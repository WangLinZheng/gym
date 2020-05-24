<%--
  Created by IntelliJ IDEA.
  User: wlz
  Date: 2020/2/26
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="member/findAll">点一下</a>
<a href="main.jsp">点两下，主页</a>
<a href="login.jsp">登录</a>
<a href="">会员主页</a>
<h1>新增会员测试</h1>
<form action="member/saveMember" method="post">
    id:<input type="text" name="mid"><br>
    账号:<input type="text" name="mnumber"><br>
    密码:<input type="text" name="mpwd"><br>
    姓名:<input type="text" name="mname"><br>
    性别:<input type="text" name="mgender"><br>
    年龄:<input type="text" name="mage"><br>
    身高cm:<input type="text" name="mheight"><br>
    体重kg:<input type="text" name="mweight"><br>
    联系电话:<input type="text" name="mphone"><br>
    会员卡号:<input type="text" name="cardid"><br>
    办卡时间:<input type="text" name="cardtime"><br>
    课时:<input type="text" name="cardclass"><br>
    剩余课时:<input type="text" name="nextclass"><br>
    <input type="submit" value="提交">



</form>
</body>
</html>
