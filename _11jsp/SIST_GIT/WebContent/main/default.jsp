<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.khy.mini.MiniDao"%>
<%@page import="com.khy.mini.MiniBean"%> 
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%
	  
 	MiniDao miniDao = new MiniDao();
	//빈즈에서 가지고 올 게시물 데이터를 보관하고 있는 ArrayList 를 처리하기 위한 변수
	//ArrayList<HashMap> datas = miniDao.selectDBList();
	int page_num  = 1;
	int page_size = 10;
	
	String strPageSize = (request.getParameter("page_size")==null)?"10":request.getParameter("page_size");
	page_size = Integer.parseInt(strPageSize);
	
	String search_div   = (request.getParameter("search_div")==null)?"":request.getParameter("search_div");
	String search_word  = (request.getParameter("search_word")==null)?"":request.getParameter("search_word");
	System.out.println("search_word:"+search_word);   
	ArrayList<HashMap> datas = miniDao.selectPageList(1, page_size, search_div, search_word);
	// ArrayList 를 좀더 쉽게처리하기 위한 iterator 생성.
	Iterator iter = datas.iterator();
%>

<HTML>
<HEAD><TITLE>:::MiniBook::: </TITLE>

<script type="text/javascript">
    /*
    	검색으로 이동
    */
	function do_search()
	{
		//console.log("do_search");
		var frm = document.searchForm;
		var select = document.getElementById("page_size");
		var option_value = select.options[select.selectedIndex].value;
		//console.log(option_value);
		if(option_value==""){
			return;
		}
		
		
		
		frm.submit();
	}
	/*
	 등록으로 이동
	*/
	function do_insert()
	{
		var frm = document.searchForm;
		frm.action="mini_form.jsp";
		frm.submit();
	}
	
	/*
	 Enter Event처리
	*/
	function on_keydown()
	{		
		if(f.keyCode == 13){ 
			do_search();
		}
	}
</script>
</HEAD>

<BODY>
<form name="searchForm" action="main.jsp" method="post">
 <input type="hidden"  name="cont_div"  value="800101"/>
<center>
<H2> mini_book</H2>
<HR>
<table cellpadding=5 cellspacing=0 border="0" width=640>
	<tr>
	 	<td>
		<div id="buttonArea" align="right" width=640>
		    <input type="button" onclick="Javascript:do_search()"  onkeypress="JavaScript:on_keydown(this.form)" value="조회"/>
			<input type="button" onclick="Javascript:do_insert()" 	value="등록"/>
		</div>
		</td>
	</tr>	
</table>
<table cellpadding=5 cellspacing=0 border="0" width=640>
 <tr>
    <td align="right">
    	<select name="search_div" id="search_div">
    		<option value="">선택</option>
    		<option value="NAME"  <%if(search_div.equalsIgnoreCase("NAME"))out.print("selected");%> >작성자</option>
    		<option value="TITLE" <%if(search_div.equalsIgnoreCase("TITLE"))out.print("selected");%> >제목</option>
    	</select>
    	<input type="text" name="search_word" size="20" max="20" >
    </td>
 	<td align="right">페이지:
		<select name="page_size" id="page_size">
			<option value="10" <%if(page_size==10)out.print("selected");%> >10</option>
			<option value="20" <%if(page_size==20)out.print("selected");%> >20</option>
			<option value="50" <%if(page_size==50)out.print("selected");%> >50</option>
		</select>
    </td>
 </tr>
</table>

	<table cellpadding=5 cellspacing=0 border="1" width=640>
		<tr>
			<td bgcolor="#99ccff" height="23" width="40">No</td>
			<td bgcolor="#99ccff" height="23" width="80">작성자</td>
			<td bgcolor="#99ccff" height="23" >내용</td>
			<td bgcolor="#99ccff" height="23" width="80">생성일</td>
		</tr>
	<%
		// 빈즈에서 가져온 ArrayList 에서 HashMap 을 가져와 반복해서 출력함.
		if(datas.size()>0){
		while(iter.hasNext()) {
				// ArrayList 에서 HashMap 을 가져옴. Object 로 저장되어 있기 때문에 형변환 필요
				HashMap data = (HashMap)iter.next();
	%>
				  <tr>				
					<td><%= data.get("RNUM") %></td>
					<td><%= data.get("mi_name") %></td>
					<td><%= data.get("mi_contents") %></td>
					<td><%= data.get("mi_date") %></td>
				  </tr>
	
	<%
			} // end while
		}else{ // if		
	%>
	    <tr><td colspan="70" align="center">:::조회 데이터가 없습니다.:::</td></tr> 			
	<%
		}//else
	%>			
	</table>
	
</form>
</BODY>
</HTML>