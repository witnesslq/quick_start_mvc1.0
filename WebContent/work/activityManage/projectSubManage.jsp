<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>活动项目管理</title>
<%@ include file="../../inc.jsp"%>
<script type="text/javascript" src="<%=basePath%>/script/easyui/easyui-validatebox.js"></script>
<script type='text/javascript' src='<%=basePath%>/script/easyui/dwrloader.js'></script>
<script type="text/javascript" src='<%=basePath%>/dwr/interface/activityManageAction.js'></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/script/flash/skin/idialog.css" id="artDialogSkin" />
<script type="text/javascript" src="<%=basePath%>/script/flash/artDialog.js"></script>
<script type="text/javascript" src="<%=basePath%>/script/flash/photoEditor.js"></script>

<link href="<%=basePath%>/script/uploadPlug/css/uploadPlug.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="<%=basePath%>/script/uploadPlug/js/swfobject.js"></script>
<script type="text/javascript" src="<%=basePath%>/script/uploadPlug/js/uploadPlug.js" charset="utf-8"></script>

<!--	富文本框样式-->
<script type="text/javascript"
	src="<%=basePath%>/script/ckeditor/ckeditor.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/script/ckfinder/ckfinder.js"></script>

<style type="text/css">
a{color:blue;}
.lableWidth100 {
	width: 60px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}

.lableLine320 {
	width: 237px;
	float: left;
	padding-top: 8px
}

.lableWidth120 {
	width: 84px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}
.lableWidth888{
	width: 72px;
	float: left;
	white-space: nowrap;
	margin-top: 5px
}

.lableWidth150 {
	width: 90px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}

.lableWidth160 {
	width: 120px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}

.lableWidth170 {
	width: 100px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}

.lableLine350 {
	width: 260px;
	float: left;
	padding-top: 8px
}
.lableLine650 {
	width: 740px;
	float: left;
	margin-top: 15px;
}
.lableLine1050 {
	width: 750px;
	float: left;
	padding-top: 0px;
	margin-top:0px;
	border:0px solid red;
}
.lableLine530 {
	width: 640px;
	float: left;
	margin-top: 15px;
}

.lableWidth180 {
	width: 100px;
	float: left;
	white-space: nowrap;
	padding-top: 4px
}


.hidden {
	display: none;
	visibility: hidden
}

input {
	width: 150px;
}

input.f{
	width:380px;
}
</style>
<script type="text/javascript">
      
//easyui接收jsp页面传值,点击修改传过来的aid
var para = easyui_getRequestPara();
var aid = para.aid;
var apid = para.apid;
// alert("aid"+aid);
// alert("apid"+apid);
//<!---------------活动项目增加、修改JS start--------------->
//加载js
var map = {};
$(function() {
	
// 	根据aid和apid查询数据,做修改前处理。
		if (aid !=null&&aid!=""&&apid!=null&&apid!="") {
			activityManageAction.getByIdProject(aid,apid, {
				async : false,
				callback : function(data) {
					if (data.success) {
						$('#fm').form('load', data.data);

						map = data.data;
						//富文本单独处理
// 						CKEDITOR.instances.content.setData(data.data.content);
					} else {

						$.messager.alert("提示", data.msg);
					}
				}
			});

		}

});

//新增或者修改
function saveOrUpdateProject() {

	//校验数量
// 	var projectNum=$("#projectNum").val();
// 	var r = /^\+?[1-9][0-9]*$/;
//     if(!r.test(projectNum)){
//         alert("课程项目数量是一个整数!");
//         $("#projectNum").focus();
//         return false;
//     }

// 	var refprice=$("#refprice").val();
// 	var r = /^(([1-9][0-9]*)|(([0]\.\d{1,2}|[1-9][0-9]*\.\d{1,2})))$/;
// 	if(refprice!=0||refprice!=0.00){
// 	if(!r.test(refprice)){
//         alert("金额任意正整数，正小数（小数位不超过2位）!");
//         $("#refprice").focus();
//         return false;
//     }
// }
    //校验表单
	var isValid = $("#fm").form('validate');
	if (!isValid) {
		$.messager.alert('警告', "请将红框内的数据修改正确！", 'warning');
		return;
	}
	//map传值方式
//		map['aid'] = aid;
	//遍历表单数据
	$.each($("#fm").find("input[name],textarea[name],select[name]"), function() {
		//控件类型
		if ($(this).hasClass("easyui-combobox")
				&& $(this).combobox("getValue") != "") {
			map[$(this).attr("name")] = $
					.trim($(this).combobox("getValue"));
		} else {
			map[$(this).attr("name")] = $.trim($(this).val());
		}
	});
   //富文本框的值存入map
// 	map['content']=CKEDITOR.instances.content.getData();
  
	var para = easyui_getRequestPara();
	var aid = para.aid;
	var apid = para.apid;
	 //如果是修改，传aid和apid到后台
	if(apid!=null&&apid!=""&&aid!=null&&aid!=""){
		
		 map['aid']=aid;
		 map['apid']=apid;
// 		 alert("修改");
	}
	 //如果是新增，传aid到后台
	if(aid!=null&&aid!=""&&apid==null||apid==""){
		
		 map['aid']=aid;
// 		 alert("新增");
	}
	
	activityManageAction.saveOrUpdateProject(map, {

		async : false,
		callback : function(data) {
			if (data.success) {
				$.messager.alert('提示', '保存成功!', '', function(f) {
					easyui_closeTopWindow(data.data);
				});
			} else {
				$.messager.alert('警告', data.msg, 'warning');
			}
		}
	});
}
//取消
function cancel(){
	easyui_closeTopWindow("详情页面",function(result){
		if(result){
			$("#dg").datagrid('load');
		}
	});
	 
		}
 //重置
