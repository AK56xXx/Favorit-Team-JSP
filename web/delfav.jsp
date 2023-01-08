<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete!</title>
    </head>
    <body>
        
        <form action="DeleteServlet" method="get">
            <div class="container">
        
        <%
       
         int idx =Integer.parseInt(request.getParameter("idf"));
         String e = request.getParameter("e");
         
            
    
        
        %>
        <h1>Confirmation</h1>
        <hr>
        <table class="table">
            <tr>
            <th>  Delete Equipe: <%=e%> </th>
            </tr>
            
            <tr>
            <th> <input type="text" name="idx" value="ID:<%=idx%>" disabled></th>
        </tr>
      
        <tr>
        <th>  <a href="DeleteServlet?idf=<%=idx%>" class="btn btn-dark">Delete</a></th>
            </tr>
            </div>
        <form>
    </body>
</html>
