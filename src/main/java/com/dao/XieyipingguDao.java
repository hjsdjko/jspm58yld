package com.dao;

import com.entity.XieyipingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XieyipingguVO;
import com.entity.view.XieyipingguView;


/**
 * 协议评估
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XieyipingguDao extends BaseMapper<XieyipingguEntity> {
	
	List<XieyipingguVO> selectListVO(@Param("ew") Wrapper<XieyipingguEntity> wrapper);
	
	XieyipingguVO selectVO(@Param("ew") Wrapper<XieyipingguEntity> wrapper);
	
	List<XieyipingguView> selectListView(@Param("ew") Wrapper<XieyipingguEntity> wrapper);

	List<XieyipingguView> selectListView(Pagination page,@Param("ew") Wrapper<XieyipingguEntity> wrapper);
	
	XieyipingguView selectView(@Param("ew") Wrapper<XieyipingguEntity> wrapper);
	

}
