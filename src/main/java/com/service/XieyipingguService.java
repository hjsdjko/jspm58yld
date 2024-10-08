package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XieyipingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XieyipingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XieyipingguView;


/**
 * 协议评估
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XieyipingguService extends IService<XieyipingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XieyipingguVO> selectListVO(Wrapper<XieyipingguEntity> wrapper);
   	
   	XieyipingguVO selectVO(@Param("ew") Wrapper<XieyipingguEntity> wrapper);
   	
   	List<XieyipingguView> selectListView(Wrapper<XieyipingguEntity> wrapper);
   	
   	XieyipingguView selectView(@Param("ew") Wrapper<XieyipingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XieyipingguEntity> wrapper);
   	

}

