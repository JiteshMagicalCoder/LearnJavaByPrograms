<%-- 
    Document   : submit_queries
    Created on : Feb 15, 2016, 10:46:03 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Query page</title>
    </head>
    <body bgcolor="cyan">
        <br>
        <br>
        <br>
        <%! String name = "";
             String mail = "";%>
        <%String name = session.getAttribute("username").toString();
            String mail = session.getAttribute("emailid").toString();

      
        %>
    <marquee><font color="red">Submit your queries here. We will try to solve your problem within reasonable time</font></marquee> 
    <br>
    <br>
    Question:
        <form action="query.jsp" method="post">
          <textarea rows="10" cols="150" name="a" ></textarea><br>
            <input type="submit" value="POST"  name="submit">
              <input type="reset" value="Reset"  name="reset">
        </form>
</body>
</html>
