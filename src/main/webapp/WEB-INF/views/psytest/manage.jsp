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
			<p>
				주소 : www.dok9.xyz/psytest/
				<input type="hidden" id="_method" name="_method" value="get">
				<input type="text" name="PSYID1" id="PSYID1"> / 
				<input type="text" name="PSYID2" id="PSYID2"> 
			</p>
			<p>비밀번호 : <input type="password" name="PASSWORD" id="PASSWORD"></p>
			<p>
				<input type="button" value="등록" onclick="fnSubmit('put');"> 
				<input type="button" value="수정" onclick="fnSubmit('post');">
				<input type="button" value="삭제" onclick="fnSubmit('delete');">
			</p>
		</form>
	</div>

</body>
</html>
