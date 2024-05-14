package com.dao;

import com.entity.HuiguozongjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiguozongjieVO;
import com.entity.view.HuiguozongjieView;


/**
 * 回国总结
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface HuiguozongjieDao extends BaseMapper<HuiguozongjieEntity> {
	
	List<HuiguozongjieVO> selectListVO(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
	
	HuiguozongjieVO selectVO(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
	
	List<HuiguozongjieView> selectListView(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);

	List<HuiguozongjieView> selectListView(Pagination page,@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
	
	HuiguozongjieView selectView(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
	

}
