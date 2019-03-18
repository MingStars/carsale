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
    
    <link href="app/css/layui.css" type="text/css" rel="stylesheet">
    <style type="text/css">
#jiben{position:relative;left:100px;top:0px;width:400px;height:0px}
#fadongji{position:relative;left:700px;top:0px;width:400px;height:0px}
#dipan{position:relative;left:100px;top:380px;width:400px;height:0px}
#anquan{position:relative;left:700px;top:415px;width:400px;height:0px}
#waibu{position:relative;left:100px;top:800px;width:400px;height:0px}
#neibu{position:relative;left:700px;top:800px;width:400px;height:0px}

.detailcontent {
	font-family: verdana,arial,sans-serif;
	font-size:15px;
	color:#333333;
	border-width: 0px;
	border-color: #a9c6c9;
	border-collapse: collapse;
}
.detailcontent th {
	border-width: 0px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
.detailcontent td {
	border-width: 0px;
	padding: 8px;
	border-style: solid;
	border-color: #a9c6c9;
}
.detailcontent tr:nth-child(2n+1){
     background-color: #E5E5E5;
}
.detailcontent tr:nth-child(2n){
     background-color: #EEF2F6;
}
    </style>    
     
     
      
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
                <!-- <li style="background:gray;"> -->
                <li>
                    <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu">
                        <em class="fa fa-bar-chart-o"></em>
                        <span class="item-text">用户管理</span>                  </a>
                    <!-- START SubMenu item-->
                    <ul class="nav collapse ">
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/AllUser" >
                                <span class="item-text" >所有</span>                        </a>                     </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/buyUser" >
                                <span class="item-text" >买家</span>                  </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/userManager/saleUser">
                                <span class="item-text" >卖家</span>                  </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu"   style="color:white; box-shadow: 0px 1px 10px rgba(0,0,0,.8);">
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
                            <a href="${pageContext.request.contextPath}/doGetURL?page=admin/carManager/AllCar" style="box-shadow: 0px 1px 10px rgba(0,0,0,.8);">
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
                    <a href="${pageContext.request.contextPath}/doGetURL?page=admin/picManager/picManager" title="Standard" >
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
            <h3>待审核汽车信息
                <br>
                <small>可管理所有待审核汽车信息</small>
            </h3>
            <!-- START panel-->
        
               
                <div class="titlediv">
                   
                <!-- end粗略浏览 -->
                <div class="detailcontent">
                <form action="" method="post"><!-- 跳转controller页面 -->
                	<div id="jiben"> 
                    <table  class="table1" id="altrowstable">
                        <thead>
                        <tr>
                            <th align="center" colspan="2" >基本信息</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>品牌</td>
                            <td><input name="car_name" value="${carInfo.carName}"></td>
                        </tr>
                        <tr>
                            <td>级别</td>
                            <td><input name="level" value="${carInfo.level}"></td>
                        </tr>
                       <tr>
                            <td>发动机</td>
                            <td><input name="engine" value="${carInfo.engine }"></td>
                        </tr>
                        <tr>
                            <td>变速箱</td>
                            <td><input name="gearbox" value="${carInfo.gearBox}"></td>
                        </tr>
                        <tr>
                            <td>车身结构</td>
                            <td><input name="body_structure" value="${carInfo.bodyStructure}"></td>
                        </tr>
                        <tr>
                            <td>长*宽*高{mm)</td>
                            <td><input name="size" value="${carInfo.size}"></td>
                        </tr>
                        <tr>
                            <td>最大车速(km/s}</td>
                            <td><input name="maximumspeed" value="${carInfo.maxImumSpeed}"></td>
                        </tr>
                        <tr>
                            <td>行李箱容积(L)</td>
                            <td><input name="cargo_volume" value="${carInfo.cargoVolume}"></td>
                        </tr>
                        
                        </tbody>
                    </table>
                    </div>
                    <div id="fadongji">
                    <table class="table1" id="altrowstable">
                        <thead>
                        <tr>
                            <th align="center" colspan="2">发动机参数</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>排量(L)</td>
                            <td><input name="displacement" value="${carEngineInfo.displacement}"></td>
                        </tr>
                        <tr>
                            <td>进气形式</td>
                            <td><input name="intake_form" value="${carEngineInfo.intakeForm}"></td>
                        </tr>
                        <tr>
                            <td>气缸排列形式</td>
                            <td><input name="cylinder_arrangement" value="${carEngineInfo.cylinderArrangement}"></td>
                        </tr>
                        <tr>
                            <td>气缸数</td>
                            <td><input name="cylinders" value="${carEngineInfo.cylinders}"></td>
                        </tr>
                        <tr>
                            <td>最大马力(Ps)</td>
                            <td><input name="maximum_horsepower" value="${carEngineInfo.maximumHorsepower}"></td>
                        </tr>
                        <tr>
                            <td>燃料类型</td>
                            <td><input name="fuel" value="${carEngineInfo.fuel}"></td>
                        </tr>
                        <tr>
                            <td>燃油标号</td>
                            <td><input name="fuel_label" value="${carEngineInfo.fuelLabel}"></td>
                        </tr>
                        <tr>
                            <td>供油方式</td>
                            <td><input name="oilsupply_mode" value="${carEngineInfo.oilsupplyMode}"></td>
                        </tr>
                     <tr>
                            <td>排放标准</td>
                            <td><input name="enviroment_standard" value="${carEngineInfo.enviromentStandard}"></td>
                        </tr> 
                        </tbody>
                    </table>
                    </div>
                    <div id="dipan">
                    <table class="table1" id="altrowstable">
                        <thead>
                        <tr>
                            <th align="center" colspan="2">底盘及制动</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>驱动方式</td>
                            <td><input name="drive_mode" value="${carChassisBrakeInfo.driveMode}"></td>
                        </tr>
                        <tr>
                            <td>助力类型</td>
                            <td><input name="auto_power_type" value="${carChassisBrakeInfo.autoPowerType}"></td>
                        </tr>
                        <tr>
                            <td>前悬挂类型</td>
                            <td><input name="front_suspension_type" value="${carChassisBrakeInfo.frontSuspensionType}"></td>
                        </tr>
                        <tr>
                            <td>后悬挂类型</td>
                            <td><input name="rear_suspension_type" value="${carChassisBrakeInfo.rearSuspensionType}"></td>
                        </tr>
                        <tr>
                            <td>前制动类型</td>
                            <td><input name="front_brake_type" value="${carChassisBrakeInfo.frontBrakeType}"></td>
                        </tr>
                        <tr>
                            <td>后制动类型</td>
                            <td><input name="rear_brake_type" value="${carChassisBrakeInfo.rearBrakeType}"></td>
                        </tr>
                        <tr>
                            <td>驻车制动类型</td>
                            <td><input name="parking_brake_type" value="${carChassisBrakeInfo.parkingBrakeType}"></td>
                        </tr>
                        <tr>
                            <td>前轮胎规格</td>
                            <td><input name="front_wheel_size" value="${carChassisBrakeInfo.frontWheelSize}"></td>
                        </tr>
                        <tr>
                            <td>后轮胎规格</td>
                            <td><input name="rear_wheel_size" value="${carChassisBrakeInfo.rearWheelSize}"></td>
                        </tr> 
                        </tbody>
                    </table>
                    </div>
                    <div id="anquan">
                    <table class="table1" id="altrowstable"> 
                        <thead>
                        <tr>
                            <th align="center" colspan="2">安全配置</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>主/副驾驶安全气囊</td>
                            <td><input name="front_airbag" value="${carSafetyInfo.frontAirbag}"></td>
                        </tr>
                        <tr>
                            <td>前/后排头部气囊</td>
                            <td><input name="head_airbag" value="${carSafetyInfo.headAirbag}"></td>
                        </tr>
                        <tr>
                            <td>儿童座椅接口</td>
                            <td><input name="child_seat_int" value="${carSafetyInfo.childSeatInt}"></td>
                        </tr>
                        <tr>
                            <td>胎压检测</td>
                            <td><input name="tpms" value="${carSafetyInfo.tpms}"></td>
                        </tr>
                        <tr>
                            <td>车内中控锁</td>
                            <td><input name="car_lock" value="${carSafetyInfo.carLock}"></td>
                        </tr>
                        <tr>
                            <td>ABS防抱死系统</td>
                            <td><input name="abs" value="${carSafetyInfo.abs}"></td>
                        </tr>
                        <tr>
                            <td>车身稳定控制</td>
                            <td><input name="usc" value="${carSafetyInfo.usc}"></td>
                        </tr>
                        <tr>
                            <td>无钥匙启动</td>
                            <td><input name="pss" value="${carSafetyInfo.pss}"></td>
                        </tr>
                        </tbody>
                    </table>
                    </div>
                    <div id="waibu">
                    <table class="table1" id="altrowstable">
                        <thead>
                        <tr>
                            <th align="center" colspan="2">外部配置</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>电动天窗</td>
                            <td><input name="electronic_sunroof" value="${carExternalInfo.electronicSunroof}"></td>
                        </tr>
                        <tr>
                            <td>全景天窗</td>
                            <td><input name="panoramic_sunroof" value="${carExternalInfo.panoramicSunroof}"></td>
                        </tr>
                        <tr>
                            <td>电动吸合门</td>
                            <td><input name="electronic_door_pull" value="${carExternalInfo.electronicDoorPull}"></td>
                        </tr>
                        <tr>
                            <td>电动后备箱</td>
                            <td><input name="electronic_trunk" value="${carExternalInfo.electronicTrunk}"></td>
                        </tr>
                        <tr>
                            <td>雨量感应雨刷</td>
                            <td><input name="rain_sensing_wipers" value="${carExternalInfo.rainSensingWipers}"></td>
                        </tr>
                        <tr>
                            <td>后雨刷</td>
                            <td><input name="rear_wiper" value="${carExternalInfo.rearWiper}"></td>
                        </tr>
                        <tr>
                            <td>前/后电动车窗</td>
                            <td><input name="power_window" value="${carExternalInfo.powerWindow}"></td>
                        </tr>
                        <tr>
                            <td>电动后视镜</td>
                            <td><input name="electronic_rearview_mirror" value="${carExternalInfo.electronicRearviewMirror}"></td>
                        </tr>
                  <tr>
                            <td>后视镜加热</td>
                            <td><input name="rearview_mirror_heating" value="${carExternalInfo.rearviewMirrorHeating}"></td>
                        </tr> 
                        </tbody>
                    </table>
                    </div>
                    <div id="neibu">
                    <table class="table1" id="altrowstable">
                        <thead>
                        <tr>
                            <th align="center" colspan="2">内部配置</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>多功能方向盘</td>
                            <td><input name="mf_steering_wheel" value="${carInternalInfo.mfSteeringWheel}"></td>
                        </tr>
                        <tr>
                            <td>定速巡航</td>
                            <td><input name="dlcc" value="${carInternalInfo.dlcc}"></td>
                        </tr>
                        <tr>
                            <td>自动空调</td>
                            <td><input name="automatic_air_con" value="${carInternalInfo.automaticAirCon}"></td>
                        </tr>
                        <tr>
                            <td>手动空调</td>
                            <td><input name="manual_air_con" value="${carInternalInfo.manualAirCon}"></td>
                        </tr>
                        <tr>
                            <td>GPS导航</td>
                            <td><input name="gps" value="${carInternalInfo.gps}"></td>
                        </tr>
                        <tr>
                            <td>倒车雷达</td>
                            <td><input name="parking_redar" value="${carInternalInfo.parkingRedar}"></td>
                        </tr>
                        <tr>
                            <td>倒车影像</td>
                            <td><input name="reverse_video" value="${carInternalInfo.reverseVideo}"></td>
                        </tr>
                        <tr>
                            <td>真皮座椅</td>
                            <td><input name="leather_seat" value="${carInternalInfo.leatherSeat}"></td>
                        </tr>
                         <tr>
                            <td>前后排座椅加热</td>
                            <td><input name="seat_heating" value="${carInternalInfo.seatHeating}"></td>
                        </tr> 
                        </tbody>
                    </table>
                    
                     </div>
                     <span style="position:relative;left:600px;top:1200px;width:80px;height:30px "><input  type="radio" name="audite" value="y">审核通过</span>
                     <span style="position:relative;left:600px;top:1200px;width:80px;height:30px "><input  type="radio" name="audite" value="n">审核不通过</span><br/>
                     <input style="position:relative;left:600px;top:1200px;width:80px;height:30px " type="submit" value="审核提交">
                     <input style="position:relative;left:600px;top:1200px;width:80px;height:30px " type="button" onclick="javascript:history.back(-1);" value="返回" >
                     </form>
                </div>
                
   
                
                <!-- END table-responsive-->
                <div style="position:relative;left:600px;top:1200px;width:250px;height:100px ">
                    <span>客服电话：400-828-3499</span>
                    <!-- <div class="row">
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
                    </div> -->
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

<!-- <script src="ajax/allCarAjax.js"></script> -->
   <script src="vendor/jquery/jquery.min.js"></script>    
<script  src="js/layui.js" type="text/javascript"></script>     
<script  src="ajax/AllCarAjax.js" type="text/javascript"></script>  

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