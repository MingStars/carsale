<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/resources/";
%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="ie ie6 lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="ie ie7 lt-ie9 lt-ie8"        lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="ie ie8 lt-ie9"               lang="en"> <![endif]-->
<!--[if IE 9]>    <html class="ie ie9"                      lang="en"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-ie">
<!--<![endif]-->

<head>

    <!-- Meta-->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="">
    <title>个人中心</title>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]><script src="js/html5shiv.js"></script><script src="js/respond.min.js"></script><![endif]-->
    <!-- Bootstrap CSS-->
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
    
    
    
    
   
	<!-- STYLESHEETS --><!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
	<link rel="stylesheet" type="text/css" href="css/cloud-admin.css" >
	<link rel="stylesheet" type="text/css"  href="css/themes/default.css" id="skin-switcher" >
	<link rel="stylesheet" type="text/css"  href="css/responsive.css" >
	
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- DATE RANGE PICKER -->
	<link rel="stylesheet" type="text/css" href="js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
	<!-- ANIMATE -->
	<link rel="stylesheet" type="text/css" href="css/animatecss/animate.min.css" />
	<!-- COLORBOX -->
	<link rel="stylesheet" type="text/css" href="js/colorbox/colorbox.min.css" />
	<!-- FONTS -->
	<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
    
    
    
    
    
</head>

