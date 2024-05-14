package com.entity.view;

import com.entity.XueshengchuguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生出国
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("xueshengchuguo")
public class XueshengchuguoView  extends XueshengchuguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengchuguoView(){
	}
 
 	public XueshengchuguoView(XueshengchuguoEntity xueshengchuguoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengchuguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
