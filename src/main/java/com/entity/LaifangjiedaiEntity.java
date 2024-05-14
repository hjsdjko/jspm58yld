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
 * 来访接待
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("laifangjiedai")
public class LaifangjiedaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaifangjiedaiEntity() {
		
	}
	
	public LaifangjiedaiEntity(T t) {
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
	 * 接待标题
	 */
					
	private String jiedaibiaoti;
	
	/**
	 * 接待分类
	 */
					
	private String jiedaifenlei;
	
	/**
	 * 来访人数
	 */
					
	private Integer laifangrenshu;
	
	/**
	 * 接待预算
	 */
					
	private Float jiedaiyusuan;
	
	/**
	 * 接待详情
	 */
					
	private String jiedaixiangqing;
	
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
	 * 设置：接待标题
	 */
	public void setJiedaibiaoti(String jiedaibiaoti) {
		this.jiedaibiaoti = jiedaibiaoti;
	}
	/**
	 * 获取：接待标题
	 */
	public String getJiedaibiaoti() {
		return jiedaibiaoti;
	}
	/**
	 * 设置：接待分类
	 */
	public void setJiedaifenlei(String jiedaifenlei) {
		this.jiedaifenlei = jiedaifenlei;
	}
	/**
	 * 获取：接待分类
	 */
	public String getJiedaifenlei() {
		return jiedaifenlei;
	}
	/**
	 * 设置：来访人数
	 */
	public void setLaifangrenshu(Integer laifangrenshu) {
		this.laifangrenshu = laifangrenshu;
	}
	/**
	 * 获取：来访人数
	 */
	public Integer getLaifangrenshu() {
		return laifangrenshu;
	}
	/**
	 * 设置：接待预算
	 */
	public void setJiedaiyusuan(Float jiedaiyusuan) {
		this.jiedaiyusuan = jiedaiyusuan;
	}
	/**
	 * 获取：接待预算
	 */
	public Float getJiedaiyusuan() {
		return jiedaiyusuan;
	}
	/**
	 * 设置：接待详情
	 */
	public void setJiedaixiangqing(String jiedaixiangqing) {
		this.jiedaixiangqing = jiedaixiangqing;
	}
	/**
	 * 获取：接待详情
	 */
	public String getJiedaixiangqing() {
		return jiedaixiangqing;
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
