<%-- 
    Document   : query
    Created on : Feb 16, 2016, 2:46:48 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int x=0; String user;String id;String queries;%>
        <%
            user = session.getAttribute("username").toString();
            id = session.getAttribute("emailid").toString();
            queries = request.getParameter("a");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
            PreparedStatement st1=con.prepareStatement("select * from problems");
            ResultSet rs =st1.executeQuery();
            int count =0;
            while(rs.next())
            {
                count++;
            }

            PreparedStatement st=con.prepareStatement("insert into problems(sno,name,email_id,question) values(?,?,?,?)");
            st.setInt(1,count+1);
            st.setString(2,user);
            st.setString(3,id);
            st.setString(4,queries);
            x=st.executeUpdate();
            if(x==1)
            {
                out.println("Query submitted");
            }
        %>
        
    <center>
        <br>
        <br><%
                       out.println("<a href=\"studenthome.jsp\"> <input type=\"button\" name=\"Back\" value=\"Back\"></a>");
          %>
    </center>
</body>
</html>
