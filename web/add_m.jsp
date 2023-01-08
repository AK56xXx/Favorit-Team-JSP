<%@page import="java.sql.SQLException"%>
<%@page import="DAO.DbConnect"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Models.Equipe"%>
<%@page import="DAO.EquipeCRUD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.MatchCRUD"%>
<%@page import="java.util.List"%>
<%@page import="Models.Match"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="navbar2.jsp" %>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
     
    </style>
    <body>
        <form method="post" action="/EquipeFav/AddMatchServlet"> 
            
            
            <%
DbConnect c = new DbConnect();

try{
Connection con = c.getConn();
PreparedStatement ps;
String sql = "SELECT * FROM equipe";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
%>
                
              

              
        <div class="container">
        <h1>Ajouter un Match</h1>
        
        
        <table class="table">
            
            
              <tr>
                <th>Date: <input type="text" name="date" placeholder="Date" </th>
              </tr>
            
            <tr>
                <th>Heure: <input type="text" name="heure" placeholder="Heure" </th>
            </tr>
            
            <tr>
                <th>Equipe(Home):  <select name="Equipe1">
                          <%
            while(rs.next()){
             
                String nom=rs.getString("nome");
            %>
            
            
                <option value="<%=nom%>"><%=nom%></option>
            <%}%>
            
                    </select>
                
                </th>
                
              
                
            </tr>
            
            <tr>
                <th>Equipe(Visitor):  <select name="Equipe2">
                        
                <%
              EquipeCRUD sc = new EquipeCRUD();
              List<Equipe> liste = new ArrayList<Equipe>();
              liste = sc.getAllEquipes();
              for(Equipe l : liste){
            %>
                       <option value="<%=l.getNom_e() %>"><%=l.getNom_e() %></option>
                        <%}%>
                    </select>
                
                </th>
            </tr>
            
            <tr>
            <th>Score(E.H):  <input type="number" name="score1" placeholder="Score(Equipe 1)" </th>
            </tr>
            
            <tr>
            <th>Score(E.V): <input type="number" name="score2" placeholder="Score(Equipe 2)" </th>
            </tr>
            
            <tr>
            <th>Etat: <input type="text" name="etat" placeholder="Etat" </th>
            </tr>
            
            <tr>
                <th> <input type="submit" value="Ajouter" </th>
            </tr>
            
            
            
        
            
            
            
            
            
        </table>

        
        
        
        
        
        
        
           <% 
          
         
          
         
         
       
       
           %>
        
     
        
        
         </div>
             
<%
}
catch(SQLException sqe)
{ 
out.println(sqe);
}
%>

        </form>
    </body>
    
 

</html>
