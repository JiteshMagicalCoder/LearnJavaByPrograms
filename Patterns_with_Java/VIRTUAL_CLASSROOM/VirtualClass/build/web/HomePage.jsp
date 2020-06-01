<%-- 
    Document   : HomePage
    Created on : Feb 10, 2016, 1:22:59 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="background.jpg">
    <center>
      <%! int idhitcount;int visiters=0;%>
      <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
                PreparedStatement st = con.prepareStatement("select * from hitcount");
                ResultSet rs =st.executeQuery();
                if(rs.next())
                {
                    int idhitcount=rs.getInt("idhitcount");
                    visiters=idhitcount+1;
                    PreparedStatement st1 = con.prepareStatement("update hitcount set idhitcount=?");
                    st1.setInt(1,visiters);
                     int x=st1.executeUpdate();

                }
                
                
      %>
        <br><br>
        <img src="images/display.jpg" height="400" width="1000"><br><br><br><br><br>
        <a href="AdminLogin.jsp"><input type="image" src="images/adminlogin.PNG" alt="submit" width="200" height="30"> </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="studentlogin.jsp"><input type="image" src="images/studentlogin.PNG" alt="submit" width="150" height="30"> </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="Registration.jsp"><input type="image" src="images/registerhere.PNG" alt="submit" width="150" height="30"></a> </button>
    </center>
    <br>
    <hr>
    <center>
    <h6> All right reserved &COPY; JRS Group </h6>
     
     <%
         out.println("<h3>");
         out.println("Total Visiters:"+visiters);
         out.println("</h3>");
     %>
    </center>
         
            
</body>
</html>
