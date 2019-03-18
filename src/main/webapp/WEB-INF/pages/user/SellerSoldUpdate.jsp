<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/resources/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>历史订单修改</title>
<link rel="stylesheet" href="app/css/bootstrap.css">
   <!-- Vendor CSS-->
   <link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.min.css">
   <link rel="stylesheet" href="vendor/animo/animate+animo.css">
   <link rel="stylesheet" href="vendor/csspinner/csspinner.min.css">
   <!-- START Page Custom CSS-->
   <link rel="stylesheet" href="vendor/slider/css/slider.css">
   <link rel="stylesheet" href="vendor/chosen/chosen.min.css">
   <link rel="stylesheet" href="vendor/datetimepicker/css/bootstrap-datetimepicker.min.css">
   <!-- Codemirror -->
   <link rel="stylesheet" href="vendor/codemirror/lib/codemirror.css">
   <!-- Bootstrap tags-->
   <link rel="stylesheet" href="vendor/tagsinput/bootstrap-tagsinput.css">
   <!-- END Page Custom CSS-->
   <!-- App CSS-->
   <link rel="stylesheet" href="app/css/app.css">
   <!-- Modernizr JS Script-->
   <script src="vendor/modernizr/modernizr.js" type="application/javascript"></script>
   <!-- FastClick for mobiles-->
   <script src="vendor/fastclick/fastclick.js" type="application/javascript"></script>

</head>
<body>
 <!-- START Main wrapper-->
   <section class="wrapper">
      <!-- START Top Navbar-->
      <nav role="navigation" class="navbar navbar-default navbar-top navbar-fixed-top">
         <!-- START navbar header-->
         <div class="navbar-header">
            <a href="Welcome" class="navbar-brand">
               <div class="brand-logo">东通二手车</div>
            </a>         </div>
         <!-- END navbar header-->
         <!-- START Nav wrapper-->
         <div class="nav-wrapper">
            <!-- START Left navbar-->
            <ul class="nav navbar-nav">
               <li>
                  <a href="#" data-toggle="aside">
                     <em class="fa fa-align-left"></em>                  </a>               </li>
            </ul>
            <!-- END Left navbar-->
            <!-- START Right Navbar-->
            <ul class="nav navbar-nav navbar-right">
               <li>
                  <a href="#" data-toggle="navbar-search">
                     <em class="fa fa-search"></em>                  </a>               </li>
            </ul>
            <!-- END Right Navbar-->
         </div>
         <!-- END Nav wrapper-->
      </nav>
      <!-- END Top Navbar-->
      <!-- START aside-->
      <aside class="aside">
         <!-- START Sidebar (left)-->
         <nav class="sidebar">
            <ul class="nav">
               <!-- START user info-->
               <li>
                  <div data-toggle="collapse-next" class="item user-block has-submenu">
                     <!-- User picture-->
                     <div class="user-block-picture">
