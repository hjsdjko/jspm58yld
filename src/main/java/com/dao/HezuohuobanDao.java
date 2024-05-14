package com.dao;

import com.entity.HezuohuobanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuohuobanVO;
import com.entity.view.HezuohuobanView;


/**
 * 合作伙伴
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface HezuohuobanDao extends BaseMapper<HezuohuobanEntity> {
	
	List<HezuohuobanVO> selectListVO(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
	
	HezuohuobanVO selectVO(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
	
	List<HezuohuobanView> selectListView(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);

	List<HezuohuobanView> selectListView(Pagination page,@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
	
	HezuohuobanView selectView(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HezuohuobanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
}