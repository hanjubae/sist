<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.khy.mini.MiniDao"%>
<%@page import="com.khy.mini.MiniBean"%>    
<% request.setCharacterEncoding("UTF-8"); %>    

<%
    MiniBean miniBean = new MiniBean();
    MiniDao miniDao   = new MiniDao();


    
	String mini_id     = request.getParameter("mi_id");  
	String mini_passwd   = request.getParameter("mi_passwd");	
	 //String mini_date     = request.getParameter("mi_date");
	   

	miniBean.setMi_id(mini_id);
	miniBean.setMini_passwd(mini_passwd);
	//checkPasswd 메서드를 통해 사용자가 입력한 비밀번호 인증
	HashMap<String,String> data =(HashMap<String,String>) miniDao.checkPasswd(mini_id,mini_passwd) ;
	String vsPasswd = data.get("mi_passwd");
	System.out.println("vsPasswd="+vsPasswd);
	System.out.println("mini_passwd="+mini_passwd);
	if(vsPasswd.equals(mini_passwd)==false){
		out.println("<script> alert('비밀번호가 일치하지 않습니다.'); history.go(-1); </script>");
	}
	
	
%>
       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='../css/common.css' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>:::Mini_Book:::</title>

<script>
	function onAction()
	{
		
		var frm = document.frmWrite;
		/*이름 Validation*/
		if(frm.mi_name.value.length == 0 )
		{
			alert('이름을 입력하세요.');
			frm.mi_name.focus();
			return;
		}
		
		/*Email Validation*/
		if(frm.mi_email.value.length == 0 )
		{
			alert('이메일을 입력하세요.');
			frm.mi_email.focus();
			return;
		}		
		
		/*mi_passwd Validation*/
		if(frm.mi_passwd.value.length == 0 )
		{
			alert('비밀번호를 입력하세요.');
			frm.mi_passwd.focus();
			return;
		}	
		
		/*mi_contents Validation*/
		if(frm.mi_contents.value.length == 0 )
		{
			alert('내용을 입력하세요.');
			frm.mi_contents.focus();
			return;
		}		
		frm.action.value="update";
		frm.action="mini_cont.jsp";
		frm.submit();
	}

	// 삭제버튼처리를 위한 자바스크립트 메서드
	function del_confirm() {
		yn = confirm("삭제하시겠습니까 ?");
		if(yn) {
			var frm = document.frmWrite;
			frm.action.value="delete";
			frm.action="mini_cont.jsp";
			frm.submit();
		}
	}
	
	// list로 이동
	function do_list() {
		frmWrite.action="mini_search_list.jsp";
		frmWrite.submit();
	}
</script>

</head>
<body>

 <center>
    <h2>mini : 수정하기</h2>
    <hr/>
 <form name="frmWrite" method="post" action="mini_cont.jsp">   
  <input type=hidden name="action" value="update">
  <input type=hidden name="mi_id" value="<%=mini_id %>" >
              
    <table cellpadding="5" cellspacing="0" border="1" width="500">
      <tr>
      	<td bgcolor="#99ccff" height="23">작성자</td>
      	<td><input type="text" name="mi_name"  size="20"  value="<%=data.get("mi_name")%>" /> </td>
      </tr>
      <tr>
      	<td bgcolor="#99ccff" height="23">작성일</td>
      	<td><input type="text" name="mi_date"  size="20" value="<%=data.get("mi_date")%>" /> </td>
      </tr>      
      <tr>
        <td bgcolor="#99ccff" height="23">e-mail</td>
        <td ><input type="text" name="mi_email"  size="20" value="<%=data.get("mi_email")%>"  /> </td>
      </tr>
      <tr>
        <td bgcolor="#99ccff" height="23">비밀번호</td>
        <td><input type="password" name="mi_passwd"  size="20" value="<%=data.get("mi_passwd")%>" /> </td>
      </tr>      
      <tr>
        <td colspan="2"><textarea rows=5 name="mi_contents" cols="40"><%=data.get("mi_contents")%></textarea></td>
      </tr>
      <tr>
      	<td colspan=2 align=center><input type=submit value="저장"> 
      	<input type=button value="목록" onClick="do_list()">
	    <input type=button value="삭제" onClick="del_confirm()">
	 </td>           
    </table>
 </center>
 </form>
</body>
</html>