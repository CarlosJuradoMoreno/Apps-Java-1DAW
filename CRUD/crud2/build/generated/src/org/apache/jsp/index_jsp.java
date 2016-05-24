package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      <title><i>Airsoft World</i></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("   \n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("    ");
  
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");

        
        
      out.write("\n");
      out.write("     \n");
      out.write("      \n");
      out.write("        <div id=\"fondo\">\n");
      out.write("            <h1 class=\"text-center\">Airsoft World</h1>\n");
      out.write("             \n");
      out.write("        \n");
      out.write("        ");

        ResultSet listado = s.executeQuery ("SELECT * FROM campos");
        while(listado.next()){
            
        
    
      out.write("\n");
      out.write("     \n");
      out.write("    <form action=\"persona.jsp\">\n");
      out.write("       <table class=\"table text-center\" >  \n");
      out.write("                 \n");
      out.write("        <tr>\n");
      out.write("             <td><h3 >");
      out.print(listado.getString("nombre") );
      out.write("</h3>\n");
      out.write("             <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(listado.getString("codigo") );
      out.write("\">\n");
      out.write("             <button class=\"btn btn-default\" type=\"submit\">Entrar</button>\n");
      out.write("             </td>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("     </form>  \n");
      out.write("              </table>\n");
      out.write("    ");

        }
      conexion.close();
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>    \n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("      </body>\n");
      out.write("</html>");
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
