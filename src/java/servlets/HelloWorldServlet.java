/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author awarsyle
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // retrieves fname and lname from the form
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        
        // set the attributes for the JSP
        request.setAttribute("firstname", firstName);
        request.setAttribute("lastname", lastName);
        
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldJSP.jsp").
                forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
    }
}
