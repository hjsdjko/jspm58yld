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
 * 合作伙伴
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("hezuohuoban")
public class HezuohuobanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HezuohuobanEntity() {
		
	}
	
	public HezuohuobanEntity(T t) {
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
	 * 合作伙伴
	 */
					
	private String hezuohuoban;
	
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
	 * 设置：合作伙伴
	 */
	public void setHezuohuoban(String hezuohuoban) {
		this.hezuohuoban = hezuohuoban;
	}
	/**
	 * 获取：合作伙伴
	 */
	public String getHezuohuoban() {
		return hezuohuoban;
	}
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
