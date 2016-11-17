<#include "common/_layout.ftl">
<@layoutHead title="网站"></@layoutHead>

<@layoutBody>
<!-- 这是nested的内容-->
<div class="container">
    <h1>添加用户</h1>
    <hr/>
    <form action="/addP" method="post" commandName="user" role="form">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name:"/>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="Enter Age:"/>
        </div>
        <div class="form-group">
            <label for="sex">Sex:</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="Enter Sex:"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form>
</div>

</@layoutBody>

<@layoutFooter></@layoutFooter>