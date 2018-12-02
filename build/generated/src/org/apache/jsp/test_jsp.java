package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Interact</title>\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Favicons\n");
      out.write("    ================================================== -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"img/apple-touch-icon.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"img/apple-touch-icon-72x72.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"img/apple-touch-icon-114x114.png\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"  href=\"css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome/css/font-awesome.css\">\n");
      out.write("\n");
      out.write("<!-- Stylesheet\n");
      out.write("    ================================================== -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nivo-lightbox/nivo-lightbox.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nivo-lightbox/default.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato:400,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Raleway:300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\" data-spy=\"scroll\" data-target=\".navbar-fixed-top\">\n");
      out.write("<!-- Navigation\n");
      out.write("    ==========================================-->\n");
      out.write("<nav id=\"menu\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\"> \n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"> <span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("      <a class=\"navbar-brand page-scroll\" href=\"#page-top\">Interact</a> </div>\n");
      out.write("    \n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#features\" class=\"page-scroll\">Features</a></li>\n");
      out.write("        <li><a href=\"#about\" class=\"page-scroll\">About</a></li>\n");
      out.write("        <li><a href=\"#services\" class=\"page-scroll\">Services</a></li>\n");
      out.write("        <li><a href=\"#portfolio\" class=\"page-scroll\">Gallery</a></li>\n");
      out.write("        <li><a href=\"#testimonials\" class=\"page-scroll\">Testimonials</a></li>\n");
      out.write("        <li><a href=\"#team\" class=\"page-scroll\">Team</a></li>\n");
      out.write("        <li><a href=\"#contact\" class=\"page-scroll\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.navbar-collapse --> \n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!-- Header -->\n");
      out.write("<header id=\"header\">\n");
      out.write("  <div class=\"intro\">\n");
      out.write("    <div class=\"overlay\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-8 col-md-offset-2 intro-text\">\n");
      out.write("            <h1>We Are Interact<span></span></h1>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sed commodo nibh ante facilisis bibendum.</p>\n");
      out.write("            <a href=\"#features\" class=\"btn btn-custom btn-lg page-scroll\">Learn More</a> </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!-- Features Section -->\n");
      out.write("<div id=\"features\" class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"col-md-10 col-md-offset-1 section-title\">\n");
      out.write("      <h2>Features</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-6 col-md-3\"> <i class=\"fa fa-comments-o\"></i>\n");
      out.write("        <h3>Lorem ipsum</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xs-6 col-md-3\"> <i class=\"fa fa-bullhorn\"></i>\n");
      out.write("        <h3>Dolor sit amet</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xs-6 col-md-3\"> <i class=\"fa fa-group\"></i>\n");
      out.write("        <h3>Tempus eleifend</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque etiam.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xs-6 col-md-3\"> <i class=\"fa fa-magic\"></i>\n");
      out.write("        <h3>Pellentesque</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet placerat facilisis felis mi in tempus eleifend pellentesque natoque.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- About Section -->\n");
      out.write("<div id=\"about\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xs-12 col-md-6\"> <img src=\"img/about.jpg\" class=\"img-responsive\" alt=\"\"> </div>\n");
      out.write("      <div class=\"col-xs-12 col-md-6\">\n");
      out.write("        <div class=\"about-text\">\n");
      out.write("          <h2>About Us</h2>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\n");
      out.write("          <h3>Why Choose Us?</h3>\n");
      out.write("          <div class=\"list-style\">\n");
      out.write("            <div class=\"col-lg-6 col-sm-6 col-xs-12\">\n");
      out.write("              <ul>\n");
      out.write("                <li>Lorem ipsum dolor</li>\n");
      out.write("                <li>Tempor incididunt</li>\n");
      out.write("                <li>Lorem ipsum dolor</li>\n");
      out.write("                <li>Incididunt ut labore</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6 col-sm-6 col-xs-12\">\n");
      out.write("              <ul>\n");
      out.write("                <li>Aliquip ex ea commodo</li>\n");
      out.write("                <li>Lorem ipsum dolor</li>\n");
      out.write("                <li>Exercitation ullamco</li>\n");
      out.write("                <li>Lorem ipsum dolor</li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Services Section -->\n");
      out.write("<div id=\"services\" class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-title\">\n");
      out.write("      <h2>Our Services</h2>\n");
      out.write("      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed dapibus leonec.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-wordpress\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Lorem ipsum dolor</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-cart-arrow-down\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Consectetur adipiscing</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-cloud-download\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Lorem ipsum dolor</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-language\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Consectetur adipiscing</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-plane\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Lorem ipsum dolor</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\"> <i class=\"fa fa-pie-chart\"></i>\n");
      out.write("        <div class=\"service-desc\">\n");
      out.write("          <h3>Consectetur adipiscing</h3>\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Gallery Section -->\n");
      out.write("<div id=\"portfolio\" class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-title\">\n");
      out.write("      <h2>Gallery</h2>\n");
      out.write("      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed dapibus leonec.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"portfolio-items\">\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/01-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/01-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/02-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Adipiscing Elit</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/02-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/03-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/03-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/04-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/04-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/05-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Adipiscing Elit</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/05-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/06-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Dolor Sit</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/06-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/07-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Dolor Sit</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/07-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/08-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/08-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-lg-4\">\n");
      out.write("          <div class=\"portfolio-item\">\n");
      out.write("            <div class=\"hover-bg\"> <a href=\"img/portfolio/09-large.jpg\" title=\"Project Title\" data-lightbox-gallery=\"gallery1\">\n");
      out.write("              <div class=\"hover-text\">\n");
      out.write("                <h4>Adipiscing Elit</h4>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"img/portfolio/09-small.jpg\" class=\"img-responsive\" alt=\"Project Title\"> </a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Testimonials Section -->\n");
      out.write("<div id=\"testimonials\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-title text-center\">\n");
      out.write("      <h2>What our clients say</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/01.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - John Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/02.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - Johnathan Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/03.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - John Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\"> </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/04.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - Johnathan Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/05.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis bibendum dolor feugiat at.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - John Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"testimonial\">\n");
      out.write("          <div class=\"testimonial-image\"> <img src=\"img/testimonials/06.jpg\" alt=\"\"> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sed dapibus leo nec ornare diam sedasd commodo nibh ante facilisis.\"</p>\n");
      out.write("            <div class=\"testimonial-meta\"> - Johnathan Doe </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Team Section -->\n");
      out.write("<div id=\"team\" class=\"text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"col-md-8 col-md-offset-2 section-title\">\n");
      out.write("      <h2>Meet the Team</h2>\n");
      out.write("      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed dapibus leonec.</p>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"row\">\n");
      out.write("      <div class=\"col-md-3 col-sm-6 team\">\n");
      out.write("        <div class=\"thumbnail\"> <img src=\"img/team/01.jpg\" alt=\"...\" class=\"team-img\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h4>John Doe</h4>\n");
      out.write("            <p>Director</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-3 col-sm-6 team\">\n");
      out.write("        <div class=\"thumbnail\"> <img src=\"img/team/02.jpg\" alt=\"...\" class=\"team-img\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h4>Mike Doe</h4>\n");
      out.write("            <p>Senior Designer</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-3 col-sm-6 team\">\n");
      out.write("        <div class=\"thumbnail\"> <img src=\"img/team/03.jpg\" alt=\"...\" class=\"team-img\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h4>Jane Doe</h4>\n");
      out.write("            <p>Senior Designer</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-3 col-sm-6 team\">\n");
      out.write("        <div class=\"thumbnail\"> <img src=\"img/team/04.jpg\" alt=\"...\" class=\"team-img\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            <h4>Karen Doe</h4>\n");
      out.write("            <p>Project Manager</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Contact Section -->\n");
      out.write("<div id=\"contact\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"col-md-8\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Get In Touch</h2>\n");
      out.write("          <p>Please fill out the form below to send us an email and we will get back to you as soon as possible.</p>\n");
      out.write("        </div>\n");
      out.write("        <form name=\"sentMessage\" id=\"contactForm\" novalidate>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" id=\"name\" class=\"form-control\" placeholder=\"Name\" required=\"required\">\n");
      out.write("                <p class=\"help-block text-danger\"></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Email\" required=\"required\">\n");
      out.write("                <p class=\"help-block text-danger\"></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <textarea name=\"message\" id=\"message\" class=\"form-control\" rows=\"4\" placeholder=\"Message\" required></textarea>\n");
      out.write("            <p class=\"help-block text-danger\"></p>\n");
      out.write("          </div>\n");
      out.write("          <div id=\"success\"></div>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-custom btn-lg\">Send Message</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3 col-md-offset-1 contact-info\">\n");
      out.write("      <div class=\"contact-item\">\n");
      out.write("        <h3>Contact Info</h3>\n");
      out.write("        <p><span><i class=\"fa fa-map-marker\"></i> Address</span>4321 California St,<br>\n");
      out.write("          San Francisco, CA 12345</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"contact-item\">\n");
      out.write("        <p><span><i class=\"fa fa-phone\"></i> Phone</span> +1 123 456 1234</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"contact-item\">\n");
      out.write("        <p><span><i class=\"fa fa-envelope-o\"></i> Email</span> info@company.com</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"social\">\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer Section -->\n");
      out.write("<div id=\"footer\">\n");
      out.write("  <div class=\"container text-center\">\n");
      out.write("    <p>&copy; 2017 Interact. Design by <a href=\"http://www.templatewire.com\" rel=\"nofollow\">TemplateWire</a></p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.1.11.1.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/SmoothScroll.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/nivo-lightbox.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/jqBootstrapValidation.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/contact_me.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
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