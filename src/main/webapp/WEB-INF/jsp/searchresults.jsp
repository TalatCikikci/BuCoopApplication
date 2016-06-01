<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuCoop - Search Results</title>
    </head>
    <body>
        <h1>Search Results for ${searchitem}</h1>
        <div class="span12">
            <div class="span6">
                <h4>Product List</h4>
                <div class="area">
                    <div class="table-responsive">
                        <table class="table table-hover table-bordered table-striped">
                          <thead>
                                <tr>
                                    <th>Product Name</th>
                                    <th>Category</th>
                                    <th>Producer</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${productList}" var="productList">
                                    <tr>
                                        <td><c:out value="${productList.productname}"/></td>
                                        <td><c:out value="${productList.categoryname}"/></td>
                                        <td><c:out value="${productList.producername}"/></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
          </div>
          <div class="span6">
            SECOND COLUMN
          </div>
        </div>     
     
    </body>
</html>
