package br.edu.utfpr.dv.siacoes.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JuryFormAppraiserReport {
	
	private int stage;
	private String title;
	private Date date;
	private String student;
	private String description;
	private String name;
	private String comments;
	private List<JuryFormAppraiserDetailReport> detail;
	
	public JuryFormAppraiserReport(){
		this.setStage(0);
		this.setTitle("");
		this.setDate(new Date());
		this.setStudent("");
		this.setDescription("");
		this.setName("");
		this.setComments("");
		this.setDetail(new ArrayList<JuryFormAppraiserDetailReport>());
	}
	
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<JuryFormAppraiserDetailReport> getDetail() {
		return detail;
	}
	public void setDetail(List<JuryFormAppraiserDetailReport> detail) {
		this.detail = detail;
	}

}