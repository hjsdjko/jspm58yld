package com.dao;

import com.entity.YingongchuguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingongchuguoVO;
import com.entity.view.YingongchuguoView;


/**
 * 因公出国
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface YingongchuguoDao extends BaseMapper<YingongchuguoEntity> {
	
	List<YingongchuguoVO> selectListVO(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
	
	YingongchuguoVO selectVO(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
	
	List<YingongchuguoView> selectListView(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);

	List<YingongchuguoView> selectListView(Pagination page,@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
	
	YingongchuguoView selectView(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
	

}
