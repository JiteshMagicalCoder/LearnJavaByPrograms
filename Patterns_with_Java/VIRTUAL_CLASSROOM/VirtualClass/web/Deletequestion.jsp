<%-- 
    Document   : Deletequestion
    Created on : Feb 11, 2016, 3:04:51 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Question</title>
        <script type="text/javascript">
        function getdata()
        {
            var name = document.getElementById('subject_topic').value;
            window.location.replace("Addtopic.jsp?subject" + name);


        }
    </script>
    </head>
    <body background="background.jpg">
    <center>
     <%! String name = "",sub="";int eid =0;%>
       
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
            PreparedStatement st = con.prepareStatement("select * from subject");
            ResultSet rs = st.executeQuery();
            out.println("<center>");
            out.println("<form action='Deletequestion.jsp' method='post'>");
            out.println("Select Subject:");
            out.print("<select name='subject' id='subject_topic'>");
            out.print("<option>");
            out.println("select");
            out.print("</option>");
            while (rs.next()) {

        %>       
        <option value=<%=rs.getString("SubjectName")%>>
            <%=rs.getString("SubjectName")%>
        </option>
        <%
              }
            out.println("<input type=\"submit\" value=\"go\">");
            out.println("</form>");
        %>
    </center>
    
      <%
            out.println("<br><br>");
            name = request.getParameter("subject");
            if (name == null) {

            } 
            else 
            {
                if (name.equalsIgnoreCase("select")) 
                {
                    out.println("<script type='text/javascript'>");
                    out.println("alert('choose valid subject...');");
                    out.println("</script>");

                }
                else 
                {
                    sub = name;
                    PreparedStatement st1 = con.prepareStatement("select * from exams where ExamName=?");
                    st1.setString(1,sub);
                    ResultSet rs1 = st1.executeQuery();

                    while(rs1.next())
                    {
                        eid=rs1.getInt("ExamId");
                        break;
                    }

                    PreparedStatement st2= con.prepareStatement("select * from questionbank where ExamId=?");
                    st2.setInt(1,eid);
                    ResultSet rs2= st2.executeQuery();
                    out.print("<table border='1' bgcolor='cyan' width='1500'>");
                    out.print("<th>");
                    out.print("S.No.");
                    out.print("</th>");
                    out.println("<th>");
                    out.print("Question");
                    out.print("</th>");
                    out.print("<th>");
                    out.print("Option A");
                    out.print("</th>"); 
                    out.print("<th>");
                    out.print("Option B");
                    out.print("</th>");
                     out.print("<th>");
                    out.print("Option C");
                    out.print("</th>");
                     out.print("<th>");
                    out.print("Option D");
                    out.print("</th>");
                     out.print("<th>");
                    out.print("Answer");
                    out.print("</th>");
                     out.print("<th>");
                    out.print("Exam Id");
                    out.print("</th>");
                    while (rs2.next()) 
                    {
                        out.print("<tr>");
                        out.print("<td>");
                        out.print(rs2.getString("QuestionNo"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("Question"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("OptionA"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("OptionB"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("OptionC"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("OptionD"));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(rs2.getString("Answer"));
                        out.print("</td>");
                         out.print("<td>");
                        out.print(rs2.getString("ExamId"));
                        out.print("</td>");
                        
                    }
                    out.println("</table>");
                
        %>       
</center>
     <br><br><br><br><br>
        
    <form action="DeleteQuestion1.jsp" method="post">
        <center>
           
            <table>
                <caption><font color="red">Enter Your Choice To Delete Question</font></caption>
                <tr>
                    <td>
                        Subject Name:  
                    </td>
                    <td>
                        <input type="text" name="subject" value='<%=sub%>' readonly>   
                    </td>
                </tr>
                <tr>
                    <td>
                        Exam Id:
                    </td>
                    <td>
                        <input type="text" name="examid" value="<%=eid%>" readonly>   
                    </td>
                </tr>
                <tr>
                    <td>
                        Enter Question No:
                    </td>
                    <td>
                       <input type="text" name="question">
                    </td>
                </tr>
                 <tr>
                     <td>
                      <input type="submit" name="topics" value="Delete">
                     </td>
                </tr>
            </table>
        </center>
    </form>
    <%
                }
            }
     %>
  
 <center>
    <footer>
        <hr>
        <a href="AdminHome.jsp"><Button >Back</Button> </a>
    </footer>   
    </center>
 </body>
</html>
