/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-02-17 07:15:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Beans.Ya_QnaBean;
import java.util.ArrayList;
import com.Beans.Ya_MemberBean;
import com.Beans.Ya_NoticeBean;

public final class ya_005fnotanswerList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


public String arrow(int depth){
	String rs = "<img src='../img/arrow.png' width='20px' height='20px'>";
	String nbsp = "&nbsp;&nbsp;&nbsp;&nbsp;";
	String ts = "";
	for(int i = 0; i<depth; i++){
		ts += nbsp;
	}
	return depth==0 ? "" : ts + rs;  
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.Beans.Ya_NoticeBean");
    _jspx_imports_classes.add("com.Beans.Ya_MemberBean");
    _jspx_imports_classes.add("com.Beans.Ya_QnaBean");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Object> list = (ArrayList<Object>)request.getAttribute("list");
	for(int i=0; i<list.size(); ++i){
		System.out.println(((Ya_QnaBean)list.get(i)).toString());
	}
	String pageNumStr = (request.getAttribute("pageNum")==null||request.getAttribute("pageNum")=="")?"1":(String)request.getAttribute("pageNum");
	String pageSizeStr = (request.getAttribute("pageSize")==null||request.getAttribute("pageSize")=="")?"1":(String)request.getAttribute("pageSize");
	String search_div = (request.getAttribute("search_div")==null||request.getAttribute("search_div")=="")?"":(String)request.getAttribute("search_div");
	String search_word = (request.getAttribute("search_word")==null||request.getAttribute("search_word")=="")?"":(String)request.getAttribute("search_word");
	Ya_MemberBean user = (Ya_MemberBean)session.getAttribute("member");

      out.write("\r\n");
      out.write("<!-- Top -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../super/superTop.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"blank\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<col width=\"222\"/><col width=\"222\"/><col width=\"222\"/>\r\n");
      out.write("    \t<col width=\"222\"/><col width=\"222\"/><col width=\"222\"/>\r\n");
      out.write("    \t<col width=\"222\"/><col width=\"222\"/><col width=\"222\"/>\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t<td></td>\r\n");
      out.write("    \t\t<td colspan=\"7\">________</td>\r\n");
      out.write("    \t\t<td></td>\r\n");
      out.write("    \t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-2\">\r\n");
      out.write("\t\t<!-- 사이드바 -->\r\n");
      out.write("            <div style=\"border-right: solid 2px #e3ebf7 ; height: 700px;\">\r\n");
      out.write("            \t<h3><b>&nbsp;&nbsp;고객센터</b></h3>\r\n");
      out.write("            \t<a href=\"noticeControl.jsp?command=list\" id=\"notice\">공지사항</a>\r\n");
      out.write("            \t<p></p>\r\n");
      out.write("     \t\t\t<p></p>\r\n");
      out.write("     \t\t\t<p align=\"left\" id=\"qna\" style=\"color: red\"><span class=\"glyphicon glyphicon-chevron-right\" style=\"color: red\"></span>1:1문의</p>\r\n");
      out.write("            \t<p></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-10\">\r\n");
      out.write("        <!-- 본문-->\r\n");
      out.write("        <table style=\"border: 0; border-collapse:collapse; margin-top: 22px; width: 1240px; height: 100px; background-color: #ededed\">\r\n");
      out.write("        <col width=\"50\"><col width=\"400\"><col width=\"100\"><col width=\"350\">\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td style=\"border-bottom: 3px solid #a0a0a0;\"></td>\r\n");
      out.write("        \t<td colspan=\"4\" align=\"left\" valign=\"center\" style=\"border-bottom: 3px solid #a0a0a0; text-align: left;\"><h3><b>1:1문의</b></h3></td>\r\n");
      out.write("        \t<td style=\"border-bottom: 3px solid #a0a0a0;\"></td>\r\n");
      out.write("        \t<td style=\"border-bottom: 3px solid #a0a0a0;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("         <table height=\"100px\" style=\"border: 0; table-layout:fixed; width: 1240px; background-color: #ededed\">\r\n");
      out.write("        <col width=\"20\"><col width=\"400\"><col width=\"100\"><col width=\"350\">\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td colspan=\"4\" height=\"20\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<form action=\"qnaControl.jsp\" name=\"f1\">\r\n");
      out.write("         <input type=\"hidden\" id=\"command\" name=\"command\" value=\"\">\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t<td colspan=\"2\">\r\n");
      out.write("        \t<div class=\"input-group\">\r\n");
      out.write("        \t<button class=\"input-group-addon\" id=\"write\" style=\"width: 356px; height: 30px; background-color: #ededed;\" onclick=\"mySubmit(1)\">전체 문의 내역</button>\r\n");
      out.write("            <button class=\"input-group-addon\" style=\"width: 356px; height: 30px; background-color: white;\" onclick=\"mySubmit(2)\">답변 미처리 내역</button>\r\n");
      out.write("        \t</div>\r\n");
      out.write("        \t</td>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t</form>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table style=\"border: 0; border-collapse:collapse;  width: 1240px; height: 550px; background-color: #ededed\">\r\n");
      out.write("        <col width=\"50\"><col width=\"350\"><col width=\"50\"><col width=\"100\"><col width=\"350\">\r\n");
      out.write("        ");
if(null != list && list.size() > 0){
        	for(int i=0; i<list.size(); ++i){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t<td style=\"border-bottom: 1px solid #a0a0a0; height: 10; text-align: left;\">");
      out.print(arrow(((Ya_QnaBean)list.get(i)).getDepth()) );
      out.write("<a href=\"qnaControl.jsp?command=detail&seq=");
      out.print(((Ya_QnaBean)list.get(i)).getSeq());
      out.write('"');
      out.write('>');
      out.print(((Ya_QnaBean)list.get(i)).getTitle() );
      out.write("</a></td>\r\n");
      out.write("        \t<td style=\"border-bottom: 1px solid #a0a0a0; height: 10; text-align: left;\">");
      out.print(((Ya_QnaBean)list.get(i)).getEmail() );
      out.write("</td>\r\n");
      out.write("        \t<td style=\"border-bottom: 1px solid #a0a0a0; height: 10; text-align: left;\">");
      out.print(((Ya_QnaBean)list.get(i)).getUpload_dt() );
      out.write("</td>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        \t");
}
        }else{
      out.write("\r\n");
      out.write("        \t<tr style=\"text-align: center\">\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t<td colspan=\"2\">검색된 글이 없습니다.<td>\t\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t</tr>\r\n");
      out.write("        ");
}
        	
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t<td colspan=\"2\" style=\"height: 20px;\">\r\n");
      out.write("        \t");
 
        	if(null != list && list.size() > 0){
        		int pageNum = Integer.parseInt(pageNumStr);
        		int pageSize = Integer.parseInt(pageSizeStr);
        		int tot_cnt = ((Ya_QnaBean)list.get(0)).getTot_cnt();
        		
        		int pageCnt = (tot_cnt%pageSize)==0 ? tot_cnt/pageSize : tot_cnt/pageSize +1;
        		System.out.println(pageSize);
        		
        		
        		if(pageNum == 1){
        			System.out.println("페이지넘버가 1일때"+pageNum);
        		
      out.write("\r\n");
      out.write("        \t\t\t<span class=\"glyphicon glyphicon-chevron-left\" style=\"color: red; width: 30px; height: 20px; visibility: hidden;\"></span>\r\n");
      out.write("        \t\t");
	for(int i=0; i<pageCnt; i++){
	        			if(i+1 == pageNum){
	        			
      out.write("\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail());
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: red;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}
	        			else
	        			{
      out.write("\r\n");
      out.write("\t        \t\t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: black;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}
      out.write("\r\n");
      out.write("        \t\t");
	}
        			if(pageCnt != 1){
        		
      out.write("\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(pageNum+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\"><span class=\"glyphicon glyphicon-chevron-right\" style=\"color: red; width: 30px; height: 20px\"></span></a>\r\n");
      out.write("        \t\t");
	}		
        		}
        		
        		
        		
        		else if(pageNum == pageCnt){
        		
        			System.out.println("페이지넘버가 페이지카운트랑 같을때"+pageNum);
        		
      out.write("\r\n");
      out.write("        \t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(pageNum-1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\"><span class=\"glyphicon glyphicon-chevron-left\" style=\"color: red; width: 30px; height: 20px\"></span></a>\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t");
	for(int i=0; i<pageCnt; i++){
	    			if(i+1 == pageNum){
	        			
      out.write("\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: red;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}else{
      out.write("\r\n");
      out.write("\t        \t\t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: black;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}
      out.write("\r\n");
      out.write("    \t\t\t");
	} 
      out.write("\r\n");
      out.write("    \t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\" style=\"color: red; width: 30px; height: 20px; visibility: hidden;\"></span>\t\t\r\n");
      out.write("        \t");
	}
        	
        	
        	
        	else{
      out.write("\r\n");
      out.write("        \t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(pageNum-1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\">\r\n");
      out.write("        \t\t\t<span class=\"glyphicon glyphicon-chevron-left\" style=\"color: red; width: 30px; height: 20px\">\r\n");
      out.write("        \t\t\t</span></a>\r\n");
      out.write("        \t\t");
	for(int i=0; i<pageCnt; i++){
	    			if(i+1 == pageNum){
	        			
      out.write("\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: red;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}else{
      out.write("\r\n");
      out.write("\t        \t\t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(i+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" style=\"color: black;\">");
      out.print(i+1);
      out.write("</a>\r\n");
      out.write("\t        \t\t");
	}
      out.write("\r\n");
      out.write("    \t\t\t");
	}
    			
      out.write("\t\r\n");
      out.write("    \t\t\t\t<a href=\"qnaControl.jsp?command=adminlist&pageNum=");
      out.print(pageNum+1);
      out.write("&email=");
      out.print(user.getEmail() );
      out.write("&search_word=");
      out.print(search_word );
      out.write("&search_div=");
      out.print(search_div );
      out.write("\" >\r\n");
      out.write("    \t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\" style=\"color: red; width: 30px; height: 20px\">\r\n");
      out.write("    \t\t\t\t</span>\r\n");
      out.write("    \t\t\t\t</a>\r\n");
      out.write("        \t");
	
        		}
        	} 
        	
      out.write("\r\n");
      out.write("\t      \t</td>\r\n");
      out.write("\t      \t<td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        \t<td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table style=\"border: 0; border-collapse:collapse;  width: 1240px; height: 50px; background-color: #ededed\">\r\n");
      out.write("        <col width=\"250\"><col width=\"200\"><col width=\"100\"><col width=\"350\">\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td colspan=\"2\" style=\"height: 50px;\" >\r\n");
      out.write("        <form action=\"./qnaControl.jsp?command=adminlist\" method=\"post\"> \r\n");
      out.write("          <div class=\"input-group\" align=\"center\">\r\n");
      out.write("\t      <select name=\"search_div\" id=\"search_div\" class=\"form-control\" style=\"width: 150px; height: 35px\">\r\n");
      out.write("\t      \t<option value=\"title\">제목</option>\r\n");
      out.write("\t      \t<option value=\"content\">내용</option>\r\n");
      out.write("\t      </select>  \r\n");
      out.write("\t    <input id=\"search_word\" type=\"text\" class=\"form-control\" name=\"search_word\" style=\"width: 200px; height: 35px\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"email\" value=\"");
      out.print(user.getEmail());
      out.write("\">\r\n");
      out.write("\t    <input type=\"submit\" id=\"search\" class=\"form-control\" value=\"검색\" style=\"width: 50px; height: 35px\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    </form> \r\n");
      out.write("        </td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       <script>\r\n");
      out.write("        \tfunction mySubmit(index){\r\n");
      out.write("        \t\tif(index == 1){\r\n");
      out.write("        \t\t\tdocument.getElementById(\"command\").value = \"adminlist\";\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t\tif(index == 2){\r\n");
      out.write("        \t\t\tdocument.getElementById(\"command\").value = \"adminnoanswer\";\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t\tdocument.f1.submit();\r\n");
      out.write("        \t}\r\n");
      out.write("        </script>\t\r\n");
      out.write("      \r\n");
      out.write("<!--Foot -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../super/superFoot.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
