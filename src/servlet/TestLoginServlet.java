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
		 * �ж��û����治���ڵ�˼·��ͨ���û����Ǹ�ȥ�����û������û���ҵ���¼˵���������û�
		 * ������ڣ�ȡ����¼��Ψһ�ģ��˶����룬ͨ�����¼�ɹ��������������
		 * */
		if(userName.equals("fafa")){ 
			if(passWord.equals("123456")){
				/**
				 * ͨ��JSONObject���췵�ص�����
				 * JSONObject json = new JSONObject();
				 * json.element("success", true);
				 * json.element("text", "��¼�ɹ�!");
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
				
				
				System.out.println("�û�������"+isRight);
				
				result = "{success : true,text : \"��¼�ɹ�!\"}";
			}else{
				/**
				 * JSONObject json = new JSONObject();
				 * json.element("fail", true);
				 * json.element("text", "�������!");
				 * **/
				result = "{fail : true,text : \"�������!\"}";
			}
		}else{
			/**
			 * JSONObject json = new JSONObject();
			 * json.element("fail", true);
			 * json.element("text", \""+userName+"�û�������!\");
			 * **/
			result = "{fail : true,text : \""+userName+"�û�������!\"}";
		}
		
		/**
		 * response.getWriter().print(json.toString());
		 * json.toString()���������"{fail : true,text : \"�������!\"}"��ʽ���ַ���
		 * ����ṹ��ô��ȥ���죬����ʵ����������ֱ�����ַ�������ʽ����Ч��ǰ��������������ܼ�
		 * ��������ӵĽ���ͱ��������JSONObject�������ˣ�����GridPanel��ʱ��͵��õ�JSONObject����׼��������
		 * */
		response.getWriter().print(result);
		response.getWriter().close();
	}
}
