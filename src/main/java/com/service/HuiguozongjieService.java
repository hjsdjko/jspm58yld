package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiguozongjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiguozongjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiguozongjieView;


/**
 * 回国总结
 *
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public interface HuiguozongjieService extends IService<HuiguozongjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiguozongjieVO> selectListVO(Wrapper<HuiguozongjieEntity> wrapper);
   	
   	HuiguozongjieVO selectVO(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
   	
   	List<HuiguozongjieView> selectListView(Wrapper<HuiguozongjieEntity> wrapper);
   	
   	HuiguozongjieView selectView(@Param("ew") Wrapper<HuiguozongjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiguozongjieEntity> wrapper);
   	

}

