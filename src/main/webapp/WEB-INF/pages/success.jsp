<!-- 身体框架-->
<div class="card mb-3">
    <div class="card-header border-bottom">
        <h6 class="m-0">会员信息表</h6></div>
    <div class="selbody">

        <div class="card-body p-0 pb-3 text-center">
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

                <c:forEach items="${member}" var="member">
                    <tr>

                        <td>${member.mname}</td>
                        <td>${member.cardid}</td>
                        <td>${member.cardtime}</td>
                        <td>${member.mnumber}</td>
                        <td>${member.mgender}</td>
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
    </div>
</div>




