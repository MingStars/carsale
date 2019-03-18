<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/resources/";
%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->

<head>

    <meta name="viewport" content="width=100%,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no" />
    <link rel="shortcut icon" href="images/favicon.ico" />
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/apple-touch-icon-144-precomposed.png" />
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/apple-touch-icon-114-precomposed.png" />
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/apple-touch-icon-72-precomposed.png" />
    <link rel="apple-touch-icon-precomposed" href="images/apple-touch-icon-57-precomposed.png" />
    <title>Home Page</title>
    <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    <link href="css/style2.css" type="text/css" rel="stylesheet" />
    <link href="css/prettyPhoto.css" type="text/css" rel="stylesheet" />
    <link href="css/font-icomoon.css" type="text/css" rel="stylesheet" />
    <link href="css/font-awesome.css" type="text/css" rel="stylesheet" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="assets/css/font-awesome-ie7.css"/>
    <![endif]-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
    <script type="text/javascript" src="js/jquery.quicksand.js"></script>
    <script type="text/javascript" src="js/superfish.js"></script>
    <script type="text/javascript" src="js/hoverIntent.js"></script>
    <script type="text/javascript" src="js/jquery.flexslider.js"></script>
    <script type="text/javascript" src="js/jflickrfeed.min.js"></script>
    <script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
    <script type="text/javascript" src="js/jquery.elastislide.js"></script>
    <script type="text/javascript" src="js/jquery.tweet.js"></script>
    <script type="text/javascript" src="js/smoothscroll.js"></script>
    <script type="text/javascript" src="js/jquery.ui.totop.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript" src="js/ajax-mail.js"></script>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
	<style type="text/css">
.renzf-bz {
    padding-bottom: 40px;
    background: #f8f8f8;
    margin-top: 30px;
}
.renzf-bz ul {
    height: 246px;
    padding: 30px 0px 0;
}
.renzf-bz ul li {
    float: left;
    height: 246px;
    width: 180px;
    margin-left: 36px;
}
.renzf-bz ul li em.renzf-icoa {
    background-position: 0 -51px;
}
.renzf-bz ul li em.renzf-icob {
    height: 51px;
    width: 51px;
    background-position: 0 0;
    margin-top: 2px;
}
.renzf-bz ul li em.renzf-icoc {
    background-position: 0 -106px;
}
.renzf-bz ul li em.renzf-icod {
    background-position: 0 -218px;
}
.renzf-bz ul li em.renzf-icoe {
    background-position: 0 -162px;
}
.renzf-bz ul li em {
    display: block;
    width: 55px;
    height: 55px;
    margin: 0 auto;
    background: url(images/detail-rzc-ad.png) no-repeat;
}
.renzf-bz ul li p {
    background: #eee;
    border-radius: 3px;
    width: 188px;
    height: 110px;
    padding: 10px;
    font-size: 12px;
    color: #686868;
    line-height: 18px;
}
.renzf-bz ul li span {
    font-size: 16px;
    color: #686868;
    line-height: 24px;
    padding: 13px 0;
    text-align: center;
    display: block;
}
.renzf-bz h3 {
    font-size: 20px;
    color: #394043;
    line-height: 30px;
    padding-top: 30px;
    text-align: center;
}	
ul li{

list-style: none;

}		
.table1  {
border:white;
}

	</style>
	
	
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>

<!--top menu-->
<section id="top-menu">
    <div class="container">
        <div class="row">
         </div>
    </div>
</section>

