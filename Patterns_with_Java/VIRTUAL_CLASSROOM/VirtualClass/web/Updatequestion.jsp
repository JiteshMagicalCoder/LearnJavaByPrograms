<%-- 
    Document   : Updatequestion
    Created on : Feb 11, 2016, 3:02:12 PM
    Author     : user
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE PAGE</title>
    </head>
    <body background="background.jpg">
        <br><br><br><br><br><br><br><br><br>

       
            <center><form action="UpdateQuestion1.jsp" method="post" ><table>
         
                        <%
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
                            PreparedStatement st=con.prepareStatement("select * from subject");
                            ResultSet rs=st.executeQuery();
                            out.print("<tr>");
                            out.print("<td>");
                            out.print("Subject Name:");
                            out.print("</td>");
                            out.print("<td>");
                            out.print("<select name='subName'>");
                            out.print("<option>Select</option>");
                            while(rs.next()){
                            out.print("<option>");
                            out.print(rs.getString("SubjectName"));
                            out.print("</option>");
                            }
                            out.print("</select> ");
                           out.print("<input type='submit' value='Go'>");
                            out.print("</td>");
                            out.print("</tr>");
                            con.close();
                            st.close();
                           
                        %>
                        
                         </table>
                </form>
                         </center>
    <center>                 
     <footer>
        <hr>
        <a href="AdminHome.jsp"><Button >Back</Button> </a>
    </footer>   
    </center>                  
                           
    </body>
</html>
