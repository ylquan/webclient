
/**
 * WebUserManageCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.0  Built on : May 17, 2011 (04:19:43 IST)
 */

    package web.client;

    /**
     *  WebUserManageCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebUserManageCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebUserManageCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebUserManageCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for viewRoleStatus method
            * override this method for handling normal response from viewRoleStatus operation
            */
           public void receiveResultviewRoleStatus(
                    web.client.WebUserManageStub.ViewRoleStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewRoleStatus operation
           */
            public void receiveErrorviewRoleStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRole method
            * override this method for handling normal response from addRole operation
            */
           public void receiveResultaddRole(
                    web.client.WebUserManageStub.AddRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRole operation
           */
            public void receiveErroraddRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewResources method
            * override this method for handling normal response from viewResources operation
            */
           public void receiveResultviewResources(
                    web.client.WebUserManageStub.ViewResourcesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewResources operation
           */
            public void receiveErrorviewResources(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewResource method
            * override this method for handling normal response from viewResource operation
            */
           public void receiveResultviewResource(
                    web.client.WebUserManageStub.ViewResourceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewResource operation
           */
            public void receiveErrorviewResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delFeedback method
            * override this method for handling normal response from delFeedback operation
            */
           public void receiveResultdelFeedback(
                    web.client.WebUserManageStub.DelFeedbackResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delFeedback operation
           */
            public void receiveErrordelFeedback(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modUserStatus method
            * override this method for handling normal response from modUserStatus operation
            */
           public void receiveResultmodUserStatus(
                    web.client.WebUserManageStub.ModUserStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modUserStatus operation
           */
            public void receiveErrormodUserStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delFileServer method
            * override this method for handling normal response from delFileServer operation
            */
           public void receiveResultdelFileServer(
                    web.client.WebUserManageStub.DelFileServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delFileServer operation
           */
            public void receiveErrordelFileServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delRoleResource method
            * override this method for handling normal response from delRoleResource operation
            */
           public void receiveResultdelRoleResource(
                    web.client.WebUserManageStub.DelRoleResourceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delRoleResource operation
           */
            public void receiveErrordelRoleResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRoleOperations method
            * override this method for handling normal response from addRoleOperations operation
            */
           public void receiveResultaddRoleOperations(
                    web.client.WebUserManageStub.AddRoleOperationsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRoleOperations operation
           */
            public void receiveErroraddRoleOperations(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addFeedback method
            * override this method for handling normal response from addFeedback operation
            */
           public void receiveResultaddFeedback(
                    web.client.WebUserManageStub.AddFeedbackResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addFeedback operation
           */
            public void receiveErroraddFeedback(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addResource method
            * override this method for handling normal response from addResource operation
            */
           public void receiveResultaddResource(
                    web.client.WebUserManageStub.AddResourceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addResource operation
           */
            public void receiveErroraddResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewUserRole method
            * override this method for handling normal response from viewUserRole operation
            */
           public void receiveResultviewUserRole(
                    web.client.WebUserManageStub.ViewUserRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewUserRole operation
           */
            public void receiveErrorviewUserRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addFileServer method
            * override this method for handling normal response from addFileServer operation
            */
           public void receiveResultaddFileServer(
                    web.client.WebUserManageStub.AddFileServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addFileServer operation
           */
            public void receiveErroraddFileServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubAdminDetail method
            * override this method for handling normal response from viewSubAdminDetail operation
            */
           public void receiveResultviewSubAdminDetail(
                    web.client.WebUserManageStub.ViewSubAdminDetailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubAdminDetail operation
           */
            public void receiveErrorviewSubAdminDetail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUsersDetail method
            * override this method for handling normal response from viewSubUsersDetail operation
            */
           public void receiveResultviewSubUsersDetail(
                    web.client.WebUserManageStub.ViewSubUsersDetailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUsersDetail operation
           */
            public void receiveErrorviewSubUsersDetail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewUserBase method
            * override this method for handling normal response from viewUserBase operation
            */
           public void receiveResultviewUserBase(
                    web.client.WebUserManageStub.ViewUserBaseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewUserBase operation
           */
            public void receiveErrorviewUserBase(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUser method
            * override this method for handling normal response from addUser operation
            */
           public void receiveResultaddUser(
                    web.client.WebUserManageStub.AddUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUser operation
           */
            public void receiveErroraddUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewOperations method
            * override this method for handling normal response from viewOperations operation
            */
           public void receiveResultviewOperations(
                    web.client.WebUserManageStub.ViewOperationsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOperations operation
           */
            public void receiveErrorviewOperations(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUsersBase method
            * override this method for handling normal response from viewSubUsersBase operation
            */
           public void receiveResultviewSubUsersBase(
                    web.client.WebUserManageStub.ViewSubUsersBaseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUsersBase operation
           */
            public void receiveErrorviewSubUsersBase(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for replyFeedback method
            * override this method for handling normal response from replyFeedback operation
            */
           public void receiveResultreplyFeedback(
                    web.client.WebUserManageStub.ReplyFeedbackResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from replyFeedback operation
           */
            public void receiveErrorreplyFeedback(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUsersSystem method
            * override this method for handling normal response from viewSubUsersSystem operation
            */
           public void receiveResultviewSubUsersSystem(
                    web.client.WebUserManageStub.ViewSubUsersSystemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUsersSystem operation
           */
            public void receiveErrorviewSubUsersSystem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delOperation method
            * override this method for handling normal response from delOperation operation
            */
           public void receiveResultdelOperation(
                    web.client.WebUserManageStub.DelOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delOperation operation
           */
            public void receiveErrordelOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewUserSystem method
            * override this method for handling normal response from viewUserSystem operation
            */
           public void receiveResultviewUserSystem(
                    web.client.WebUserManageStub.ViewUserSystemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewUserSystem operation
           */
            public void receiveErrorviewUserSystem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewUserDetail method
            * override this method for handling normal response from viewUserDetail operation
            */
           public void receiveResultviewUserDetail(
                    web.client.WebUserManageStub.ViewUserDetailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewUserDetail operation
           */
            public void receiveErrorviewUserDetail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUserBase method
            * override this method for handling normal response from viewSubUserBase operation
            */
           public void receiveResultviewSubUserBase(
                    web.client.WebUserManageStub.ViewSubUserBaseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUserBase operation
           */
            public void receiveErrorviewSubUserBase(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewAllFileServer method
            * override this method for handling normal response from viewAllFileServer operation
            */
           public void receiveResultviewAllFileServer(
                    web.client.WebUserManageStub.ViewAllFileServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewAllFileServer operation
           */
            public void receiveErrorviewAllFileServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubAdminBase method
            * override this method for handling normal response from viewSubAdminBase operation
            */
           public void receiveResultviewSubAdminBase(
                    web.client.WebUserManageStub.ViewSubAdminBaseResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubAdminBase operation
           */
            public void receiveErrorviewSubAdminBase(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modFileServer method
            * override this method for handling normal response from modFileServer operation
            */
           public void receiveResultmodFileServer(
                    web.client.WebUserManageStub.ModFileServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modFileServer operation
           */
            public void receiveErrormodFileServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUserDetail method
            * override this method for handling normal response from viewSubUserDetail operation
            */
           public void receiveResultviewSubUserDetail(
                    web.client.WebUserManageStub.ViewSubUserDetailResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUserDetail operation
           */
            public void receiveErrorviewSubUserDetail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubAdminRole method
            * override this method for handling normal response from viewSubAdminRole operation
            */
           public void receiveResultviewSubAdminRole(
                    web.client.WebUserManageStub.ViewSubAdminRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubAdminRole operation
           */
            public void receiveErrorviewSubAdminRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewFeedback method
            * override this method for handling normal response from viewFeedback operation
            */
           public void receiveResultviewFeedback(
                    web.client.WebUserManageStub.ViewFeedbackResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewFeedback operation
           */
            public void receiveErrorviewFeedback(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addOperation method
            * override this method for handling normal response from addOperation operation
            */
           public void receiveResultaddOperation(
                    web.client.WebUserManageStub.AddOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addOperation operation
           */
            public void receiveErroraddOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubAdminSystem method
            * override this method for handling normal response from viewSubAdminSystem operation
            */
           public void receiveResultviewSubAdminSystem(
                    web.client.WebUserManageStub.ViewSubAdminSystemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubAdminSystem operation
           */
            public void receiveErrorviewSubAdminSystem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    web.client.WebUserManageStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delRole method
            * override this method for handling normal response from delRole operation
            */
           public void receiveResultdelRole(
                    web.client.WebUserManageStub.DelRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delRole operation
           */
            public void receiveErrordelRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewOperation method
            * override this method for handling normal response from viewOperation operation
            */
           public void receiveResultviewOperation(
                    web.client.WebUserManageStub.ViewOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewOperation operation
           */
            public void receiveErrorviewOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addUserRole method
            * override this method for handling normal response from addUserRole operation
            */
           public void receiveResultaddUserRole(
                    web.client.WebUserManageStub.AddUserRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addUserRole operation
           */
            public void receiveErroraddUserRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delResource method
            * override this method for handling normal response from delResource operation
            */
           public void receiveResultdelResource(
                    web.client.WebUserManageStub.DelResourceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delResource operation
           */
            public void receiveErrordelResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modRoleStatus method
            * override this method for handling normal response from modRoleStatus operation
            */
           public void receiveResultmodRoleStatus(
                    web.client.WebUserManageStub.ModRoleStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modRoleStatus operation
           */
            public void receiveErrormodRoleStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewUserStatus method
            * override this method for handling normal response from viewUserStatus operation
            */
           public void receiveResultviewUserStatus(
                    web.client.WebUserManageStub.ViewUserStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewUserStatus operation
           */
            public void receiveErrorviewUserStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewFileServer method
            * override this method for handling normal response from viewFileServer operation
            */
           public void receiveResultviewFileServer(
                    web.client.WebUserManageStub.ViewFileServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewFileServer operation
           */
            public void receiveErrorviewFileServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRoleResource method
            * override this method for handling normal response from addRoleResource operation
            */
           public void receiveResultaddRoleResource(
                    web.client.WebUserManageStub.AddRoleResourceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRoleResource operation
           */
            public void receiveErroraddRoleResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modUserRole method
            * override this method for handling normal response from modUserRole operation
            */
           public void receiveResultmodUserRole(
                    web.client.WebUserManageStub.ModUserRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modUserRole operation
           */
            public void receiveErrormodUserRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delUser method
            * override this method for handling normal response from delUser operation
            */
           public void receiveResultdelUser(
                    web.client.WebUserManageStub.DelUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delUser operation
           */
            public void receiveErrordelUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUserRole method
            * override this method for handling normal response from viewSubUserRole operation
            */
           public void receiveResultviewSubUserRole(
                    web.client.WebUserManageStub.ViewSubUserRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUserRole operation
           */
            public void receiveErrorviewSubUserRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    web.client.WebUserManageStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewRole method
            * override this method for handling normal response from viewRole operation
            */
           public void receiveResultviewRole(
                    web.client.WebUserManageStub.ViewRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewRole operation
           */
            public void receiveErrorviewRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubRole method
            * override this method for handling normal response from viewSubRole operation
            */
           public void receiveResultviewSubRole(
                    web.client.WebUserManageStub.ViewSubRoleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubRole operation
           */
            public void receiveErrorviewSubRole(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for viewSubUserSystem method
            * override this method for handling normal response from viewSubUserSystem operation
            */
           public void receiveResultviewSubUserSystem(
                    web.client.WebUserManageStub.ViewSubUserSystemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from viewSubUserSystem operation
           */
            public void receiveErrorviewSubUserSystem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delRoleOperations method
            * override this method for handling normal response from delRoleOperations operation
            */
           public void receiveResultdelRoleOperations(
                    web.client.WebUserManageStub.DelRoleOperationsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delRoleOperations operation
           */
            public void receiveErrordelRoleOperations(java.lang.Exception e) {
            }
                


    }
    