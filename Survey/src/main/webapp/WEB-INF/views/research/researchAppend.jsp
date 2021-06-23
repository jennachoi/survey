<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사지</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>설문조사</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="researchAppendWrite.do" method="post">
				<input type="hidden" name="qid" value="${researchTitle.id }">
				<input type="hidden" name="qorder" value="${q.qOrder }">
				<div>
					<table border="1">
						<tr>
							<td colspan="2" width="700" height="200" align="center">
								<h1>
									<b>${researchTitle.title }</b>
								</h1>
								<h4>종료일자: ${researchTitle.edate }</h4>
							</td>
						</tr>
						<c:forEach var="q" items="${qlists }">
							<tr>
								<th width="50">문항 ${q.qOrder }</th>
								<td>${q.qTitle }</td>
							</tr>
							<c:set var="qstr" value="${fn:split(q.qSubtitle, ',') }"></c:set>
							<tr>
								<td colspan="2" width="700">
									<c:choose>
										<c:when test="${q.qType eq 'S' }">
											<c:forEach var="str" items="${qstr }">
												<input type="checkbox" name="qResult[${q.qOrder }]" value="${str }">${str }
											</c:forEach>
										</c:when>
										<c:when test="${q.qType eq 'R' }">
											<c:forEach var="str" items="${qstr }">
												<input type="radio" name="qResult[${q.qOrder }]" value="${str }">${str }
											</c:forEach>
										</c:when>
										<c:when test="${q.qType eq 'C' }">
											${q.qSubtitle } : <input type="text" name="qResult[${q.qOrder }]">
										</c:when>
										<c:when test="${q.qType eq 'SC' }">
											<c:forEach var="str" items="${qstr }">
												<input type="checkbox" name="qResult[${q.qOrder }]" value="${str }">${str }
												<c:if test="${str eq '기타' }">
													<input type="text" name="qResultText[${q.qOrder }]">
												</c:if>
											</c:forEach>
										</c:when>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div><br>
				<button type="submit">결과제출</button>&nbsp;&nbsp;
				<button type="reset">취소</button>
			</form>
		</div>
	</div>
</body>
</html>