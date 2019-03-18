<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/resources/";
%>
<!DOCTYPE html>
<html lang="en" class="no-ie">
<head>
   <base href="<%=basePath%>">
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
   <meta name="description" content="">
   <meta name="keywords" content="">
   <meta name="author" content="">
   <title>东通二手车</title>
   <link rel="stylesheet" href="/bootstrap-3.3.7-dist/css/bootstrap.css">
   <link rel="stylesheet" href="/css/font-awesome.min.css">
   <link rel="stylesheet" href="/css/animate+animo.css">
   <link rel="stylesheet" href="/css/app.css">
   <script src="/js/modernizr.js" type="application/javascript"></script>
   <script src="/js/fastclick.js" type="application/javascript"></script>
</head>

<body>

   <div style="height: 100%; padding: 20px 0; background-image:url(/img/background.jpg)" class="row row-table">
      <div class="col-lg-3 col-md-6 col-sm-8 col-xs-12 align-middle">
         <div  data-play="fadeInDown" data-offset="0" class="panel b0">
            <p class="text-center mb-lg">
               <br>
               <a href="/img/logo.jpg">
                  <img src="/img/logo.jpg" alt="Image" class="block-center img-rounded">
               </a>
            </p>
            <div id="accordion" data-toggle="collapse-autoactive" class="panel-group">
               <div class="panel radius-clear b0 shadow-clear">
                  <div class="panel-heading radius-clear panel-heading-active"><a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" class="text-muted btn-block text-center">用户登录</a>
                  </div>
                  <div id="collapseOne" class="panel-collapse collapse in">
                     <div class="panel-body">
                        <form role="form" class="mb-lg" method="post">
                           <div class="form-group has-feedback">
                              <label for="exampleInputName">用户名</label>
                              <input id="exampleInputName" name="userName" placeholder="Enter name" value="" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
                           <div class="form-group has-feedback">
                              <label for="exampleInputPassword1">密  码</label>
                              <input id="exampleInputPassword1" name="password" type="password" placeholder="Password" value="" class="form-control">
                              <span class="fa fa-lock form-control-feedback text-muted"></span>
                           </div>
                           <div class="form-group has-feedback">
                              <label for="exampleInputCode">验证码</label><br>
                              
                              <a onclick="changeImg()">
                              <img  id="imgObj" alt="验证码" src="../login/getCode">
                               </a>
                              <input id="exampleInputCode" name="code" placeholder="看不清，点击图片更换验证码" value="" style="width:170px;height:40px;border-radius:5px;border:1px solid #DBDBDB;">
                           </div>				   						  						 
                          <input type="button" id="login_btn" class="btn btn-block btn-primary" value="登录"> </input>
                        </form>
                     </div>
                  </div>
               </div>
               <div class="panel radius-clear b0 shadow-clear">
                  <div class="panel-heading radius-clear"><a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" class="text-muted btn-block text-center">新用户注册</a>
                  </div>
                  <div id="collapseTwo" class="panel-collapse collapse">
                     <div class="panel-body">
                        <form role="form" id="regform" class="mb-lg" method="post" action="../login/register?action='register'">
                           <div class="form-group has-feedback">
                              <label id="b1" for="signupInputName">用户名</label>
                              <input id="signupInputName" name="userName"  placeholder="字母数字组成，字母开头，8-15位" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
                           <div class="form-group has-feedback">
                              <label for="signupInputPassword1">密  码</label>
                              <input id="signupInputPassword1" name="uPassword" type="password" placeholder="Password" class="form-control">
                              <span class="fa fa-lock form-control-feedback text-muted"></span>
                           </div>
                           <div class="form-group has-feedback">
                              <label for="signupInputRePassword1">确认密码</label>
                              <input id="signupInputRePassword1" name="repeatPassword" type="password" placeholder="ReType Password" class="form-control">
                              <span class="fa fa-lock form-control-feedback text-muted"></span>
                           </div>
						   <div class="form-group has-feedback">
                              <label id="b2" for="signupInputEmail1">邮箱</label>
                              <input id="signupInputEmail1" name="uEmail" type="email" placeholder="Enter email" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
						   <div class="form-group has-feedback">
                              <label id="b3" for="signupInputPhone">手机号码</label>
                              <input id="signupInputPhone" name="uPhone" placeholder="请输入正确的11位手机号码" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
                           <div class="clearfix">
                              <div class="checkbox c-checkbox pull-left mt0">
                                 <label>
                                    <input id="check" type="checkbox" value="">
                                    <span class="fa fa-check"></span>同意 <a href="#">协议</a>
                                 </label>
                              </div>
                           </div>
                           <input type="button" id="register_btn" value="提交" class="btn btn-block btn-primary"> </input>
                        </form>
                     </div>
                  </div>
               </div>
               <div class="panel radius-clear b0 shadow-clear">
                  <div class="panel-heading radius-clear"><a data-toggle="collapse" data-parent="#accordion" href="#collapseThree" class="text-muted btn-block text-center">忘记密码?</a>
                  </div>
                  <div id="collapseThree" class="panel-collapse collapse">
                     <div class="panel-body">
                       <form   role="form" id="update" method="post" action="../login/updatePassword?action='register'">
                           <p class="text-center">输入注册邮箱地址以接受密码找回邮件</p>
                           <div class="form-group has-feedback">
                              <label for="resetInputEmail1">邮件地址</label>
                              <input id="resetInputEmail1" name="uEmail" placeholder="Enter email" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
                           <button type="button" id="update_btn" class="btn btn-danger btn-block">重置</button>
                        </form>
                     </div>
                  </div>
				  <div class="panel-heading radius-clear">
				       <a href="../login/visitorLogin">跳过登录，以游客身份浏览</a>
				  </div>
               </div>
               <div class="panel radius-clear b0 shadow-clear">
                  <div class="panel-heading radius-clear"><a data-toggle="collapse" data-parent="#accordion" href="#collapseFourth" class="text-muted btn-block text-center">管理员登录</a>
                  </div>
                  <div id="collapseFourth" class="panel-collapse collapse">
                     <div class="panel-body">
                        <form role="form" class="mb-lg" method="post">
                           <div class="form-group has-feedback">
                              <label for="adminInputName">用户名</label>
                              <input id="adminInputName" name="userName"  placeholder="Enter name" value="" class="form-control">
                              <span class="fa fa-envelope form-control-feedback text-muted"></span>
                           </div>
                           <div class="form-group has-feedback">
                              <label for="adminInputPassword1">密  码</label>
                              <input id="adminInputPassword1" name="password" type="password" placeholder="Password" value="" class="form-control">
                              <span class="fa fa-lock form-control-feedback text-muted"></span>
                           </div>
                           <input type="button" id="admin_login_btn" class="btn btn-block btn-primary" value="登录"> </input>
                        </form>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
   <script src="/js/jquery-3.3.1.js"></script>
   <script src="/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
   <script src="/js/animo.min.js"></script>
   <script src="/js/pages.js"></script>
   <script src="/js/login.js"></script>
   <!--登录js-->
   <script type="text/javascript">
       $("#login_btn").click(function () {
           var userName = $.trim($("#exampleInputName").val());
           var password = $.trim($("#exampleInputPassword1").val());
           var code = $.trim($("#exampleInputCode").val());
           if (userName == "") {
               alert("用户名不能为空！");
               return false;
           } else if (password == "") {
               alert("密码不能为空！");
               return false;
           }else if (code == "") {
               alert("验证码不能为空！");
               return false;
           }
           //ajax去服务器端校验
           var data = {userName:userName,password:password,code:code};
           $.ajax({
               type: "POST",
               url: "../login/checkLogin",
               data: data,
               success: function (msg) {
            	   if(msg == "register"){
            		   alert("该账号未注册，请前往注册页面进行注册后登陆！");
            	   }else if (msg == "fail") {
                	   alert("用户名或密码错误！");
                   }else if (msg == "nonactivated") {
                	   alert("您的账号未激活，请前往注册邮箱激活账号后登录！");
                   }else if (msg == "code") {
                	   alert("验证码输入有误，请输入正确的验证码！");
                   }else if (msg == "success") {
                       window.location.href = "../login/home";
                   }
               }
           });
       });
       function changeImg() {        
           var imgSrc = $("#imgObj");    
           var src = imgSrc.attr("src");        
           imgSrc.attr("src", chgUrl(src));
       }
       // 时间戳
       // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
       function chgUrl(url) {
           var timestamp = (new Date()).valueOf();
           url = url.substring(0, 20);
           if ((url.indexOf("&") >= 0)) {
               url = url + "×tamp=" + timestamp;
           } else {
               url = url + "?timestamp=" + timestamp;
           }
          return url;
      }
   </script>
   <!--注册JS-->
   <script type="text/javascript">
       $("#register_btn").click(function(){
           var userName = $.trim($("#signupInputName").val());
           var password = $.trim($("#signupInputPassword1").val());
           var repeatPassword = $.trim($("#signupInputRePassword1").val());
           var email = $.trim($("#signupInputEmail1").val());
           var phone = $.trim($("#signupInputPhone").val());
           //用户名，手机号，邮箱的正则表达式
           var user_reg=/^[a-zA-Z][a-zA-Z0-9]{7,14}$/;
           var phone_reg=/^((13[0-9])|(14[5|7])|(15[0-3]|[5-9])|(18[0,5-9]))[0-9]{8}$/;
           var email_reg=/^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
           if(userName == ""){
               alert("用户名不能为空！");
               return false;
           }else if(!user_reg.test(userName)){
               alert("用户名格式不正确！");
               return false;
           }
           else if(password == ""){
               alert("密码不能为空！");
               return false;
           }
           else if(repeatPassword!=password){
               alert("两次输入密码不相同！")
               return false;
           }
           else if(email==""){
               alert("电子邮箱不能为空");
               return false;
           }
           else if(!email_reg.test(email)){
               alert("电子邮箱格式不正确");
               return false;
           }
           else if(phone==""){
               alert("手机号码不能为空");
               return false;
           }
           else if(!phone_reg.test(phone)){
               alert("手机号格式不正确");
               return false;
           }
           else if(!$("#check").is(":checked")){
               alert("请同意协议后再注册！");
               return false;
           }
          else { $("#regform").submit();}
       });
       
       $("#signupInputName").blur(function(){
			var userName =$("#signupInputName").val();
			$.ajax({
				url:"../login/selectByUserName?userName="+userName,
				dataType:"json",
				success:function(res){
					
					$("#b1").html("<span style='color:red;font-size:12px'>"+res+"</span>");
				}
			});
		});
		$("#signupInputEmail1").blur(function(){
			var uEmail =$("#signupInputEmail1").val();
			$.ajax({
				url:"../login/selectByuEmail?uEmail="+uEmail,
				dataType:"json",
				success:function(res){
					$("#b2").html("<span style='color:red;font-size:12px'>"+res+"</span>");
				}
			});
		});
		$("#signupInputPhone").blur(function(){
			var uphone =$("#signupInputPhone").val();
			$.ajax({
				url:"../login/selectByuPhone?uphone="+uphone,
				dataType:"json",
				success:function(res){
					$("#b3").html("<span style='color:red;font-size:12px'>"+res+"</span>");
				}
			});
		});
   </script>
   <script type="text/javascript">
       $("#update_btn").click(function () {
    	   var uEmail = $.trim($("#resetInputEmail1").val());
           if (uEmail == "") {
               alert("邮箱不能为空！");
               return false;
           }else { $("#update").submit();}
           //ajax去服务器端校验
           var data = {uEmail:uEmail};
          $.ajax({
              type: "POST",
              url: "../login/updateByuEmail",
              data: data,
              success: function (msg) {
           	   if(msg == "uEmail"){
           		   alert("该邮箱地址不存在！");
           	   }
               }
           });
       });
   </script>
   <!-- END Scripts-->
   <script type="text/javascript">
       $("#admin_login_btn").click(function () {
           var userName = $.trim($("#adminInputName").val());
           var password = $.trim($("#adminInputPassword1").val());
           if (userName == "") {
               alert("用户名不能为空！");
               return false;
           } else if (password == "") {
               alert("密码不能为空！");
               return false;
           }
           //ajax去服务器端校验
           var data = {userName: userName, password: password};

           $.ajax({
               type: "POST",
               url: "../login/adminLogin",
               data: data,

               success: function (msg) {
                   if (msg == "success") {
                       window.location.href = "../login/admin";
                   }
                   else if (msg == "fail") {
                       alert("用户名或密码错误！");
                   }
               }
           });
       });
   </script>
</body>
</html>