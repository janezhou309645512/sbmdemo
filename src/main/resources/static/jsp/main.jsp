<%@ page language="java" import="java.util.*"  contentType="text/html" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 引入JQuery -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.min.js"></script>
  <!-- 引入EasyUI -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/jquery.easyui.min.js"></script>
  <!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
  <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/locale/easyui-lang-zh_CN.js"></script>
  <!-- 引入EasyUI的样式文件-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/themes/default/easyui.css" type="text/css"/>
  <!-- 引入EasyUI的图标样式文件-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.5.2/themes/icon.css" type="text/css"/>
 
 <script  type="text/javascript">  
 function addTab(title, url){
	if ($('#tt').tabs('exists', title)){
		$('#tt').tabs('select', title);
	} else {
		var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
		$('#tt').tabs('add',{
			title:title,
			content:content,
			closable:true
		});
	}
}
 
 
 
    </script>
  </head>

  <body>
  <div class="easyui-layout" style="width:100%;height:100%;">
	<div region="west" split="true" title="菜单" style="width:300px;">
	
	<!-- 菜单内容 -->
		<div class="easyui-accordion" style="width:300px;">
	<div title="基础资料"  style="overflow:auto;padding:10px;">
		<ul>
	 <li>人员信息</li>
     <li>部门信息</li>
     <li>书架信息</li>
    
    </ul>
	</div>
	<div title="功能"  selected="true" style="padding:10px;">
     <ul>
     <li><a href="javascript:void(0)" onclick="addTab('事件提交','jsp/event.jsp')">事件提交</a></li>
    <li><a href="javascript:void(0)" onclick="addTab('文件下载','jsp/download.jsp')">文件下载</a></li>
    <li><a href="javascript:void(0)" onclick="addTab('上传文件','jsp/upload.jsp')">上传文件</a></li>
    <li><a href="javascript:void(0)" onclick="addTab('报表','jsp/chart.jsp')">报表</a></li>
	<li><a href="javascript:void(0)" onclick="addTab('apk上传','jsp/uploadApk.jsp')">apk上传</a></li>
			
	
    </ul>
	</div>
	<div title="设置">
	<ul>
   <li>系统设置</li>
   <li><a href="javascript:void(0)" onclick="addTab('权限设置','jsp/base.jsp')">权限设置</a></li>
  <li><a href="javascript:void(0)" onclick="addTab('文件预览','http://192.168.66.26/')">文件预览</a></li>
  </ul>
	</div>
  </div>
	</div>
	<div id="content" region="center" title="主页" style= ""> 
	<div id="tt" class="easyui-tabs" style="width:100%;">
	 <div title="Home">
	 </div>
	
	</div>
   </div>
  
  
 
	
  </body>
</html>
