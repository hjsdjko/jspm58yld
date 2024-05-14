package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaishixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaishixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaishixinxiView;


/**
 * 外事信息
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface WaishixinxiService extends IService<WaishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaishixinxiVO> selectListVO(Wrapper<WaishixinxiEntity> wrapper);
   	
   	WaishixinxiVO selectVO(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
   	
   	List<WaishixinxiView> selectListView(Wrapper<WaishixinxiEntity> wrapper);
   	
   	WaishixinxiView selectView(@Param("ew") Wrapper<WaishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaishixinxiEntity> wrapper);
   	

}

