<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>임의의 값을 1부터 더하기</h3>
<% 
int sum = 0;
int n = Integer.parseInt(request.getParameter("num"));

for (int i = 1; i <= n; i++) {
	
		sum += i;
		out.print(i);
		if (i == n) {
			out.print("=");
			out.print(sum);
		}else {
			out.print("+");
		}
}		
%>

</body>
</html>