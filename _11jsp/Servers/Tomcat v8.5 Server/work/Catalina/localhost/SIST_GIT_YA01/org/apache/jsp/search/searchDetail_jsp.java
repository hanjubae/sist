/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-02-21 03:48:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Beans.Ya_ZzimBean;
import java.util.ArrayList;
import com.Dao.ZzimDao;
import com.Beans.Ya_MemberBean;
import com.Beans.Ya_MotelBean;

public final class searchDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

//
//
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
    _jspx_imports_classes.add("com.Beans.Ya_MotelBean");
    _jspx_imports_classes.add("com.Dao.ZzimDao");
    _jspx_imports_classes.add("com.Beans.Ya_ZzimBean");
    _jspx_imports_classes.add("com.Beans.Ya_MemberBean");
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


request.setCharacterEncoding("UTF-8");

//
String contents = "";
String contentsDiv = request.getParameter("contentsDiv");
System.out.println(contentsDiv);
Ya_MotelBean dto = (Ya_MotelBean)request.getAttribute("dto");

if(contentsDiv==null) contents = "searchDetailRoom.jsp";
else if(contentsDiv.equals("room")) contents = "searchDetailRoom.jsp";
else if(contentsDiv.equals("pay")) contents = "searchDetailPay.jsp";
else if(contentsDiv.equals("review")) contents = "searchDetailReview.jsp?motelName="+dto.getName();



