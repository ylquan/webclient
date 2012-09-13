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
		 * �ж��û����治���ڵ�˼·��ͨ���û����Ǹ�ȥ�����û������û���ҵ���¼˵���������û�
		 * ������ڣ�ȡ����¼��Ψһ�ģ��˶����룬ͨ�����¼�ɹ��������������
		 * */
		WebUserManageStub stub = null;
		try {
			stub = new WebUserManageStub(null,"http://192.168.123.16:8080/WebServer/services/WebUserManage");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			System.out.println("��һ��Exception");
			e.printStackTrace();
		}
		
		Login login90  = new Login();
		login90.setArgs0(userName);
		login90.setArgs1(passWord);
	
		
		System.out.println("�������");
		LoginResponse loginResponse=null;
		try {
			loginResponse = stub.login(login90);
			System.out.println("loginResponseΪ�գ�"+(loginResponse==null));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("�ڶ���Exception");
			e.printStackTrace();
		}
	
		boolean isRight = loginResponse.get_return().getFlag();
		
		System.out.println("��������������"+isRight);
		
			if(isRight){
				/**
				 * ͨ��JSONObject���췵�ص�����
				 * JSONObject json = new JSONObject();
				 * json.element("success", true);
				 * json.element("text", "��¼�ɹ�!");
				 * **/
				String sessionId = request.getSession().getId();
				request.getSession().setAttribute("username", userName);
				request.getSession().setAttribute("password", passWord);
				request.getSession().setAttribute("Cell", loginResponse.get_return().getCell());
				
				result = "{success : true,text : \""+sessionId+"\"}";
				
				//result = "{success : true,text : \"��¼�ɹ�!\"}";
			}else{
				/**
				 * JSONObject json = new JSONObject();
				 * json.element("fail", true);
				 * json.element("text", "�������!");
				 * **/
				result = "{fail : true,text : \"�û������������!\"}";
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
