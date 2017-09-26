<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr" %>
<%@ taglib prefix="ui" uri="http://www.jahia.org/tags/uiComponentsLib" %>
<%@ taglib prefix="functions" uri="http://www.jahia.org/tags/functions" %>
<%@ taglib prefix="query" uri="http://www.jahia.org/tags/queryLib" %>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib" %>
<%@ taglib prefix="s" uri="http://www.jahia.org/tags/search" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<form name="myForm" action="<c:url value='${url.base}${currentNode.path}.myForm.do'/>" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <label for="image">Image </label>
        <label class="btn btn-default btn-file">
            Select file...<input type="file" name="image" accept="image/*" id="image" style="display: none;">
        </label>
    </div>
    <div class="form-group">
        <label for="name">Name:</label>
        <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>
    <div class="form-group">
        <label for="surname">Surname:</label>
        <input type="text" class="form-control" id="surname" placeholder="Enter surname" name="surname">
    </div>
    <div class="form-group">
        <label for="bday">Bday:</label>
        <input type="date" class="form-control" id="bday" placeholder="Enter birthday date" name="bday">
    </div>
    <div class="form-group">
        <label for="surname">Work place:</label>
        <input type="text" class="form-control" id="workPlace" placeholder="Enter work place" name="workPlace">
    </div>

    <input type="hidden" value="${url.base}/sites/mySite/success" name="redirect" id="redirect">
    <button type="submit" class="btn btn-default">Submit</button>

</form>
<a href="/cms/all">Get all journalists</a>