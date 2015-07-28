<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" pageEncoding="utf-8"%>
<html>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>


<script type="text/javascript">

	function fnSubmit(arg){
		$("#_method").val(arg);
		$("#form1").attr('method','post').submit();
	}

	function fnTest(){
		
		var tmpArr   = $("[name=qsno]");
		var tmpArr2   = $("[name=checked]");
	}
	function fnUnitSubmit(arg){
		
		var tmpArr   = $("[value|='"+arg+"'][type='checkbox']");
		var ans   = $("#ans"+arg).val();
		var ansArr = ans.split(',');
		
		var ansCnt = ansArr.length;
		
		var oksign = 0;
		var noSign = 0;
		$.each(tmpArr, function (index1, item1) {
			
			$("#ex"+item1.value).attr('color','red');
			
			if(item1.checked == true){
				
				var exArr = item1.value.split('-'); 
				
				var goodSing = 0;
				$.each(ansArr, function (index2, item2) {
					
					if(exArr[1]==item2){
						goodSing++;
					}
				});
				
				if(goodSing == 1){
					$("#ex"+item1.value).attr('color','blue');
					oksign++;
				} else{
					noSign++;
					$("#ex"+item1.value).attr('color','red');
				}
				
			} else{
				
				var exArr = item1.value.split('-'); 
				
				var bedSing = 0;
				$.each(ansArr, function (index2, item2) {
					
					if(exArr[1]==item2){
						bedSing++;
					} 
				});
				
				if(bedSing==1){
					noSign++;
					$("#ex"+item1.value).attr('color','red');
				} else{
					$("#ex"+item1.value).attr('color','black');
				}
			}
			
		});
		
		//alert(oksign);
		//alert(noSign);
		if(noSign == 0){
			$("#qs"+arg).attr('color','blue');
		} else{
			$("#qs"+arg).attr('color','red');
		}
		
		
	}
	
</script>

<head>
	<title>Home</title>
</head>
<body>

<form id="form1" name="form1">
<c:forEach items="${DATA}" var="DATA" varStatus="status">
	<font id="qs${DATA.QUESTIONNO}">${DATA.QUESTIONNO}. ${DATA.QUESTION}</font>
	 
	<input type="button" value="풀기" onclick="fnUnitSubmit(${DATA.QUESTIONNO});"/>
	<br>
	<input type="hidden" id="qsno" name="qsno" value="${DATA.QUESTIONNO}">
	<input type="hidden" id="ans${DATA.QUESTIONNO}" name="${DATA.QUESTIONNO}ans" value="${DATA.ANSWER}">
	<c:forEach items="${DATA.EXAMPLE}" var="EXAMPLE" varStatus="status2">
	
	<input type="checkbox" id="checked" name="checked" value="${EXAMPLE.QUESTIONNO}-${EXAMPLE.EXAMPLENO}" <%-- <c:if test="${ex.checked == 1}">checked</c:if> --%>/>
	<font id="ex${EXAMPLE.QUESTIONNO}-${EXAMPLE.EXAMPLENO}"> ${EXAMPLE.EXAMPLENO}. ${EXAMPLE.EXAMPLE} </font>
	<br />
	</c:forEach>
	<br>
		
</c:forEach>
		<input type="hidden" id="_method" name="_method" value="delete">
		<input type="button" value="post" onclick="fnSubmit('post');"/>
		<input type="button" value="put" onclick="fnSubmit('put');"/>
		<input type="button" value="delete" onclick="fnSubmit('delete');"/>
		<input type="button" value="test" onclick="fnTest();"/>
</form>	

</body>
</html>