//
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- prevent IE6 flickering -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    try {\r\n");
      out.write("        document.execCommand('BackgroundImageCache', false, true);\r\n");
      out.write("    } catch (e) {\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function no_log(){\r\n");
      out.write("    \talert(\"로그인 해주세요.\");\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.header{\r\n");
      out.write("\t\tposition : fixed;\r\n");
      out.write("\t\theight : 100px;\r\n");
      out.write("\t\tbackground: #fc676e;\r\n");
      out.write("\t}\r\n");
      out.write("\t.foot{\r\n");
      out.write("\t\theight : 200px;\r\n");
      out.write("\t\tbackground: #3f3e3e;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blank{\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t}\t.location{\r\n");
      out.write("\t\tpadding-top : 50px;\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.popular{\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable,tr,td{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\t/* border: 1px solid black */\r\n");
      out.write("\t}\r\n");
      out.write("\timg:hover{\r\n");
      out.write("\t\topacity: 0.5;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.tabl{\r\n");
      out.write("\t\twidth: 60%;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.tabl01{\r\n");
      out.write("\t\twidth: 80%;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t\tmargin: auto;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t.btn3:hover{\r\n");
      out.write("\t\tbackground-color: #ffd8f3;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.btn3:ACTIVE {\r\n");
      out.write("\t\tbackground-color: #bababa;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Top -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../super/superTop.jsp", out, false);
      out.write("<!-- 빈곳   -->\t\r\n");
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
      out.write("<br>\r\n");
      out.write("\t<table class=\"tabl01\" border=\"1\" >\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("    \t<tr>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<td height=\"400\" align=\"center\" colspan=\"4\">\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t");
 
    		// 찜 내역
    		if(session.getAttribute("member")!=null){ 
    			Ya_MemberBean memdt = (Ya_MemberBean)session.getAttribute("member");
    			ZzimDao dao = ZzimDao.getInstance();
    			ArrayList<Ya_ZzimBean> list = dao.logZzim(memdt.getEmail());
    		
      out.write("<a id=\"zzimlink\" href=\"searchControll.jsp?command=ZZIM&motelNum=");
      out.print(dto.getMotel_num() );
      out.write("&email=");
      out.print(memdt.getEmail());
      out.write("\">\r\n");
      out.write("        \t\t<img id=\"zzimimg\" alt=\"사진이 없습니다.\" src=\"../img/ZZIM1.PNG\" width=\"100px\" height=\"140px\">\r\n");
      out.write("        \t\t</a>\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t<input type=\"hidden\" id=\"motelNum\" value=\"");
      out.print(dto.getMotel_num() );
      out.write("\">\r\n");
      out.write("        \t\t<input type=\"hidden\" id=\"email\" value=\"");
      out.print(memdt.getEmail());
      out.write("\">\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t");
	
    			for(int i =0; i<list.size();i++){
    				if(list.get(i).getMotel_num()==dto.getMotel_num()){
    		
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t$(\"#zzimlink\").attr(\"href\",\"searchControll.jsp?command=ZZIMdelete&motelNum=\"+$(\"#motelNum\").val()+\"&email=\"+$(\"#email\").val())\r\n");
      out.write("    \t\t$(\"#zzimimg\").attr(\"src\", \"../img/ZZIM.PNG\")\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t</script>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t");
 		
    		}    	
    		  } // for 문 
	}else{ // 로그인 안했을 때 
    		
      out.write("<a href=\"javascript:;\" onclick=no_log()>\r\n");
      out.write("        \t\t<img alt=\"사진이 없습니다.\" src=\"../img/ZZIM1.PNG\" width=\"100px\" height=\"140px\" >\r\n");
      out.write("        \t\t</a>\r\n");
      out.write("    \t\t");
 } 
      out.write("<p><font face=\"맑은 고딕\" size=\"15\">");
      out.print(dto.getName() );
      out.write("</font></p>\r\n");
      out.write("    \t\t<p><img src=\"../img/address.png\" width=\"20px\" height=\"20px\"> 주소 : ");
      out.print(dto.getAddress() );
      out.write("</p>\r\n");
      out.write("    \t\t<p><img src=\"../img/mobile.png\" width=\"20px\" height=\"20px\"> 연락처 : ");
      out.print(dto.getPhone() );
      out.write("</p>\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t<td colspan=\"5\">\r\n");
      out.write("    \t\t\r\n");
      out.write("\t\t\t<div id=\"testMap\" style=\" width:1000px; height:400px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("    \t\t</td>\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t</tr>    \t\r\n");
      out.write("\t</table>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<table class=\"tabl01\" border=\"1\">\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("\t\t<col width=\"222\" /><col width=\"222\" /><col width=\"222\" />\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"btn3\" colspan=\"3\" height=\"80\" style=\"cursor:pointer\" \r\n");
      out.write("\t\t\tonclick=\"location.href='searchControll.jsp?command=detailAf&type=room&motel_num=");
      out.print(dto.getMotel_num() );
      out.write("'\" >객실정보</td>\r\n");
      out.write("\t\t\t<td class=\"btn3\" colspan=\"3\" height=\"80\" style=\"cursor:pointer\" \r\n");
      out.write("\t\t\tonclick=\"location.href='searchControll.jsp?command=detailAf&type=pay&motel_num=");
      out.print(dto.getMotel_num() );
      out.write("'\" >요금 및 시간</td>\r\n");
      out.write("\t\t\t<td class=\"btn3\" colspan=\"3\" height=\"80\" style=\"cursor:pointer\" \r\n");
      out.write("\t\t\tonclick=\"location.href='searchControll.jsp?command=detailAf&type=review&motel_num=");
      out.print(dto.getMotel_num() );
      out.write("'\" >리뷰</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"9\" height=\"750\" valign=\"top\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, contents , out, false);
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    var oPoint = new nhn.api.map.LatLng(37.5552462,126.935164);\r\n");
      out.write("    nhn.api.map.setDefaultPoint('LatLng');\r\n");
      out.write("    oMap = new nhn.api.map.Map('testMap', {\r\n");
      out.write("        point: oPoint,\r\n");
      out.write("        zoom: 14,\r\n");
      out.write("        enableWheelZoom: true,\r\n");
      out.write("        enableDragPan: true,\r\n");
      out.write("        enableDblClickZoom: false,\r\n");
      out.write("        mapMode: 0,\r\n");
      out.write("        activateTrafficMap: false,\r\n");
      out.write("        activateBicycleMap: false, \r\n");
      out.write("        minMaxLevel: [1, 14],\r\n");
      out.write("        size: new nhn.api.map.Size(900, 400)\r\n");
      out.write("    });\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("<!--Foot -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../super/superFoot.jsp", out, false);
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
