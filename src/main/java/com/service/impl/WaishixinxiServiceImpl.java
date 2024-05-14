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


import com.dao.WaishixinxiDao;
import com.entity.WaishixinxiEntity;
import com.service.WaishixinxiService;
import com.entity.vo.WaishixinxiVO;
import com.entity.view.WaishixinxiView;

@Service("waishixinxiService")
public class WaishixinxiServiceImpl extends ServiceImpl<WaishixinxiDao, WaishixinxiEntity> implements WaishixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaishixinxiEntity> page = this.selectPage(
                new Query<WaishixinxiEntity>(params).getPage(),
                new EntityWrapper<WaishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaishixinxiEntity> wrapper) {
		  Page<WaishixinxiView> page =new Query<WaishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaishixinxiVO> selectListVO(Wrapper<WaishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaishixinxiVO selectVO(Wrapper<WaishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaishixinxiView> selectListView(Wrapper<WaishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaishixinxiView selectView(Wrapper<WaishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
