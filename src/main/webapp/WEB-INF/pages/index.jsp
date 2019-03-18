<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/resources/";
%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

   <base href="<%=basePath%>">
 
    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>cssmoban</title>
	<meta name="description" content="">
	<meta name="author" content="">
	
    <!-- Mobile Specific Metas
  ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
  ================================================== -->
  	<link rel="stylesheet" href="/css/zerogrid.css">
	<link rel="stylesheet" href="/css/style1.css">
	<link rel="stylesheet" href="/css/responsiveslides.css">
	
	<script src="/js/jquery-latest.min.js"></script>
	<script src="/js/script.js"></script>
    <script src="/js/jquery183.min.js"></script>
    <script src="/js/responsiveslides.min.js"></script>
    <script>
		// You can also use "$(window).load(function() {"
		$(function () {
		  // Slideshow 
		  $("#slider").responsiveSlides({
			auto: true,
			pager: false,
			nav: true,
			speed: 500,
			namespace: "callbacks",
			before: function () {
			  $('.events').append("<li>before event fired.</li>");
			},
			after: function () {
			  $('.events').append("<li>after event fired.</li>");
			}
		  });
		});
	</script>
	
	
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
		<script src="/js/html5.js"></script>
		<script src="/js/css3-mediaqueries.js"></script>
	<![endif]-->
    
</head>
<body>
<div class="wrap-body">

<!--////////////////////////////////////Header-->
<header class="bg-theme">
	<div class="wrap-header zerogrid">
		<div class="row">
			<div id="cssmenu">
				<ul>
				   <li class='active'><a href="${pageContext.request.contextPath}/login/home">首页</a></li>
				   <li><a href="${pageContext.request.contextPath}/carHome?userid=${user}">我要买车</a></li>
				   <li><a href="javascript:showDialog();">我要卖车</a></li>
					<c:if test="${not empty user }"><li><a href="${pageContext.request.contextPath}/Welcome?userid=${user}">个人中心</a></li></c:if>
					<c:if test="${empty user }"><li><a   href="${pageContext.request.contextPath}/login/dongtong">登录</a></li></c:if>

				  <!--  <li><a href="single.html">关于我们</a></li> -->
				   <li><a href="contact.html">联系方式</a></li>
				</ul>
			</div>
			<a href='index.html' class="logo"><img src="/images/logo.png" /></a>
		</div>
	</div>
</header>
<div class="slider">
	<!-- Slideshow -->
	<div class="callbacks_container">
		<ul class="rslides" id="slider">
			<li>
				<img src="/images/slideshow-image1.jpg" alt="">
				<div class="caption">
					<h1>东通二手车</h1>
					<span >二手车行业的领军者</span>
				</div>
			</li>
			<li>
				<img src="/images/slideshow-image2.jpg" alt="">
				<div class="caption">
					<h1>东通二手车</h1>
					<span >没有中间商赚差价</span>
				</div>
			</li>
			<li>
				<img src="/images/slideshow-image3.jpg" alt="">
				<div class="caption">
					<h1>东通二手车</h1>
					<span >没有中间商赚差价</span>
				</div>
			</li>
		</ul>
	</div>
	<div class="clear"></div>
</div>

