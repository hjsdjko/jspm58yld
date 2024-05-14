package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingongchuguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingongchuguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingongchuguoView;


/**
 * 因公出国
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface YingongchuguoService extends IService<YingongchuguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingongchuguoVO> selectListVO(Wrapper<YingongchuguoEntity> wrapper);
   	
   	YingongchuguoVO selectVO(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
   	
   	List<YingongchuguoView> selectListView(Wrapper<YingongchuguoEntity> wrapper);
   	
   	YingongchuguoView selectView(@Param("ew") Wrapper<YingongchuguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingongchuguoEntity> wrapper);
   	

}

