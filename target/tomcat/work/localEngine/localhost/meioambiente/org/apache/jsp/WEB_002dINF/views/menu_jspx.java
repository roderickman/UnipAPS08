package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu2.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category2.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item2.tagx");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<div version=\"2.0\" id=\"menu\" class=\"well sidebar-nav\">");
      if (_jspx_meth_menu_005fmenu2_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_menu_005fmenu2_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu2
    org.apache.jsp.tag.web.menu.menu2_tagx _jspx_th_menu_005fmenu2_005f0 = new org.apache.jsp.tag.web.menu.menu2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fmenu2_005f0);
    _jspx_th_menu_005fmenu2_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/menu.jspx(5,45) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu2_005f0.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(5,45) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu2_005f0.setId("_menu");
    _jspx_th_menu_005fmenu2_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_menu_005fmenu2_005f0, null));
    _jspx_th_menu_005fmenu2_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fmenu2_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory2_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category2
    org.apache.jsp.tag.web.menu.category2_tagx _jspx_th_menu_005fcategory2_005f0 = new org.apache.jsp.tag.web.menu.category2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory2_005f0);
    _jspx_th_menu_005fcategory2_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory2_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(6,57) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory2_005f0.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(6,57) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory2_005f0.setId("c_pessoas");
    _jspx_th_menu_005fcategory2_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_menu_005fcategory2_005f0, null));
    _jspx_th_menu_005fcategory2_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory2_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem2_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item2
    org.apache.jsp.tag.web.menu.item2_tagx _jspx_th_menu_005fitem2_005f0 = new org.apache.jsp.tag.web.menu.item2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f0);
    _jspx_th_menu_005fitem2_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem2_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(7,114) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f0.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(7,114) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f0.setUrl("/pessoases?form");
    // /WEB-INF/views/menu.jspx(7,114) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f0.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(7,114) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f0.setId("i_pessoas_new");
    _jspx_th_menu_005fitem2_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem2_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item2
    org.apache.jsp.tag.web.menu.item2_tagx _jspx_th_menu_005fitem2_005f1 = new org.apache.jsp.tag.web.menu.item2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f1);
    _jspx_th_menu_005fitem2_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem2_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(8,165) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f1.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(8,165) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/pessoases?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(8,165) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f1.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(8,165) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f1.setId("i_pessoas_list");
    _jspx_th_menu_005fitem2_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory2_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category2
    org.apache.jsp.tag.web.menu.category2_tagx _jspx_th_menu_005fcategory2_005f1 = new org.apache.jsp.tag.web.menu.category2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory2_005f1);
    _jspx_th_menu_005fcategory2_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory2_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(10,62) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory2_005f1.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(10,62) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory2_005f1.setId("c_meioambiente");
    _jspx_th_menu_005fcategory2_005f1.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_menu_005fcategory2_005f1, null));
    _jspx_th_menu_005fcategory2_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory2_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem2_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item2
    org.apache.jsp.tag.web.menu.item2_tagx _jspx_th_menu_005fitem2_005f2 = new org.apache.jsp.tag.web.menu.item2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f2);
    _jspx_th_menu_005fitem2_005f2.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem2_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(11,123) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f2.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(11,123) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f2.setUrl("/meioambientes?form");
    // /WEB-INF/views/menu.jspx(11,123) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f2.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(11,123) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f2.setId("i_meioambiente_new");
    _jspx_th_menu_005fitem2_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem2_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item2
    org.apache.jsp.tag.web.menu.item2_tagx _jspx_th_menu_005fitem2_005f3 = new org.apache.jsp.tag.web.menu.item2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f3);
    _jspx_th_menu_005fitem2_005f3.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem2_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(12,174) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f3.setZ("user-managed");
    // /WEB-INF/views/menu.jspx(12,174) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/meioambientes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(12,174) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f3.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(12,174) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem2_005f3.setId("i_meioambiente_list");
    _jspx_th_menu_005fitem2_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem2_005f3);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fcategory2_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory2_005f1(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem2_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem2_005f1(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem2_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem2_005f3(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
