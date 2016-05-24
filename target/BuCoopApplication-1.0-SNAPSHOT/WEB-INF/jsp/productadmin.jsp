<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Admin Console - Products</title>
    </head>
    <body>
        <div class="container">
            <div class="row-fluid">
                <div class="span12">
                    <div class="page-header">
                        <h1 class="form-heading">Product List</h1>
                    </div>
                    <div class="span3">
                        <div class="well sidebar-nav">
                            <ul class="nav nav-list">
                                <li class="nav-header">Administrative Tools</li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/useradmin" />">Users</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/useradmin" />">List Users</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/requestadmin" />">Membership Requests</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/productadmin" />">Products</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/productadmin" />">List Products</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/addproduct" />">Add Products</a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/produceradmin" />">Producers</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/produceradmin" />">List Producers</a>
                                        </li>   
                                        <li>
                                        <a href="<c:url value="/addproducer" />">Add Producers</a>
                                        </li>
                                    </ul>                    
                                </li>
                                <li class="dropdown-submenu"><a tabindex="-1" href="<c:url value="/announcementadmin" />">Announcements</a>
                                    <ul class="well dropdown-menu">
                                        <li>
                                        <a href="<c:url value="/announcementadmin" />">List Announcements</a>
                                        </li>
                                        <li>
                                        <a href="<c:url value="/addannouncement" />">Add Announcements</a>
                                        </li>
                                    </ul>                    
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="area">
                            <div class="table-responsive">
                                <table class="table-hover table-bordered">
                                  <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Product Name</th>
                                            <th>Quantity</th>
                                            <th>Category</th>
                                            <th>Producer</th>
                                            <th>Operations</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>İzmir Tulum</td>
                                            <td>10kg</td>
                                            <td>Peynir</td>
                                            <td>Mehmet Aga</td>
                                            <td><button class="close">&times;</button></td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Kars Gravyer</td>
                                            <td>5kg</td>
                                            <td>Peynir</td>
                                            <td>Ayşe Teyze</td>
                                            <td><button class="close">&times;</button></td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Köy Yumurtası</td>
                                            <td>2kg</td>
                                            <td>Yumurta</td>
                                            <td>Keskinoğlu</td>
                                            <td><button class="close">&times;</button></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>