<#macro layoutHead title >
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>${title!""} - DEMO</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="shortcut icon" href="resources/images/favicon.ico">
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <#nested>

</head>
</#macro>

<#macro layoutBody>
<body>
<!--header-->
    <#include "_header.ftl" >
    <@header></@header>

<!--main start-->
    <!-- ECharts模块化单文件引入 -->
    <script src="resources/js/echarts/echarts.js"></script>

    <#nested>
<!--main end-->
</#macro>


<#macro layoutFooter>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <#nested>

</body>
</html>
</#macro>