function resetBtnClick(){
	 
			//fm是form的id名 
			$('#fm').form('clear');
	 
		}
//<!---------------课程增加、修改JS end--------------->			
	</script>
	<script  type="text/javascript">
	function validatePrice(){	
    //校验现价
	var price=$("#price").val();
	var r = /^(([1-9][0-9]*)|(([0]\.\d{1,2}|[1-9][0-9]*\.\d{1,2})))$/;
	if(price!=0||price!=0.00){
	if(!r.test(price)){
        alert("金额任意正整数，正小数（小数位不超过2位）!");
        $("#price").focus();
        return false;
    }
}
	}
	function validateRefprice(){	
    //校验原价
	var refprice=$("#refprice").val();
	var r = /^(([1-9][0-9]*)|(([0]\.\d{1,2}|[1-9][0-9]*\.\d{1,2})))$/;
	if(refprice!=0||refprice!=0.00){
	if(!r.test(refprice)){
        alert("金额任意正整数，正小数（小数位不超过2位）!");
        $("#refprice").focus();
        return false;
    }
}
	}
	</script>
</head>

<body style="font-size: 12px;height:260px">
<!-- 课程修改界面start-->
	<form id="fm" method="post">
		<div style="width: auto">
		<div class="lableLine320" hidden="hidden">
				<div class="lableWidth100">活动项目apid</div>
				<input id="apid" name="apid" class="easyui-validatebox" 
				    data-options="required:false,validType:'length[1,50]'" />
			</div>
		    <div class="lableLine350">
				<div class="lableWidth150">活动项目名称</div>
				<input id="name" name="name" class="easyui-validatebox"  style="height: 19px"
				    data-options="required:true,validType:'length[1,50]'" />
			</div>
			<div class="lableLine350">
				<div class="lableWidth150">活动项目现价</div>
				<input id="price" name="price" class="easyui-validatebox" onblur="validatePrice()"  style="height: 19px"
				     data-options="required:true,validType:'length[1,50]'" />
			</div>
			<div class="lableLine350" style="margin-left:-520px;margin-top:30px;">
				<div class="lableWidth120">活动项目简介</div>     
				<textarea id="content" name="content"  rows="13"  cols="98" 
				       data-options="validType:'length[1,50]'" />
				</textarea>
			</div>
			<div class="lableLine350">
				<div class="lableWidth150">活动项目原价</div>
				<input id="refprice" name="refprice" class="easyui-validatebox" onblur="validateRefprice()" style="height:19px"
				    data-options="required:true,validType:'length[1,50]'" />
			</div>

<!-- 			<div class="lableLine350"> -->
<!-- 				<div class="lableWidth150">课程项目数量</div> -->
<!-- 				<input id="projectNum" name="projectNum" class="easyui-validatebox"   -->
<!-- 				    style="height: 19px" data-options="required:true,validType:'length[1,50]'" /> -->
<!-- 			</div> -->
			
<!-- 			<div class="lableLine350"> -->
<!-- 				<div class="lableWidth150">项目开始时间</div> -->
<!-- 				<input id=startTime name="startTime" class="easyui-datebox"  style="height:19px" -->
<!-- 				    data-options="editable:false,required:true,validType:'length[1,50]'" /> -->
<!-- 			</div> -->
<!-- 			<div class="lableLine350">  -->
<!-- 				<div class="lableWidth150">项目结束时间</div> -->
<!-- 				<input id="endTime" name="endTime" class="easyui-datebox" style="height:19px" -->
<!-- 				   data-options="editable:false,required:true,validType:'length[1,50]'"/> -->
<!-- 			</div>			 -->

<table>
<tr>
<td>
        <div style="margin-left:-400px;margin-top:240px">
						<a href="javascript:void(0)" class="easyui-linkbutton"
							style="width: 80px; height: 30px; margin-right: 25px; margin-top: 17px"
							id="" data-options="iconCls:'icon-undo'"
							onclick="resetBtnClick()">重置</a> <a href="javascript:void(0)"
							style="width: 80px; height: 30px; margin-right: 25px; margin-top: 17px"
							id="btnSave" class="easyui-linkbutton"
							data-options="iconCls:'icon-save'" onclick="saveOrUpdateProject()">保存</a> 
							<a href="javascript:void(0)"
							style="width: 80px; height: 30px; margin-right: 25px; margin-top: 17px" id=""
							class="easyui-linkbutton" data-options="iconCls:'icon-cancel'"
							onclick="cancel()">取消</a>
					</div>
					</td>
					</tr>
					</table>
		</div>
	</form>


</body>
</html>
