<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <title>开除学生</title>
    <base href="<%=basePath%>" />
</head>
<body>
    <div align="center">
        <form action="student/deleteStudent.do" method="post">
            <table>
                <tr>
                    <td>学号：</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="submit" value="开除！"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
