package com.itvillage.servlet;

import com.google.gson.Gson;
import com.itvillage.vo.Todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TodoAjaxServlet", value = "/todoAjax")
public class TodoAjaxServlet extends HttpServlet {
    // Database를 대신한다.
    private List<Todo> todoList;

    @Override
    public void init() throws ServletException {
        super.init();
        this.todoList = new ArrayList<>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        Todo todo = new Todo(request.getParameter("todoName"), request.getParameter("todoDate"));

        todoList.add(todo);

        Gson gson = new Gson();
        String json = gson.toJson(todo);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.getWriter().write(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello TodoAjaxServlet doGet!");
        response.setContentType("application/x-json; charset=UTF-8");

        Gson gson = new Gson();
        String json = gson.toJson(todoList);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

    }
}
