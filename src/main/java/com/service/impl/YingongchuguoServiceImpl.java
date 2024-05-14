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


import com.dao.YingongchuguoDao;
import com.entity.YingongchuguoEntity;
import com.service.YingongchuguoService;
import com.entity.vo.YingongchuguoVO;
import com.entity.view.YingongchuguoView;

@Service("yingongchuguoService")
public class YingongchuguoServiceImpl extends ServiceImpl<YingongchuguoDao, YingongchuguoEntity> implements YingongchuguoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingongchuguoEntity> page = this.selectPage(
                new Query<YingongchuguoEntity>(params).getPage(),
                new EntityWrapper<YingongchuguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingongchuguoEntity> wrapper) {
		  Page<YingongchuguoView> page =new Query<YingongchuguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingongchuguoVO> selectListVO(Wrapper<YingongchuguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingongchuguoVO selectVO(Wrapper<YingongchuguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingongchuguoView> selectListView(Wrapper<YingongchuguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingongchuguoView selectView(Wrapper<YingongchuguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
