package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WaijilaixiaoDao;
import com.entity.WaijilaixiaoEntity;
import com.service.WaijilaixiaoService;
import com.entity.vo.WaijilaixiaoVO;
import com.entity.view.WaijilaixiaoView;

@Service("waijilaixiaoService")
public class WaijilaixiaoServiceImpl extends ServiceImpl<WaijilaixiaoDao, WaijilaixiaoEntity> implements WaijilaixiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaijilaixiaoEntity> page = this.selectPage(
                new Query<WaijilaixiaoEntity>(params).getPage(),
                new EntityWrapper<WaijilaixiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaijilaixiaoEntity> wrapper) {
		  Page<WaijilaixiaoView> page =new Query<WaijilaixiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaijilaixiaoVO> selectListVO(Wrapper<WaijilaixiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaijilaixiaoVO selectVO(Wrapper<WaijilaixiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaijilaixiaoView> selectListView(Wrapper<WaijilaixiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaijilaixiaoView selectView(Wrapper<WaijilaixiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
