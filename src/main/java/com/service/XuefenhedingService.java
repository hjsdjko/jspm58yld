package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuefenhedingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuefenhedingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuefenhedingView;


/**
 * 学分核定
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XuefenhedingService extends IService<XuefenhedingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuefenhedingVO> selectListVO(Wrapper<XuefenhedingEntity> wrapper);
   	
   	XuefenhedingVO selectVO(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
   	
   	List<XuefenhedingView> selectListView(Wrapper<XuefenhedingEntity> wrapper);
   	
   	XuefenhedingView selectView(@Param("ew") Wrapper<XuefenhedingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuefenhedingEntity> wrapper);
   	

}

