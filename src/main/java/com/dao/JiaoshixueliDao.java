package com.dao;

import com.entity.JiaoshixueliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshixueliVO;
import com.entity.view.JiaoshixueliView;


/**
 * 教师学历
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface JiaoshixueliDao extends BaseMapper<JiaoshixueliEntity> {
	
	List<JiaoshixueliVO> selectListVO(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
	
	JiaoshixueliVO selectVO(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
	
	List<JiaoshixueliView> selectListView(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);

	List<JiaoshixueliView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
	
	JiaoshixueliView selectView(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
	

}