<!--header-->
<header id="header">
    <div class="container">
        <div class="row header-top">
            <div class="span5 logo">
                <a class="logo-img" href="./index.html" title="responsive template"><img src="images/logo1.png" alt="Tabulate" /></a>
                <p class="tagline">二手车行业领军者</p>
            </div>
            <div class="span7 social-container">
                <p class="phone hidden-phone"><i class="icon-envelope"></i> info@dongtong.com</p><p class="phone hidden-phone"><i class="icon-bell"></i> Call Us +1 800 123 45 67</p>
                <div class="top-social">
                    <a data-original-title="Facebook" rel="tooltip" data-placement="top" class="facebook" href="#"></a>

                    <a data-original-title="Twitter" rel="tooltip" data-placement="top" class="twitter2" href="#"></a>

                    <a data-original-title="Dribble" rel="tooltip" data-placement="top" class="dribbble" href="#"></a>

                    <a data-original-title="Digg" rel="tooltip" data-placement="top" class="digg" href="#"></a>

                    <a data-original-title="DeviantArt" rel="tooltip" data-placement="top" class="dart" href="#"></a>

                    <a data-original-title="Market" rel="tooltip" data-placement="top" class="market" href="#"></a>
                </div>
            </div>
        </div>
        <div class="row header-nav">
           <div class="span12">
                <nav id="menu" class="clearfix">
                    <ul>
                        <li class="current"><a href="${pageContext.request.contextPath}/login/home"><span class="name">首页</span></a>
                            <!-- <ul>
                                <li><a href="./index.html">Home Page 1</a></li>
                                <li><a href="./index2.html">Home Page 2</a></li>
                                <li><a href="./index3.html">Home Page 3</a></li>
                            </ul> -->
                        </li>
                        <li><a href="${pageContext.request.contextPath}/carHome"><span class="name">我要买车</span></a>
                            <!-- <ul>
                                <li><a href="./about.html">About Us</a></li>
                                <li><a href="./full-width.html">Full Width</a></li>
                                <li><a href="./bs-scaffolding.html">BootStrap Pages</a>
                                    <ul>
                                        <li><a href="./bs-scaffolding.html">Scaffolding</a></li>
                                        <li><a href="./bs-base-css.html">Base CSS</a></li>
                                        <li><a href="./bs-components.html">Components</a></li>
                                        <li><a href="./bs-javascript.html">JavaScript</a></li>
                                    </ul>
                                </li>
                                <li><a href="./font-awesome.html">FontAwesome</a></li>
                                <li><a href="./price-table.html">Price Table</a></li>
                                <li class="last"><a href="./404.html">404 Page not found</a></li>
                            </ul> -->
                        </li>
                        <li><a href="${pageContext.request.contextPath}/login/home"><span class="name">我要卖车</span></a>
                            <!-- <ul>
                                <li><a href="./portfolio2.html">Portfolio 2 col</a>
                                    <ul>
                                        <li><a href="./portfolio2.html">Portfolio 2 Columns</a></li>
                                        <li class="last"><a href="./portfolio2ex.html">Portfolio 2 Columns Extended</a></li>
                                    </ul>
                                </li>
                                <li><a href="./portfolio3.html">Portfolio 3 col</a>
                                    <ul>
                                        <li><a href="./portfolio3.html">Portfolio 3 Columns</a></li>
                                        <li class="last"><a href="./portfolio3ex.html">Portfolio 3 Columns Extended</a></li>
                                    </ul>
                                </li>
                                <li><a href="./portfolio4.html">Portfolio 4 col</a>
                                    <ul>
                                        <li><a href="./portfolio4.html">Portfolio 4 Columns</a></li>
                                        <li class="last"><a href="./portfolio4ex.html">Portfolio 4 Columns Extended</a></li>
                                    </ul>
                                </li>
                                <li class="last"><a href="./portfolio-single.html">Single Portfolio</a></li>
                            </ul> -->
                        </li>
                        <li><a href="${pageContext.request.contextPath}/Welcome?userid=${user}"><span class="name">个人中心</span></a>
                            <!-- <ul>
                                <li><a href="./blog-sidebar-right.html">Blog - Sidebar Right</a></li>
                                <li><a href="./blog-sidebar-left.html">Blog - Sidebar Left</a></li>
                                <li><a href="./blog-type-1.html">Blog Type 1</a></li>
                                <li><a href="./blog-type-2.html">Blog Type 2</a></li>
                                <li class="last"><a href="./blog-single.html">Blog Single</a></li>
                            </ul> -->
                        </li>
                        <li><a href="./contact.html"><span class="name">联系我们</span></a></li>
                    </ul>
                </nav>
               <!--<form class="top-search pull-right">-->
                       <!--<input type="text" placeholder="text here..." class="span3">-->
                       <!--<button type="button" class="btn"><i class="icon-search-form"></i></button>-->
               <!--</form>-->
            </div>
        </div>
    </div>
