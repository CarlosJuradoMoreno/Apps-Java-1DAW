package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class persona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <head\n");
      out.write("    <title>Airsoft World</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
  
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/crud","root", "");
        Statement s = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");
        ResultSet listado= s.executeQuery("SELECT * from personal join campos on campos.codigo=personal.campos where campos.nombre="+request.getParameter("nombre"));
        
      out.write("\n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("      <div class=\"row\"></div>\n");
      out.write("      <div class=\"row s12 m12 l12\">\n");
      out.write("          <div class=\"card grey lighten-5\">\n");
      out.write("            <h3 class=\"center\">AIRSOFT WORLD</h3>\n");
      out.write("            \n");
      out.write("           class=\"bordered centered responsive-table\">\n");
      out.write("              <thead><th>Código</th><th>Nombre</th><th>apellido</th><th>replica</th><th>campo</th><th>sancion</th><th></th></thead>\n");
      out.write("              ");

                while (listado.next()) {
              
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                    <td>");
      out.print(listado.getString("codigo") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("nombre") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("apellido") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("replica") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("campo") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(listado.getString("sancion") );
      out.write("</td>\n");
      out.write("                    <form method=\"post\" action=\"modificaCliente.jsp\">\n");
      out.write("                      <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(listado.getString("codigo") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nombre") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"apellido\" value=\"");
      out.print(listado.getString("apellido") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"replica\" value=\"");
      out.print(listado.getString("replica") );
      out.write("\">\n");
      out.write("                      <input type=\"hidden\" name=\"campo\" value=\"");
      out.print(listado.getString("campo") );
      out.write("\">\n");
      out.write("                       <input type=\"hidden\" name=\"sancion\" value=\"");
      out.print(listado.getString("sancion") );
      out.write("\">\n");
      out.write("                      <td>\n");
      out.write("                      <button class=\"btn waves-effect waves-light center blue\" type=\"submit\" name=\"editar\">\n");
      out.write("                        Editar\n");
      out.write("                      </button>\n");
      out.write("                      </td>\n");
      out.write("                    </form>\n");
      out.write("                    <form method=\"post\" action=\"borraCliente.jsp\">\n");
      out.write("                        <input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(listado.getString("codigo") );
      out.write("\">\n");
      out.write("                      <td>\n");
      out.write("                      <button class=\"btn waves-effect waves-light center red\" type=\"submit\" name=\"borrar\">\n");
      out.write("                        Borrar\n");
      out.write("                      </button>\n");
      out.write("                      </td>\n");
      out.write("                    </form>\n");
      out.write("                  </tr>\n");
      out.write("              ");

                }
              
      out.write("\n");
      out.write("              \n");
      out.write("                  <td>\n");
      out.write("                    <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("                      Añadir\n");
      out.write("                    </button>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </form>\n");
      out.write("              <form method=\"post\" action=\"buscaPersona.jsp\">\n");
      out.write("                <tr>\n");
      out.write("                  <td>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                      <input type=\"text\" name=\"nombre\" id=\"buscaPersona\">\n");
      out.write("                      <label for=\"buscaNombre\">nombre</label>\n");
      out.write("                    </div>\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                    <button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("                      <i class=\"fa fa-search\"></i> Buscar\n");
      out.write("                    </button>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("              </form>\n");
      out.write("            </table>  \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("              \n");
      out.write("          ");

      conexion.close();
        
      out.write("\n");
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
