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


import com.dao.XueshengchuguoDao;
import com.entity.XueshengchuguoEntity;
import com.service.XueshengchuguoService;
import com.entity.vo.XueshengchuguoVO;
import com.entity.view.XueshengchuguoView;

@Service("xueshengchuguoService")
public class XueshengchuguoServiceImpl extends ServiceImpl<XueshengchuguoDao, XueshengchuguoEntity> implements XueshengchuguoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengchuguoEntity> page = this.selectPage(
                new Query<XueshengchuguoEntity>(params).getPage(),
                new EntityWrapper<XueshengchuguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengchuguoEntity> wrapper) {
		  Page<XueshengchuguoView> page =new Query<XueshengchuguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengchuguoVO> selectListVO(Wrapper<XueshengchuguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengchuguoVO selectVO(Wrapper<XueshengchuguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengchuguoView> selectListView(Wrapper<XueshengchuguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengchuguoView selectView(Wrapper<XueshengchuguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
