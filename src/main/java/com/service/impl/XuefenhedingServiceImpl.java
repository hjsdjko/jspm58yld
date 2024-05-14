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


import com.dao.XuefenhedingDao;
import com.entity.XuefenhedingEntity;
import com.service.XuefenhedingService;
import com.entity.vo.XuefenhedingVO;
import com.entity.view.XuefenhedingView;

@Service("xuefenhedingService")
public class XuefenhedingServiceImpl extends ServiceImpl<XuefenhedingDao, XuefenhedingEntity> implements XuefenhedingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuefenhedingEntity> page = this.selectPage(
                new Query<XuefenhedingEntity>(params).getPage(),
                new EntityWrapper<XuefenhedingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuefenhedingEntity> wrapper) {
		  Page<XuefenhedingView> page =new Query<XuefenhedingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuefenhedingVO> selectListVO(Wrapper<XuefenhedingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuefenhedingVO selectVO(Wrapper<XuefenhedingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuefenhedingView> selectListView(Wrapper<XuefenhedingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuefenhedingView selectView(Wrapper<XuefenhedingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
