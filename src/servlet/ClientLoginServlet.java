package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.client.WebUserManageStub;
import web.client.WebUserManageStub.Login;
import web.client.WebUserManageStub.LoginResponse;

public class ClientLoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ClientLoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String sessionId = request.getParameter("sessionId");
		
		String username = (String)request.getSession().getAttribute("username");
		String password = (String)request.getSession().getAttribute("password");
		String cellString = (String)request.getSession().getAttribute("Cell");
		
		PrintWriter out = response.getWriter();
		out.println("�û���Ϊ:"+username);
		out.println("��     ��Ϊ:"+password);
		out.println("���û��ڷ�����idΪ1�µ�·��Ϊ:"+cellString);
		
		
		
		
		
		
		
		
		
		
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
