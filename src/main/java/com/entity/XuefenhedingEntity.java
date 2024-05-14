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
 * 学分核定
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("xuefenheding")
public class XuefenhedingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuefenhedingEntity() {
		
	}
	
	public XuefenhedingEntity(T t) {
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
	 * 留学国家
	 */
					
	private String liuxueguojia;
	
	/**
	 * 申请学分
	 */
					
	private String shenqingxuefen;
	
	/**
	 * 学习情况
	 */
					
	private String xuexiqingkuang;
	
	/**
	 * 回校时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huixiaoshijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
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
	 * 设置：留学国家
	 */
	public void setLiuxueguojia(String liuxueguojia) {
		this.liuxueguojia = liuxueguojia;
	}
	/**
	 * 获取：留学国家
	 */
	public String getLiuxueguojia() {
		return liuxueguojia;
	}
	/**
	 * 设置：申请学分
	 */
	public void setShenqingxuefen(String shenqingxuefen) {
		this.shenqingxuefen = shenqingxuefen;
	}
	/**
	 * 获取：申请学分
	 */
	public String getShenqingxuefen() {
		return shenqingxuefen;
	}
	/**
	 * 设置：学习情况
	 */
	public void setXuexiqingkuang(String xuexiqingkuang) {
		this.xuexiqingkuang = xuexiqingkuang;
	}
	/**
	 * 获取：学习情况
	 */
	public String getXuexiqingkuang() {
		return xuexiqingkuang;
	}
	/**
	 * 设置：回校时间
	 */
	public void setHuixiaoshijian(Date huixiaoshijian) {
		this.huixiaoshijian = huixiaoshijian;
	}
	/**
	 * 获取：回校时间
	 */
	public Date getHuixiaoshijian() {
		return huixiaoshijian;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
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
