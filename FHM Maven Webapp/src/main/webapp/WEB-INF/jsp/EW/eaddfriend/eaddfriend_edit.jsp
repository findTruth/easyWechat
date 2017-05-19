<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<title></title>
		<meta name="description" content="overview & stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="static/css/bootstrap.min.css" rel="stylesheet" />
		<link href="static/css/bootstrap-responsive.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="static/css/font-awesome.min.css" />
		<!-- 下拉框 -->
		<link rel="stylesheet" href="static/css/chosen.css" />
		
		<link rel="stylesheet" href="static/css/ace.min.css" />
		<link rel="stylesheet" href="static/css/ace-responsive.min.css" />
		<link rel="stylesheet" href="static/css/ace-skins.min.css" />
		
		<link rel="stylesheet" href="static/css/datepicker.css" /><!-- 日期框 -->
		<script type="text/javascript" src="static/js/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="static/js/jquery.tips.js"></script>
		
<script type="text/javascript">
	
	
	//保存
	function save(){
			if($("#UID").val()==""){
			$("#UID").tips({
				side:3,
	            msg:'请输入发送者',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#UID").focus();
			return false;
		}
		if($("#AFUID").val()==""){
			$("#AFUID").tips({
				side:3,
	            msg:'请输入被加人',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#AFUID").focus();
			return false;
		}
		if($("#MESSAGE").val()==""){
			$("#MESSAGE").tips({
				side:3,
	            msg:'请输入加好友通知信息',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#MESSAGE").focus();
			return false;
		}
		if($("#TIME").val()==""){
			$("#TIME").tips({
				side:3,
	            msg:'请输入通知发送时间',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#TIME").focus();
			return false;
		}
		if($("#ADDSTATUS").val()==""){
			$("#ADDSTATUS").tips({
				side:3,
	            msg:'请输入加好友状态 0 未回复 1 同意 2 不同意',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#ADDSTATUS").focus();
			return false;
		}
		$("#Form").submit();
		$("#zhongxin").hide();
		$("#zhongxin2").show();
	}
	
</script>
	</head>
<body>
	<form action="eaddfriend/${msg }.do" name="Form" id="Form" method="post">
		<input type="hidden" name="EADDFRIEND_ID" id="EADDFRIEND_ID" value="${pd.EADDFRIEND_ID}"/>
		<div id="zhongxin">
		<table id="table_report" class="table table-striped table-bordered table-hover">
			<tr>
				<td style="width:70px;text-align: right;padding-top: 13px;">发送者:</td>
				<td><input type="text" name="UID" id="UID" value="${pd.UID}" maxlength="32" placeholder="这里输入发送者" title="发送者"/></td>
			</tr>
			<tr>
				<td style="width:70px;text-align: right;padding-top: 13px;">被加人:</td>
				<td><input type="text" name="AFUID" id="AFUID" value="${pd.AFUID}" maxlength="32" placeholder="这里输入被加人" title="被加人"/></td>
			</tr>
			<tr>
				<td style="width:70px;text-align: right;padding-top: 13px;">加好友通知信息:</td>
				<td><input type="text" name="MESSAGE" id="MESSAGE" value="${pd.MESSAGE}" maxlength="32" placeholder="这里输入加好友通知信息" title="加好友通知信息"/></td>
			</tr>
			<tr>
				<td style="width:70px;text-align: right;padding-top: 13px;">通知发送时间:</td>
				<td><input class="span10 date-picker" name="TIME" id="TIME" value="${pd.TIME}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="通知发送时间" title="通知发送时间"/></td>
			</tr>
			<tr>
				<td style="width:70px;text-align: right;padding-top: 13px;">加好友状态 0 未回复 1 同意 2 不同意:</td>
				<td><input type="number" name="ADDSTATUS" id="ADDSTATUS" value="${pd.ADDSTATUS}" maxlength="32" placeholder="这里输入加好友状态 0 未回复 1 同意 2 不同意" title="加好友状态 0 未回复 1 同意 2 不同意"/></td>
			</tr>
			<tr>
				<td style="text-align: center;" colspan="10">
					<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
					<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
				</td>
			</tr>
		</table>
		</div>
		
		<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green">提交中...</h4></div>
		
	</form>
	
	
		<!-- 引入 -->
		<script type="text/javascript">window.jQuery || document.write("<script src='static/js/jquery-1.9.1.min.js'>\x3C/script>");</script>
		<script src="static/js/bootstrap.min.js"></script>
		<script src="static/js/ace-elements.min.js"></script>
		<script src="static/js/ace.min.js"></script>
		<script type="text/javascript" src="static/js/chosen.jquery.min.js"></script><!-- 下拉框 -->
		<script type="text/javascript" src="static/js/bootstrap-datepicker.min.js"></script><!-- 日期框 -->
		<script type="text/javascript">
		$(top.hangge());
		$(function() {
			
			//单选框
			$(".chzn-select").chosen(); 
			$(".chzn-select-deselect").chosen({allow_single_deselect:true}); 
			
			//日期框
			$('.date-picker').datepicker();
			
		});
		
		</script>
</body>
</html>