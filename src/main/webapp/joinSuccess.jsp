<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입완료</title>
</head>
<style>
body{ background-color: lightyellow; }
#Update li{ list-style:none; }
#btn{ background-color: whight;	text-color: whight; }
#Update > ul.actions { margin-top:10%; }
</style>
<body style="text-align: center;">

	<!-- Wrapper -->
	<div id="wrapper">
		<!-- Menu -->
			<nav id="Update">	
				<ul class="actions vertical">
					<li><h1>환영합니다!</h1></li><br>
					<li>회원가입을 축하합니다.</li><br>
					<!--  회원가입 한 회원 아이디를 출력-->
					<p>
					<button id="btn" onclick='location.href="Login.jsp"'>로그인하기 </button>
					<button id="btn" onclick='location.href="index.jsp"'>메인으로 </button>
					</p>
				</ul>
			</nav>			
	</div>

</body>
</html>