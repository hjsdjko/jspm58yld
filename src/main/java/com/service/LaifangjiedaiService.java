package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaifangjiedaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaifangjiedaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaifangjiedaiView;


/**
 * 来访接待
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface LaifangjiedaiService extends IService<LaifangjiedaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaifangjiedaiVO> selectListVO(Wrapper<LaifangjiedaiEntity> wrapper);
   	
   	LaifangjiedaiVO selectVO(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
   	
   	List<LaifangjiedaiView> selectListView(Wrapper<LaifangjiedaiEntity> wrapper);
   	
   	LaifangjiedaiView selectView(@Param("ew") Wrapper<LaifangjiedaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaifangjiedaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LaifangjiedaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LaifangjiedaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LaifangjiedaiEntity> wrapper);
}

