package com.entity.model;

import com.entity.XuefenhedingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学分核定
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class XuefenhedingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
