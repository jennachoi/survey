package co.jiwon.prj.research.vo;

public class ResearchQuestionVO {
	/*
	이름        널        유형             
	--------- -------- -------------- 
	QID       NOT NULL NUMBER         
	ID        NOT NULL NUMBER         
	QORDER    NOT NULL NUMBER         
	QTITLE    NOT NULL VARCHAR2(1000) 
	QSUBTITLE NOT NULL VARCHAR2(1000) 
	QTYPE     NOT NULL VARCHAR2(20)    
	
	QTYPE S: Select box / R: Radio / C: 주관식 / SC: Select + 주관식
	 */

	private int qId;
	private int id;
	private int qOrder;
	private String qTitle;
	private String qSubtitle;
	private String qType;
	
	
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getqOrder() {
		return qOrder;
	}
	public void setqOrder(int qOrder) {
		this.qOrder = qOrder;
	}
	public String getqTitle() {
		return qTitle;
	}
	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}
	public String getqSubtitle() {
		return qSubtitle;
	}
	public void setqSubtitle(String qSubtitle) {
		this.qSubtitle = qSubtitle;
	}
	public String getqType() {
		return qType;
	}
	public void setqType(String qType) {
		this.qType = qType;
	}
	
	
}
