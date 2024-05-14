package com.dao;

import com.entity.XiangmuzongjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuzongjieVO;
import com.entity.view.XiangmuzongjieView;


/**
 * 项目总结
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XiangmuzongjieDao extends BaseMapper<XiangmuzongjieEntity> {
	
	List<XiangmuzongjieVO> selectListVO(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
	
	XiangmuzongjieVO selectVO(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
	
	List<XiangmuzongjieView> selectListView(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);

	List<XiangmuzongjieView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
	
	XiangmuzongjieView selectView(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
	

}
