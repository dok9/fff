<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<head>
<link rel="shortcut icon" href="/static/favicon.ico" type="image/x-icon" />
<title>dok9</title>
</head>
<script type="text/javascript">

	function fnSubmit(arg){
		$("#_method").val(arg);
		$("#form1").attr('method','post').submit();
	}

	function fnDelExample(arg){
		
		//var tmpArr   = $("[value|='"+arg+"'][type='checkbox']");
		var tmpArr   = $("[name='no']");
		
/* 	alert(tmpArr.length);
		alert(arg);
		alert(tmpArr[arg].value); 
*/
		
		
		$("#exam" + arg).remove();
		//alert(arg);
	}
	function fnAddExample(){

		
		var tmpArr   = $("[name='no']");
		var cnt = tmpArr.length;
		var lastNo = 0;
		var nextNo = 1;
		
		if(cnt > 0){
			lastNo = tmpArr[cnt-1].value;
			nextNo = parseInt(lastNo) + 1;
		}
		
/* 		if(tmpArr.length == 0)
			alert(0);
		else
			alert(tmpArr.length); */
		
		//jQuery("#startExam").html(trHtml);
			
			
			
			
			html = "<div id='exam"+nextNo+"' name='exam"+nextNo+"'><input type='hidden' id='no' name='no' value='"+nextNo+"' >";
			html += "<p>";
			html += "	<span>번호 : <input type='text' name='EXAMNO' id='EXAMNO' value='"+nextNo+"'></span>";
			html += "	<span>디스플레이 번호 : <input type='text' name='EXAMAS' id='EXAMAS' value=''></span>";
			html += "<input type='button' onclick='fnDelExample("+nextNo+");' value='삭제' >";
			html += "</p>";
			html += "<p>";
			html += "	<span>텍스트 : <textarea rows='5' cols='50' name='EXAMTEXT' id='EXAMTEXT'></textarea></span>";
			html += "</p>";
			html += "<p>";
			html += "	<span>설명 : <textarea rows='5' cols='50' name='EXAMDESC' id='EXAMDESC'></textarea></span>";
			html += "</p>";
			html += "<p>";
			html += "	<span>해설 : <textarea rows='5' cols='50' name='NOTE' id='NOTE'></textarea></span>";
			html += "</p>";
			html += "</div>";
/* 			
			html = "<div id='exam"+nextNo+"' name='exam"+nextNo+"'><input type='hidden' id='no' name='no' value='"+nextNo+"' >";
			html += "<p>";
			html += "	<span>번호 : <input type='text' name='EXAMNO"+nextNo+"' id='EXAMNO"+nextNo+"' value='"+nextNo+"'></span>";
			html += "	<span>디스플레이 번호 : <input type='text' name='EXAMAS"+nextNo+"' id='EXAMAS"+nextNo+"' value=''></span>";
			html += "<input type='button' onclick='fnDelExample("+nextNo+");' value='삭제' >";
			html += "</p>";
			html += "<p>";
			html += "	<span>텍스트 : <textarea rows='5' cols='50' name='EXAMTEXT"+nextNo+"' id='EXAMTEXT"+nextNo+"'></textarea></span>";
			html += "</p>";
			html += "<p>";
			html += "	<span>설명 : <textarea rows='5' cols='50' name='EXAMDESC"+nextNo+"' id='EXAMDESC"+nextNo+"'></textarea></span>";
			html += "</p>";
			html += "<p>";
			html += "	<span>해설 : <textarea rows='5' cols='50' name='NOTE"+nextNo+"' id='NOTE"+nextNo+"'></textarea></span>";
			html += "</p>";
			html += "</div>"; */
			
/* 		html = "<div id='exam"+nextNo+"' name='exam"+nextNo+"'>poiu<input type='hidden' id='no' name='no' value='"+nextNo+"' >";
		html += "<input type='button' onclick='fnDelExample("+nextNo+");' value='삭제' >";
		html += "</div>"; */
		
		if(cnt == 0)
			$("#startExam").after(html);
		else{
			$("#exam"+lastNo).after(html);
		}
			
		
	}
</script>

<body>
	<h1></h1>
	
		<form id="form1" name="form1" action="/psytest/write" method="post">
			<input type="hidden" id="_method" name="_method" value="get">
			<input type="hidden" id="SUBPATH1" name="SUBPATH1" value="${LIST.SUBPATH1}">
			<input type="hidden" id="SUBPATH2" name="SUBPATH2" value="${LIST.SUBPATH2}">
			<input type="hidden" id="TYPE" name="TYPE" value="${LIST.TYPE}">
			<p>
				<span>주소 : www.dok9.xyz/psytest/${LIST.SUBPATH1}/${LIST.SUBPATH2}</span>
			</p>
			<p>
				<span>타이틀 : ${LIST.TITLE}</span>
			</p>
			<p>
				<span>타입 : <c:if test="${LIST.TYPE=='A'}">A타입 - (1문제 1해설)</c:if><c:if test="${LIST.TYPE=='B'}">B타입 - (여러문제 1해설)</c:if></span>
			</p>
			<p>
				<span>문제번호 : <input type="text" name="QUESTNO" id="QUESTNO" value="1"></span>
				<span>문제알리아스 : <input type="text" name="QUESTAS" id="QUESTAS" value=""></span>
			</p>
			<p>
				<span>문제 : <textarea rows="" cols="" name="QUESTTEXT" id="QUESTTEXT"></textarea></span>
			</p>
			<p>
				<span>문제설명 : <textarea rows="" cols="" name="QUESTDESC" id="QUESTDESC"></textarea></span>
			</p>
			<div style="border: 1px;">
				<div id="startExam" name="startExam"></div>
				<input type="button" value="보기추가" onclick="fnAddExample();"> 
			</div>
			<p>비밀번호 : <input type="password" name="PASSWORD" id="PASSWORD">
				<span name="TYPE_msg" id="TYPE_msg">&nbsp;(비밀번호를 입력해주세요.)</span>
			</p>
			
<!-- 			<div style="display: block;">
				<p>
					<span>번호 : <input type="text" name="EXAMNO" id="EXAMNO" value="1"></span>
					<span>디스플레이 번호 : <input type="text" name="EXAMAS" id="EXAMAS" value="1"></span>
				</p>
				<p>
					<span>텍스트 : <textarea rows="5" cols="50" name="EXAMTEXT" id="EXAMTEXT"></textarea></span>
				</p>
				<p>
					<span>설명 : <textarea rows="5" cols="50" name="EXAMDESC" id="EXAMDESC"></textarea></span>
				</p>
				<p>
					<span>해설 : <textarea rows="5" cols="50" name="NOTE" id="NOTE"></textarea></span>
				</p>
			</div> -->
		</form>
	

				<input type="button" value="등록" onclick="fnSubmit('put');"> 
</body>
</html>
