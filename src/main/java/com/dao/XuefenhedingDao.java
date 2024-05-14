package com.dao;

import com.entity.XuefenhedingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuefenhedingVO;
import com.entity.view.XuefenhedingView;


/**
 * 学分核定
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XuefenhedingDao extends BaseMapper<XuefenhedingEntity> {
	
	List<XuefenhedingVO> selectListVO(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
	
	XuefenhedingVO selectVO(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
	
	List<XuefenhedingView> selectListView(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);

	List<XuefenhedingView> selectListView(Pagination page,@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
	
	XuefenhedingView selectView(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
	

}
