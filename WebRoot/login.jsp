<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>登录</title>
		<!-- 资源包 -->
		<link href="ext/resources/css/ext-all.css" rel="stylesheet">	
		<script type="text/javascript" src="ext/ext-all-debug-w-comments.js" ></script>
	</head>
	<body>
		<script type="text/javascript">
		Ext.onReady(function() {
			var loginForm = Ext.create('Ext.form.Panel', {
		        bodyStyle:'padding:5px 5px 0',
		        width: 350,
		        border : false,
		        fieldDefaults: {
		            msgTarget: 'side',
		            labelWidth: 30
		        },
		        defaultType: 'textfield',
		        defaults: {
		            anchor: '100%'
		        },

		        items: [{
		            fieldLabel: '帐号',
		            name: 'userName', //就所HTML标记中到name=“”
		            allowBlank:false,
		            blankText : '请输入帐号'
		        },{
		            fieldLabel: '密码',
		            name: 'passWord',
		            inputType : 'password', //输入类型
		            allowBlank:false,
		            blankText : '请输入密码'
		        }]
		    });
			
			var loginWindow = Ext.create('Ext.window.Window',{
				title : '登录',
				items : [loginForm],
				plain : true,
				resizable : false,
				buttonAlign : 'center',
				buttons: [{
		            text: '登录',
		            handler : function(){
		            	if (loginForm.form.isValid()) {
							loginForm.form.submit({
										waitTitle : '请稍候',
										waitMsg : '正在登录......',
										url : 'login', //提交到servlet地址
										success : function(form, action) {
													Ext.Msg.alert('系统提示','登录成功!');
    												//可以进行别的业务操作，比如跳转页面到你到主页面
  												//Ext.Msg.alert("Session参数",action.result.text);
  												 //启动本地RepoClient，将sessionId传给RepoClient
												 Ext.Ajax.request({
										          url:"http://192.168.123.16:8080/RepoClient/servlet/loginServlet",
										          method:"post",
										          success:function(response,opts){
										                var sf=response.responseText;
										                if(sf=="success")
										                 Ext.Msg.alert("提示","向RepoClient传参时成功");
										
										               else{
										
										                   Ext.Msg.alert("提示","向RepoClient传参时失败");
										
										                  }
										               },
										          failure:function(response,opts){
										         
										          Ext.Msg.alert("提示",opts.result.text);
										          },
										          params:{
										             sessionId:action.result.text
										          }
										     });
										  
										     
										     window.location.href="http://192.168.123.16:8080/RepoClient/servlet/loginServlet?sessionId="+action.result.text; 
										     
										     
												
  													
										},
										failure : function(form, action) {
												if(action.result){
													
													Ext.Msg.alert('系统提示',action.result.text);
												
													}else{
													loginForm.form.reset();
												}
										}
								});
								
						}
		            }
		        },{
		            text: '重置',
		            handler : function(){
		            	loginForm.form.reset();
		            }
		        }]
			});
			
			loginWindow.show();
		});
		</script>
	</body>
</html>
