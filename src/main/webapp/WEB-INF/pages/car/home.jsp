<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="cn.czwdz.carsale.manager.pojo.CarInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!doctype html>
<html>
<!-- head -->
<head _tracker='{"pagetype":"list","city":"xa","qpres":"95371467239243776","cpres":"search cpres","expids":"{ranker_id=0, predictor_id=2, retriever_id=0, rewriter_id=0, rank_sorter_id=1}","line":"c2c","platform":"web","ca_city":"bj"}'>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit">
<title>【西安二手车】西安二手车交易市场_西安二手车报价_西安二手车市场-西安东通二手车直卖网</title>
<meta name="keywords" content="西安二手车,西安二手车交易市场,西安二手车报价,西安二手车市场" />
<meta name="description" content="西安二手车,西安二手车交易市场,西安二手车报价,西安二手车市场提供西安二手车报价等二手车信息。东通二手车为您提供西安二手车车源,买卖二手车就上东通二手车直卖网。" />

    <meta http-equiv="P3P" content='CP="CAO PSA OUR"' />
    <meta name="baidu-site-verification" content="3r3nh4dkLA" />
    <meta name="360-site-verification" content="f045c917619b6b3dc82ad5f699a09474" />
    <meta name="google-site-verification" content="FQph3WEY6ZqNqVXCB5PT4_u8f-WjfF14l2OOdFiOEmg" />
    <meta http-equiv="Cache-Control" content="no-transform " />
    <meta name="sogou_site_verification" content="qY406sTreO"/>
    <meta name="shenma-site-verification" content="7b096264bff0cf1031a570c37abed00c_1476775946">
   <!--  <link rel="shortcut icon" type="image/x-icon" href="https://www.guazi.com/favicon.ico" media="screen" /> -->
    
    <style>
    	.hang{
    	background-color:pink;
    	border:1px solid green;
    	width:200px;
    	
    	height:200px;}
        .wai{
    	border:1px solid blue;
    	}
    </style>
      <style>
        .sel_btn{
            height: 21px;
            line-height: 21px;
            padding: 0 11px;
            background: #02bafa;
            border: 1px #1b89ea solid;
            border-radius: 3px;
            color: #1b89ea;
            display: inline-block;
            text-decoration: none;
            font-size: 15px;
            outline: none;
        }
        .ch_cls{
            background: #fff;
        }
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
</head>
<script>
    var logged = false;
    var host = 'www.dongtong.com';
    window.userPhone = '';
    window.phone400 = '400-069-6530';
</script>
<script>
    var subInitInfo = {"brand":0,"series":0,"type":0,"price":0,"licenseDate":0,"roadHaul":0,"licenseCity":176,"colour":0,"gearbox":0,"country":0,"emission":0};
    var handpickSelect = false;
    var financeType = 0;
    var listlogArr = {"city_filter":"176","num":8280};
    var cityDomain = 'xa';
</script>
    <!-- <link rel="canonical" href="https://www.guazi.com/xa/buy"/>  -->

<!-- 加载js/css-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/home.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/home2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/home3.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