</header>

<!--slider-->
<section id="slider">
    <div class="container">
        <div class="row">
            <div class="span12">
                <div id="mainslider" class="flexslider">
                    <ul class="slides">
                        <li>
                            <img src="${carInfo.picUrl}" alt="" />
                            
                        </li>
                        <li>
                            <img src="${carInfo.picUrl}" alt="" />
                            
                        </li>
                        <li>
                            <img src="${carInfo.picUrl}" alt="" />
                            
                        </li>
                        <li>
                            <img src="${carInfo.picUrl}" alt="" />
                           
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>

<!--container-->
<section id="container">
    <div class="container">
    <div class="row">
        <div class="span12">
            <div class="hero-unit">
                <h4>欢迎来到东通二手车！</h4>
                <p >服务保障（瓜子已对车辆进行检测，并提供30天可退保障）</p>
                   <p style="width: 1000px;padding-left: 20px;">30天可退 </p><img src="images/dfg.png" height="20px" width="20px"/>
					<p style="width: 1000px;padding-left: 20px;">  调表车赔付 </p><img src="images/dfg.png" height="20px" width="20px"/>
					<p style="width: 1000px;padding-left: 20px;">  盗抢查封销赃车必退 </p><img src="images/dfg.png" height="20px" width="20px"/>
					<p style="width: 1000px;padding-left: 20px;">  259项检测</p><img src="images/dfg.png" height="20px" width="20px"/>
                    <p align="right" style="width: 1100px;padding-right: 0px;border-bottom: 1px solid #dddddd">车主报价：<strong style="color:#fd6c34 ;font-size: 28px">${carInfo.price}万元</strong> 服务费<f:formatNumber maxFractionDigits="2">${carInfo.price*288}</f:formatNumber>元(车价x2.88%)</p><br>
             <div align="right" style="margin:20px 0px;padding-right: 50px;" > <div  style="display:inline; background-color:#fd6c34;width: 154px;height: 40px;padding:10px 15px 10px 15px ;" align="center"><a  href=""  style="#fd6c34;font-size: 20px ;color: white;" >预约看车</a></div>
              <div  style="margin:0px 40px;display:inline;border: 1px solid #2abd53;background-color: #f6fcf7;;width: 154px;height: 40px;padding:10px 15px 10px 15px ;" align="center"><a  id="addFavCar"  style="#fd6c34;font-size: 20px ;color: #2abd53;" >收藏爱车</a></div>
            </div>
            </div>
        </div>
    </div>
	
	<div class="renzf-bz">
            <h3>东通认证服务保障</h3>
            <ul>
                <li>
                    <em class="renzf-icoa"></em>
                    <span>售后保障</span>
                    <p>检测30天内，若购车客户确认车辆在购买前已是“重大事故损伤车辆”,经第三方机构进行复核和确认，客户将获得退还车款回收车辆或车辆重新评估补偿差价的服务</p>
                </li>
                <li>
                    <em class="renzf-icob"></em>
                    <span>免费专业检测</span>
                    <p>所有“认证服务”车源在成交前均可提供免费的专业检测，此检查服务仅对重大事故车、泡水车、火烧车的情况做排除（详见东通认证服务）</p>
                </li>
                <li>
                    <em class="renzf-icoc"></em>
                    <span>排除重大事故</span>
                    <p>“认证服务”车源将经过严格筛选过程，成交前进行车辆检测，确保排除重大碰撞事故车</p>
                </li>
                <li>
                    <em class="renzf-icod"></em>
                    <span>排除火烧</span>
                    <p>“认证服务”车源将经过严格筛选过程，成交前进行车辆检测，确保排除火烧车</p>
                </li>
                <li>
                    <em class="renzf-icoe"></em>
                    <span>排除泡水</span>
                    <p>“认证服务”车源将经过严格筛选过程，成交前进行车辆检测，确保排除泡水车</p>
                </li>
            </ul>
        </div>
	
	
	
    <div class="row">
        <div class="span3">
            <div class="hl-circle">
                <a class="hl-icon1" href="services.html">service</a>
            </div>

            <div style="padding-left: 37px" class="highlights-content clearfix">
                <h5>基本信息</h5>
 <table border="1"   class="table1">
                        <!-- <thead>
                        <tr>
                            <th align="center" colspan="2">基本信息</th>
                        </tr>
                        </thead> -->
                        <tbody >
                        <tr>
                            <td>品牌</td>
                            <td>${carInfo.carName}</td>
                        </tr>
                        <tr>
                            <td>级别</td>
                            <td>${carInfo.level}</td>
                        </tr>
                       <tr>
                            <td>发动机</td>
                            <td>${carInfo.engine }</td>
                        </tr>
                        <tr>
                            <td>变速箱</td>
                            <td>${carInfo.gearBox}</td>
                        </tr>
                        <tr>
                            <td>车身结构</td>
                            <td>${carInfo.bodyStructure}</td>
                        </tr>
                        <tr>
                            <td>长*宽*高{mm)</td>
                            <td>${carInfo.size}</td>
                        </tr>
                        <tr>
                            <td>最大车速(km/s}</td>
                            <td>${carInfo.maxImumSpeed}</td>
                        </tr>
                        <tr>
                            <td>行李箱容积(L)</td>
                            <td>${carInfo.cargoVolume}</td>
                        </tr>
                        
                        </tbody>
                    </table>
                

                <!-- <a class="btn-small btn-hl" href="services.html">
                    <span>Read more</span>
                </a> --><!-- button small end -->
            </div>
        </div>
        <div class="span3 ">
            <div class="hl-circle">
                <a class="hl-icon2" href="services.html">service</a>
            </div>

            <div style="padding-left: 37px" class="highlights-content clearfix">
                <h5>发动机参数</h5>
