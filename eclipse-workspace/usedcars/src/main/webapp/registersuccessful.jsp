<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>注册成功</title>
<link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript">
			function dosearch() {
			var sf=document.searchform;
			var submitto = sf.sengine.value + escape(sf.searchterms.value);
			window.location.href = submitto;
			return false;
			}
		</script>
<script type="text/javascript">
	           var time = 8;/*  //时间,秒 */
			   function Redirect() {
               window.location = "<%=basePath%>index.jsp";
	           }
	           var i = 0;
	           function dis() {
		       document.all.s.innerHTML = "还剩" + (time - i) + "秒";
		       i++;
	            }
	           timer = setInterval('dis()', 1000); /* //显示时间 */
	           timer = setTimeout('Redirect()', time * 1000); /* //跳转 */
</script>
</head>
<body>

	<div class="header">
		<!-- <img src="img/Logo_sample.png" /> -->
	</div>

	<p class="error">注册成功</p>

	<div class="content">
		<h2>注册成功，我们正在为您跳转至登录页面</h2>

		<p>
		<h2>
			如果时间到未跳转，<a href="<%=basePath%>index.jsp">请点击此处</a>
		</h2>
		<p>
		<h2>
			<span id="s"></span>
		</h2>


	</div>

</body>
</html>