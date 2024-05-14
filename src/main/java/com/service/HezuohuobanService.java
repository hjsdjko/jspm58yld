package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuohuobanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuohuobanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuohuobanView;


/**
 * 合作伙伴
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface HezuohuobanService extends IService<HezuohuobanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuohuobanVO> selectListVO(Wrapper<HezuohuobanEntity> wrapper);
   	
   	HezuohuobanVO selectVO(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
   	
   	List<HezuohuobanView> selectListView(Wrapper<HezuohuobanEntity> wrapper);
   	
   	HezuohuobanView selectView(@Param("ew") Wrapper<HezuohuobanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuohuobanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<HezuohuobanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<HezuohuobanEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<HezuohuobanEntity> wrapper);
}

