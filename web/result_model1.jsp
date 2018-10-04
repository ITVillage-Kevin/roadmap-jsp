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
<%@ page import="com.itvillage.vo.Todo" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");

    System.out.println("Hello Servlet doPost!");

    String todoName = request.getParameter("todoName");
    String todoDate = request.getParameter("todoDate");

    Todo.todoList.add(new Todo(todoName, todoDate));

    RequestDispatcher dispatcher = request.getRequestDispatcher("/todo_model1.jsp");
    request.setAttribute("todoList", Todo.todoList);

    dispatcher.forward(request, response);
%>
<html>
<head>
    <meta http-equiv="Content-Language" content="ko"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <title>TODO 등록</title>

    <script>

    </script>
</head>
<body>

</body>
</html>
