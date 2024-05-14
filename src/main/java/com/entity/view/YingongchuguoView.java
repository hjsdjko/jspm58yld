package com.entity.view;

import com.entity.YingongchuguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 因公出国
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("yingongchuguo")
public class YingongchuguoView  extends YingongchuguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingongchuguoView(){
	}
 
 	public YingongchuguoView(YingongchuguoEntity yingongchuguoEntity){
 	try {
			BeanUtils.copyProperties(this, yingongchuguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
