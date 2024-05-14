package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuzongjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuzongjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuzongjieView;


/**
 * 项目总结
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XiangmuzongjieService extends IService<XiangmuzongjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuzongjieVO> selectListVO(Wrapper<XiangmuzongjieEntity> wrapper);
   	
   	XiangmuzongjieVO selectVO(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
   	
   	List<XiangmuzongjieView> selectListView(Wrapper<XiangmuzongjieEntity> wrapper);
   	
   	XiangmuzongjieView selectView(@Param("ew") Wrapper<XiangmuzongjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuzongjieEntity> wrapper);
   	

}

