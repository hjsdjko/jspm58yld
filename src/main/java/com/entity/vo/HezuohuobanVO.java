package com.entity.vo;

import com.entity.HezuohuobanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 合作伙伴
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class HezuohuobanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 合作领域
	 */
	
	private String hezuolingyu;
		
	/**
	 * 合作时间
	 */
	
	private String hezuoshijian;
		
	/**
	 * 合作国家
	 */
	
	private String hezuoguojia;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
	/**
	 * 设置：合作领域
	 */
	 
	public void setHezuolingyu(String hezuolingyu) {
		this.hezuolingyu = hezuolingyu;
	}
	
	/**
	 * 获取：合作领域
	 */
	public String getHezuolingyu() {
		return hezuolingyu;
	}
				
	
	/**
	 * 设置：合作时间
	 */
	 
	public void setHezuoshijian(String hezuoshijian) {
		this.hezuoshijian = hezuoshijian;
	}
	
	/**
	 * 获取：合作时间
	 */
	public String getHezuoshijian() {
		return hezuoshijian;
	}
				
	
	/**
	 * 设置：合作国家
	 */
	 
	public void setHezuoguojia(String hezuoguojia) {
		this.hezuoguojia = hezuoguojia;
	}
	
	/**
	 * 获取：合作国家
	 */
	public String getHezuoguojia() {
		return hezuoguojia;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}
