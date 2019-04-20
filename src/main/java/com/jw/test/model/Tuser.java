package com.jw.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "_user", schema = "")
public class Tuser implements java.io.Serializable {

	// Fields

	private long userId;

	private String userName;

	private long userPhone;

	@Id
	@Column(name = "user_id",  nullable = false, length = 36)
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Column(name = "user_name", nullable = false, length = 100)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "user_phone", nullable = false, length = 100)
	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 20)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Column(name = "score", nullable = false, length = 100)
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	private Date createTime;

	private int score;
	// Constructors

	/** default constructor */
	public Tuser() {
	}



}