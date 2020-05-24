<%--
  Created by IntelliJ IDEA.
  User: wlz
  Date: 2020/3/25
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>SB Admin - Start Bootstrap Template</title>
    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom fonts for this template-->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">
    <script src="vendor/jquery/jquery.min.js"></script>

    <style type="text/css">
        body{
            background-image:url("./image/loginbackground.jpg") ;
        }
    </style>

    <script type="text/javascript">
        function beforeSubmit(loginfrom) {
            if (loginfrom.adminaccount.value == ''){
                alert("您还没输入账号");
                loginfrom.adminaccount.focus();
                return false;
            }
            if (loginfrom.adminpwd.value == ''){
                alert("您还没输入密码");
                return  false;
            }
            return true;
        }

    </script>
</head>

<body class="bg-dark">
<div class="container">
    <div class="card card-login mx-auto mt-5">
        <div class="card-header">会员用户登录</div>
        <div class="card-body">
            <form action="member/checkLogin" method="post" name="loginfrom"  onsubmit="return beforeSubmit(this)">
                <div class="form-group">
                    <label for="exampleInputEmail1">账号</label>
                    <input class="form-control" id="exampleInputEmail1" name="mnumber" placeholder="Account" onkeypress="return event.keyCode>=48&&event.keyCode<=57">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label>
                    <input class="form-control" id="exampleInputPassword1" name="mpwd" type="password" placeholder="Password">
                </div>
                <div class="form-group">
                    <div class="form-check">
                        <label class="form-check-label">
                            <input class="form-check-input" type="checkbox"> Remember Password</label>
                    </div>
                </div>
                <input type="submit" class="btn btn-success" value="登录">   -------------->
                <a href="login.jsp" class="btn btn-primary">转管理员登录</a>
            </form>

        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript-->

<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>

</body>
</html>
