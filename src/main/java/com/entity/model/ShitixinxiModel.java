package com.entity.model;

import com.entity.ShitixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 试题信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-21 20:23:26
 */
public class ShitixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 题目编号
	 */
	
	private String timubianhao;
		
	/**
	 * 题目
	 */
	
	private String timu;
		
	/**
	 * 题目类型
	 */
	
	private String timuleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 选项
	 */
	
	private String xuanxiang;
		
	/**
	 * 得分
	 */
	
	private Integer defen;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：题目编号
	 */
	 
	public void setTimubianhao(String timubianhao) {
		this.timubianhao = timubianhao;
	}
	
	/**
	 * 获取：题目编号
	 */
	public String getTimubianhao() {
		return timubianhao;
	}
				
	
	/**
	 * 设置：题目
	 */
	 
	public void setTimu(String timu) {
		this.timu = timu;
	}
	
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
				
	
	/**
	 * 设置：题目类型
	 */
	 
	public void setTimuleixing(String timuleixing) {
		this.timuleixing = timuleixing;
	}
	
	/**
	 * 获取：题目类型
	 */
	public String getTimuleixing() {
		return timuleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：选项
	 */
	 
	public void setXuanxiang(String xuanxiang) {
		this.xuanxiang = xuanxiang;
	}
	
	/**
	 * 获取：选项
	 */
	public String getXuanxiang() {
		return xuanxiang;
	}
				
	
	/**
	 * 设置：得分
	 */
	 
	public void setDefen(Integer defen) {
		this.defen = defen;
	}
	
	/**
	 * 获取：得分
	 */
	public Integer getDefen() {
		return defen;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
