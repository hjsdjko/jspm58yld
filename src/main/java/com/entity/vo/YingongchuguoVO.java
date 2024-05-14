package com.entity.vo;

import com.entity.YingongchuguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 因公出国
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class YingongchuguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 证照类型
	 */
	
	private String zhengzhaoleixing;
		
	/**
	 * 证照号码
	 */
	
	private String zhengzhaohaoma;
		
	/**
	 * 出国原因
	 */
	
	private String chuguoyuanyin;
		
	/**
	 * 出国时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuguoshijian;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：出国原因
	 */
	 
	public void setChuguoyuanyin(String chuguoyuanyin) {
		this.chuguoyuanyin = chuguoyuanyin;
	}
	
	/**
	 * 获取：出国原因
	 */
	public String getChuguoyuanyin() {
		return chuguoyuanyin;
	}
				
	
	/**
	 * 设置：出国时间
	 */
	 
	public void setChuguoshijian(Date chuguoshijian) {
		this.chuguoshijian = chuguoshijian;
	}
	
	/**
	 * 获取：出国时间
	 */
	public Date getChuguoshijian() {
		return chuguoshijian;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
