package com.itvillage.servlet;

import com.itvillage.vo.ToDo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "TodoServlet")
public class TodoServlet extends HttpServlet {
    // Database를 대신한다.
    private List<ToDo> todoList;

    @Override
    public void init() throws ServletException {
        super.init();
        this.todoList = new ArrayList<>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("Hello Servlet doPost!");

        String todoName = request.getParameter("todoName");
        String todoDate = request.getParameter("todoDate");

        todoList.add(new ToDo(todoName, todoDate));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/todo.jsp");
        request.setAttribute("todoList", todoList);

        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello Servlet doGet!");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/todo.jsp");
//        request.setAttribute("todoList", todoList);
        dispatcher.forward(request, response);
    }
}
