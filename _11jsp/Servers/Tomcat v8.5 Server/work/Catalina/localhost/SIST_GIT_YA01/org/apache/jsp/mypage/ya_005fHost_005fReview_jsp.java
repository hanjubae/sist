/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-02-21 05:18:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Dao.ReviewDao;
import com.Beans.Ya_ReviewBean;
import com.Beans.Ya_MemberBean;
import com.Beans.Ya_ZzimBean;
import java.util.ArrayList;

public final class ya_005fHost_005fReview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
    _jspx_imports_classes.add("com.Dao.ReviewDao");
    _jspx_imports_classes.add("com.Beans.Ya_ReviewBean");
    _jspx_imports_classes.add("com.Beans.Ya_MemberBean");
    _jspx_imports_classes.add("com.Beans.Ya_ZzimBean");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

	ArrayList<Ya_ReviewBean> list = (ArrayList<Ya_ReviewBean>)request.getAttribute("reviewlist");
	Ya_MemberBean memberBean =(Ya_MemberBean)session.getAttribute("member");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction view() {\r\n");
      out.write("\t\tdocument.getElementById(\"reply\").style.display = \"block\";\r\n");
      out.write("\t\tdocument.getElementById(\"arrow\").style.display = \"block\";\r\n");
      out.write("\t\tdocument.getElementById(\"inputBtn\").style.display = \"block\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	ReviewDao reviewdao = ReviewDao.getInstance();
	if(list!=null && !(list.size()==0)){

      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t");
for(int i=0; i<list.size(); ++i) {
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<col width=\"130px\" />\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\" style=\"border-bottom: 1px solid black\"><h3>");
      out.print(memberBean.getNickname());
      out.write("님 의 모텔에 대한 리뷰</h3></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" style=\"border-bottom: 1px solid black\"></td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\"><h3>");
      out.print(list.get(0).getTot_cnt());
      out.write("개\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>작성자 </td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(list.get(i).getNickname() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>작성일</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">");
      out.print(list.get(0).getUpload_dt() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
System.out.println("seq : " +list.get(i).getSeq()); 
      out.write("\r\n");
      out.write("\t\t\t\t");
if(reviewdao.needAnswer(list.get(i).getSeq())){ 
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"view()\">댓글달기</button>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">시설점수</td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">\r\n");
      out.write("\t\t\t\t\t");

						for(int j = 0; j < list.get(i).getFacility(); ++j){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"../img/star.png\" height=\"10px\" width=\"10px\">\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">서비스점수</td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">\r\n");
      out.write("\t\t\t\t\t");

						for(int j = 0; j < list.get(i).getService(); ++j){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"../img/star.png\" height=\"10px\" width=\"10px\">\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">청결점수</td>\r\n");
      out.write("\t\t\t\t<td style=\"border-bottom: 1px solid black\">\r\n");
      out.write("\t\t\t\t\t");

						for(int j = 0; j < list.get(i).getClean(); ++j){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"../img/star.png\" height=\"10px\" width=\"10px\">\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\" height=\"100\" colspan=\"2\" valign=\"top\" style=\"border-bottom: 1px solid #a0a0a0; text-align: left;\">");
      out.print(list.get(i).getContent() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
if(!reviewdao.needAnswer(list.get(i).getSeq())){
				if(list.get(i).getStep() == 0){
					Ya_ReviewBean bean = reviewdao.get_answer(list.get(i).getReference());
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\"><img alt=\"\" src=\"../img/arrow.png\" style=\"display: block;\" id=\"arrow\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\">작성자</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\">");
      out.print( bean.getNickname());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\">작성일</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\">");
      out.print( bean.getUpload_dt());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border-bottom: 1px solid gray\"></td>\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"6\" height=\"100\" colspan=\"2\" valign=\"top\" style=\"border-bottom: 1px solid #a0a0a0; text-align: left;\">");
      out.print(bean.getContent() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}
			}
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<form action=\"mypage_Control.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"command\" value=\"reviewAnswer\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"seq\" value=\"");
      out.print(list.get(i).getSeq() );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"motel_num\" value=\"");
      out.print(list.get(i).getMotel_num() );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"nickname\" value=\"");
      out.print(memberBean.getNickname() );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"facility\" value=\"");
      out.print(list.get(i).getFacility() );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"service\" value=\"");
      out.print(list.get(i).getService());
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"clean\" value=\"");
      out.print(list.get(i).getClean());
      out.write("\">\r\n");
      out.write("\t\t\t\t<td><img alt=\"\" src=\"../img/arrow.png\" style=\"display: none;\" id=\"arrow\"></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"textarea\" id=\"reply\" name=\"reply\" style=\"display: none; width: 300px; height: 100px\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" style=\"display: none;\" id=\"inputBtn\" value=\"입력\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

			int count = (int)Math.ceil(list.get(0).getTot_cnt() / 1);
				for (int k = 0; k < count; ++k) {
		
      out.write("\r\n");
      out.write("\t\t<a\r\n");
      out.write("\t\t\thref=\"mypage_Control.jsp?command=hostreviewlist&motelNum=");
      out.print(memberBean.getMotel_num());
      out.write("&value=after&pageNum=");
      out.print( k+1);
      out.write('"');
      out.write('>');
      out.print(k+1 );
      out.write("</a>\r\n");
      out.write("\t\t");

			}	
		
      out.write("\r\n");
      out.write("\t</center>\r\n");

		}
	}else{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<col width=\"150px\" /><col width=\"150px\" /><col width=\"150px\" />\r\n");
      out.write("\t\t\t<col width=\"150px\" /><col width=\"150px\" /><col width=\"150px\" />\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><h3>");
      out.print(memberBean.getNickname());
      out.write("님 의 모텔에 대한 리뷰</h3></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"></td>\r\n");
      out.write("\t\t\t\t<td><h3>0개</h3></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\"><h4>리뷰가없습니다... 분발하세요</h4></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t\r\n");
      out.write("\t");

}
	
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
