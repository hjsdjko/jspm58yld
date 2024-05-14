package com.entity.view;

import com.entity.WaijilaixiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外籍来校
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("waijilaixiao")
public class WaijilaixiaoView  extends WaijilaixiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaijilaixiaoView(){
	}
 
 	public WaijilaixiaoView(WaijilaixiaoEntity waijilaixiaoEntity){
 	try {
			BeanUtils.copyProperties(this, waijilaixiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
