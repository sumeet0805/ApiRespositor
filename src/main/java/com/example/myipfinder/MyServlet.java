package com.example.myipfinder;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
     		resp.setContentType("text/plain");
	        resp.setStatus(HttpServletResponse.SC_OK); // Set status code to 200    
	    	resp.setHeader("Access-Control-Allow-Origin", "*"); // Allow requests from any origin
		
		PrintWriter out = resp.getWriter();
		
		String clientIP = req.getHeader("X-Forwarded-For");
		
		if (null == clientIP) {
			clientIP = req.getRemoteAddr();
		}
		
		out.println("Public IP Address of the client: " + clientIP);
	    out.close();
    }
}

