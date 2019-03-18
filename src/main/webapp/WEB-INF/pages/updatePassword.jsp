<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/resources/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

 <title>东通二手车密码修改</title>
 <base href="<%=basePath%>">
   <link rel="stylesheet" href="app/css/bootstrap.css">
   <link rel="stylesheet" href="app/css/app.css">
	<script src="js/jquery.min.js"></script>
</head>
<body>
      <section>
         <section class="main-content">
            <h1>东通二手车密码修改
               <br>
               <small>请认真填写密码，保护自身账号安全</small>
             </h1>
            <div class="panel panel-default">
               <div class="panel-body">
                  <form id="regform" method="get" action="../login/selectuEmail" >
                     <input type="hidden"  name="email"  value="${email }">
                      <fieldset>
                     	<div class="form-group">
                     		<label class="col-sm-2 control-label">更改密码</label>
                     		<div class="col-sm-4">
                     		<input type="password" id="pwd1" name="uPassword" class="form-control"><span id="b2"></span> 
                     			
                     		</div>
                     	</div>
                     </fieldset>
                                          
                     <fieldset>
                     	<div class="form-group">
                     		<label class="col-sm-2 control-label">确认密码</label>
                     		<div class="col-sm-4">
                     		<input type="password" id="pwd2" name="uPassword1" class="form-control"><span id="b3"></span> 
                     		
                     		</div>
                     	</div>
                     </fieldset>

                     <fieldset>
                        <div class="form-group">
                           <div class="col-sm-4 col-sm-offset-2">
                              <input type="submit" id="updatePassword_btn" value="提交" class="btn btn-primary">
                           </div>
                        </div>
                     </fieldset>
                  </form>
               </div>
            </div>
         </section>
      </section>
      
      <script type="text/javascript">
       $("#updatePassword_btn").click(function(){
           var pwd1 = $.trim($("#pwd1").val());
           var pwd2 = $.trim($("#pwd2").val());
           if(pwd1 == ""){
               alert("密码不能为空！");
               return false;
           }
           else if(pwd2!=pwd1){
               alert("两次输入密码不相同！")
               return false;
           }
          else { $("#regform").submit();}
       });
   </script>
</body>
</html>