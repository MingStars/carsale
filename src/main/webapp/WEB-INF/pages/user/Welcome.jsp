<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/resources/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到兆龙二手车</title>
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
                     <li><a href="PreUpdatePwd">密码修改 </a></li>
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
               <li>
                  <a href="#" title="Tables" data-toggle="collapse-next" class="has-submenu">
                     <em class="fa fa-bar-chart-o"></em>
                     <span class="item-text">作为卖方</span>                  </a>
                  <!-- START SubMenu item-->
                  <ul class="nav collapse ">
                     <li>
                        <a href="${pageContext.request.contextPath}/SellerSold">
                           <span class="item-text">已售出车辆信息</span>                        </a>                     </li>
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

               <li >
                  <a href="${pageContext.request.contextPath}/Collection" >
                     <em class="Collection"></em>
                     <span class="item-text" >收藏夹</span>                  </a>
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
       <div >
  <img src="images/small/car0012.jpg" width="100%" height="100%" style="z-index:-

100;position:absolute;left:0;top:0" />
 </div>
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
   <script type="text/javascript">
       $(function(){
           var discussListDom = $("#table-id").find("#table-tbody");
           $("#table-id").on("click","a#cancel",function(){
//               alert(321);
//               var tbval = $(this).closest("tr").find("td:first-child").val();
               var tbval = $(this).closest("tr").find("td:first-child").html();
               console.log(tbval);
               $.ajax({
                   type:"post",
                   url:"../collect/cancel",
                   data:{id:tbval},
                   success:function(data){
                       addDiscuss(data, discussListDom);
                   }
               });
           });
           function addDiscuss(data, discussListDom) {
//            discussListDom.children().removeAll();

               discussListDom.find("tr").remove();
//            alert(data.length);
               for (var i = 0; i < data.length; i++) {
                   var liDom=$("<tr></tr>");
                   <%--var message="<td>${data[i].order.orderId}</td><td>AA</td>";--%>
//            <a  class='car_a' href='/page/details?id=" + data[i].carId +
                   message = "<td>"+data[i].carId+"</td>"+
                       "<td>"+data[i].carName+"</td>"+
                       "<td><a href='/page/details?id="+data[i].carId+"'>"+data[i].confName+"</a></td>"+
                       "<td>"+data[i].gearbox+"</td>"+
                       "<td>"+data[i].engine+"</td>"+
                       "<td>"+data[i].bodyStructure+"</td>"+
                       "<td>"+data[i].carAge+"</td>"+
                       "<td>"+data[i].carMileage+"</td>"+
                       "<td><a href='javascript:void(0);' id='cancel'>取消</a></td>";
//                   console.log(liDom.html());
                   liDom.html(message);
//                   console.log(liDom.html());
                   discussListDom.append(liDom);
               }
               //------------X--------------
           };
       });
   </script>
   <!-- END Scripts-->
</body>
</html>