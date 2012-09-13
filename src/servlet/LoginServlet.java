package servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;

import web.client.WebUserManageStub;
import web.client.WebUserManageStub.Login;
import web.client.WebUserManageStub.LoginResponse;


public class LoginServlet extends HttpServlet {

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
		/**
		 * 判断用户名存不存在到思路：通过用户名那个去查找用户表，如果没有找到记录说明不存在用户
		 * 如果存在，取出记录（唯一的）核对密码，通过则登录成功，否则密码错误
		 * */
		WebUserManageStub stub = null;
		try {
			stub = new WebUserManageStub(null,"http://192.168.123.16:8080/WebServer/services/WebUserManage");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			System.out.println("第一个Exception");
			e.printStackTrace();
		}
		
		Login login90  = new Login();
		login90.setArgs0(userName);
		login90.setArgs1(passWord);
	
		
		System.out.println("在这儿呢");
		LoginResponse loginResponse=null;
		try {
			loginResponse = stub.login(login90);
			System.out.println("loginResponse为空？"+(loginResponse==null));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("第二个Exception");
			e.printStackTrace();
		}
	
		boolean isRight = loginResponse.get_return().getFlag();
		
		System.out.println("程序正常结束？"+isRight);
		
			if(isRight){
				/**
				 * 通过JSONObject构造返回到数据
				 * JSONObject json = new JSONObject();
				 * json.element("success", true);
				 * json.element("text", "登录成功!");
				 * **/
				String sessionId = request.getSession().getId();
				request.getSession().setAttribute("username", userName);
				request.getSession().setAttribute("password", passWord);
				request.getSession().setAttribute("Cell", loginResponse.get_return().getCell());
				
				result = "{success : true,text : \""+sessionId+"\"}";
				
				//result = "{success : true,text : \"登录成功!\"}";
			}else{
				/**
				 * JSONObject json = new JSONObject();
				 * json.element("fail", true);
				 * json.element("text", "密码错误!");
				 * **/
				result = "{fail : true,text : \"用户名或密码错误!\"}";
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
