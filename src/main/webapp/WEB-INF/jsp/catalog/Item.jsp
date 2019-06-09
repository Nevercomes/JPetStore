<%@ include file="../common/IncludeTop.jsp"%>

<div id="BackLink">
<a href="viewProduct?productId=${requestScope.product.productId}">Return to ${requestScope.product.productId}</a>
<a href="viewProduct?productId=${requestScope.product.productId}">Return to ${requestScope.product.productId}</a>
</div>

<div id="Catalog">

<table>
	<tr>
		<td>${requestScope.product.description}</td>
	</tr>
	<tr>
		<td><b> ${requestScope.item.itemId} </b></td>
	</tr>
	<tr>
		<td><b><font size="4"> ${requestScope.item.attribute1}
		${requestScope.item.attribute2} ${requestScope.item.attribute3}
		${requestScope.item.attribute4} ${requestScope.item.attribute5}
		${requestScope.product.name} </font></b></td>
	</tr>
	<tr>
		<td>${requestScope.product.name}</td>
	</tr>
	<tr>
		<td><c:if test="${requestScope.item.quantity <= 0}">
        Back ordered.
      </c:if> <c:if test="${requestScope.item.quantity > 0}">
      	${requestScope.item.quantity} in stock.
	  </c:if></td>
	</tr>
	<tr>
		<td><fmt:formatNumber value="${requestScope.item.listPrice}"
			pattern="$#,##0.00" /></td>
	</tr>

	<tr>
		<td>
			<a class="Button" href="addItem?workingItemId=${item.itemId}">Add to Cart</a>
		</td>
	</tr>
</table>

</div>

<%@ include file="../common/IncludeButtom.jsp"%>



