package com.dao;

import com.entity.WaijilaixiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaijilaixiaoVO;
import com.entity.view.WaijilaixiaoView;


/**
 * 外籍来校
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface WaijilaixiaoDao extends BaseMapper<WaijilaixiaoEntity> {
	
	List<WaijilaixiaoVO> selectListVO(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
	
	WaijilaixiaoVO selectVO(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
	
	List<WaijilaixiaoView> selectListView(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);

	List<WaijilaixiaoView> selectListView(Pagination page,@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
	
	WaijilaixiaoView selectView(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
	

}
