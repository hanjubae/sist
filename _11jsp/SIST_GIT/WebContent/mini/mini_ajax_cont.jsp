<%@page import="com.google.gson.Gson"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.khy.mini.MiniDao"%>
<%@page import="com.khy.mini.MiniBean"%>    

<% request.setCharacterEncoding("UTF-8"); %>    

<%
   MiniBean miniBean = new MiniBean();
   MiniDao miniDao   = new MiniDao();
   
      
   String mini_name     = request.getParameter("mi_name");	  
   String mini_email    = request.getParameter("mi_email");	  
   String mini_passwd   = request.getParameter("mi_passwd");	
   String mini_contents = request.getParameter("mi_contents");
   //String mini_date     = request.getParameter("mi_date");
     
   miniBean.setMini_name(mini_name);
   miniBean.setMini_email(mini_email);
   miniBean.setMini_passwd(mini_passwd);
   miniBean.setMini_contents(mini_contents);

   
%>


<%
   String action = request.getParameter("action");

   if("update".equalsIgnoreCase(action))
   {
	   String mi_id         = request.getParameter("mi_id");
	   miniBean.setMi_id(mi_id);
	     
	   if(miniDao.updateClobDB(miniBean)==true)	   
	   {
		   out.println("true");
	   }else{
		   out.println("false");
		   throw new Exception("update 오류");
	   }
	   
	   
   }else if("delete".equalsIgnoreCase(action)){
	   String mi_id         = request.getParameter("mi_id");
	   if(miniDao.deleteDB(mi_id))   
	   {
		   out.println("true");
	   }else{
		   out.println("false");
		   throw new Exception("delete 오류");
	   }
	   
	   
   } else if("insert".equalsIgnoreCase(action)){
	   if(miniDao.insertClobDB(miniBean))	 	   
	   {
		   out.println("true");
	   }else{
		   out.println(new Exception("insert 오류").toString());
	   }
	   
   } else if("selectOne".equalsIgnoreCase(action)){
		   String mi_id         = request.getParameter("mi_id");
		   HashMap<String,String> data = (HashMap<String,String>)miniDao.checkPasswd(mi_id,mini_passwd);
		   if(data.size()>0)	   
		   {   Gson gson = new Gson();
		       miniBean.setMi_id(data.get("mi_id"));
			   miniBean.setMini_name(data.get("mi_name"));
			   miniBean.setMini_email(data.get("mi_email"));
			   miniBean.setMini_passwd(data.get("mi_passwd"));
			   miniBean.setMini_contents(data.get("mi_contents"));
			   miniBean.setMini_date(data.get("mi_date"));
			   
			   out.println(gson.toJson(miniBean));
		   }else{
			   out.println("false");
			   throw new Exception("update 오류");
		   }
	
   }else{
	   out.println("false");
	   throw new Exception("action Error");
   }

%>
