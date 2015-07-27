<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

123123
123123
${vo}
  <c:forEach var="test" items="${vo.testList2}">
 ${test.test1} <br />
 ${test.test2} <br />
 ${test.test3} <br />
  </c:forEach> 


</body>
</html>
