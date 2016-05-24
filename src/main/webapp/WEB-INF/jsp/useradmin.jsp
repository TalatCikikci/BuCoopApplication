<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Admin Console - Users</title>
    </head>
    <body>
        <div class="span3">
            <div class="well sidebar-nav">
                <ul class="nav nav-list">
                    <h3>Administrative Tools</h3>
                    <li><a href="<c:url value="/useradmin" />">Users</a></li>
                    <li><a href="<c:url value="/productadmin" />">Products</a></li>
                    <li><a href="<c:url value="/produceradmin" />">Producers</a></li>
                    <li><a href="<c:url value="/announcementadmin" />">Announcements</a></li>
                </ul>
            </div>
        </div>
        <div class="span6">

        </div>
    </body>
</html>
