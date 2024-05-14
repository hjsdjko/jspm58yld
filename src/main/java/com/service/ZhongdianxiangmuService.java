package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongdianxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongdianxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongdianxiangmuView;


/**
 * 重点项目
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface ZhongdianxiangmuService extends IService<ZhongdianxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongdianxiangmuVO> selectListVO(Wrapper<ZhongdianxiangmuEntity> wrapper);
   	
   	ZhongdianxiangmuVO selectVO(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
   	
   	List<ZhongdianxiangmuView> selectListView(Wrapper<ZhongdianxiangmuEntity> wrapper);
   	
   	ZhongdianxiangmuView selectView(@Param("ew") Wrapper<ZhongdianxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongdianxiangmuEntity> wrapper);
   	

}

