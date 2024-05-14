package com.entity.vo;

import com.entity.XieyipingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 协议评估
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class XieyipingguVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
