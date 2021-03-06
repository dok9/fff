<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
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
</script>

<body>
	<h1></h1>
	<div style="display: block;">
		<form id="form1" name="form1" action="/psytest/master" method="post">
		<p># 자료를 입력해주세요.</p> 
			<p>
				주소 : www.dok9.xyz/psytest/
				<input type="hidden" id="_method" name="_method" value="get">
				<input type="text" name="SUBPATH1" id="SUBPATH1"> / 
				<input type="text" name="SUBPATH2" id="SUBPATH2">
				<span name="SUBPATH_msg" id="SUBPATH_msg">&nbsp;(주소를 입력해주세요.)</span>
			</p>
			<p>비밀번호 : <input type="password" name="PASSWORD" id="PASSWORD">
				<span name="TYPE_msg" id="TYPE_msg">&nbsp;(비밀번호를 입력해주세요.)</span>
			</p>
			<p>타입 : 
				<input type="radio" name="TYPE" value="A" checked="checked">A타입 - (1문제 1해설)
				<input type="radio" name="TYPE" value="B">B타입 - (여러문제 1해설)
				<span name="TYPE_msg" id="TYPE_msg">&nbsp;(타입를 입력해주세요.)</span>
			</p>
			
			<p>타이틀 :<span name="TITLE_msg" id="TITLE_msg">&nbsp;(타이틀을 입력해주세요.)</span>
			<br /><textarea rows="5" cols="50" name="TITLE" ID="TITLE"></textarea> </p>
			<p>
				<input type="button" value="등록" onclick="fnSubmit('put');"> 
				<input type="button" value="수정" onclick="fnSubmit('post');">
				<input type="button" value="삭제" onclick="fnSubmit('delete');">
			</p>
		</form>
	</div>

</body>
</html>
