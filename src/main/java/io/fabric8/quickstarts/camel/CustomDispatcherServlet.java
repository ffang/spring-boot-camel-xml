package io.fabric8.quickstarts.camel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

@Component("dispatcherServlet")
public class CustomDispatcherServlet extends DispatcherServlet {
    protected void doTrace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
        response.setStatus(405);
    }
}
