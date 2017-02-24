<%
/*------------------------------------------------------------
 * 페이지명:	main.jsp
 * 설      명:	main페이지
 * Table:
 * 작성자 :	다현아빠
 * 버    전:	0.1
 *-----------------------------------------------------------*/
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//Contents영역 정의
	String contentsDiv = request.getParameter("cont_div");
	if(null == contentsDiv)contentsDiv="";

    //contentsDiv = "300200";
    String contents    = "";
    
    //Content영역 교체
    switch(contentsDiv)
    {
    	case "500105":/* 메인 Default  */
    		contents = "default.jsp";
    		break;
    		
    	case "800101":/*default*/
    		contents = "default.jsp";
    		
    		break;
       	case "800201":/*공지사항*/
       		contents = "../mini/mini_search_list.jsp";
       		break;
        		
    	default:
    		contents = "default.jsp";
    		break;
    		
    }
    
	String loginContents     ="";
	
	String id=(String)session.getAttribute("id");
	
    if(id==null)
    	loginContents="login.jsp";
    else
    	loginContents="logout.jsp";
	
		


%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:::::SIST_GIT:::::</title>
</head>
<body>
	<center>
		<table border=1 bordercolor=black width=900 height=700>
		    <!-- Top -->
			<tr>
				<td colspan="2" height="80" align="center" >
					<font face="맑은 고딕" size="20" >야하자</font>
				</td>
			</tr>
			<!--// Top -->
			
		    <!-- Left & Contents -->
			<tr>
			    <!-- Contents -->
				<td width="700" height="570" valign="top">
					<jsp:include page="<%=contents %>"></jsp:include>
				</td>
				<!--// Contents -->
				
				<!-- Menu -->
				<td width="200" height="570" valign="top">
					<jsp:include page="<%=loginContents %>"></jsp:include>
			        <div style="margin-top: 50px">
			          <jsp:include page="left.jsp"></jsp:include>
			        </div>					
				</td>
				<!--// Menu -->
			</tr>
			<!--// Left & Contents -->			
			
			<!-- Bottom --> 
			<tr>
				<td colspan="2"  height="50" >Copyright KHL.co.</td>
			</tr>	
			<!-- Bottom -->
			
		</table>
	</center>
</body>
</html>