package com.adaptavant.sis.bean;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import java.io.Serializable;

@PersistenceCapable
public class MarkBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@Persistent
	private int sub1;
	@Persistent
	private int sub2;
	@Persistent
	private int sub3;
	@Persistent
	private int sub4;
	@Persistent
	private int sub5;
	@Persistent
	private int maxMarkSub1;
	@Persistent
	private int maxMarkSub2;
	@Persistent
	private int maxMarkSub3;
	@Persistent
	private int maxMarkSub4;
	@Persistent
	private int maxMarkSub5;
	@Persistent
	private int total;
	@Persistent
	private int MaxTotal;
	@Persistent
	private String grade;

	public int getMaxTotal() {
		return MaxTotal;
	}

	public void setMaxTotal(int maxTotal) {
		this.MaxTotal = maxTotal;
	}

	public int getMaxMarkSub1() {
		return maxMarkSub1;
	}

	public void setMaxMarkSub1(int maxMarkSub1) {
		this.maxMarkSub1 = maxMarkSub1;
	}

	public int getMaxMarkSub2() {
		return maxMarkSub2;
	}

	public void setMaxMarkSub2(int maxMarkSub2) {
		this.maxMarkSub2 = maxMarkSub2;
	}

	public int getMaxMarkSub3() {
		return maxMarkSub3;
	}

	public void setMaxMarkSub3(int maxMarkSub3) {
		this.maxMarkSub3 = maxMarkSub3;
	}

	public int getMaxMarkSub4() {
		return maxMarkSub4;
	}

	public void setMaxMarkSub4(int maxMarkSub4) {
		this.maxMarkSub4 = maxMarkSub4;
	}

	public int getMaxMarkSub5() {
		return maxMarkSub5;
	}

	public void setMaxMarkSub5(int maxMarkSub5) {
		this.maxMarkSub5 = maxMarkSub5;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getSub5() {
		return sub5;
	}

	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}

	public int gettotal() {
		return total;
	}

	public void settotal(int gtotal) {
		this.total = gtotal;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
