<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fff" uri="http://www.springframework.org/tags"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="/static/favicon.ico" type="image/x-icon" />
<title>dok9</title>
<div align="right">
	<p>
		<fff:message code="common.filed.static.language" />&nbsp;:&nbsp;
		<a href="/lang/?lang=ko"><fff:message code="common.filed.static.language.korea" /></a>&nbsp;
		<a href="/lang/?lang=en"><fff:message code="common.filed.static.language.english" /></a>
	</p>
</div>
</head>
<body>
<script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '1626339620953877',
      xfbml      : true,
      version    : 'v2.4'
    });
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
</script>
<h1>
	<fff:message code="common.filed.text.top1" /><br />
	<fff:message code="common.filed.text.top2" />
</h1>

<div
  class="fb-like"
  data-share="true"
  data-width="450"
  data-show-faces="true">
</div>
</body>
</html>
