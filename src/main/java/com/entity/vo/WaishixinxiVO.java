package com.entity.vo;

import com.entity.WaishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 外事信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class WaishixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 证照号码
	 */
	
	private String zhengzhaohaoma;
		
	/**
	 * 有效期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxiaoqi;
		
	/**
	 * 签证信息
	 */
	
	private String qianzhengxinxi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：证照号码
	 */
	 
	public void setZhengzhaohaoma(String zhengzhaohaoma) {
		this.zhengzhaohaoma = zhengzhaohaoma;
	}
	
	/**
	 * 获取：证照号码
	 */
	public String getZhengzhaohaoma() {
		return zhengzhaohaoma;
	}
				
	
	/**
	 * 设置：有效期
	 */
	 
	public void setYouxiaoqi(Date youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	
	/**
	 * 获取：有效期
	 */
	public Date getYouxiaoqi() {
		return youxiaoqi;
	}
				
	
	/**
	 * 设置：签证信息
	 */
	 
	public void setQianzhengxinxi(String qianzhengxinxi) {
		this.qianzhengxinxi = qianzhengxinxi;
	}
	
	/**
	 * 获取：签证信息
	 */
	public String getQianzhengxinxi() {
		return qianzhengxinxi;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
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
			
}