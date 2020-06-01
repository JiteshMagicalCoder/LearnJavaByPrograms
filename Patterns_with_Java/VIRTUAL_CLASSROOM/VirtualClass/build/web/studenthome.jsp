<%-- 
    Document   : studenthome.jsp
    Created on : Feb 10, 2016, 1:21:29 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>STUDENT HOME</title>
    </head>
<body background="background.jpg">  
<div align="center">
 <!-------------------- display current date ---------------------------------------->
        <h2>
            <font color="#ff0080">
            <script type="text/javascript">
                var m_names = new Array("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
                var d = new Date();
                var curr_date = d.getDate();
                var curr_month = d.getMonth();
                var curr_year = d.getFullYear();
                document.write(curr_date + "-" + m_names[curr_month] + "-" + curr_year);
            </script>
            </FONT>
        </h2>
</div>
    <img src="images/vclass.PNG" height="200" width="1350">
<%
 String name=session.getAttribute("username").toString();
  out.println("<h4>");
  out.println("<font color=\"Blue\">");
  out.println("Welcome "+name);
  out.println("</font>");
  String lastlogin=session.getAttribute("Last_Login").toString();
  out.println("<div style=\"float:right\">");
  out.println("<form action=\"logout.jsp\" method=\"post\">");
  out.println("<font color=\"red\">");
  out.println("Last Login: "+lastlogin);
  out.println("</font>");
  out.println("<input type=\"submit\" name=\"submit\" value=\"Logout\" height=\"30\" width=\"50\">");
  out.println("</form>");
  out.println("</div>");
  out.println("</h4>");
%>
<hr>
<!----------------------------------------------------Latest News and Images---------------->
<div style="float:left">
<table border="1" bgcolor="#00FFFF">
<caption> <font color="#000000"><u>Latest News </u></font></caption>
<tr>
<td width="180" height="100">
<marquee direction="up">
<p> 1: LIC AAO Exam 2016 </p>
<p> 2: SSC CPO 2016</p>
<p> 3: SSC CGL </p>
<p> 4: CDS </p>
</marquee>
</td>
</tr>
</table>
<table border="0">
<tr>
<td height="50" width="180">
    <a href="submit_queries.jsp"><input type="image" src="images/askexpert.PNG" alt="submit" width="200" height="30"></a>
</td>
</tr>
<tr>
<td height="50" width="180">
    <a href="WatchVideo"><input type="image" src="images/watchvedio.PNG" alt="submit" width="200" height="30"></a>
</td>
</tr>

</table>
</div>
 <!-------------------------------------our services------------------->
<div style="float:right">
 <table border="1" bgcolor="#00FFFF">
<caption> <font color="#000000"><u>OUR NEW SERVICES </u> </font></caption>
<tr>
<td width="183">
<marquee direction="up">
<p> 1: VIDEO TUTORIALS </p>
<p> 2: LIVE EXPERT COUNCIL</p>
<p> 3: SEMINARS </p>
<p> 4: DISSCUSSION SESSION 


</p>
</marquee>
</td>
</tr>
</table>
<table border="0">
<tr>
<td height="50" width="180">
    <a href="testpage.jsp"><input type="image" src="images/taketest.PNG" alt="submit" width="200" height="30"></a>
</td>
</tr>
<tr>
<td height="50" width="180">
    <a href="view_report.jsp"><input type="image" src="images/viewreport.PNG" alt="submit" width="200" height="30"></a>

</td>
</tr>
<tr>
<td height="50" width="180">
    <a href="feedback.jsp"><input type="image" src="images/feedback.PNG" alt="submit" width="200" height="30"></a>

</td>
</tr>
</table>
</div>

<!---------------------------Welcome Message------------------------------------------------>

<br><br>
<center>
<table bgcolor="#99FFFF" border="0">
<tr>
<td height="50" width="1000">
<font color="blue">
<p>
<h3>
Welcome,<br>
We provides easy and point to point learning of Technical as well as Aptitude Topics. 
In this website, you will get a lot of useful tutorials with simple examples. There are
online test facility for student to check what They Learn.<br>
Let's see what are the topics...
</h3>
</p>
</font>
</td>
</tr>
</table>
</center>
<br>

 
 
 
<!---------------------------get subject------------------------------------------------>
<center>
   <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
        PreparedStatement st = con.prepareStatement("select * from subject");
        ResultSet rs = st.executeQuery();
        out.println("<center>");
        
        
        out.println("<form action='StudentHome' method='post'>");
        out.println("Select Subject:");
        out.print("<select name=\"choose\" id=\"ch\">");
        out.print("<option>");
        out.println("select");
        out.print("</option>");
        while (rs.next()) {
            out.println("<option>");
            out.println(rs.getString("SubjectName"));
            out.println("</option>");
        }
        out.println("</select>");
        out.println("<input type='submit' name='go' value='go'>");
        out.println("</form>");
        String course =request.getParameter("message");
        System.out.println("course");
        out.println("</center>");
        
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        
       out.println("<video width=\"600\" height=\"400\" controls>");
       out.println("<source src='vedios/motivational.mp4' type=\"video/mp4\">");
       out.println("Your browser does not support the video tag");
       out.println("</video>"); 
        
  %>
  
  
  
</center>     
</body>
</html>