<table border="1" class="table1">
                        <!-- <thead>
                        <tr>
                            <th align="center" colspan="2">发动机参数</th>
                        </tr>
                        </thead> -->
                        <tbody>
                        <tr>
                            <td>排量(L)</td>
                            <td>${carEngineInfo.displacement}</td>
                        </tr>
                        <tr>
                            <td>进气形式</td>
                            <td>${carEngineInfo.intakeForm}</td>
                        </tr>
                        <tr>
                            <td>气缸排列形式</td>
                            <td>${carEngineInfo.cylinderArrangement}</td>
                        </tr>
                        <tr>
                            <td>气缸数</td>
                            <td>${carEngineInfo.cylinders}</td>
                        </tr>
                        <tr>
                            <td>最大马力(Ps)</td>
                            <td>${carEngineInfo.maximumHorsepower}</td>
                        </tr>
                        <tr>
                            <td>燃料类型</td>
                            <td>${carEngineInfo.fuel}</td>
                        </tr>
                        <tr>
                            <td>燃油标号</td>
                            <td>${carEngineInfo.fuelLabel}</td>
                        </tr>
                        <tr>
                            <td>供油方式</td>
                            <td>${carEngineInfo.oilsupplyMode}</td>
                        </tr>
                       <tr>
                            <td>排放标准</td>
                            <td>${carEngineInfo.enviromentStandard}</td>
                        </tr> 
                        </tbody>
                    </table>
                

                <!-- <a class="btn-small btn-hl" href="services.html">
                    <span>Read more</span>
                </a> --><!-- button small end -->
            </div>
        </div>
        <div class="span3">
            <div class="hl-circle">
                <a class="hl-icon3" href="services.html">service</a>
            </div>

            <div style="padding-left: 37px" class="highlights-content clearfix">
                <h5>底盘及制动</h5>
