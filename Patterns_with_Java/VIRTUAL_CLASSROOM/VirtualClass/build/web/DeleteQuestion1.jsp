<%-- 
    Document   : DeleteQuestion1
    Created on : Feb 16, 2016, 8:48:19 PM
    Author     : RAVI
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Question</title>
    </head>
    <body background="background.jpg">
        <form action="DeleteQuestion" method="post">
            <%! int qno=0,eid=0;%>
            <%
                    try
                    {
                    String sub = request.getParameter("examid");
                    eid=Integer.parseInt(sub);

                     String q = request.getParameter("question").toString();
                     qno=Integer.parseInt(q);
                    }
                    catch(Exception e)
                    {
    
                    }
                    if (qno==0)
                    {
                        out.println("<script type='text/javascript'>");
                        out.println("alert('All Fields are Required');");
                        out.println("</script>");
                        RequestDispatcher rd = request.getRequestDispatcher("Deletequestion.jsp");
                        rd.include(request, response);
                    }
                    else 
                    {
                        
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/virtualclass", "root", "root");
                        PreparedStatement st = con.prepareStatement("delete from questionbank where QuestionNO=? and ExamId=?");
                        st.setInt(1,qno);
                        st.setInt(2,eid);

                        int x = st.executeUpdate();

                        if (x == 1)
                        {
                           PreparedStatement st1 = con.prepareStatement("update questionbank set QuestionNo=QuestionNo-1 where QuestionNo>? and ExamId=?");
                           st1.setInt(1,qno);
                           st1.setInt(2,eid);
                           x=st1.executeUpdate();
                           out.println("<script type='text/javascript'>");
                           out.println("alert('Question deleted successfully');");
                           out.println("</script>");
                           RequestDispatcher rd = request.getRequestDispatcher("Deletequestion.jsp");
                           rd.include(request, response);
                        }
                        else 
                        {
                            out.println("<script type='text/javascript'>");
                            out.println("alert('Oops!,Select valid data')");
                            out.println("</script>");
                            RequestDispatcher rd = request.getRequestDispatcher("Deletequestion.jsp");
                            rd.include(request, response);
                        }
                    }
                

            %>

        </form>
    </body>
</html>
