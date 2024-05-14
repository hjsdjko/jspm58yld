package com.dao;

import com.entity.ZhongdianxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongdianxiangmuVO;
import com.entity.view.ZhongdianxiangmuView;


/**
 * 重点项目
 * 
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface ZhongdianxiangmuDao extends BaseMapper<ZhongdianxiangmuEntity> {
	
	List<ZhongdianxiangmuVO> selectListVO(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
	
	ZhongdianxiangmuVO selectVO(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
	
	List<ZhongdianxiangmuView> selectListView(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);

	List<ZhongdianxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
	
	ZhongdianxiangmuView selectView(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
	

}
