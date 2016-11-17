<#include "common/_layout.ftl">
<@layoutHead title="网站"></@layoutHead>

<@layoutBody>
<!-- 这是nested的内容-->
<div class="container">
    <h1>修改用户</h1>
    <hr/>

    <form action="/updateP" method="post" commandName="user" role="form">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name:" value="${user.name}"/>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="Enter Age:" value="${user.age}"/>
        </div>
        <div class="form-group">
            <label for="sex">Sex:</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="Enter Sex:" value="${user.sex}"/>
        </div>
        <input type="hidden" id="user_id" name="user_id" value="${user.user_id}"/>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form>
</div>

</@layoutBody>

<@layoutFooter></@layoutFooter>