package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 外事信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("waishixinxi")
public class WaishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WaishixinxiEntity() {
		
	}
	
	public WaishixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 证照类型
	 */
					
	private String zhengzhaoleixing;
	
	/**
	 * 证照号码
	 */
					
	private String zhengzhaohaoma;
	
	/**
	 * 有效期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：证照类型
	 */
	public void setZhengzhaoleixing(String zhengzhaoleixing) {
		this.zhengzhaoleixing = zhengzhaoleixing;
	}
	/**
	 * 获取：证照类型
	 */
	public String getZhengzhaoleixing() {
		return zhengzhaoleixing;
	}
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
