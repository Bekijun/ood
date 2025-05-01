<%-- 
    Document   : index
    Created on : 2025. 4. 30., 오후 12:27:08
    Author     : beki
--%>

<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 환경설정이 Mac이기 때문에 경로 수정 -->
<c:set value="/Users/beki/jsp/download" var="targetDirectory" />
<jsp:useBean id="fileList" scope="page"
             class="deu.se.ood.ch07.file_download.beans.FileListBean" />
<jsp:setProperty name="fileList" property="dirName" value="${targetDirectory}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>파일 내려받기</title>
    </head>
    <body>
        <h1>파일 내려받기</h1>
        <hr/>
        원하는 파일을 선택하세요. <br/> <br/>
        
        <form action="${pageContext.request.contextPath}/ch07/FileDownload/download.do" method="POST">
            <c:forEach var="fileName" items="${fileList.relativeFileList}">
                <input type="radio" name="D1" value="${fileName}" /> ${fileName} <br>
            </c:forEach>
            <br/>
            <input type="hidden" name="AbsolutePath" value="${targetDirectory}" />
            <input type="submit" value="내려받기" />
        </form>
    </body>
</html>
