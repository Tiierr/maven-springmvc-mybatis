<#include "common/_layout.ftl">
<@layoutHead title="网站"></@layoutHead>

<@layoutBody>
<!-- 这是nested的内容-->
<div class="container">
    <h1>SpringMVC Demo</h1>
    <hr/>

    <h3>所有用户 <a href="/add" type="button" class="btn btn-primary btn-sm">添加</a></h3>
    <table class="table table-bordered table-striped">

    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>操作</th>

    <#--<th>CreateTime</th>-->
    </tr>
        <#list userList as oneUser>
        <tr>
            <td>${oneUser.name}</td>
            <td>${oneUser.age}</td>
            <#if oneUser.sex==1>
                <td>女</td>
            <#else>
                <td>男</td>
            </#if>
            <td>
                <a href="/update/${oneUser.user_id}" type="button" class="btn btn-sm btn-warning">修改</a>
                <a href="/delete/${oneUser.user_id}" type="button" class="btn btn-sm btn-danger">删除</a>
            </td>
            <#--<td>${oneUser.create_time}</td>-->
        </tr>
        </#list>
</table>
</div>

</@layoutBody>

<@layoutFooter></@layoutFooter>