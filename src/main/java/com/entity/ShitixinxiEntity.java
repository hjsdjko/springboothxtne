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
 * 试题信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 20:23:26
 */
@TableName("shitixinxi")
public class ShitixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShitixinxiEntity() {
		
	}
	
	public ShitixinxiEntity(T t) {
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
	 * 科目类型
	 */
					
	private String kemuleixing;
	
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
	 * 设置：科目类型
	 */
	public void setKemuleixing(String kemuleixing) {
		this.kemuleixing = kemuleixing;
	}
	/**
	 * 获取：科目类型
	 */
	public String getKemuleixing() {
		return kemuleixing;
	}
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
