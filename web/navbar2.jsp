<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="/EquipeFav/LogoutAdmin" method="post">
<nav class="navbar navbar-expand-sm navbar-dark bg-primary mb-3">
<div class="container">
<a href="/EquipeFav/adminindex.jsp" class="navbar-brand">Admin panel</a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#mobile-nav">

<span class="navbar-toggle-icon"></span>
</button>

<div class="collapse navbar-collapse" id="mobile-nav">
<ul class="navbar-nav ml-auto">

<li class="nav-item">
<a href="/EquipeFav/adminuser.jsp" class="nav-link">Gestion Users</a>
</li>

<li class="nav-item">
<a href="/EquipeFav/adminequipe.jsp" class="nav-link">Gestion Equipe</a>
</li>

<li class="nav-item">
   <a href="/EquipeFav/adminindex.jsp" class="nav-link">Gestion Match</a>
</li>

</ul>
</div>

</div>
    

    <input class="btn btn-outline-secondary" type="submit" value="Logout">

</nav>
    
</form>
        
        
        
        
        
        
        
        
        
    </body>
</html>
