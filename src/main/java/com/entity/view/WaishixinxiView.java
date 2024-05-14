package com.entity.view;

import com.entity.WaishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外事信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("waishixinxi")
public class WaishixinxiView  extends WaishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaishixinxiView(){
	}
 
 	public WaishixinxiView(WaishixinxiEntity waishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, waishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
