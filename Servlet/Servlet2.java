/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jitesh
 */
public class Servlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
       // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            String nm=request.getParameter("n");
            String uname=request.getParameter("u");
            String pass=request.getParameter("p");
            String gen=request.getParameter("g");
            String fath=request.getParameter("f");
            String st=request.getParameter("c");
            String add=request.getParameter("add");
            String mbno=request.getParameter("mb");
            String s="insert into newregisteration values('"+nm+"','"+uname+"','"+pass+"','"+gen+"','"+fath+"','"+st+"','"+add+"','"+mbno+"')";
                   
           
                Class.forName("oracle.jdbc.driver.OracleDriver");
                        
               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jitesh");
               System.out.println("Connecting to database");  
               Statement stmt=con.createStatement();     
               int a= stmt.executeUpdate(s);
                System.out.println("data inserted");
                if(a==1){
                   response.sendRedirect("Registeration.jsp");
                     }
               
        } catch (SQLException ex) {
            Logger.getLogger(Servlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servlet2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
