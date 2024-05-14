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


import com.dao.HezuohuobanDao;
import com.entity.HezuohuobanEntity;
import com.service.HezuohuobanService;
import com.entity.vo.HezuohuobanVO;
import com.entity.view.HezuohuobanView;

@Service("hezuohuobanService")
public class HezuohuobanServiceImpl extends ServiceImpl<HezuohuobanDao, HezuohuobanEntity> implements HezuohuobanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuohuobanEntity> page = this.selectPage(
                new Query<HezuohuobanEntity>(params).getPage(),
                new EntityWrapper<HezuohuobanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuohuobanEntity> wrapper) {
		  Page<HezuohuobanView> page =new Query<HezuohuobanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuohuobanVO> selectListVO(Wrapper<HezuohuobanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuohuobanVO selectVO(Wrapper<HezuohuobanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuohuobanView> selectListView(Wrapper<HezuohuobanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuohuobanView selectView(Wrapper<HezuohuobanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<HezuohuobanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<HezuohuobanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<HezuohuobanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
