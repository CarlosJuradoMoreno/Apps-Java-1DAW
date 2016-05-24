package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form method=\"pre\" action=\"crear.jsp\">                <!--ALta del cliente-->\n");
      out.write("                <tr>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      \n");
      out.write("                      <label for=\"clienteid\">código Campo ");
      out.print(request.getParameter("codigo") );
      out.write("</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"nombre\" id=\"nombre\">\n");
      out.write("                      <label for=\"nombre\">nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"apellido\" id=\"apellido\">\n");
      out.write("                      <label for=\"apellido\">apellido</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"tel\" name=\"replica\" id=\"replica\">\n");
      out.write("                      <label for=\"replica\">replica</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" class=\"datepicker\" name=\"sancion\" id=\"sancion\">\n");
      out.write("                      <label for=\"sancion\">sancion</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                      <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(request.getParameter("codigo") );
      out.write("\">\n");
      out.write("                       <button class=\"btn waves-effect waves-light center red\" type=\"submit\" name=\"Alta\">\n");
      out.write("                        Alta\n");
      out.write("                      </button>\n");
      out.write("         </form>\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                 \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
