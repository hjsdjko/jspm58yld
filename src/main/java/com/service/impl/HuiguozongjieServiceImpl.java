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


import com.dao.HuiguozongjieDao;
import com.entity.HuiguozongjieEntity;
import com.service.HuiguozongjieService;
import com.entity.vo.HuiguozongjieVO;
import com.entity.view.HuiguozongjieView;

@Service("huiguozongjieService")
public class HuiguozongjieServiceImpl extends ServiceImpl<HuiguozongjieDao, HuiguozongjieEntity> implements HuiguozongjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiguozongjieEntity> page = this.selectPage(
                new Query<HuiguozongjieEntity>(params).getPage(),
                new EntityWrapper<HuiguozongjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiguozongjieEntity> wrapper) {
		  Page<HuiguozongjieView> page =new Query<HuiguozongjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiguozongjieVO> selectListVO(Wrapper<HuiguozongjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiguozongjieVO selectVO(Wrapper<HuiguozongjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiguozongjieView> selectListView(Wrapper<HuiguozongjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiguozongjieView selectView(Wrapper<HuiguozongjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
