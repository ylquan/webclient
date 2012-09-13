package test;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import web.client.WebUserManageStub;
import web.client.WebUserManageStub.Login;
import web.client.WebUserManageStub.LoginResponse;

public class testSkeleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebUserManageStub stub = null;
		try {
			stub = new WebUserManageStub(null,"http://localhost:8080/WebServer/services/WebUserManage");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			System.out.println("第一个Exception");
			e.printStackTrace();
		}
		
		Login login90  = new Login();
		login90.setArgs0("fafa");
		login90.setArgs1("123456");
	
		
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
		
	//	System.out.println("用户名密码"+isRight);
	}

}
