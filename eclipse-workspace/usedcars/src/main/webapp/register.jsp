<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎注册</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/component.css" />
<script src="${pageContext.request.contextPath}/js/registercheck.js"></script>
</head>
<body>
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h3>欢迎注册</h3>		
					<form action="${pageContext.request.contextPath}/user/register.action" name="register" method="post">
						<!--***************************************输入用户名***********************************************-->
						<div class="input_outer">
							<span class="title">用户名</span> <input name="userNetworkName"
								id="network_name" onblur="checkUser()" class="text"
								style="color: #FFFFFF !important" type="text"
								placeholder="请输入用户名">
						</div>
						<div id="user_prompt">由英文字母和数字组成的4-16位字符，字母开头</div>
						<!--***************************************输入密码*********************************************** -->
						<div class="input_outer">
							<span class="title">密码</span> <input name="userPassword" id="pwd"
								onblur="checkPwd() " class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="password" placeholder="请输入密码">
						</div>
						<div id="pwd_prompt">密码由英文字母和数字组成的4-10位字符</div>
						<!--***************************************确认密码*********************************************** -->
						<div class="input_outer">
							<span class="title">确认密码</span> <input name="conformuserPassword" id="repwd"
								onblur="checkRepwd()" class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="password" placeholder="请确认密码">
						</div>
						<div id="repwd_prompt"></div>
						<!--***************************************邮箱*************************************************** -->
						<div class="input_outer">
							<span class="title">邮箱</span> <input name="userEmail" id="email"
								onblur="checkEmail()" class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="text" placeholder="请输入邮箱">
						</div>
						<div id="email_prompt"></div>
						<!--***************************************手机号************************************************* -->
						<div class="input_outer">
							<span class="title">手机号</span> <input name="userMobileNumber"
								id="mobile" onblur="checkMobile()" class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="text" placeholder="请输入手机号">
						</div>
						<div id="mobile_prompt"></div>
						<!--***************************************验证码************************************************* -->
						
						<!--***************************************点击注册*********************************************** -->
						<div class="submit_reset">
							<input type="submit" class="submit" style="color: #FFFFFF"
								value="注册">
						</div>
					</form>
					<a href="index.jsp" style="color: #FFFFFF">已有账号？点击登录</a>
				</div>
	<div style="text-align: center;"></div>
</body>
</html>