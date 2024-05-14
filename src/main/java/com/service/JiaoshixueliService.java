package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshixueliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshixueliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshixueliView;


/**
 * 教师学历
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface JiaoshixueliService extends IService<JiaoshixueliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshixueliVO> selectListVO(Wrapper<JiaoshixueliEntity> wrapper);
   	
   	JiaoshixueliVO selectVO(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
   	
   	List<JiaoshixueliView> selectListView(Wrapper<JiaoshixueliEntity> wrapper);
   	
   	JiaoshixueliView selectView(@Param("ew") Wrapper<JiaoshixueliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshixueliEntity> wrapper);
   	

}

