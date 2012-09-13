package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.client.WebUserManageStub;
import web.client.WebUserManageStub.Login;
import web.client.WebUserManageStub.LoginResponse;


public class TestLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String result = "";
		
		
		
		boolean isRight = false;
		
		/**
		 * 判断用户名存不存在到思路：通过用户名那个去查找用户表，如果没有找到记录说明不存在用户
		 * 如果存在，取出记录（唯一的）核对密码，通过则登录成功，否则密码错误
		 * */
		if(userName.equals("fafa")){ 
			if(passWord.equals("123456")){
				/**
				 * 通过JSONObject构造返回到数据
				 * JSONObject json = new JSONObject();
				 * json.element("success", true);
				 * json.element("text", "登录成功!");
				 * **/
				
				
				WebUserManageStub stub = new WebUserManageStub(null,"http://localhost:8080/axis2/services/WebUserManage");
				
				Login login90  = new Login();
				login90.setArgs0("fafa");
				login90.setArgs1("123456");
			
				//LoginResponse results = stub.login(login90);
				//isRight = results.get_return().getFlag();
				
				System.out.println(login90.getArgs0());
				LoginResponse loginResponse =	stub.login(login90);
				isRight = loginResponse.get_return().getFlag();
				
				
				System.out.println("用户名密码"+isRight);
				
				result = "{success : true,text : \"登录成功!\"}";
			}else{
				/**
				 * JSONObject json = new JSONObject();
				 * json.element("fail", true);
				 * json.element("text", "密码错误!");
				 * **/
				result = "{fail : true,text : \"密码错误!\"}";
			}
		}else{
			/**
			 * JSONObject json = new JSONObject();
			 * json.element("fail", true);
			 * json.element("text", \""+userName+"用户不存在!\");
			 * **/
			result = "{fail : true,text : \""+userName+"用户不存在!\"}";
		}
		
		/**
		 * response.getWriter().print(json.toString());
		 * json.toString()输出到就是"{fail : true,text : \"密码错误!\"}"格式到字符串
		 * 输出结构怎么样去构造，根据实际需求来，直接用字符串到形式跟高效。前提是你的输出结果很简单
		 * 如果所复杂的结果就必须借助与JSONObject对象来了，开发GridPanel到时候就得用到JSONObject对象准备数据了
		 * */
		response.getWriter().print(result);
		response.getWriter().close();
	}
}
