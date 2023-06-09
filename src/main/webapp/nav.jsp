<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.dropdown-item:active {
	background: #14870c;
}
</style>
<nav class="navbar navbar-expand-sm navbar-dark"
	style="margin-bottom: 30px; font-size: 18px; background-color: #14870c;">
	<div class="container-fluid">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link active" href="/bf"><b>Bike Friends</b></a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle id" role="button"
				data-bs-toggle="dropdown" style="color:white;">커뮤니티</a>
				<ul class="dropdown-menu">
					<li><a class="dropdown-item" href="/bf/bbs/grouplist">전체 게시판 목록</a></li>
					<li><a class="dropdown-item" href="/bf/course/list?page=1">코스 공유하기</a></li>
				</ul></li>
			<li class="nav-item"><a class="nav-link"
				href="/bf/bike/bikemain" style="color:white;">자전거정보</a></li>
			<li class="nav-item"><a class="nav-link" href="/bf/event/eventmain" style="color:white;">이벤트</a></li>
			<li class="nav-item"><a class="nav-link"
				href="/bf/payment/dailyticket.jsp" style="color:white;">이용권</a></li>
		</ul>
		<ul class="navbar-nav">
			<%
				if (session.getAttribute("id") == null) {
			%>
			<li class="nav-item" style="text-align: right;"><a
				class="nav-link" href="/bf/member/login.jsp" style="color:white;">로그인</a></li>
			<%
				} else {
			%>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" role="button"
				data-bs-toggle="dropdown" style="color:white;">${name}</a>
				<ul class="dropdown-menu dropdown-menu-end">
					<li><a class="dropdown-item"
						href="/bf/member/one?id=<%=session.getAttribute("id")%>">마이페이지</a></li>
					<li><a class="dropdown-item"
						href="/bf/note/receive_notelist?receiver=${id}">쪽지</a></li>
				</ul>
			</li>
			<li class="nav-item" style="text-align: right;"><a
				class="nav-link" href="/bf/member/logout" style="color:white;">로그아웃</a></li>
			<%
				}
			%>
		</ul>
	</div>
</nav>