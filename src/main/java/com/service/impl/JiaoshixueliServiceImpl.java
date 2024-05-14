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


import com.dao.JiaoshixueliDao;
import com.entity.JiaoshixueliEntity;
import com.service.JiaoshixueliService;
import com.entity.vo.JiaoshixueliVO;
import com.entity.view.JiaoshixueliView;

@Service("jiaoshixueliService")
public class JiaoshixueliServiceImpl extends ServiceImpl<JiaoshixueliDao, JiaoshixueliEntity> implements JiaoshixueliService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshixueliEntity> page = this.selectPage(
                new Query<JiaoshixueliEntity>(params).getPage(),
                new EntityWrapper<JiaoshixueliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshixueliEntity> wrapper) {
		  Page<JiaoshixueliView> page =new Query<JiaoshixueliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshixueliVO> selectListVO(Wrapper<JiaoshixueliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshixueliVO selectVO(Wrapper<JiaoshixueliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshixueliView> selectListView(Wrapper<JiaoshixueliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshixueliView selectView(Wrapper<JiaoshixueliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
