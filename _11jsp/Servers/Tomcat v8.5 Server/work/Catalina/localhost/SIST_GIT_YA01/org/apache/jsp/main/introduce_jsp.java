/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-02-21 05:19:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class introduce_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>팀소개</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".header {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tbackground: #fc676e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot {\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tbackground: #3f3e3e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".blank {\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table, tr, td {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t/* border: 1px solid black */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img:hover {\r\n");
      out.write("\topacity: 0.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.tab {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tbackground-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Float the list items side by side */\r\n");
      out.write("ul.tab li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the links inside the list items */\r\n");
      out.write("ul.tab li a {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 14px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\ttransition: 0.3s;\r\n");
      out.write("\tfont-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change background color of links on hover */\r\n");
      out.write("ul.tab li a:hover {\r\n");
      out.write("\tbackground-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Create an active/current tablink class */\r\n");
      out.write("ul.tab li a:focus, .active {\r\n");
      out.write("\tbackground-color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the tab content */\r\n");
      out.write(".tabcontent {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tpadding: 6px 12px;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tborder-top: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".myText {\r\n");
      out.write("\tcolor: rgb(203, 52, 160);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Top -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../super/superTop.jsp", out, false);
      out.write("\r\n");
      out.write("\t<!-- 빈곳   -->\t\r\n");
      out.write("\t\r\n");
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
      out.write("\t<!-- 입력 -->\r\n");
      out.write("\t<div style=\"padding-left: 200px; padding-right: 200px; padding-top: 200px; padding-bottom: 200px\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<ul class=\"tab\">\r\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\" class=\"tablinks\"\r\n");
      out.write("\t\t\tonclick=\"openCity(event, 'Main')\">한번 더 해요</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\" class=\"tablinks\"\r\n");
      out.write("\t\t\tonclick=\"openCity(event, 'London')\">조윤행</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\" class=\"tablinks\"\r\n");
      out.write("\t\t\tonclick=\"openCity(event, 'Paris')\">김영재</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\" class=\"tablinks\"\r\n");
      out.write("\t\t\tonclick=\"openCity(event, 'Tokyo')\">배한주</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void(0)\" class=\"tablinks\"\r\n");
      out.write("\t\t\tonclick=\"openCity(event, 'Seoul')\">황인배</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div id=\"Main\" class=\"tabcontent\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<h3>한번 더 해요</h3>\r\n");
      out.write("\t\t<div class=\"myText\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t한번 더 해요는 가격경쟁으로 숙박업체가 더 나은 서비스와 저렴한 가격을 제공할 수 있도록 숙박업체 통합 시스템을 구축하기 위한 팀입니다.\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t야하자는 위치기반 좋은숙소 추천, 예약, 적립까지 가능한 숙박O2O 서비스입니다.\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t야하자는 고객이 편하고 즐겁게 쉴 수 있는 최적의 장소정보를 제공함으로써\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t고객만족의 가치를 실현함은 물론 지역 산업발전에 이바지함에 긍지를 가지고\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t오늘도 더 나은 서비스를 위한 진화를 멈추지 않겠습니다.\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<p>2017/02/02 - 02/21</p>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"London\" class=\"tabcontent\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<h3>조윤행</h3>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<div class=\"myText\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t메인페이지, 위치, 사진 업로드를 담당하였습니다.\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t야하자는 위치기반 좋은숙소 추천, 예약, 적립까지 가능한 숙박O2O 서비스입니다.\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t야하자는 고객이 편하고 즐겁게 쉴 수 있는 최적의 장소정보를 제공함으로써\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t고객만족의 가치를 실현함은 물론 지역 산업발전에 이바지함에 긍지를 가지고\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t오늘도 더 나은 서비스를 위한 진화를 멈추지 않겠습니다.\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<p>2017/02/02 - 02/21</p>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"Paris\" class=\"tabcontent\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<h3>김영재</h3>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<p>그는 진짜 크다</p>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"Tokyo\" class=\"tabcontent\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<h3>배한주</h3>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<p>그는 곧 생일이다</p>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"Seoul\" class=\"tabcontent\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<h3>황인배</h3>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<p>그는 술쟁이다</p>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\topenCity(event,'Main');\r\n");
      out.write("\t\tfunction openCity(evt, cityName) {\r\n");
      out.write("\t\t\tvar i, tabcontent, tablinks;\r\n");
      out.write("\t\t\ttabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("\t\t\tfor (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("\t\t\t\ttabcontent[i].style.display = \"none\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("\t\t\tfor (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("\t\t\t\ttablinks[i].className = tablinks[i].className.replace(\r\n");
      out.write("\t\t\t\t\t\t\" active\", \"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("\t\t\tevt.currentTarget.className += \" active\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<!--Foot -->\r\n");
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