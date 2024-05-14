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


import com.dao.XieyipingguDao;
import com.entity.XieyipingguEntity;
import com.service.XieyipingguService;
import com.entity.vo.XieyipingguVO;
import com.entity.view.XieyipingguView;

@Service("xieyipingguService")
public class XieyipingguServiceImpl extends ServiceImpl<XieyipingguDao, XieyipingguEntity> implements XieyipingguService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XieyipingguEntity> page = this.selectPage(
                new Query<XieyipingguEntity>(params).getPage(),
                new EntityWrapper<XieyipingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XieyipingguEntity> wrapper) {
		  Page<XieyipingguView> page =new Query<XieyipingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XieyipingguVO> selectListVO(Wrapper<XieyipingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XieyipingguVO selectVO(Wrapper<XieyipingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XieyipingguView> selectListView(Wrapper<XieyipingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XieyipingguView selectView(Wrapper<XieyipingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
