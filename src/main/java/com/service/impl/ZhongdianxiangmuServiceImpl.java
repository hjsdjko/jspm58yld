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


import com.dao.ZhongdianxiangmuDao;
import com.entity.ZhongdianxiangmuEntity;
import com.service.ZhongdianxiangmuService;
import com.entity.vo.ZhongdianxiangmuVO;
import com.entity.view.ZhongdianxiangmuView;

@Service("zhongdianxiangmuService")
public class ZhongdianxiangmuServiceImpl extends ServiceImpl<ZhongdianxiangmuDao, ZhongdianxiangmuEntity> implements ZhongdianxiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongdianxiangmuEntity> page = this.selectPage(
                new Query<ZhongdianxiangmuEntity>(params).getPage(),
                new EntityWrapper<ZhongdianxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongdianxiangmuEntity> wrapper) {
		  Page<ZhongdianxiangmuView> page =new Query<ZhongdianxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongdianxiangmuVO> selectListVO(Wrapper<ZhongdianxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongdianxiangmuVO selectVO(Wrapper<ZhongdianxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongdianxiangmuView> selectListView(Wrapper<ZhongdianxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongdianxiangmuView selectView(Wrapper<ZhongdianxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
