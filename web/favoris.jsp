<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Models.Match"%>
<%@page import="java.lang.String"%>
<%@page import="DAO.MatchCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ include file="navbar.jsp" %>






<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>











<html>
    <head>
        <link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="FavorisServlet" method="get">
        <div class="container mb-3">
        <h1>Choisie ton favoris Equipe!</h1>
      
        
 
        
          <% 
          
          int idm = Integer.parseInt(request.getParameter("idm"));
          
          Integer id =(Integer)(session.getAttribute("id"));
         
       
       
           %>
        
           <table>
               <li>
               <dt>
           <input type="text" name="u" value="ID User: <%=session.getAttribute("id") %>" disabled>
           <input type="text" name="m" value="ID Match: <%=idm %>" disabled>
               </dt>
               </li>
           </table>
        <select name="equipe">
            <%
            
               MatchCRUD sc = new MatchCRUD();
              List<Match> liste = new ArrayList<Match>();
              liste = sc.getAllMatch(idm);
              for(Match l : liste){
            
            
            
            %>
            
            
            <option><%=l.getEquipe_h() %></option>
          <option ><%=l.getEquipe_v() %></option>
        </select>
        
        <%}%>
        
        
       <input type="submit" class="btn btn-danger" value="Favoris"> 
       
        
        </div>
        
        </form>
    </body>
</html>
