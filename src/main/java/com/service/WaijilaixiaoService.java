package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaijilaixiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaijilaixiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaijilaixiaoView;


/**
 * 外籍来校
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface WaijilaixiaoService extends IService<WaijilaixiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaijilaixiaoVO> selectListVO(Wrapper<WaijilaixiaoEntity> wrapper);
   	
   	WaijilaixiaoVO selectVO(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
   	
   	List<WaijilaixiaoView> selectListView(Wrapper<WaijilaixiaoEntity> wrapper);
   	
   	WaijilaixiaoView selectView(@Param("ew") Wrapper<WaijilaixiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaijilaixiaoEntity> wrapper);
   	

}