<img src="${li.uPhoto}" alt="Avatar" width="60" height="60"
						class="img-thumbnail img-circle">                        <!-- Status when collapsed-->
                        <div class="user-block-status">
                           <div class="point point-success point-lg"></div>
                        </div>
                     </div>
                     <!-- Name and Role-->
                     <div class="user-block-info">
                        <span class="user-block-name item-text">尊敬的用户，欢迎您！</span>
                        <span class="user-block-role">买主&卖主</span>
                     </div>
                  </div>
                  <!-- START User links collapse-->
                  <ul class="nav collapse">
                     <li><a href="${pageContext.request.contextPath}/PreUpdatePwd">密码修改 </a></li>
                     <li class="divider"></li>
                     <li><a href="/usercenter/out">退出</a>                     </li>
                  </ul>
                  <!-- END User links collapse-->
               </li>
               <!-- END user info-->
               <!-- START Menu-->
                <li>
                  <a href="${pageContext.request.contextPath}/UpdateUser" title="Dashboard" data-toggle="" class="no-submenu">
                     <em class="fa fa-dashboard"></em>
                     <span class="item-text">个人信息</span>                  </a>
               </li>
               <li>
                  <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-bar-chart-o"></em>
                     <span class="item-text">作为买方</span>                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="${pageContext.request.contextPath}/BuyerUnFinsh">
                           <span class="item-text">未完成订单</span>                        </a>                     </li>
                     <li>
                        <a href="${pageContext.request.contextPath}/BuyerHistory">
                           <span class="item-text">历史订单</span>                  </a>
                     </li>
                  </ul>
               </li>
               <li style="background:gray;">
                  <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu"
                  style="color:white; box-shadow: 0px 1px 10px rgba(0,0,0,.8);">
                     <em class="fa fa-bar-chart-o"></em>
                     <span class="item-text" style="font-size:17px;">作为卖方</span>                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li style="background:gray;">
                        <a href="${pageContext.request.contextPath}/SellerSold" style="color:white; box-shadow: 0px 1px 10px rgba(0,0,0,.8);">
                           <span class="item-text" style="font-size:17px;">已售出车辆信息</span>                        </a>                     </li>
                     <li>
                     <li>
                        <a href="${pageContext.request.contextPath}/SellerDepend">
                           <span class="item-text">订单确认</span>                        </a>                     </li>
                     <li>
                        <a href="${pageContext.request.contextPath}/SellerNews" >
                           <span class="item-text">我发布的车辆信息</span>                  </a>
                     </li>
                  </ul>
               </li>

               <li>
                  <a href="${pageContext.request.contextPath}/Collection" title="Standard" >
                     <em class="fa fa-table"></em>
                     <span class="item-text">收藏夹</span>                  </a>
               </li>
               <li>
                  <a href="${pageContext.request.contextPath}/login/home" title="Pages" data-toggle="" class="no-submenu">
                     <em class="fa fa-file-text"></em>
                     <div class="label label-primary pull-right">new</div>
                     <span class="item-text">返回首页</span>                  </a>
               </li>
               <!-- END Menu-->
               
               <!-- Sidebar footer    -->
               <li class="nav-footer">
                  <div class="nav-footer-divider"></div>
                  <!-- START button group-->
                  <div class="btn-group text-center">
                     <button type="button" data-toggle="tooltip" data-title="退出" class="btn btn-link">
                        <em class="fa fa-sign-out text-muted"></em>                     </button>
                  </div>
                  <!-- END button group-->
               </li>
            </ul>
         </nav>
         <!-- END Sidebar (left)-->
      </aside>
      <aside
		class="offsidebar"> <!-- START Off Sidebar (right)--> <nav>
	<ul class="nav">
		<!-- START user info-->
		<li>
			<div class="item">
				<div
					style="background-image: url('${basePath}/resources/app/img/offsidebar-bg.jpg')"
					class="p-lg">
					<div class="text-center">
						<p>
							<img src="app/img/user/02.jpg" style="width: 64px; height: 64px"
								alt="Image" class="img-circle img-thumbnail">
						</p>
						<p class="text-white">
							<strong>Alex</strong>
						</p>
					</div>
				</div>
			</div>
		</li>
		<!-- END user info-->
		<!-- START list title-->
		<li class="p"><small class="text-muted">ONLINE</small></li>
		<!-- END list title-->
		<li>
			<!-- START User status--> <a href="#" class="media p mt0"> <span
				class="pull-right"> <span
					class="point point-success point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/05.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Tommy
							Sam</strong> <br> <small class="text-muted">tommy39</small>
				</span>
			</span>
		</a> <!-- END User status--> <!-- START User status--> <a href="#"
			class="media p mt0"> <span class="pull-right"> <span
					class="point point-success point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/06.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Beverley
							Pierce</strong> <br> <small class="text-muted">be40210</small>
				</span>
			</span>
		</a> <!-- END User status--> <!-- START User status--> <a href="#"
			class="media p mt0"> <span class="pull-right"> <span
					class="point point-danger point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/07.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Victor
							Long</strong> <br> <small class="text-muted">longlong</small>
				</span>
			</span>
		</a> <!-- END User status--> <!-- START User status--> <a href="#"
			class="media p mt0"> <span class="pull-right"> <span
					class="point point-warning point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/08.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Danielle
							Berry</strong> <br> <small class="text-muted">hunter49</small>
				</span>
			</span>
		</a> <!-- END User status-->
		</li>
		<!-- START list title-->
		<li class="p"><small class="text-muted">OFFLINE</small></li>
		<!-- END list title-->
		<li>
			<!-- START User status--> <a href="#" class="media p mt0"> <span
				class="pull-right"> <span class="point point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/09.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Bertha
							Cooper</strong> <br> <small class="text-muted">ber123</small>
				</span>
			</span>
		</a> <!-- END User status--> <!-- START User status--> <a href="#"
			class="media p mt0"> <span class="pull-right"> <span
					class="point point-lg"></span>
			</span> <span class="pull-left"> <!-- Contact avatar--> <img
					src="app/img/user/10.jpg" style="width: 40px; height: 40px"
					alt="Image" class="media-object img-circle">
			</span> <!-- Contact info--> <span class="media-body"> <span
					class="media-heading"> <strong class="text-white">Anne
							Curtis</strong> <br> <small class="text-muted">anni</small>
				</span>
			</span>
		</a> <!-- END User status-->
		</li>
		<li>
			<!-- Optional link to list more users--> <a href="#"
			title="See more contacts" class="p"> <strong> <small
					class="text-muted">&hellip;</small>
			</strong>
		</a>
		</li>
	</ul>
	</nav> <!-- END Off Sidebar (right)--> </aside> <!-- END aside--> <!-- START Main section-->
	<section> <!-- START Page content--> <!--XXX1--> <section
		class="main-content">
	<h3>
		卖家历史订单 <br> <small>请完善历史订单信息</small>
	</h3>
	<!-- START panel-->
	<div class="panel panel-default">
		<div class="panel-heading">已完成订单</div>
		<div class="panel-body">
	<!-- enctype:提交图片必须要有enctyp属性	 -->
			<form class="form-horizontal" id="form1"  enctype="multipart/form-data">
 
				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">汽车编号</label>
						<div class="col-sm-4">${rng.carInfo.carId}</div>
					</div>
				</fieldset>

				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">配置信息</label>
						<div class="col-sm-4" id="confName">${rng.carInfo.confName}</div>
					</div>
				</fieldset>

				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">售价</label>
						<div class="col-sm-4" id="price">${rng.carInfo.price}</div>
					</div>
				</fieldset>

				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">车龄</label>
						<div class="col-sm-4" id="carAge">${rng.carInfo.carAge}</div>
					</div>
				</fieldset>

				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">买家id</label>
						<div class="col-sm-4" >${rng.user.uId}</div>
					</div>
				</fieldset>

				<fieldset>
					<div class="form-group">
						<label class="col-sm-2 control-label">买家联系方式</label>
						<div class="col-sm-4" id="uphone">${rng.user.uPhone}</div>
					</div>
				</fieldset>

			

				<fieldset>
					<div class="form-group">
						<div class="col-sm-4 col-sm-offset-2">
							<button type="button" id="edit" style="display: block"
								class="btn btn-primary">编辑</button>
							<button type="button" id="cancel" style="display: none"
								class="btn btn-default">取消</button>
							<button type="button" id="save" style="display: none"
								class="btn btn-primary">保存修改</button>
						</div>
					</div>
				</fieldset>

			</form>
		</div>
	</div>
	<!-- END panel--> </section> <!-- END Page content--> </section> <!-- END Main section--> <script
		type="text/javascript" src="js/jquery-1.11.2.min.js"></script> <script>
			var status = 0;
			var init_confName;
			var init_price;
			var init_carAge;
			var init_uphone;
			
			$("#edit")
					.click(
							function() {

								if (status == 0) {
									console.log("11");

									$("#edit").attr("style", "display:none");
									$("#save").attr("style", "display:block");
									$("#cancel").attr("style", "display:block");

									init_confName = $("#confName").html();
									init_price = $("#price").html();
									init_carAge = $("#carAge").html();
									init_uphone = $("#uphone").html();
									
									/* 修改方法必须要有隐藏属性id */
									$("#confName")
											.html("<input type=\"hidden\" id=\"uid\" name='uId'  value='${rng.user.uId}'><input type=\"text\" id=\"confNameInput\" name='confName' class=\"form-control\" value=" + init_confName + ">");
									$("#price")
											.html(
													"<input type=\"text\" id=\"priceInput\"  name='price' class=\"form-control\" value=" + init_price + ">");
									$("#carAge")
											.html(
													"<input type=\"text\" id=\"carAgeInput\" name='carAge' class=\"form-control\" value=" + init_carAge + ">");
									$("#uphone")
											.html(
													"<input type=\"text\" id=\"uphoneInput\" name='uPhone' class=\"form-control\" value=" + init_uphone + ">");
									

									status = 1;
								}
								return false;
							});

			$("#save").click(function() {
				
				if (status == 1) {
					$("#edit").attr("style", "display:block");
					$("#save").attr("style", "display:none");
					$("#cancel").attr("style", "display:none");
					
					
					var confName = $("#confNameInput").val();
		            var price = $("#priceInput").val();
		            var carAge = $("#carAgeInput").val();
		            var uphone = $("#uphoneInput").val();

		            $("#confName").html(confName);
		            $("#price").html(price);
		            $("#carAge").html(carAge);
		            $("#uphone").html(uphone);
		            
					status = 0
					/* var formData = new FormData(document.getElementById("form1"));//表单id */
					
					$.ajax({
						type : "POST",
						url : "SellerSoldUpdate",
					/* 	dataType:"json", */
						 data : {
							 confName : confName,
							 price : price,
							 carAge : carAge,
							 uphone : uphone,
							
						} 
						/* data:formData,
						 async: false,
						 cache: false,
						 contentType: false,
						 processData: false,
						success:function(res){
						alert(res); 
						} */
					});
				}
			});

			$("#cancel").click(function() {
				if (status == 1) {
					$("#edit").attr("style", "display:block");
					$("#save").attr("style", "display:none");
					$("#cancel").attr("style", "display:none");

					$("#confName").html(init_confName);
					$("#price").html(init_price);
					$("#carAge").html(init_carAge);
					$("#uphone").html(init_uphone);
					
					status = 0
				}
				return false;
			});
		</script> </section>
	<!-- END Main wrapper-->
	<!-- START Scripts-->
	<!-- Main vendor Scripts-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!-- Plugins-->
	<script src="vendor/chosen/chosen.jquery.min.js"></script>
	<script src="vendor/slider/js/bootstrap-slider.js"></script>
	<script src="vendor/filestyle/bootstrap-filestyle.min.js"></script>
	<!-- Animo-->
	<script src="vendor/animo/animo.min.js"></script>
	<!-- Sparklines-->
	<script src="vendor/sparklines/jquery.sparkline.min.js"></script>
	<!-- Slimscroll-->
	<script src="vendor/slimscroll/jquery.slimscroll.min.js"></script>
	<!-- START Page Custom Script-->
	<!-- Markdown Area Codemirror and dependencies -->
	<script src="vendor/codemirror/lib/codemirror.js"></script>
	<script src="vendor/codemirror/addon/mode/overlay.js"></script>
	<script src="vendor/codemirror/mode/markdown/markdown.js"></script>
	<script src="vendor/codemirror/mode/xml/xml.js"></script>
	<script src="vendor/codemirror/mode/gfm/gfm.js"></script>
	<script src="vendor/marked/marked.js"></script>
	<!-- MomentJs and Datepicker-->
	<script src="vendor/moment/min/moment-with-langs.min.js"></script>
	<script src="vendor/datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
	<!-- Tags input-->
	<script src="vendor/tagsinput/bootstrap-tagsinput.min.js"></script>
	<!-- Input Mask-->
	<script src="vendor/inputmask/jquery.inputmask.bundle.min.js"></script>
	<!-- END Page Custom Script-->
	<!-- App Main-->
	<script src="app/js/app.js"></script>
	<!--XXX2-->

	<!-- END Scripts-->
</html>