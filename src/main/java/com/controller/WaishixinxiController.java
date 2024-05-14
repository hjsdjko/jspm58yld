package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WaishixinxiEntity;
import com.entity.view.WaishixinxiView;

import com.service.WaishixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 外事信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@RestController
@RequestMapping("/waishixinxi")
public class WaishixinxiController {
    @Autowired
    private WaishixinxiService waishixinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WaishixinxiEntity waishixinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date youxiaoqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date youxiaoqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			waishixinxi.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WaishixinxiEntity> ew = new EntityWrapper<WaishixinxiEntity>();
                if(youxiaoqistart!=null) ew.ge("youxiaoqi", youxiaoqistart);
                if(youxiaoqiend!=null) ew.le("youxiaoqi", youxiaoqiend);
    	PageUtils page = waishixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, waishixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WaishixinxiEntity waishixinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date youxiaoqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date youxiaoqiend,
		HttpServletRequest request){
        EntityWrapper<WaishixinxiEntity> ew = new EntityWrapper<WaishixinxiEntity>();
                if(youxiaoqistart!=null) ew.ge("youxiaoqi", youxiaoqistart);
                if(youxiaoqiend!=null) ew.le("youxiaoqi", youxiaoqiend);
    	PageUtils page = waishixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, waishixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WaishixinxiEntity waishixinxi){
       	EntityWrapper<WaishixinxiEntity> ew = new EntityWrapper<WaishixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( waishixinxi, "waishixinxi")); 
        return R.ok().put("data", waishixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WaishixinxiEntity waishixinxi){
        EntityWrapper< WaishixinxiEntity> ew = new EntityWrapper< WaishixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( waishixinxi, "waishixinxi")); 
		WaishixinxiView waishixinxiView =  waishixinxiService.selectView(ew);
		return R.ok("查询外事信息成功").put("data", waishixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WaishixinxiEntity waishixinxi = waishixinxiService.selectById(id);
        return R.ok().put("data", waishixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WaishixinxiEntity waishixinxi = waishixinxiService.selectById(id);
        return R.ok().put("data", waishixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WaishixinxiEntity waishixinxi, HttpServletRequest request){
    	waishixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(waishixinxi);

        waishixinxiService.insert(waishixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WaishixinxiEntity waishixinxi, HttpServletRequest request){
    	waishixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(waishixinxi);

        waishixinxiService.insert(waishixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WaishixinxiEntity waishixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(waishixinxi);
        waishixinxiService.updateById(waishixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        waishixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WaishixinxiEntity> wrapper = new EntityWrapper<WaishixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = waishixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
