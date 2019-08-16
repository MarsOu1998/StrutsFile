<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: air
  Date: 2019-08-16
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <html:form action="/upload" method="post" enctype="multipart/form-data"><br/>
    请您选择一个文件进行上传:<br/>
        <html:file property="myFile"></html:file><br/>
    <html:submit value="上传"/>
    </html:form>

</body>
</html>
