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


import com.dao.XiangmuzongjieDao;
import com.entity.XiangmuzongjieEntity;
import com.service.XiangmuzongjieService;
import com.entity.vo.XiangmuzongjieVO;
import com.entity.view.XiangmuzongjieView;

@Service("xiangmuzongjieService")
public class XiangmuzongjieServiceImpl extends ServiceImpl<XiangmuzongjieDao, XiangmuzongjieEntity> implements XiangmuzongjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuzongjieEntity> page = this.selectPage(
                new Query<XiangmuzongjieEntity>(params).getPage(),
                new EntityWrapper<XiangmuzongjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuzongjieEntity> wrapper) {
		  Page<XiangmuzongjieView> page =new Query<XiangmuzongjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuzongjieVO> selectListVO(Wrapper<XiangmuzongjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuzongjieVO selectVO(Wrapper<XiangmuzongjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuzongjieView> selectListView(Wrapper<XiangmuzongjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuzongjieView selectView(Wrapper<XiangmuzongjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
