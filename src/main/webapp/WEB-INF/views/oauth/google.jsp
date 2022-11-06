<!DOCTYPE html>
<meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<head>
    <meta charset="UTF-8">
    <title>Google OAuth</title>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script>
        $(function() {
            const uri = window.location.href;
            console.log(uri);
            let authcode =  uri.split("code=")[1];
            authcode = authcode.split("&scope")[0];

            opener.getGoogleAuthcode(authcode);
            window.close();
        });
    </script>
</head>
<body>
</body>
</html>