<%-- <script type="text/javascript" src="${pageContext.request.contextPath }/js/home3.js"></script> --%>
<!-- <body class="list"> -->
<!-- 头部 -->
<input type="hidden" id="skipKindNew" value="0">
<!--<input type="hidden" id="firstSubLogin" value="0">-->
<input type="hidden" id="clueData" data-puid="" data-city-id="176">
<body >
<div  style="height: 100%; padding: 20px 0; background-color: #fafafa;">
<!-- 头部吸顶菜单 s -->
<div id="jstop" class="j-header header-2 " >
    <div class = "header" >
        <h1>
           <!--  <a href="" title="东通二手车">东通二手车1111</a> -->
           <img alt="" src="/images/logo1.png">
        </h1>
        <div class="city">
            <!-- 鼠标悬停 .city添加class名active -->
          
        <!--        class:all-city的作用是局部滚动不影响整体滚动-->
        </div>
        <div class="uc js-uc js-uc-new" data-gzlog="tracking_type=click&eventid=1015123400000003">
        <c:if test="${not empty user }"><a  class="uc-my" id="js-login-new"  href="${pageContext.request.contextPath}/Welcome?userid=${user}">欢迎${user }</a>&nbsp&nbsp<a href="/logout" style="color:#495056 ">退出登录</a></c:if>
        <c:if test="${empty user }"><a  class="uc-my" id="js-login-new"  href="/login/dongtong">登录</a></c:if>
         <input type="hidden" id="userId" value="${user}">
                <div class="uc-app" style=display:none>
                    <a href="/xa/userstore" class="js-loginElem1" data-gzlog="tracking_type=click&eventid=1015123400000004">收藏车辆</a>
                    <a href="/xa/userreduce" class="js-loginElem2" data-gzlog="tracking_type=click&eventid=1015123400000005">降价提醒</a>
                    <a href="/xa/userhistory" class="js-loginElem3" data-gzlog="tracking_type=click&eventid=1015123400000006">浏览记录</a>
                    <a href="javascript:;" class="js-logout js-loginElem4" data-gzlog="tracking_type=click&eventid=1015123400000007">退出</a>
                    <i></i>
                </div>
        </div>
        <div class="header-phone">
            <!--电话判断，当页面处于汽车金融则显示汽车金融电话  -->
            热线电话  400-069-6530        </div>
                <div class="nav-list">
            <a 
               href=""   title="东通新车" target="_blank" >东通新车</a>
            <a 
               href="" >东通金融</a>
            <a 
               href="" >东通服务</a>
    	    <a href="${pageContext.request.contextPath}/login/home" >我要卖车</a>
			<a  href="${pageContext.request.contextPath}/carHome?userid=${user}">我要买车</a>
            <a class="fl " 
               href="${pageContext.request.contextPath}/login/home"  >首页</a>
        </div>
    </div>
</div>
<!-- 头部吸顶菜单 e -->


<!-- 登录弹层  s -->
<!-- 登录弹框  s -->
<div class="pop-box pop-login" id="login1"></div> 
 <iframe name="guazi_login" style="display: none;"></iframe> 
<!-- 弹框蒙层  s -->
<div class="pop-mask"></div>
<!-- 弹框蒙层  e --><!-- 登录弹层  e -->

<script>
    //公用头部登陆后跳转至个人中心时url中需要用到
    var domain = 'xa';
    //意见反馈所需城市id
    var cityId = "176";
    var cityName = "\u897f\u5b89";
    var disOtherCity = 1;
    
 
    
    
</script>


<!-- 列表页内容区域 -->
<div class="list-wrap js-post">
    <!-- 面包屑，搜索框 -->
    <!-- 面包屑 -->
    <div class="crumbs-search" id="bread">
               <!--  <div class="crumbs">
        <a href='//www.guazi.com/xa/'>东通二手车</a>&gt;西安二手车        </div> -->
        <!-- input在focus状态下，最外层div添加class名active -->
        <div class="search js-search">
            <div class="search-box suggestion_widget" data-default-count="9">
                <input type="text" class="search-input js_search_input_index" placeholder="搜索您想要的车" submit="确定" />
                <button class="search-btn" data-gzlog="tracking_type=click&eventid=0020070000000022" type="button"></button>
                <input type="hidden" value="xa" name="hiddenCity">
            </div>
            <ul class="search-select" style="display: none;">
                <li class="select-tit">热门推荐</li>
                <li>大众</li>
                <li>福特</li>
                <li>丰田</li>
                <li>雪佛兰</li>
            </ul>
        </div>
    </div>
    <!-- 头部筛选框 -->
    <!-- 车源筛选1 -->
