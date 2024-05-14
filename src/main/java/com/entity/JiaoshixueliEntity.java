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
 * 教师学历
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("jiaoshixueli")
public class JiaoshixueliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshixueliEntity() {
		
	}
	
	public JiaoshixueliEntity(T t) {
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
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
