﻿<%@ page contentType="text/html; charset=utf-8"%>
<%@ include file = "GenXmlData.jsp" %>
<%
String data = request.getParameter("data"); 
String QuerySQL =  "";

if (!data.equals("")) {
	QuerySQL = "select m.consignee,m.delivery_number,m.custom_company,m.consignee_address,m.deli_time, "
		+ "d.product_name,d.specifications,d.out_num,d.carton_price "
		+ "from (carton_out_info m inner join cartonOut d ) "
		+ "on m.delivery_number=d.delivery_number "
		+ "where m.fake=0 and d.fake=0 and m.delivery_number= "+data;
}


if (QuerySQL != "") {
	XML_GenOneRecordset(response, QuerySQL);
}
else {
	ArrayList<ReportQueryItem> QueryItems = new ArrayList<ReportQueryItem>();

	if (QueryItems.size() == 0) {
		ResponseText(response, "没有为数据 '" + data + "' 分配处理程序，无法获取到报表数据！", ResponseDataType.PlainText);
	}
	else {
		XML_GenMultiRecordset(response, QueryItems);
	}
}
%> 