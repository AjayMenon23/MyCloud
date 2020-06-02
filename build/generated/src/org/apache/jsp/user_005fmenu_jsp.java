package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<style>\n");
      out.write("    ul#menu {\n");
      out.write("        padding: 0\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ul#menu li {\n");
      out.write("        display: inline;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ul#menu li a {\n");
      out.write("        background-color: darkcyan;\n");
      out.write("        color: white;\n");
      out.write("        padding: 20px 80px;\n");
      out.write("        text-decoration: white;\n");
      out.write("        font: 700 15px cursive;\n");
      out.write("        border-radius: 4px 4px 0 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ul#menu li a:hover {\n");
      out.write("        background-color: #366092;\n");
      out.write("        color: yellow;\n");
      out.write("        font: 700 18px fantasy;\n");
      out.write("        border-radius: 4px 4px 0 0;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<center>\n");
      out.write("    <ul id=\"menu\">\n");
      out.write("        <li><a href=\"user_home.jsp\">HOME</a></li>\n");
      out.write("        <li><a href=\"user_file_list.jsp\">My FILES</a></li>\n");
      out.write("        <li><a href=\"\">SHARED FILES</a></li>\n");
      out.write("        <li><a href=\"\">LOG</a></li>\n");
      out.write("        <li><a href=\"user_settings_home.jsp\">SETTINGS</a></li>\n");
      out.write("        <li><a href=\"user_login.jsp\">LOGOUT</a></li>\n");
      out.write("    </ul>\n");
      out.write("</center>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