<div class="bg-theme">
	<div class="filter zerogrid">
		<h2 class="t-center">寻找你喜欢的车辆</h2>
		<div class="row">
			<div class="col-1-4">
				<div class="wrap-col">
					<span>品牌 :</span><br/>
					<select>
						<option>--ALL--</option>
						<option>本田</option>
						<option>英菲尼迪</option>
						<option>Jeep</option>
						<option>梅赛德斯奔驰</option>
						<option>沃尔沃</option>
					</select>
				</div>
			</div>
			<div class="col-1-4">
				<div class="wrap-col">
					<span>车型 :</span><br/>
					<select>
						<option>--ALL--</option>
						<option>Aston martin</option>
						<option>Audi</option>
						<option>Bentley</option>
						<option>Bmw</option>
						<option>Cadillac</option>
						<option>Chevrolet</option>
						<option>Citroen</option>
						<option>Dacia</option>
						<option>Dodge</option>
						<option>Ferrari</option>
						<option>Ford</option>
						<option>Gmc</option>
						<option>Hyundai</option>
						<option>Jaguar</option>
						<option>Lexus</option>
					</select>
				</div>
			</div>
			<div class="col-1-4">
				<div class="wrap-col">
					<span>价格 :</span><br/>
					<select>
						<option>--ALL--</option>
						<option>0-1000</option>
						<option>1000-5000</option>
						<option>5000-10000</option>
					</select>
				</div>
			</div>
			<div class="col-1-4">
				<div class="wrap-col">
					<br>
					<a href="#" class="button bt1">我要买车</a>
				</div>
			</div>
		</div>
	</div>
</div>

