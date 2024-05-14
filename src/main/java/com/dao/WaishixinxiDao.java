package com.dao;

import com.entity.WaishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaishixinxiVO;
import com.entity.view.WaishixinxiView;


/**
 * 外事信息
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface WaishixinxiDao extends BaseMapper<WaishixinxiEntity> {
	
	List<WaishixinxiVO> selectListVO(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
	
	WaishixinxiVO selectVO(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
	
	List<WaishixinxiView> selectListView(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);

	List<WaishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
	
	WaishixinxiView selectView(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
	

}
