<%-- 
    Document   : alta
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
   
    </head>
    <body>
        <br>
         <table class="table table-striped">
         <form method="pre" action="crear.jsp"> 
            
                <tr>
                  <td>
                    <div class="input-field">
                        <label for="nombre">Nombre</label>
                         <br><br>
                      <input type="text" name="nombre" id="nombre">
                      
                    </div>
                  </td>
                  <td>
                      
                    <div class="input-field">
                         <label for="apellido">apellido</label>
                          <br><br>
                      <input type="text" name="apellido" id="apellido">
                     
                    </div>
                  </td>
                  <td>
                      <label for="replica">Replica</label>
                       <br><br>
                      <input type="tel" name="replica" id="replica">
                      
                    
                  </td>
                  <td>
                    <div class="input-field">
                        <label for="sancion">Sancion</label>
                        <br><br>
                      <input type="text" name="sancion" id="sancion">
                      
                    </div>
                  </td>
                </tr>
                <tr>
                    <td><input type="hidden" name="codigo" value="<%=request.getParameter("codigo") %>">
                       <button class="btn btn-default" type="submit" name="Alta">
                        Apuntarse al campo
                      </button>
                    </td>
                 </tr>
         </form>
</table>
                    
                      
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>    
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