<table border="1" class="table1">
                        <!-- <thead>
                        <tr>
                            <th align="center" colspan="2">底盘及制动</th>
                        </tr>
                        </thead> -->
                        <tbody>
                        <tr>
                            <td>驱动方式</td>
                            <td>${carChassisBrakeInfo.driveMode}</td>
                        </tr>
                        <tr>
                            <td>助力类型</td>
                            <td>${carChassisBrakeInfo.autoPowerType}</td>
                        </tr>
                        <tr>
                            <td>前悬挂类型</td>
                            <td>${carChassisBrakeInfo.frontSuspensionType}</td>
                        </tr>
                        <tr>
                            <td>后悬挂类型</td>
                            <td>${carChassisBrakeInfo.rearSuspensionType}</td>
                        </tr>
                        <tr>
                            <td>前制动类型</td>
                            <td>${carChassisBrakeInfo.frontBrakeType}</td>
                        </tr>
                        <tr>
                            <td>后制动类型</td>
                            <td>${carChassisBrakeInfo.rearBrakeType}</td>
                        </tr>
                        <tr>
                            <td>驻车制动类型</td>
                            <td>${carChassisBrakeInfo.parkingBrakeType}</td>
                        </tr>
                        <tr>
                            <td>前轮胎规格</td>
                            <td>${carChassisBrakeInfo.frontWheelSize}</td>
                        </tr>
                      <tr>
                            <td>后轮胎规格</td>
                            <td>${carChassisBrakeInfo.rearWheelSize}</td>
                        </tr> 
                        </tbody>
                    </table>
                

                <!-- <a class="btn-small btn-hl" href="services.html">
                    <span>Read more</span>
                </a> --><!-- button small end -->
            </div>
        </div>
        <div class="span3">
            <div class="hl-circle">
                <a class="hl-icon4" href="services.html">service</a>
            </div>

            <div style="padding-left: 37px"  class="highlights-content clearfix">
                <h5>安全配置</h5>
                 <table  border="1" class="table1">
                        <!-- <thead>
                        <tr>
                            <th align="center" colspan="2">安全配置</th>
                        </tr>
                        </thead> -->
                        <tbody>
                        <tr>
                            <td>主/副驾驶安全气囊</td>
                            <td>${carSafetyInfo.frontAirbag}</td>
                        </tr>
                        <tr>
                            <td>前/后排头部气囊</td>
                            <td>${carSafetyInfo.headAirbag}</td>
                        </tr>
                        <tr>
                            <td>儿童座椅接口</td>
                            <td>${carSafetyInfo.childSeatInt}</td>
                        </tr>
                        <tr>
                            <td>胎压检测</td>
                            <td>${carSafetyInfo.tpms}</td>
                        </tr>
                        <tr>
                            <td>车内中控锁</td>
                            <td>${carSafetyInfo.carLock}</td>
                        </tr>
                        <tr>
                            <td>ABS防抱死系统</td>
                            <td>${carSafetyInfo.abs}</td>
                        </tr>
                        <tr>
                            <td>车身稳定控制</td>
                            <td>${carSafetyInfo.usc}</td>
                        </tr>
                        <tr>
                            <td>无钥匙启动</td>
                            <td>${carSafetyInfo.pss}</td>
                        </tr>
                        </tbody>
                    </table>
                

                <!-- <a class="btn-small btn-hl" href="services.html">
                    <span>Read more</span>
                </a> --><!-- button small end -->
            </div>
        </div>
    </div>
        <div class="row">
        <div class="span12 our-works"><h4>车辆图片</h4></div>
        <div class="span12">
            <div id="our-projects" class="carousel bttop">
                <div class="carousel-wrapper">
                    <ul class="portfolio" >
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 1</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>
                                    </div>
                                </div>
                            </article>
                        </li>
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 2</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>

                                    </div>
                                </div>
                            </article>
                        </li>
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 3</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>

                                    </div>
                                </div>
                            </article>
                        </li>
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 4</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>
                                    </div>
                                </div>
                            </article>
                        </li>
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 5</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>

                                    </div>
                                </div>
                            </article>
                        </li>
                        <li>
                            <article>
                                <div class="inner-image">
                                    <a href="example/view.jpg" data-rel="prettyPhoto">
                                        <img src="${carInfo.picUrl}" alt="" />
                                        <span class="frame-overlay"></span>
                                    </a>
                                </div>
                                <div class="sliding">
                                    <div class="inner-text">
                                        <h4 class="title"><a href="./portfolio-single.html">Project title 6</a></h4>
                                        <p>Lorem ipsum dolor site amet quanta negat omnia</p>
                                    </div>
                                </div>
                            </article>
                        </li>
                    </ul>
                </div>
            </div>
            <script type="text/javascript">
                $(document).ready(function(){
                    $('#our-projects').elastislide({
                        imageW : 250,
                        
                        border : 0,
                        minItems : 1,
                        margin : 30
                    });
                });
            </script>
        </div>
    </div>
       <div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>
        <div class="row">
            <div class="span12">
                <ul class="thumbnails">
                    <!---->
                    <li class="span6">
                        <a href="example/view.jpg" data-rel="prettyPhoto" class="thumbnail">
                            <img src="${carInfo.picUrl}" height="560" width="570" alt="" />
                            <span class="frame-overlay"></span>
                        </a>
                    </li>
                    <!---->
                    <li class="span3">
                        <a href="example/view.jpg" data-rel="prettyPhoto" class="thumbnail">
                            <img src="${carInfo.picUrl}"  alt="" />
                            <span class="frame-overlay"></span>
                        </a>
                    </li>
                    <!---->
                    <li class="span3">
                        <a href="example/view.jpg" data-rel="prettyPhoto" class="thumbnail">
                            <img src="${carInfo.picUrl}" alt="" />
                            <span class="frame-overlay"></span>
                        </a>
                    </li>
                    <!---->
                    <li class="span3">
                        <a href="example/view.jpg" data-rel="prettyPhoto" class="thumbnail">
                            <img src="${carInfo.picUrl}" alt="" />
                            <span class="frame-overlay"></span>
                        </a>
                    </li>
                    <!---->
                    <li class="span3">
                        <a href="example/view.jpg" data-rel="prettyPhoto" class="thumbnail">
                            <img src="${carInfo.picUrl}" alt="" />
                            <span class="frame-overlay"></span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="span12 testimonials">
                <h4>东通质量保证</h4>
            </div>
            <div class="span4">
                <p>
                    1、靠谱车况：专业检测师团队，259项检测，杜绝事故车，全程担保<br><br>
                    2、轻松买车：专业购车顾问陪您看车，协助过户，买车放心不被蒙<br><br>
                    3、售后保障：30天可退,维修保障，为你的爱车保驾护航
                </p>
            </div>
            <div class="span8">
                <!--testimonals-->
                <div id="testimonial" class="carousel bttop">
                    <div class="carousel-wrapper">
                        <ul class="testimonials">
                            <li>
                                <img src="example/testimonials1.jpg" alt="" />
                                <p>
                                    之前担心在网上买不到优质二手车，不过东通二手车帮我找到了梦寐以求的车，线下服务人员很耐心的讲解了注意事项，交易过程很愉快！
                                </p>
                                <h4>买家王女士 <small>Compani Inc.</small></h4>
                            </li>
                            <li>
                                <img src="example/testimonials2.jpg" alt="" />
                                <p>
                                    我有一辆开了4年的蒙迪欧，发布在别的平台大都是车贩来电话，这个平台是个人对个人交易，信息真实可靠，三天就卖出去了！
                                </p>
                                <h4>卖家张先生 <small>Compani Inc.</small></h4>
                            </li>
                            <li>
                                <img src="example/testimonials3.jpg" alt="" />
                                <p>
                                    东通二手车帮我挑了一部好车，比买新车便宜了4万多，车很新，不用担心是事故车，东通质保30天，有问题随时可退！
                                </p>
                                <h4>买家刘先生 <small>Compani Inc.</small></h4>
                            </li>
                            <li>
                                <img src="example/testimonials4.jpg" alt="" />
                                <p>
                                    东通每天交易量很大，朋友推荐我来这卖车，线下服务人员很专业，帮我评估了车辆，比我预期还多卖了5000元。
                                </p>
                                <h4>卖家杨女士 <small>Compani Inc.</small></h4>
                            </li>
                        </ul>
                    </div>
                </div>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $('#testimonial').elastislide({
                            imageW  : 740,
                            margin  : 30
                        });
                    });
                </script>
            </div>
        </div>
    </div>
