package com.entity.model;

import com.entity.HuiguozongjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 回国总结
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-27 17:11:27
 */
public class HuiguozongjieModel  implements Serializable {
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
	 * 回国时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huiguoshijian;
		
	/**
	 * 回结总结
	 */
	
	private String huijiezongjie;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
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
	 * 设置：回国时间
	 */
	 
	public void setHuiguoshijian(Date huiguoshijian) {
		this.huiguoshijian = huiguoshijian;
	}
	
	/**
	 * 获取：回国时间
	 */
	public Date getHuiguoshijian() {
		return huiguoshijian;
	}
				
	
	/**
	 * 设置：回结总结
	 */
	 
	public void setHuijiezongjie(String huijiezongjie) {
		this.huijiezongjie = huijiezongjie;
	}
	
	/**
	 * 获取：回结总结
	 */
	public String getHuijiezongjie() {
		return huijiezongjie;
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
