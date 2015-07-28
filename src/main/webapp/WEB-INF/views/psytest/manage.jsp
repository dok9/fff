<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<head>
<link rel="shortcut icon" href="/static/favicon.ico" type="image/x-icon" />
	<title>dok9</title>
</head>
<body>
<h1>
</h1>
<div style="display:block;" >
주소 : <br/>
www.dok9.xyz/psytest/
<form action="/psytest/manage" method="PUT" enctype="multipart/form-data">
<input type="text" name="PSYID1" id="PSYID1"> /
<input type="text" name="PSYID2" id="PSYID2">

<input type="button" value="NEW" >
<input type="button" value="MODIFY">
<input type="submit" value="NEW">
</form>
</div>

</body>
</html>
