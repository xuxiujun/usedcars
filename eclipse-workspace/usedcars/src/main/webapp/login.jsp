<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<script src="js/sss.js"></script>
</head>
<body>
	<div class="container demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box_login">
					<h3>欢迎你</h3>
					
					<form action="user/login.action" name="f" method="post">
						<div class="input_outer">
							<span class="u_user"></span> <input name="userNetworkName" class="text"
								style="color: #FFFFFF !important" type="text"
								placeholder="请输入账户">
						</div>

						<div class="input_outer">
							<span class="us_uer"></span> <input name="userPassword" class="text"
								style="color: #FFFFFF !important; position: absolute; z-index: 100;"
								value="" type="password" placeholder="请输入密码">
						</div>
						<div class="submit_reset">

							<input type="submit" class="submit" style="color: #FFFFFF"
								value="登录">
						</div>
					</form>

					<a href="javascript:void(0);" onclick="hide11();return false;"
						style="color: #FFFFFF">还没账号？点击注册</a>

				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script src="js/TweenLite.min.js"></script>
	<script src="js/EasePack.min.js"></script>
	<script src="js/rAF.js"></script>
	<script src="js/demo-1.js"></script>
	<div style="text-align: center;"></div>
</body>
</html>