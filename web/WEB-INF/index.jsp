<%-- 
    Document   : index
    Created on : 15-Sep-2017, 9:18:01 AM
    Author     : awarsyle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World</h1>
        <div>
            <form action="HelloWorld" method="GET">
                First name: <input type="text" name="fname"><br>
                Last name: <input type="text" name="lname"><br>
                <input type="submit" value="Submit">
            </form>
        </div>
        ${errorMessage}
    </body>
</html>
