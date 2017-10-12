<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>

	<c:forEach items="${cs}" var="c" varStatus="st">
		<tr>
			<td>${c.lin_Ye_Ju}</td>
			<td>${c.shenQing_RQ}</td>
			<td>${c.pi_Ci}</td>
			<td>${c.shenQing_WH}</td>
			<td>${c.piZhun_WH}</td>
			<td>${c.lei_Xing}</td>
			<td>${c.shou_Li_Ren}</td>
			<td>${c.shouLi_RQ}</td>
			<td>${c.shen_He_Ren}</td>
			<td>${c.zhuang_Tai}</td>
			<td>${c.shouLi_TZD}</td>
			<td>${c.yaoJian_SHD}</td>
			<td>${c.shenHe_BGD}</td>
			<td>${c.shen_Pi_Dan}</td>
			
		</tr>
	</c:forEach>
</table>

<div style="text-align: center">
	<a href="?start=0">首 页</a> <a href="?start=${page.start-page.count}">上一页</a>
	<a href="?start=${page.start+page.count}">下一页</a> <a
		href="?start=${page.last}">末 页</a>
</div>