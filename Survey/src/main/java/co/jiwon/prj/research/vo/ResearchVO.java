package co.jiwon.prj.research.vo;

import java.sql.Date;

public class ResearchVO {
	/*
	이름      널        유형            
	------- -------- ------------- 
	ID      NOT NULL NUMBER        
	TITLE   NOT NULL VARCHAR2(100) 
	WRITER  NOT NULL VARCHAR2(20)  
	SDATE   NOT NULL DATE          
	EDATE   NOT NULL DATE          
	GUBUN   NOT NULL VARCHAR2(20)  
	COURSE  NOT NULL VARCHAR2(100) 
	RNUMBER NOT NULL NUMBER        
	*/
	
	private int id;
	private String title;
	private String writer;
	private Date sdate;
	private Date edate;
	private String gubun;
	private String course;
	private int rnumber;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRnumber() {
		return rnumber;
	}
	public void setRnumber(int rnumber) {
		this.rnumber = rnumber;
	}
}