</section>

<!--footer-->
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="span4">
                <p><img src="example/logo.png" alt="" /></p>
                <address>
                    <p><i class="icon-map-marker"></i>陕西省, 西安市, 90210</p>
                    <p><i class="icon-phone"></i> (029) 456-7890</p>
                    <p><i class="icon-mobile-2"></i> (029) 456-7890</p>
                    <p><i class="icon-mail-3"></i> <a href="mailto:#">info@dongtong.com</a></p>
                </address>
            </div>
            <div class="span8">
                <div class="row">
                    <div class="span8"></div>
                    <div class="span8">

                    </div>
                </div>
            </div>
            <div class="span4">
                <p class="heading">关于我们</p>
                <p>东通二手车，成立于2015年9月，致力于用创新重塑二手车产业，为用户创造更大的价值。东通二手车秉持二手车直卖模式，为用户提供二手车检测定价、居间服务、汽车金融、售后保障、维修保养等一站式服务。 </p>
                <p class="heading">版权所有</p>
                <p>东通®/东通二手车®/东通二手车直卖网®等带有®标记的内容均是东通旧机动车经纪（陕西）有限公司的注册商标</p>
                <div class="input-append">
                    <input type="text" placeholder="Enter Email Address" class="span2" />
                    <button type="button" class="btn btn-inverse">Subscribe!</button>
                </div>
            </div>
            <div class="span4">
                <p class="heading">关于公司</p>
                <ul class="footer-navigate">
                    <li><a href="./index.html">首页</a></li>
                    <li><a href="./about.html">关于</a></li>
                    <li><a href="./portfolio4.html">投资关系</a></li>
                    <li><a href="./blog-sidebar-right.html">博客</a></li>
                    <li><a href="./services.html">合作关系</a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>

<!--footer menu-->
<section id="footer-menu">
    <div class="container">
        <div class="row">
            <div class="span4">
                <p class="copyright">Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="东通之家">东通之家</a> - Collect from <a href="http://www.cssmoban.com/" title="东通" target="_blank">东通</a></p>
            </div>
            <div class="span8 hidden-phone">
                <ul class="pull-right">
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Contact Us</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>
        </div>
    </div>
</section>


</body>
<script>
    $(function(){
        $('#addFavCar').click(function(){
            $.ajax({
                type: "GET",
                url: "addFavCar?id=${carInfo.carId}&userId=${userId}",
                dataType: "text",
                success: function(data){
                    $('#addFavCar').text("");
                    $('#addFavCar').text("已收藏");
                }, error: function(){
                alert("服务器链接失败");
            }
            });
        });
    });
</script>
</html>