<!--////////////////////////////////////Container-->
<section id="container">
	<div class="wrap-container clearfix">
		<div id="main-content">
			<div class="wrap-box"><!--Start Box-->
				<div class="zerogrid">
					<div class="header">
						<h2>精选车</h2>
					</div>	
					<div class="row">
						<div class="col-1-3">
							<div class="wrap-col">
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2016 / 32,000 km / 250 马力 / 汽油 / 自动变速箱 / 运动型 / 轿车 / 黑色</span>
													</div>
												</div>
											</div>
											<img src="/images/car1.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>阿斯顿马丁DB11</h3></a>
										<p>32,000 km ￥420,200</p>
									</div>
								</div>
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2014 / 22,000 km / 450 马力 / 汽油 / 自动变速箱 /  豪华型 /轿车 / 白色</span>
													</div>
												</div>
											</div>
											<img src="/images/car2.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>宾利飞驰</h3></a>
										<p>22,000 km ￥3,000,200</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-1-3">
							<div class="wrap-col">
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2013 / 22,000 km / 330  马力 / 汽油 / 自动变速器 /  运动型/跑车 / 红色</span>
													</div>
												</div>
											</div>
											<img src="/images/car3.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>奥迪R8</h3></a>
										<p>22,000 km ￥700,200</p>
									</div>
								</div>
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2010 / 72,000 km / 550  马力 / 汽油 / 自动变速器 /  豪华型/轿车 / 银色</span>
													</div>
												</div>
											</div>
											<img src="/images/car5.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>布加迪威龙</h3></a>
										<p>72,000 km ￥14,000,200</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-1-3">
							<div class="wrap-col">
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2016 / 42,000 km / 250  马力 / 汽油 / 自动变速器 /  运动型/跑车 / 黑色</span>
													</div>
												</div>
											</div>
											<img src="/images/car4.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>玛莎拉蒂GranTurismo</h3></a>
										<p>42,000 km ￥1,400,200</p>
									</div>
								</div>
								<div class="item t-center">
									<div class="item-container">
										<a href="single.html">
											<div class="item-caption">
												<div class="item-caption-inner">
													<div class="item-caption-inner1">
														<span>2010 / 62,000 km / 450  马力 / 汽油 / 自动变速器 /  豪华型/轿车 / 白色</span>
													</div>
												</div>
											</div>
											<img src="/images/car6.jpg" />
										</a>
									</div>
									<div class="item-info">
										<a href="single.html"><h3>劳斯莱斯幻影</h3></a>
										<p>62,000 km ￥3,500,200</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="wrap-box t-center" style="background: #fff; box-shadow: 2px 2px 5px 0px rgba(0,0,0,0.3);"><!--Start Box-->
				<div class="zerogrid">
					<div class="header">
						<h2>欢迎来到东通二手车</h2>
					</div>
					<strong>东通二手车秉持二手车直卖模式，为用户提供二手车检测定价、居间服务、汽车金融、售后保障、维修保养等一站式服务。</strong>
					<p>作为行业领军者，东通二手车始终坚持“没有中间商赚差价”的直卖模式，基于大数据与人工智能能力，在国内率先实现了二手车非标品的标准定价——东通价，该定价将逐步成为中国消费者买卖二手车的重要依据。在强大技术基因的助力下，东通二手车正在推动二手车车况与车价的透明化，对于行业的高速发展起到了革命性的作用。</p>
				</div>
			</div>
			<div class="wrap-box" ><!--Start Box-->
				<div class="zerogrid">
					<div class="header">
						<h2>最新发布</h2>
					</div>
					<div class="row">
						<div class="col-2-3">
							<div class="wrap-col">
								<div class="row">
									<div class="item">
										<div class="col-1-3">
											<div class="item-container">
												<a href="single.html">
													<div class="item-caption">
														<div class="item-caption-inner">
															<div class="item-caption-inner1">
																<span>2016 / 42,000 km / 245 马力 / 汽油 / 自动变速箱 /  运动型 /SUV / 白色</span>
															</div>
														</div>
													</div>
													<img src="/img/car_pic/100.jpg" />
												</a>
											</div>
										</div>
										<div class="col-2-3">
											<div class="wrap-col">
												<div class="item-info">
													<a href="../getCarShow?id=22222"><h3>福特撼路者</h3></a>
													<p>42,000 km ￥110,000</p>
													<p>2016款 2.0T 汽油自动豪华版   涡轮增压 245马力   前置四驱    6挡手自一体</p>
												</div>
											</div>
										</div>
										<div class="clear"></div>
									</div>
								</div>
								<div class="row">
									<div class="item">
										<div class="col-1-3">
											<div class="item-container">
												<a href="single.html">
													<div class="item-caption">
														<div class="item-caption-inner">
															<div class="item-caption-inner1">
																<span>2013 / 74,000 km / 167 马力 / 汽油 / 自动变速箱 /  舒适性 / SUV / 金色</span>
															</div>
														</div>
													</div>
													<img src="/img/car_pic/116.jpg" />
												</a>
											</div>
										</div>
										<div class="col-2-3">
											<div class="wrap-col">
												<div class="item-info">
													<a href="../getCarShow?id=54677"><h3>雪佛兰科帕奇</h3></a>
													<p>74,000 km ￥75,000</p>
													<p>2013款 2.4L 两驱城市版 7座   167马力  前置前驱    6挡手自一体</p>
												</div>
											</div>
										</div>
										<div class="clear"></div>
									</div>
								</div>
								<div class="row">
									<div class="item">
										<div class="col-1-3">
											<div class="item-container">
												<a href="single.html">
													<div class="item-caption">
														<div class="item-caption-inner">
															<div class="item-caption-inner1">
																<span>2010 / 82,000 km / 220 马力 / 汽油 / 自动变速箱 /  运动型/轿车 / 红色</span>
															</div>
														</div>
													</div>
													<img src="/img/car_pic/32.jpg" />
												</a>
											</div>
										</div>
										<div class="col-2-3">
											<div class="wrap-col">
												<div class="item-info">
													<a href="../getCarShow?id=56484"><h3>别克君威</h3></a>
													<p>82,000 km ￥62,000</p>
													<p>2010款 2.0T 豪华运动版   涡轮增压 220马力  前置前驱6挡手自一体</p>
												</div>
											</div>
										</div>
										<div class="clear"></div>
									</div>
								</div>
								<div class="row">
									<div class="item">
										<div class="col-1-3">
											<div class="item-container">
												<a href="single.html">
													<div class="item-caption">
														<div class="item-caption-inner">
															<div class="item-caption-inner1">
																<span>2014 / 72,000 km / 126 马力 / 汽油 / 手动变速箱 /  舒适性/轿车 / 金色</span>
															</div>
														</div>
													</div>
													<img src="/img/car_pic/22.jpg" />
												</a>
											</div>
										</div>
										<div class="col-2-3">
											<div class="wrap-col">
												<div class="item-info">
													<a href="../getCarShow?id=64859"><h3>观致3</h3></a>
													<p>72,000 km ￥45,000</p>
													<p>2014款 三厢 1.6L 手动致悦型  126马力 前置前驱   6挡手动</p>
												</div>
											</div>
										</div>
										<div class="clear"></div>
									</div>
								</div>
								<div class="row">
									<div class="item">
										<div class="col-1-3">
											<div class="item-container">
												<a href="single.html">
													<div class="item-caption">
														<div class="item-caption-inner">
															<div class="item-caption-inner1">
																<span>2017 / 22,000 km / 350 马力 / 汽油 / 自动变速箱 /  运动型/ suv / 白色</span>
															</div>
														</div>
													</div>
													<img src="/img/car_pic/64.jpg" />
												</a>
											</div>
										</div>
										<div class="col-2-3">
											<div class="wrap-col">
												<div class="item-info">
													<a href="../getCarShow?id=56971"><h3>福特探界者</h3></a>
													<p>22,000 km ￥350,000</p>
													<p>2017款 3.5T 精英版 涡轮增压 356马力  前置四驱   6挡手自一体</p>
												</div>
											</div>
										</div>
										<div class="clear"></div>
									</div>
								</div>
							</div>
						</div>
						<div id="sidebar" class="col-1-3">
							<div class="wrap-col">
								<!---- Start Widget ---->
								<div class="widget">
									<div class="wid-header">
										<h5>关于我们</h5>
									</div>
									<div class="wid-content">
										<p>东通集团，中国领军的汽车消费服务一站式平台，旗下拥有东通二手车、东通新车与车速拍三大品牌，协同为用户提供新车、二手车交易服务、汽车金融、售后保障、汽车维修保养等全产业链服务，一站式满足用户汽车全生命周期的所有需求。</p>
										<a href="#">更多了解</a>
									</div>
								</div>
								<!---- Start Widget ---->
								<div class="widget wid-post">
									<div class="wid-header">
										<h5>最新热点</h5>
									</div>
									<div class="wid-content">
										<div class="post">
											<a href="#"><img src="/images/car8.jpg"/></a>
											<div class="wrapper">
											  <h5><a href="#">Lorem ipsum dolor</a></h5>
											   <span>$25 - $26</span>
											</div>
										</div>
										<div class="post">
											<a href="#"><img src="/images/car9.jpg"/></a>
											<div class="wrapper">
											  <h5><a href="#">Lorem ipsum dolor</a></h5>
											  <span>$25 - $26</span>
											</div>
										</div>
										<div class="post">
											<a href="#"><img src="/images/car10.jpg"/></a>
											<div class="wrapper">
											  <h5><a href="#">Lorem ipsum dolor</a></h5>
											   <span>$25 - $26</span>
											</div>
										</div>
									</div>
								</div>
								<!---- Start Widget ---->
								<div class="widget">
									<div class="wid-header">
										<h5>投资</h5>
									</div>
									<div class="wid-content">
										<p>截至目前，东通集团拥有员工2万余人，业务遍布全国200多个城市。累计融资超17亿美元，居国内汽车消费服务电商平台前列。主要投资方包括红杉资本中国基金、腾讯、DST Global、今日资本、云锋基金、GIC、方源资本、工银国际、H CAPITAL、IDG资本等。</p>
										<a href="#" class="button bt1">投资关系</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<!--////////////////////////////////////Footer-->
<footer>
	<div class="zerogrid">
		<div class="wrap-footer">
			<div class="row">
				<h3>联系方式</h3>
				<span>Phone / +80 999 99 9999 </span></br>
				<span>Email / info@domain.com  </span></br>
				<span>运营方 / 东通品牌运营部 </span></br>
				<span><strong>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="东通之家">东通之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">东通之家</a></strong></span>
			</div>
		</div>
	</div>
</footer>

</div>

</body></html>