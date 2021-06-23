package co.jiwon.prj.research.vo;

public class ResearchResponseVO {
	/*
	이름         널        유형             
	---------- -------- -------------- 
	RESPONSEID NOT NULL NUMBER         
	QID        NOT NULL NUMBER         
	QORDER     NOT NULL NUMBER         
	QRESULT    NOT NULL VARCHAR2(1000) 
	*/
	
	private int responseId;
	private int qId;
	private int qOrder;
	private String qResult;

	public int getResponseId() {
		return responseId;
	}
	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public int getqOrder() {
		return qOrder;
	}
	public void setqOrder(int qOrder) {
		this.qOrder = qOrder;
	}
	public String getqResult() {
		return qResult;
	}
	public void setqResult(String qResult) {
		this.qResult = qResult;
	}
	
}
