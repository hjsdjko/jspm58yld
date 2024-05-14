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

import com.entity.WaijilaixiaoEntity;
import com.entity.view.WaijilaixiaoView;

import com.service.WaijilaixiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 外籍来校
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@RestController
@RequestMapping("/waijilaixiao")
public class WaijilaixiaoController {
    @Autowired
    private WaijilaixiaoService waijilaixiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WaijilaixiaoEntity waijilaixiao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xieyidaoqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xieyidaoqiend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			waijilaixiao.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WaijilaixiaoEntity> ew = new EntityWrapper<WaijilaixiaoEntity>();
                if(xieyidaoqistart!=null) ew.ge("xieyidaoqi", xieyidaoqistart);
                if(xieyidaoqiend!=null) ew.le("xieyidaoqi", xieyidaoqiend);
    	PageUtils page = waijilaixiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, waijilaixiao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WaijilaixiaoEntity waijilaixiao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xieyidaoqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date xieyidaoqiend,
		HttpServletRequest request){
        EntityWrapper<WaijilaixiaoEntity> ew = new EntityWrapper<WaijilaixiaoEntity>();
                if(xieyidaoqistart!=null) ew.ge("xieyidaoqi", xieyidaoqistart);
                if(xieyidaoqiend!=null) ew.le("xieyidaoqi", xieyidaoqiend);
    	PageUtils page = waijilaixiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, waijilaixiao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WaijilaixiaoEntity waijilaixiao){
       	EntityWrapper<WaijilaixiaoEntity> ew = new EntityWrapper<WaijilaixiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( waijilaixiao, "waijilaixiao")); 
        return R.ok().put("data", waijilaixiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WaijilaixiaoEntity waijilaixiao){
        EntityWrapper< WaijilaixiaoEntity> ew = new EntityWrapper< WaijilaixiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( waijilaixiao, "waijilaixiao")); 
		WaijilaixiaoView waijilaixiaoView =  waijilaixiaoService.selectView(ew);
		return R.ok("查询外籍来校成功").put("data", waijilaixiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WaijilaixiaoEntity waijilaixiao = waijilaixiaoService.selectById(id);
        return R.ok().put("data", waijilaixiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WaijilaixiaoEntity waijilaixiao = waijilaixiaoService.selectById(id);
        return R.ok().put("data", waijilaixiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WaijilaixiaoEntity waijilaixiao, HttpServletRequest request){
    	waijilaixiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(waijilaixiao);

        waijilaixiaoService.insert(waijilaixiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WaijilaixiaoEntity waijilaixiao, HttpServletRequest request){
    	waijilaixiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(waijilaixiao);

        waijilaixiaoService.insert(waijilaixiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WaijilaixiaoEntity waijilaixiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(waijilaixiao);
        waijilaixiaoService.updateById(waijilaixiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        waijilaixiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WaijilaixiaoEntity> wrapper = new EntityWrapper<WaijilaixiaoEntity>();
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

		int count = waijilaixiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
