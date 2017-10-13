<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>

	<c:forEach items="${spjl}" var="spjl" varStatus="st">
		<tr>
			<td>${spjl.lin_Ye_Ju}</td>
			<td>${spjl.shenQing_RQ}</td>
			<td>${spjl.pi_Ci}</td>
			<td>${spjl.shenQing_WH}</td>
			<td>${spjl.piZhun_WH}</td>
			<td>${spjl.lei_Xing}</td>
			<td>${spjl.shou_Li_Ren}</td>
			<td>${spjl.shouLi_RQ}</td>
			<td>${spjl.shen_He_Ren}</td>
			<td>${spjl.zhuang_Tai}</td>
			<td>${spjl.shouLi_TZD}</td>
			<td>${spjl.yaoJian_SHD}</td>
			<td>${spjl.shenHe_BGD}</td>
			<td>${spjl.shen_Pi_Dan}</td>			
		</tr>
	</c:forEach>
</table>



<div style="text-align: center">
	<a href="?start=0">首 页</a> <a href="?start=${page.start-page.count}">上一页</a>
	<a href="?start=${page.start+page.count}">下一页</a> <a
		href="?start=${page.last}">末 页</a>
</div>