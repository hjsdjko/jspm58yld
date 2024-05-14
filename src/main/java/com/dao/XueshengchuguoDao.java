package com.dao;

import com.entity.XueshengchuguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengchuguoVO;
import com.entity.view.XueshengchuguoView;


/**
 * 学生出国
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XueshengchuguoDao extends BaseMapper<XueshengchuguoEntity> {
	
	List<XueshengchuguoVO> selectListVO(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
	
	XueshengchuguoVO selectVO(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
	
	List<XueshengchuguoView> selectListView(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);

	List<XueshengchuguoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
	
	XueshengchuguoView selectView(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
	

}
