<#macro book bs>
    <table>
        <#list bs as b>
            <tr>
                <td>${b}</td>
            </tr>
        </#list>
    </table>
    <#nested>
</#macro>