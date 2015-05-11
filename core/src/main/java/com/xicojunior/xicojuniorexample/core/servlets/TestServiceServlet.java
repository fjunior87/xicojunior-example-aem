package com.xicojunior.xicojuniorexample.core.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import com.xicojunior.xicojuniorexample.core.XicoService;

@SuppressWarnings("serial")
@SlingServlet(paths="/services/xicojunior/testservice", methods="GET")
public class TestServiceServlet extends SlingAllMethodsServlet{
	
	@Reference
	XicoService xicoService;
	
	@Override
	protected void doGet(SlingHttpServletRequest request,
			SlingHttpServletResponse response) throws ServletException,
			IOException {
		response.getWriter().write(xicoService.getData());
	}

}
