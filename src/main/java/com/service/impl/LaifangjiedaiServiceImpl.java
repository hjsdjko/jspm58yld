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


import com.dao.LaifangjiedaiDao;
import com.entity.LaifangjiedaiEntity;
import com.service.LaifangjiedaiService;
import com.entity.vo.LaifangjiedaiVO;
import com.entity.view.LaifangjiedaiView;

@Service("laifangjiedaiService")
public class LaifangjiedaiServiceImpl extends ServiceImpl<LaifangjiedaiDao, LaifangjiedaiEntity> implements LaifangjiedaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaifangjiedaiEntity> page = this.selectPage(
                new Query<LaifangjiedaiEntity>(params).getPage(),
                new EntityWrapper<LaifangjiedaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaifangjiedaiEntity> wrapper) {
		  Page<LaifangjiedaiView> page =new Query<LaifangjiedaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaifangjiedaiVO> selectListVO(Wrapper<LaifangjiedaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaifangjiedaiVO selectVO(Wrapper<LaifangjiedaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaifangjiedaiView> selectListView(Wrapper<LaifangjiedaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaifangjiedaiView selectView(Wrapper<LaifangjiedaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LaifangjiedaiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LaifangjiedaiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LaifangjiedaiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