<body>
<!-- START Main wrapper-->
<section class="wrapper">
    <!-- START Top Navbar-->
    <nav role="navigation" class="navbar navbar-default navbar-top navbar-fixed-top">
        <!-- START navbar header-->
        <div class="navbar-header">
            <a href="/page/index" class="navbar-brand">
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
                            <img src="app/img/user/02.jpg" alt="Avatar" width="60" height="60" class="img-thumbnail img-circle">
                            <!-- Status when collapsed-->
                            <div class="user-block-status">
                                <div class="point point-success point-lg"></div>
                            </div>
                        </div>
                        <!-- Name and Role-->
                        <div class="user-block-info">
                            <span class="user-block-name item-text">尊敬的管理员，欢迎您！</span>
                            <span class="user-block-role"></span>
                        </div>
                    </div>
                    <!-- START User links collapse-->
                    <ul class="nav collapse">
                        <li><a href="${basePath}/usercenter/updatepassword">密码修改 </a></li>
                        <li class="divider"></li>
                        <li><a href="/usercenter/out">退出</a>                     </li>
                    </ul>
                    <!-- END User links collapse-->
                </li>
                <!-- END user info-->
                <!-- START Menu-->
                <%--<li>--%>
                    <%--<a href="${basePath}/usercenter/userinfo?action=show" title="Dashboard" data-toggle="" class="no-submenu">--%>
                        <%--<em class="fa fa-dashboard"></em>--%>
                        <%--<span class="item-text">个人信息</span>                  </a>--%>
                <%--</li>--%>
                <li >
                    <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu"
                       >
                        <em class="fa fa-bar-chart-o"></em>
                        <span class="item-text" >用户管理</span>                  </a>
                    <!-- START SubMenu item-->
                    <ul class="nav collapse ">
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/AllUser">
                                <span class="item-text" >所有</span>                        </a>                     </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/buyUser" >
                                <span class="item-text" >买家</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/saleUser" >
                                <span class="item-text" >卖家</span>                  </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu"   >
                        <em class="fa fa-bar-chart-o"></em>
                        <span class="item-text">汽车管理</span>                  </a>
                    <!-- START SubMenu item-->
                    <ul class="nav collapse ">
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/auditeCar">
                                <span class="item-text">待审核</span>                        </a>                     </li>
                        <li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/salableCar">
                                <span class="item-text">可出售</span>                        </a>                     </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/bookedCar" >
                                <span class="item-text">已被预约</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/saledCar" >
                                <span class="item-text">已出售</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/AllCar" >
                                <span class="item-text">所有</span>                  </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu">
                        <em class="fa fa-bar-chart-o"></em>
                        <span class="item-text">订单管理</span>                  </a>
                    <!-- START SubMenu item-->
                    <ul class="nav collapse ">
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/orderManager/cancelled">
                                <span class="item-text">被取消</span>                        </a>                     </li>
                        <li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/orderManager/unconfirmed">
                                <span class="item-text">未确认</span>                        </a>                     </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/orderManager/confirmed" >
                                <span class="item-text">已确认</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/orderManager/completed" >
                                <span class="item-text">已完成</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/orderManager/AllOrder" >
                                <span class="item-text">所有</span>                  </a>
                        </li>
                    </ul>
                </li>
                <!-- <li>
                    <a href="/page/collection" title="Standard" >
                        <em class="fa fa-table"></em>
                        <span class="item-text">收藏夹管理</span>                  </a>
                </li> -->
                <li>
                    <a href="${pageContext.request.contextPath}/doGetURL?page=admin/picManager/picManager" title="Standard" style="color:white; box-shadow: 0px 1px 10px rgba(0,0,0,.8);" >
                        <em class="fa fa-table"></em>
                        <span class="item-text">图片管理</span>                  </a>
                </li>
                <li>
                    <a href="/page/collection" title="Standard" >
                        <em class="fa fa-table"></em>
                        <span class="item-text">其他</span>                  </a>
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
    <!-- End aside-->
    <!--XXX1-->
    <section>
        <!-- START Page content-->
        <section class="main-content">
            <h3>图片管理
                <br>
                <small>可管理的车辆图片</small>
            </h3>
            <!-- START panel-->
            <div class="panel panel-default">
                <div class="panel-heading">车辆图片
                    <a href="#" data-perform="panel-dismiss" data-toggle="tooltip" title="Close Panel" class="pull-right">
                        <em class="fa fa-times"></em>
                    </a>
                    <a href="#" data-perform="panel-collapse" data-toggle="tooltip" title="Collapse Panel" class="pull-right">
                        <em class="fa fa-minus"></em>
                    </a>
                </div>
                <!-- START table-responsive-->
                  
           	<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box">
									<!-- <div class="box-title">
										<h4><i class="fa fa-bars"></i>Portfolio</h4>
										<div class="tools">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a>
											<a href="javascript:;" class="reload">
												<i class="fa fa-refresh"></i>
											</a>
											<a href="javascript:;" class="collapse">
												<i class="fa fa-chevron-up"></i>
											</a>
											<a href="javascript:;" class="remove">
												<i class="fa fa-times"></i>
											</a>
										</div>
									</div> -->
									<div class="box-body clearfix">
									   <div id="filter-controls" class="btn-group">
										  <div class="hidden-xs">
											  <a href="../doGetCarPicById" class="btn btn-default" data-filter="*">所有图片</a>
											  <a href="../doGetCarPicById?picType=1" class="btn btn-info" data-filter=".category_1">车辆</a>
											  <a href="../doGetCarPicById?picType=2" class="btn btn-danger" data-filter=".category_2">缩略图</a>
											  <a href="../doGetCarPicById?picType=3" class="btn btn-success" data-filter=".category_3">头像</a>
											  <a href="../doGetCarPicById?picType=4" class="btn btn-warning" data-filter=".category_4">图标</a>
										  </div>
										  <div class="visible-xs">
											   <select id="e1" class="form-control">
													<option value="*">所有图片</option>
													<option value=".category_1">车辆</option>
													<option value=".category_2">缩略图</option>
													<option value=".category_3">头像</option>
													<option value=".category_4">图标</option>
												</select>
										  </div>
									   </div>
										<div id="filter-items" class="row">
											<div class="col-md-3 category_1 item">
												<div class="filter-content">
													<img src="${itemsList[0].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/1.png" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_2 item">
												<div class="filter-content">
													<img src="${itemsList[1].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/2.jpg" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_3 item">
												<div class="filter-content">
													<img src="${itemsList[2].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/3.png" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_4 item">
												<div class="filter-content">
													<img src="${itemsList[3].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/4.png" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_1 item">
												<div class="filter-content">
													<img src="${itemsList[4].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/5.png" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_2 item">
												<div class="filter-content">
													<img src="${itemsList[5].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/8.png" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_4 item">
												<div class="filter-content">
													<img src="${itemsList[6].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/7.jpg" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
											<div class="col-md-3 category_4 item">
												<div class="filter-content">
													<img src="${itemsList[7].picUrl}" alt="" class="img-responsive" />
													<div class="hover-content">
														<h4>Image Title</h4>
														<a class="btn btn-success hover-link">
															<i class="fa fa-edit fa-1x"></i>
														</a>
														<a class="btn btn-warning hover-link colorbox-button" href="img/gallery/2.jpg" title="Image Title">
															<i class="fa fa-search-plus fa-1x"></i>
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- /BOX -->
							</div>
						</div>
						
						<!--/PAGE -->
	<!-- JAVASCRIPTS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- JQUERY -->
	<script src="js/jquery-1.11.2.min.js"></script>
	<!-- JQUERY UI-->
	<script src="js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<!-- DATE RANGE PICKER -->
	<script src="js/bootstrap-daterangepicker/moment.min.js"></script>
	
	<script src="js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script><script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript" src="js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- ISOTOPE -->
	<script type="text/javascript" src="js/isotope/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="js/isotope/imagesloaded.pkgd.min.js"></script>
	<!-- COLORBOX -->
	<script type="text/javascript" src="js/colorbox/jquery.colorbox.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript" src="js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="js/script.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("gallery");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
                <!-- END table-responsive-->
                <div class="panel-footer">
                    <div class="row">
                        <div class="col-lg-2">
                            <div class="input-group">

                            </div>
                        </div>
                        <div class="col-lg-8"></div>
                        <div class="col-lg-2">
                            <div class="input-group">
                                <p>客服电话：400-828-3499</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END panel-->
        </section>
        <!-- END Page content-->
    </section>
</section>
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
</body>

</html>