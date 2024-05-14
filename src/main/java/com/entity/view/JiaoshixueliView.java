package com.entity.view;

import com.entity.JiaoshixueliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师学历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("jiaoshixueli")
public class JiaoshixueliView  extends JiaoshixueliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshixueliView(){
	}
 
 	public JiaoshixueliView(JiaoshixueliEntity jiaoshixueliEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshixueliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
