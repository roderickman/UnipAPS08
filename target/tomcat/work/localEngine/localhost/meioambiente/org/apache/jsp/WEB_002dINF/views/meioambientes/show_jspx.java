package org.apache.jsp.WEB_002dINF.views.meioambientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tags/form/show2.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/display2.tagx");
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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_page_005fshow2_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_page_005fshow2_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  page:show2
    org.apache.jsp.tag.web.form.show2_tagx _jspx_th_page_005fshow2_005f0 = new org.apache.jsp.tag.web.form.show2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_page_005fshow2_005f0);
    _jspx_th_page_005fshow2_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/meioambientes/show.jspx(5,134) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005fshow2_005f0.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(5,134) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005fshow2_005f0.setPath("/meioambientes");
    // /WEB-INF/views/meioambientes/show.jspx(5,134) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005fshow2_005f0.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(5,134) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005fshow2_005f0.setId("ps_com_rodrigo_meioambiente_domain_Meioambiente");
    _jspx_th_page_005fshow2_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_page_005fshow2_005f0, null));
    _jspx_th_page_005fshow2_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_page_005fshow2_005f0);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f0 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f0);
    _jspx_th_field_005fdisplay2_005f0.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(6,148) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f0.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(6,148) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f0.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(6,148) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f0.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_descricao");
    // /WEB-INF/views/meioambientes/show.jspx(6,148) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f0.setField("descricao");
    _jspx_th_field_005fdisplay2_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f0);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f1 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f1);
    _jspx_th_field_005fdisplay2_005f1.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_data_hr");
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setField("data_hr");
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = dateTimePattern type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setDateTimePattern((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente_data_hr_date_format}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(7,210) name = date type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f1.setDate(new Boolean(true));
    _jspx_th_field_005fdisplay2_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f1);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f2 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f2);
    _jspx_th_field_005fdisplay2_005f2.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(8,148) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f2.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(8,148) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f2.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(8,148) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f2.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_local_rua");
    // /WEB-INF/views/meioambientes/show.jspx(8,148) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f2.setField("local_rua");
    _jspx_th_field_005fdisplay2_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f2);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f3 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f3);
    _jspx_th_field_005fdisplay2_005f3.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(9,154) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f3.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(9,154) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f3.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(9,154) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f3.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_local_numero");
    // /WEB-INF/views/meioambientes/show.jspx(9,154) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f3.setField("local_numero");
    _jspx_th_field_005fdisplay2_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f3);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f4 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f4);
    _jspx_th_field_005fdisplay2_005f4.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f4.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(10,164) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f4.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(10,164) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f4.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(10,164) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f4.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_local_complemento");
    // /WEB-INF/views/meioambientes/show.jspx(10,164) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f4.setField("local_complemento");
    _jspx_th_field_005fdisplay2_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f4);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f5 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f5);
    _jspx_th_field_005fdisplay2_005f5.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(11,154) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f5.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(11,154) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f5.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(11,154) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f5.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_local_cidade");
    // /WEB-INF/views/meioambientes/show.jspx(11,154) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f5.setField("local_cidade");
    _jspx_th_field_005fdisplay2_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f5);
    return false;
  }

  private boolean _jspx_meth_field_005fdisplay2_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:display2
    org.apache.jsp.tag.web.form.fields.display2_tagx _jspx_th_field_005fdisplay2_005f6 = new org.apache.jsp.tag.web.form.fields.display2_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f6);
    _jspx_th_field_005fdisplay2_005f6.setJspContext(_jspx_page_context);
    _jspx_th_field_005fdisplay2_005f6.setParent(_jspx_parent);
    // /WEB-INF/views/meioambientes/show.jspx(12,154) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f6.setZ("user-managed");
    // /WEB-INF/views/meioambientes/show.jspx(12,154) name = object type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f6.setObject((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${meioambiente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/meioambientes/show.jspx(12,154) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f6.setId("s_com_rodrigo_meioambiente_domain_Meioambiente_local_estado");
    // /WEB-INF/views/meioambientes/show.jspx(12,154) name = field type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_field_005fdisplay2_005f6.setField("local_estado");
    _jspx_th_field_005fdisplay2_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_field_005fdisplay2_005f6);
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
      if (_jspx_meth_field_005fdisplay2_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f3(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f5(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_005fdisplay2_005f6(_jspx_parent, _jspx_page_context))
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
