package com.entity.view;

import com.entity.ZhongdianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 重点项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("zhongdianxiangmu")
public class ZhongdianxiangmuView  extends ZhongdianxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongdianxiangmuView(){
	}
 
 	public ZhongdianxiangmuView(ZhongdianxiangmuEntity zhongdianxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, zhongdianxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
