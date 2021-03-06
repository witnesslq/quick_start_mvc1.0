<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!doctype html>
<html>
<head>
<title>明星学员</title>
<%@ include file="../../inc.jsp"%>
<script type='text/javascript' src='<%=basePath%>/script/easyui/dwrloader.js'></script>
<script type="text/javascript" src='<%=basePath%>/dwr/interface/newsManageAction.js'></script>
<script type="text/javascript" src="../../script/easyui/easyui-validatebox.js"></script>
<style type="text/css">
.box {
	float: left;
}
</style>

<script type="text/javascript">
	var para= easyui_getRequestPara();
	var caid=para.caid;
	
	//查询按钮
	function searchBtnClick() {
		$('#dg').datagrid('load');
	}
	
	//格式化操作列	
	function operationFmt(value, row, index) {
		var html = " ";
		var nid=row.nid;
		 var studentType=row.onhome;
		  if(studentType==1){
			  row.onhome="显示";
			  }   
		  if(studentType==0){
			  row.onhome="不显示";
		  } 
		  var adminStatus=row.status;
		  if (adminStatus==0){
			  row.status="未删除";	  
		  }
		  if(adminStatus==1){
			  row.status="已删除";
		  }
		  
		
		
		var caid=row.caid;
		var idstring=nid.toString();
		var caidstring=caid.toString();
		html += " <a href='javascript:void(0)' onclick='editBtnClick(&quot;"+idstring+"&quot;,&quot;"+caidstring+"&quot;,this)' >修改</a>";
		return html;
	}
	
	
	//传递查询条件
	function onBeforeLoad(param) {
		param["title"] = $.trim($('#title').val());
		param["englishTitle"] = $.trim($('#englishTitle').val());
		param["caid"]= $.trim($('#caid').val());
		param["status"]= $.trim($('#status').val());
		param["onhome"]= $.trim($('#onhome').val());
		//alert(param["caid"]);
	}
	
	//删除记录
	function delBtnClick(flag){
		
		var str="删除";
		var checkedRows=$('#dg').datagrid('getChecked');
		if(checkedRows.length==0){
			$.messager.alert('提示', '请选择要'+str+'的行。');
			return;
		}
		var ids="";
		$.each(checkedRows,function(i){
			ids=ids+checkedRows[i]['nid']+",";
		});
		ids=ids.substring(0,ids.length-1);
		$.messager.confirm('确认', '确定要'+str+'吗?', function(r) {
			if (r) {
				newsManageAction.deletedata(ids, {
					async : false,
					callback : function(data) {
						if (data.success) {
							$.messager.alert('确认', str+'成功!');
							$('#dg').datagrid('reload');
						} else {
							$.messager.alert('警告', str+'失败!');
						}
					}
				});
			}
		});
	}
	
	//修改
	function editBtnClick(nid,caid,obj) {
		
		 
		var url="<%=basePath%>work/newsManage/starSubStudent.jsp?nid="+nid+"&&caid="+caid;
		
		easyui_openTopWindow("明星学员管理",1000,640,url,function(returnValue)
		{
			$('#dg').datagrid('reload');
		}); 
	}
	
	
	//新增
	function addBtnClick(caid,obj) {
		
	//	alert(caid);
		 
		var url="<%=basePath%>work/newsManage/starSubStudent.jsp?caid="+caid;
		
		easyui_openTopWindow("明星学员",1000,640,url,function(returnValue)
		{
			$('#dg').datagrid('reload');
		}); 
	}

	
//查询已删除的数据
	
	function searchData(caid,obj){
		var url="<%=basePath%>work/newsManage/starRecoveryManage.jsp?caid="+caid; 
		easyui_openTopWindow("内容管理",1500,640,url,function(returnValue)
				{
					$('#dg').datagrid('reload');
				}); 
			}
	
	
	
	
	
	
</script>
</head>

<body class="easyui-layout">
	<div data-options="region:'north',split:false" style="height:70px">
		<div id="search"
			class="easyui-panel" title="明星学员"
			data-options="iconCls:'icon-search'">
			<div class="box">
				<span>姓名</span> <input id="title"></input>
				<input id="caid" type="hidden" value="<%=request.getParameter("caid") %>"></input>
			</div>
			<div class="box">
						<span>首页显示</span>
						<select id="onhome" ><option value="">全部</option>
							<option value="1">显示</option>
							<option value="0">不显示</option>
						</select>
					</div>
					<div class="box">
				<span>是否删除</span> <select id="status"><option value="0"
						selected="selected">未删除</option>
					<option value="1">已删除</option>
					<option value=" ">全部</option>
				</select>
			</div>	
			<span class="aBtn">
				<a id="searchBtn" href="javascript:void(0)" class="easyui-linkbutton"
					style="margin-left:100px;" data-options="iconCls:'icon-search'"
					onclick="searchBtnClick()">查询</a>
			</span>
		</div>
	</div>
	<div class="clear"></div>

	<div data-options="region:'center'">
		<table id="dg" class="easyui-datagrid" title="明星学员"
			data-options="
						fitColumns:false,
	                     fit:true,
	                     iconCls: 'icon-edit',
	                     rownumbers:true,
	                     toolbar: '#add',
	                     pagination:true,
	                     singleSelect:true,
	                     selectOnCheck:false,
	                     checkOnSelect:false,
	                     onBeforeLoad:onBeforeLoad,
	                     url:newsManageAction.getStarStudent">
			<thead>
				<tr>
					<th data-options="field:'checked',checkbox:true,width:50,align:'center'">checked</th>
					<th data-options="field:'operations',formatter:operationFmt,width:50,align:'center'">操作</th>		
                    <th data-options="field:'title',width:200,editor:{type:'validatebox',options:{required:true,validType:'length[1,20]'}},align:'center',halign:'center'">姓名</th>
                    <th data-options="field:'briefintro',width:200,editor:{type:'validatebox',options:{required:true,validType:'length[1,20]'}},align:'center',halign:'center'">年龄</th>
                     <th data-options="field:'englishTitle',width:200,editor:{type:'validatebox',options:{required:true,validType:'length[1,20]'}},align:'center',halign:'center'">满意度</th>
                    <th data-options="field:'onhome',width:200,editor:{type:'validatebox',options:{required:true,validType:'length[1,20]'}},align:'center',halign:'center'">首页是否显示</th>
				
				 <th data-options="field:'status',width:200,editor:{type:'validatebox',options:{required:true,validType:'length[1,20]'}},align:'center',halign:'center'">是否删除</th>
				</tr>
			</thead>
		</table>
		<div id="add" style="height: 25px">
			<a id="addBtn" href="javascript:void(0)" class="easyui-linkbutton" style="margin-left: 10px;" 
				data-options="iconCls:'icon-add',plain:true" onclick="addBtnClick('<%=request.getParameter("caid") %>',this)">新增</a> 
			 <a id="delBtn" href="javascript:void(0)" class="easyui-linkbutton" style="margin-left: 10px;"
				data-options="iconCls:'icon-no',plain:true" onclick="delBtnClick(0)">删除</a> 
<!-- 		<a id="delBtn" href="javascript:void(0)" class="easyui-linkbutton" style="margin-left: 10px;" -->
<%-- 				data-options="iconCls:'icon-search',plain:true" onclick="searchData('<%=request.getParameter("caid") %>',this)">查询已删除数据</a>  --%>
		
		
		</div>
	</div>
</body>
</html>
