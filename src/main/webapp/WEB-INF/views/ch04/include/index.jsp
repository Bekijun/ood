<%-- 
    Document   : index
    Created on : 2025. 4. 9., 오후 10:28:00
    Author     : beki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>&lt;jsp:include&gt; 액션 예제</title>
    </head>
    <body>
        <!-- 절대 경로 사용 시에는 제어기(ch04Controller)에 RequestMapping 정의해서 사용 가능 -->
        <!-- jsp:include page="/jspf/header" -->
        <jsp:include page="header.jsp" />
        <%-- <jsp:include page="../../jspf/header.jsp" /> --%> <!-- 상대 경로상의 .jsp 포함 가능 -->
        본문 내용입니다.
        <% request.setCharacterEncoding("UTF-8");%>
        <jsp:include page="footer.jsp">
            <jsp:param name="date" value="<%=new java.util.Date()%>" />
            <jsp:param name="user" value="홍길동" />
        </jsp:include>
    </body>
</html>
