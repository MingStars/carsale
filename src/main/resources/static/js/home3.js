
/*$(document).ready(function(){
	
	$("#obj").getByBrand(function(){
		var brand = $(obj).text();
		window.location.href = "linkBrand?brand=" + brand;
	})
	
	alert(brand);
	
	
})*/

function getByBrand(obj) {
    var list = $(list).attr("lis");
	var brand = $(obj).text();
	var userId = $("#userId").val();
	window.location.href = "linkBrand?brand=" + brand+"&userId="+userId;
}

function getByName(obj) {
    var brand = $(obj).attr("brand");
	var name = $(obj).text();
    var userId = $("#userId").val();
	window.location.href = "linkBrand?name=" + name+"&brand="+brand+"&userId="+userId;
}
