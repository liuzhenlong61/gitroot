package com.whaty.products.web.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user_score")
public class UserScore {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // 自增长
	@Column(name="id")
	private int id ;
	
	@Column(name="score")
	private Integer score;
	
	@Column(name="date_time")
	private Date dateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
}
