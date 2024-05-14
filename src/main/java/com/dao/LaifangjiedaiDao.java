package com.dao;

import com.entity.LaifangjiedaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaifangjiedaiVO;
import com.entity.view.LaifangjiedaiView;


/**
 * 来访接待
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface LaifangjiedaiDao extends BaseMapper<LaifangjiedaiEntity> {
	
	List<LaifangjiedaiVO> selectListVO(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
	
	LaifangjiedaiVO selectVO(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
	
	List<LaifangjiedaiView> selectListView(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);

	List<LaifangjiedaiView> selectListView(Pagination page,@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
	
	LaifangjiedaiView selectView(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
}
