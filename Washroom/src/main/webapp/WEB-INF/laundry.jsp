<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/stylesheet.css">
<meta charset="ISO-8859-1">
<title>Laundry Room</title>
</head>
<body class="text-center">
	<div class="container">
		<div class="row">
			<div class="col-9">
				<h2>Wall</h2>
			</div>
			<div class="col-3">
				<h2>Door</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-9">


				<h3>Dryers</h3>
				<table>
					<tr>
						<c:forEach items="${dryers}" var="dryer">
							<c:if test="${dryer.machineRow == 'top' }">
								<td class="${dryer.inUse }"><c:choose>
										<c:when test="${dryer.inUse == false }">
											<form action="/dryer/use/${dryer.id }" method="post">
												<label for="start">Started: </label> <input type="time"
													name="start"> <label for="finish">Finish: </label>
												<input type="time" name="finish">
												<button>Start Dryer</button>
											</form>
										</c:when>
										<c:otherwise>
											<p>Started: ${dryer.startTime }</p>
											<p>Finish Time ${dryer.finishTime }</p>
											<form action="/dryer/empty/${dryer.id }" method="post">
												<button>Empty</button>
											</form>
										</c:otherwise>
									</c:choose></td>
							</c:if>
						</c:forEach>
					</tr>
					<tr>
						<c:forEach items="${dryers}" var="dryer">
							<c:if test="${dryer.machineRow == 'bottom' }">
								<td class="${dryer.inUse }"><c:choose>
										<c:when test="${dryer.inUse == false }">
											<form action="/dryer/use/${dryer.id }" method="post">
												<label for="start">Started: </label> <input type="time"
													name="start"> <label for="finish">Finish: </label>
												<input type="time" name="finish">
												<button>Start Dryer</button>
											</form>
										</c:when>
										<c:otherwise>
											<p>Started: ${dryer.startTime }</p>
											<p>Finish Time ${dryer.finishTime }</p>
											<form action="/dryer/empty/${dryer.id }" method="post">
												<button>Empty</button>
											</form>
										</c:otherwise>
									</c:choose></td>
							</c:if>
						</c:forEach>
					</tr>
				</table>

				<h3>Washing Machines</h3>
				<table>
					<tr>
						<c:forEach items="${washers}" var="washer">
							<c:if test="${washer.machineRow == 'front' }">
								<td class="${washer.inUse }"><c:choose>
										<c:when test="${washer.inUse == false }">
											<form action="/washer/use/${washer.id }" method="post">
												<label for="start">Started: </label> <input type="time"
													name="start"> <label for="finish">Finish: </label>
												<input type="time" name="finish">
												<button>Start Washer</button>
											</form>
										</c:when>
										<c:otherwise>
											<p>Started: ${washer.startTime }</p>
											<p>Finish Time ${washer.finishTime }</p>
											<form action="/washer/empty/${washer.id }" method="post">
												<button>Empty</button>
											</form>
										</c:otherwise>
									</c:choose></td>
							</c:if>
						</c:forEach>
					</tr>
					<tr>
						<c:forEach items="${washers}" var="washer">
							<c:if test="${washer.machineRow == 'back' }">
								<td class="${washer.inUse }"><c:choose>
										<c:when test="${washer.inUse == false }">
											<form action="/washer/use/${washer.id }" method="post">
												<label for="start">Started: </label> <input type="time"
													name="start"> <label for="finish">Finish: </label>
												<input type="time" name="finish">
												<button>Start Washer</button>
											</form>
										</c:when>
										<c:otherwise>
											<p>Started: ${washer.startTime }</p>
											<p>Finish Time ${washer.finishTime }</p>
											<form action="/washer/empty/${washer.id }" method="post">
												<button>Empty</button>
											</form>
										</c:otherwise>
									</c:choose></td>
							</c:if>
						</c:forEach>
					</tr>
				</table>
			</div>
			<div class="col-3"></div>

		</div>


		<div class="row">
			<div class="col-3">
				<h2><-- Door to office</h2>
			</div>
			<div class="col-9"></div>

		</div>


	</div>
</body>
</html>