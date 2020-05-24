<%--
  Created by IntelliJ IDEA.
  User: wlz
  Date: 2020/2/26
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>查询所有用户</h2>
 <%--  <c:forEach items="${list}" var="member">
       ${member.mgender}

   </c:forEach>--%>

      <table class="table table-hover">
          <thead class="bg-light">
          <tr>
              <th scope="col" class="border-0">会员姓名</th>
              <th scope="col" class="border-0">会员卡号</th>
              <th scope="col" class="border-0">办卡时间</th>
              <th scope="col" class="border-0">会员账号</th>
              <th scope="col" class="border-0">会员性别</th>
              <th scope="col" class="border-0">会员年龄</th>
              <th scope="col" class="border-0">会员身高</th>
              <th scope="col" class="border-0">会员体重</th>
              <th scope="col" class="border-0">会员联系方式</th>
              <th scope="col" class="border-0">购买课时</th>
              <th scope="col" class="border-0">剩余课时</th>
          </tr>
          </thead>

          <tbody>
          <c:forEach items="${list}" var="member">
          <tr>
              <td>${member.mname}</td>
              <td>${member.cardid}</td>
              <td>${member.cardtime}</td>
              <td>${member.mage}</td>
              <td>${member.mheight}</td>
              <td>${member.mweight}</td>
              <td>${member.mphone}</td>
              <td>${member.cardclass}</td>
              <td>${member.nextclass}</td>
          </tr>
          </c:forEach>


          </tbody>
      </table>

  </div>
</body>
</html>
