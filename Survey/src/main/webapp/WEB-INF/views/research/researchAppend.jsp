<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사지</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.0.js"></script>
<script type="text/javascript">


	function resultSet(len) {
		var gid = [];
		
	    var fileValue = $("input[name='fileData']").length;
	    var fileData = new Array(fileValue);
	    for(var i=0; i<fileValue; i++){                          
	         fileData[i] = $("input[name='fileData']")[i].value;
	}
	}
	    
	function resultQid(len) {
		var len = frm.len.length
		var	qidArray = new Array(len);
		for(var i=0; i<len; i++) {
			qidArray[i] = document.getElementsByClassName("qid")[i].value
		}
		console.log(qidArray);
	}
	
	function resultQorder(len) {
		var len = frm.len.length
		var	qorderArray = new Array(len);
		for(var i=0; i<len; i++) {
			qorderArray[i] = document.getElementsByClassName("qorder")[i].value
		}
		console.log(qorderArray);
	}
	
	
	    
</script>
</head>
<body>
	<div align="center">
		<div>
			<h1>설문조사</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="researchAppendWrite.do"
				method="post">
				<div>
					<table border="1">
						<tr>
							<td colspan="2" width="700" height="200" align="center">
								<h1>
									<b>${researchTitle.title }</b>
								</h1>
								<h4>종료일자: ${researchTitle.edate }</h4> ${fn:length(qlists) }건<br>
							</td>
						</tr>
						<c:forEach var="q" items="${qlists }">
							<input type="hidden" id="len" name="len" value="${fn:length(qlists) }">
							<input type="hidden" id="qid" name="qid" value="${q.qId }" class="qid">
							<input type="hidden" id="qorder" name="qorder" value="${q.qOrder }" class="qorder">
							<tr>
								<th width="50">문항 ${q.qOrder }</th>
								<td>${q.qTitle }</td>
							</tr>
							<c:set var="qstr" value="${fn:split(q.qSubtitle, ',') }"></c:set>
							<tr>
								<td colspan="2" width="700"><c:choose>
										<c:when test="${q.qType eq 'S' }">
											<c:forEach var="str" items="${qstr }">
												<input type="checkbox" id="qResult[${q.qOrder }]"
													name="qResult[${q.qOrder }]" value="${str }">${str }
											</c:forEach>
										</c:when>
										<c:when test="${q.qType eq 'R' }">
											<c:forEach var="str" items="${qstr }">
												<input type="radio" id="qResult[${q.qOrder }]"
													name="qResult[${q.qOrder }]" value="${str }">${str }
											</c:forEach>
										</c:when>
										<c:when test="${q.qType eq 'C' }">
											${q.qSubtitle } : <input type="text"
												id="qResult[${q.qOrder }]" name="qResult[${q.qOrder }]">
										</c:when>
										<c:when test="${q.qType eq 'SC' }">
											<c:forEach var="str" items="${qstr }">
												<input type="checkbox" id="qResult[${q.qOrder }]"
													name="qResult[${q.qOrder }]" value="${str }">${str }
												<c:if test="${str eq '기타' }">
													<input type="text" id="qResultText[${q.qOrder }]"
														name="qResultText[${q.qOrder }]">
												</c:if>
											</c:forEach>
										</c:when>
									</c:choose></td>
							</tr>
						</c:forEach>
					</table>
				</div>
				<br>
				<button type="button" onclick="resultQorder(len)">결과제출</button>
				&nbsp;&nbsp;
				<button type="reset">취소</button>
			</form>
		</div>
	</div>
</body>
</html>