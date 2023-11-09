<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");

MemberDAO dao = new MemberDAO();
MemberDTO dto = dao.getMemberDTO(userId, userPwd);
dao.close();

if (dto.getId() != null) {
    session.setAttribute("UserId", dto.getId());
    session.setAttribute("UserName", dto.getName());
    response.sendRedirect("LoginForm.jsp");
}else {
    request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
    request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}
%>
<!DOCTYPE html>
<html>
<body>

</body>
</html>