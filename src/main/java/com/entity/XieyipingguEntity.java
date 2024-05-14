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
 * 协议评估
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
@TableName("xieyipinggu")
public class XieyipingguEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XieyipingguEntity() {
		
	}
	
	public XieyipingguEntity(T t) {
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
	 * 合作协议
	 */
					
	private String hezuoxieyi;
	
	/**
	 * 执行评估
	 */
					
	private String zhixingpinggu;
	
	/**
	 * 合作总结
	 */
					
	private String hezuozongjie;
	
	/**
	 * 总结时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zongjieshijian;
	
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
	 * 设置：执行评估
	 */
	public void setZhixingpinggu(String zhixingpinggu) {
		this.zhixingpinggu = zhixingpinggu;
	}
	/**
	 * 获取：执行评估
	 */
	public String getZhixingpinggu() {
		return zhixingpinggu;
	}
	/**
	 * 设置：合作总结
	 */
	public void setHezuozongjie(String hezuozongjie) {
		this.hezuozongjie = hezuozongjie;
	}
	/**
	 * 获取：合作总结
	 */
	public String getHezuozongjie() {
		return hezuozongjie;
	}
	/**
	 * 设置：总结时间
	 */
	public void setZongjieshijian(Date zongjieshijian) {
		this.zongjieshijian = zongjieshijian;
	}
	/**
	 * 获取：总结时间
	 */
	public Date getZongjieshijian() {
		return zongjieshijian;
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
