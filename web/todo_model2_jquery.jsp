<%--
  Created by IntelliJ IDEA.
  User: jshwang
  Date: 2018-08-28
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta http-equiv="Content-Language" content="ko"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <title>TODO 등록</title>
    <style>
        #todoList {
            border: 1px solid #8F8F8F;
            width: 500px;
            border-collapse: collapse;
        }

        th, td {
            padding: 5px;
            border: 1px solid #8F8F8F;
        }
    </style>

</head>
<body>
    <h3>TO DO 등록</h3>
    <div>
        <form id="todoForm" method="POST" action="/todo">
            <input type="text" name="todoName" id="todoName" value=""/>
            <input type="date" name="todoDate" id="todoDate" value=""/>
            <input type="button" id="btnReg" value="등록" onclick="registerTodo()"/>
        </form>
    </div>
    <div>
        <h4>TO DO List</h4>
        <table id="todoList">
            <thead>
                <tr>
                    <td align="center">todo name</td><td align="center">todo date</td>
                </tr>
            </thead>

            <tbody>
                <c:choose>
                    <c:when test="${fn:length(todoList) == 0}">
                        <tr>
                            <td align="center" colspan="2">할 일이 없습니다.</td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <c:forEach items="${todoList}" var="todo">
                            <tr>
                                <td>${todo.todoName}</td><td align="center">${todo.todoDate}</td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </tbody>
        </table>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#btnReg").click(function () {
                var todoName = $("#todoName").val();
                var todoDate = $("#todoDate").val();

                if(!todoName){
                    alert("할일을 입력해주세요.");
                }else if(!todoDate){
                    alert("날짜를 입력해주세요.");
                }else{
                    $("#todoForm").submit();
                }
            });
        });
    </script>
</body>
</html>
