package com.entity.view;

import com.entity.XieyipingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 协议评估
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("xieyipinggu")
public class XieyipingguView  extends XieyipingguEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XieyipingguView(){
	}
 
 	public XieyipingguView(XieyipingguEntity xieyipingguEntity){
 	try {
			BeanUtils.copyProperties(this, xieyipingguEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