<div class="screen">
    <!-- 品牌 -->
    <dl class="clearfix">
                <dt>品牌</dt>
        <dd>
            <div class="dd-top">
                <span class="a-box">
                    <!-- 不限 -->
                    <a  style="color: #fff;background: #2D88CF;"    href="${pageContext.request.contextPath}/carHome?userid=${user}">不限</a>
                        
                        
                        
                        
                    <!-- 热门品牌 -->
                                        <a 
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=dazhong&type=hot onclick="getByBrand(this)" ${brand eq "上汽大众"||brand eq "大众(进口)" ?"style='color:#2D88CF'":"style='color:#495056'"}>大众</a>
                                        <a   
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=ford&type=hot onclick="getByBrand(this)"  ${brand eq "福特" ?"style='color:#2D88CF'":"style='color:#495056'"}>福特</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=buick&type=hot onclick="getByBrand(this)" ${brand eq "别克" ?"style='color:#2D88CF'":"style='color:#495056'"}>别克</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=benz&type=hot onclick="getByBrand(this)" ${brand eq "奔驰" ?"style='color:#2D88CF'":"style='color:#495056'"}>奔驰</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=audi&type=hot  onclick="getByBrand(this)" ${brand eq "奥迪" ?"style='color:#2D88CF'":"style='color:#495056'"}>奥迪</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=bmw&type=hot onclick="getByBrand(this)" ${brand eq "宝马" ?"style='color:#2D88CF'":"style='color:#495056'"}>宝马</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=toyota&type=hot onclick="getByBrand(this)" ${brand eq "丰田" ?"style='color:#2D88CF'":"style='color:#495056'"}>丰田</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=kia&type=hot  onclick="getByBrand(this)" ${brand eq "起亚" ?"style='color:#2D88CF'":"style='color:#495056'"}>起亚</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=hyundai&type=hot  onclick="getByBrand(this)" ${brand eq "现代" ?"style='color:#2D88CF'":"style='color:#495056'"}>现代</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=honda&type=hot onclick="getByBrand(this)" ${brand eq "本田" ?"style='color:#2D88CF'":"style='color:#495056'"}>本田</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=chevrolet&type=hot  onclick="getByBrand(this)" ${brand eq "雪佛兰" ?"style='color:#2D88CF'":"style='color:#495056'"}>雪佛兰</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=richan&type=hot  onclick="getByBrand(this)" ${brand eq "日产" ?"style='color:#2D88CF'":"style='color:#495056'"}>日产</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=hafu&type=hot  onclick="getByBrand(this)" ${brand eq "哈弗" ?"style='color:#2D88CF'":"style='color:#495056'"}>哈弗</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=byd&type=hot onclick="getByBrand(this)" ${brand eq "比亚迪" ?"style='color:#2D88CF'":"style='color:#495056'"}>比亚迪</a>
                                        <a  
                        data-gzlog=tracking_type=click&eventid=92458035&filter=brand&brand=jili&type=hot onclick="getByBrand(this)" ${brand eq "吉利" ?"style='color:#2D88CF'":"style='color:#495056'"}>吉利</a>
                                                        </span>
              <!--   <!-- 点击全部为span添加class名active -->
                
            </div>
            
        </dd>
    </dl>
    <!-- 车系 -->
    <dl class="clearfix">
                <dt>车系</dt>
         <dd>
            <div class="dd-top">
                <span class="a-box">
                    <a  style="color: #fff;background: #2D88CF;"
                        href="linkBrand?brand=${brand}&userId=${user}">不限 </a>
                        <c:forEach items="${list2}" var="lis">
                         <a 
                        data-gzlog=tracking_type=click&eventid=92513324&filter=tag&tag=fute-fukesi&type=hot
                         onclick="getByName(this)"   ${lis.carName eq name ? "style='color:#2D88CF'":"style='color:#495056'"}   brand="${lis.brand }">${lis.carName }</a>
                        </c:forEach>
                        </span>
                           </div>
            <div class="dd-car js-tag js-option-hid-info" style="display: none;">
           
            </div>
        </dd> 
    </dl>
    <!-- 价格 -->
    <dl class="clearfix">
        <dt>价格</dt>
        <dd>
                    <div class="dd-top">
              
                              <a rel=”nofollow”  style="color: #fff;background: #2D88CF;"                        data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=0                    href="linkBrand?num1=0.1&num2=10000&brand=${brand }&name=${name}&userId=${user}">不限</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=11    ${num1 eq "0" ? "style='color:#2D88CF'":"style='color:#495056'"}                 href="linkBrand?num1=0&num2=3&brand=${brand }&name=${name}">3万以下</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=12    ${num1 eq "3" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=3&num2=5&brand=${brand }&name=${name}">3-5万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=13    ${num1 eq "5" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=5&num2=7&brand=${brand }&name=${name}">5-7万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=14    ${num1 eq "7" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=7&num2=9&brand=${brand }&name=${name}">7-9万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=15    ${num1 eq "9" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=9&num2=12&brand=${brand }&name=${name}">9-12万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=16    ${num1 eq "12" ? "style='color:#2D88CF'":"style='color:#495056'"}               href="linkBrand?num1=12&num2=16&brand=${brand }&name=${name}">12-16万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=17    ${num1 eq "16" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=16&num2=20&brand=${brand }&name=${name}">16-20万</a>
                            <a rel=”nofollow”                     data-gzlog=tracking_type=click&eventid=92544716&filter=price_index&price_index=18    ${num1 eq "20" ? "style='color:#2D88CF'":"style='color:#495056'"}                href="linkBrand?num1=20&num2=10000&brand=${brand }&name=${name}">20万以上</a> 
                           
                        <div class="rangeFilter" data-url-template="/xa/buy/b{{begin}}e{{end}}/">
                        <form action="linkBrand">
                <input type="text" name="num1"
                    value="" 
                    class="screen-price js-begin" data-default-value="0" size="4" maxlength="3" id="my_price_b" name="b"/>
                <em class="screen-em">-</em>
                <input 
                    value=""  name="num2"
                    type="text" class="screen-price js-end" data-default-value="999" size="4" maxlength="3" id="my_price_e" name="e"/>
                <em class="screen-em">万</em>
                <button class="" submit="确定">确定</button>
                </form>
            </div>
            </div>
        </dd>
    </dl>
<!-- 筛选结果 -->
<div class="screen-result js-top" id="post">
    <p class="result-p3">在 "西安二手车" 中为您找到${count } 辆好车</p>
</div>

<!-- 热销车源 -->
<!-- 热销车系排行榜 -->

<!-- 车源筛选2 -->
<h2 style="display: none;">西安二手车交易市场</h2>
<h2 style="display: none;">西安二手车报价</h2>
<div class="list-filter">
    <div class="list-tab">
            <a     style=" algin: left;height: 46px; line-height: 46px;padding: 3px 10px 0;font-size: 22px;color: #495056;"    data-gzlog="tracking_type=click&eventid=1011000000000008"
            href="/xa/buy/#bread">全部</a>

            </div>
  
</div>    <!-- 车源展示 -->
    <!-- 车源列表 -->
    
    <ul class="carlist clearfix js-top">
       
       <c:forEach items="${list}" var="lis" varStatus="status">
       
        <c:if test="${status.index }%4==0"><p></p></c:if>
            <li data-scroll-track="61416242@0@0@1&0120000000000057" >
            <a title="${lis.brand }  ${lis.carName }  ${lis.confName }" href="getCarShow?id=${lis.carId }&userId=${user} " target="_blank" class="car-a" data-gzlog="tracking_type=click&eventid=0120000000000057&carid=61416242&pageno=0&position=0&city_filter=176&num=8280&is_baomai=1">
                <div style="background-image:url(/${lis.picUrl}) ;background-size: 287px 192px;width: 287px;height: 192px;" >

                    <c:forEach items="${keys}" var="key">
                        <c:if test="${key.equals(lis.carId)}"> <div style="background-image:url(/images/yiliulan.png) ;background-size: 50px 35px;width: 50px;height: 35px;float: right;"></div></c:if>
                </c:forEach>

                 </div>


                <h2>${lis.brand }  ${lis.carName }  ${lis.confName }</h2>
                <!-- 年款里程 -->
                <div class="t-i">车龄${lis.carAge }年<span class="icon-pad">|</span>行驶${lis.carMileage }公里<span class='icon-pad'>|</span>${lis.level }</div>

                <div class="t-price">
                    <!-- 价格 -->
                    <!-- 如果是保卖车且有降价,则是'补贴金'的话术样式-->
                    <p><span>补贴后</span>${lis.price }<span>万</span></p>
                    <!-- 标签 -->
                    <!-- 如果是保卖车且有降价,则是'补贴金'的话术样式-->
                    <i class='i-orange'>超值</i><i class='i-red'>急售</i><i class='i-blue'>严选车</i>                </div>
                <!-- 上侧标签 -->
                <!-- 如果是保卖车且有降价,则是'补贴金'的话术样式-->
                                    <em class="icon-sale">补贴额度<br>
                    <span><f:formatNumber maxFractionDigits="2">${lis.price*200 }</f:formatNumber>元</span>                    </em>
                                                
            </a>
        </li>

           
           
           
        </c:forEach>
        <!-- 添加最后一张 -->
        <c:if test="${pageCount==current}">
        <li data-scroll-track="61416242@0@0@1&0120000000000057" >
            <a  href="${pageContext.request.contextPath}/carHome" target="_blank" class="car-a" data-gzlog="tracking_type=click&eventid=0120000000000057&carid=61416242&pageno=0&position=0&city_filter=176&num=8280&is_baomai=1">
                <img src="/img/car_pic/lastPic.png" style="width: 287px;height: 192px;">
                
                                                
            </a>
        </li>
       </c:if>
    </ul>
<!--当前筛选-->
    <%--大于3页或搜索结果只有1页时出现搜索框--%>
    <c:if test="${pageCount<2}|${current>2}">
    <div class="search-box suggestion_widget" data-default-count="9">
        <input type="text" class="search-input js_search_input_index" placeholder="搜索您想要的车" submit="确定" />
        <button class="search-btn" data-gzlog="tracking_type=click&eventid=0020070000000022" type="button"></button>
        <input type="hidden" value="xa" name="hiddenCity">
    </div>
    </c:if>
<input type='hidden' id='listFilter' value='{"city_filter":"176","num":8280}'>
   <p style="text-align:center;line-height:20px;font-size:15px;color:#666; padding-top:20px;">
<div class="pageBox" data-widget="app/ms_v2/common/list_page.js#pagination"  align="center">
<a class="sel_btn ch_cls" id="sel_btn1 "href="linkBrand?current=1&brand=${brand }&name=${name}&num1=${num1 }&num2=${num2 }" >首页</a>
<%-- <c:if test="current > 1"> --%>
<a class="sel_btn ch_cls" id="sel_btn1 "id="top" href="linkBrand?current=${current-1 }&brand=${brand }&name=${name}&num1=${num1 }&num2=${num2 }" >上一页</a>
<c:forEach begin="1" end="${pageCount}" step="1" var="page">
<a class="sel_btn ch_cls" id="sel_btn1 "href="linkBrand?current=${page }&brand=${brand }&name=${name}&num1=${num1 }&num2=${num2 }" >${page }</a>
</c:forEach>
<a class="sel_btn ch_cls" id="sel_btn1 "href="linkBrand?current=${current+1}&brand=${brand }&name=${name}&num1=${num1 }&num2=${num2 } " >下一页</a>
<a  class="sel_btn ch_cls" id="sel_btn1 " href="linkBrand?current=${pageCount}&brand=${brand }&name=${name}&num1=${num1 }&num2=${num2 } " >末页</a>

</div>

        <!--公司信息-->
    <p style="text-align:center;line-height:20px;font-size:12px;color:#666; padding-top:20px;">
   东通旧机动车经纪（陕西）有限公司&emsp;&emsp;&emsp;
    陕西省西安市省体育场南侧&emsp;&emsp;&emsp;
    010-57317000
</p></div>
<div style='display:none;' class='js-check-post-code' data-str='7050d418c5575212716f36cee0ff31ff' data-time='1546848336'></div><input type='text' name='js-waf-seo-referer' value='https://www.guazi.com/bj/buy/' style='display:none;' /><input type="hidden" data-role="dataSource" class="dataSourceButton" data-source='[]' >
</div>
</div>
</body>
</html>
