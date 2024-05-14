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
 * 外籍来校
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("waijilaixiao")
public class WaijilaixiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WaijilaixiaoEntity() {
		
	}
	
	public WaijilaixiaoEntity(T t) {
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
	 * 专家名字
	 */
					
	private String zhuanjiamingzi;
	
	/**
	 * 荣誉学衔
	 */
					
	private String rongyuxuexian;
	
	/**
	 * 合作协议
	 */
					
	private String hezuoxieyi;
	
	/**
	 * 协议内容
	 */
					
	private String xieyineirong;
	
	/**
	 * 协议到期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xieyidaoqi;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：专家名字
	 */
	public void setZhuanjiamingzi(String zhuanjiamingzi) {
		this.zhuanjiamingzi = zhuanjiamingzi;
	}
	/**
	 * 获取：专家名字
	 */
	public String getZhuanjiamingzi() {
		return zhuanjiamingzi;
	}
	/**
	 * 设置：荣誉学衔
	 */
	public void setRongyuxuexian(String rongyuxuexian) {
		this.rongyuxuexian = rongyuxuexian;
	}
	/**
	 * 获取：荣誉学衔
	 */
	public String getRongyuxuexian() {
		return rongyuxuexian;
	}
	/**
	 * 设置：合作协议
	 */
	public void setHezuoxieyi(String hezuoxieyi) {
		this.hezuoxieyi = hezuoxieyi;
	}
	/**
	 * 获取：合作协议
	 */
	public String getHezuoxieyi() {
		return hezuoxieyi;
	}
	/**
	 * 设置：协议内容
	 */
	public void setXieyineirong(String xieyineirong) {
		this.xieyineirong = xieyineirong;
	}
	/**
	 * 获取：协议内容
	 */
	public String getXieyineirong() {
		return xieyineirong;
	}
	/**
	 * 设置：协议到期
	 */
	public void setXieyidaoqi(Date xieyidaoqi) {
		this.xieyidaoqi = xieyidaoqi;
	}
	/**
	 * 获取：协议到期
	 */
	public Date getXieyidaoqi() {
		return xieyidaoqi;
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
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
