package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengchuguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengchuguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengchuguoView;


/**
 * 学生出国
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface XueshengchuguoService extends IService<XueshengchuguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengchuguoVO> selectListVO(Wrapper<XueshengchuguoEntity> wrapper);
   	
   	XueshengchuguoVO selectVO(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
   	
   	List<XueshengchuguoView> selectListView(Wrapper<XueshengchuguoEntity> wrapper);
   	
   	XueshengchuguoView selectView(@Param("ew") Wrapper<XueshengchuguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengchuguoEntity> wrapper);
   	

}

