<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<#import "./mymacro.ftlh" as com>

<@com.book bs=["三国演义","水浒传"]>
    <h1>hello javaboy!</h1>
</@com.book>
<hr>
<#noparse>
<#include './javaboy.ftlh'>
</#noparse>
<div>
    <#assign age=23>
    <#if (age>60)>老年人
    <#elseif (age>40)>中年人
    <#elseif (age>20)>青年人
    <#else> 少年人
    </#if>
</div>

<div>
    <#assign age=99>
    <#switch age>
        <#case 23>23<#break>
        <#case 24>24<#break>
        <#default>9999
    </#switch>
</div>
<div>
    <div>${"hello"?cap_first}</div>
    <div>${"HELLO"?lower_case}</div>
    <div>${"hello"?upper_case}</div>
    <div>${" hello "?trim}</div>
    <div>${users?size}</div>
    <div>${3.14?int}</div>
    <div>${birthday?string("yyyy-MM-dd")}</div>
</div>

<div>${aaa!"aaa"}</div>

<div>
    <#if aaa??>
        aaa
    </#if>
</div>

<div>
    <#assign age=99>
    <#if age=99>age=99</#if>
    <#if age gt 99>age gt 99</#if>
    <hr>
    <#if (age > 99) || 1==1>(age > 99) || 1==1</#if>
    <hr>
    <#if age gte 99>age gte 99</#if>
    <#if age lt 99>age lt 99</#if>
    <#if age lte 99>age lte 99</#if>
    <#if age!=99>age!=99</#if>
    <#if age==99>age==99</#if>
</div>

<div>
    <#assign age=99>
    <div>${age*99/99+99-1}</div>
</div>

<#list [1,2,3]+[4,5,6] as x>
    <div>${x}</div>
</#list>

<#list (info+{"address":"www.javaboy.org"})?keys as key>
    <div>${key}</div>
</#list>

<div>${"hello ${name}"}</div>
<div>${"hello "+name}</div>
<div>${name[0]}${name[1]}</div>
<div>${name[1..3]}</div>

<div>${info.name}</div>
<div>${info['age']}</div>

<#list info?keys as key>
    <div>${key}</div>
</#list>

<#list info?values as value>
    <div>${value}</div>
</#list>

<div>${name}</div>

<table border="1">
    <#list users as u>
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.address}</td>
            <td>${u_index}</td>
            <td>${u_has_next?string("yes","no")}</td>
        </tr>
    </#list>
</table>

<div>${users[1].address}</div>
<table border="1">
    <#list users[3..5] as u>
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.address}</td>
        </tr>
    </#list>
</table>
<hr>
<#assign userinfo={"name":"javaboy","address":"www.javaboy.org"}>

<#list userinfo?keys as key>
    <div>${key}-${userinfo[key]}</div>
</#list>

<hr>

<#list userinfo?values as value>
    <div>${value}</div>
</#list>

<hr>
<div>${userinfo.name}</div>
<div>${userinfo['address']}</div>

<#list 1..5 as x>
    <div>${x}</div>
</#list>
<hr>
<#list 5..1 as x>
    <div>${x}</div>
</#list>

<#list [2+2,"javaboy","javagirl"] as x>
    <div>${x}</div>
</#list>

<#assign flag=true>

<div>${flag?string("yes","no")}</div>

<#assign price=99>

<div>${price?string.currency}</div>
<div>${price?string.percent}</div>

<div>${"hello，我是直接输出的字符串"}</div>
<div>${r"C:\"}</div>

<table border="1">
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.address}</td>
        </tr>
    </#list>
</table>
</body>
</html>