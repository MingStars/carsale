/*var json = [{"id":"1","name":"Tom","age":"12"},{"id":"2","name":"Joy","age":"13"}];*/
$(function(){
	ajax(null);
});


//function getCarById (){
//	var carId= $("#carId").val();
//	var sellerId= $("#sellerId").val();
//	var isLocked = $("#isLocked").val();
//	var data = {carId: carId,sellerId: sellerId,isLocked: isLocked};
//	//$("#table").empty(); 
//	
//	ajax(data);
//}
            


function ajax(data){
	console.log(data);
                  $.ajax({
                      type: "GET",
                      url: "../doGetCarSaled",
                      data:data,
                      dataType: "json",
                      success: function(json){
                    	  //console.log(json); 
                     	 //var json = data; 急于出售
                     	 
                     	 var nameList = ['汽车id', '卖家id', '买家id','操作'] //table的列名
                     	 var widthList = [100, 100, 100, 100] //table每列的宽度
                     	 var json = json;
                     	 /**
                     	  * 初始化设置nicepage组件    v1.0
                     	  *-------------------------------------------------------------
                     	  * 进行数据组装,与layui交互进行元素渲染
                     	  *-------------------------------------------------------------
                     	  * @param    {string}  table     table的div id
                     	  * @param    {string}  bar     底部分页的div id
                     	  * @param    {int}  limit     每页默认行数
                     	  * @param    {string}  color     底部分页的颜色
                     	  * @param    {array}  layout     底部分页的布局,具体可参考layui api
                     	  *
                     	  * @date     2018-10-19
                     	  * @author   duzhen wechat：wenxuejn
                     	  */
                     	
                     	  
                     	window.nicePage={table:"div",bar:"bar",limit:"10",color:"#1E9FFF",layout:["count","prev","page","next","limit","skip"],
                     			setCfg:function(b){nicePage.table=b.table;nicePage.bar=b.bar;nicePage.limit=b.limit;nicePage.color=b.color;nicePage.layout=b.layout},
                     			returnHtml:function(g,e){var h='<table class="layui-table" lay-size="sm"><colgroup>';for(var f in e){h+=" <col width="+e[f]+">"}h+=" </colgroup><thead><tr>";
                     			for(var f in g){h+="  <th>"+g[f]+"</th>"}h+=" </tr></thead> <tbody>";return h},returnList:function(j){var h=new Array();for(var f in j){var i="";for(var g in j[f]){i+=j[f][g]+"_"}i=i.substring(0,i.length-1);h.push(i)}return h},returnTable:function(e){var h=e.split("_");var g="<tr>";for(var f in h){g+="<td>"+h[f]+"</td>"}g+="</tr>";return g}};
                     	$(function(){
                     		nicePage.setCfg({
                     	 		table: 'table',
                     	 		bar: 'pageBar',
                     	 		limit: 20,
                     	 		color: '#1E9FFF',
                     	 		layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                     	 	});
                     		
                     		layui.use("laypage",function(){var a=layui.laypage;a.render({elem:nicePage.bar,
                     		limit:nicePage.limit,
                     		theme:nicePage.color,
                     		count:json.length,
                     		layout:nicePage.layout,
                     		jump:function(b){document.getElementById(nicePage.table).innerHTML=function(){var c=[nicePage.returnHtml(nameList,widthList)],d=nicePage.returnList(json).concat().splice(b.curr*b.limit-b.limit,b.limit);
                     	layui.each(d,function(e,g){var f=nicePage.returnTable(g);c.push(f)});
                     	c.push(" </tbody></table></br>");return c.join("")}()}})})});
                     	 
                     	//$(function () {
                 	 	
                 	// });
                     	  
                            }
                
             });
                 
                  
         }; 










 