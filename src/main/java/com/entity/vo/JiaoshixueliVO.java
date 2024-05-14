package com.entity.vo;

import com.entity.JiaoshixueliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教师学历
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class JiaoshixueliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 毕业时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biyeshijian;
		
	/**
	 * 毕业学校
	 */
	
	private String biyexuexiao;
		
	/**
	 * 学校类型
	 */
	
	private String xuexiaoleixing;
		
	/**
	 * 外语等级
	 */
	
	private String waiyudengji;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：毕业时间
	 */
	 
	public void setBiyeshijian(Date biyeshijian) {
		this.biyeshijian = biyeshijian;
	}
	
	/**
	 * 获取：毕业时间
	 */
	public Date getBiyeshijian() {
		return biyeshijian;
	}
				
	
	/**
	 * 设置：毕业学校
	 */
	 
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
	}
				
	
	/**
	 * 设置：学校类型
	 */
	 
	public void setXuexiaoleixing(String xuexiaoleixing) {
		this.xuexiaoleixing = xuexiaoleixing;
	}
	
	/**
	 * 获取：学校类型
	 */
	public String getXuexiaoleixing() {
		return xuexiaoleixing;
	}
				
	
	/**
	 * 设置：外语等级
	 */
	 
	public void setWaiyudengji(String waiyudengji) {
		this.waiyudengji = waiyudengji;
	}
	
	/**
	 * 获取：外语等级
	 */
	public String getWaiyudengji() {
		return waiyudengji;
	}
			
}
