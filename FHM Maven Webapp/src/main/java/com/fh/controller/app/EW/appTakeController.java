package com.fh.controller.app.EW;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;
import com.fh.service.EW.etakemessage.EtakemessageService;
import com.fh.service.system.appuser.AppuserService;
import com.fh.util.AppUtil;
import com.fh.util.PageData;
import com.fh.util.Tools;


/**
  * 会员-接口类 
  *    
  * 相关参数协议：
  * 00	请求失败
  * 01	请求成功
  * 02	返回空值
  * 03	请求协议参数不完整    
  * 04  用户名或密码错误
  * 05  FKEY验证失败
 */
@Controller
@RequestMapping(value="/apptake")
public class appTakeController extends BaseController {
	@Resource(name="etakemessageService")
	private EtakemessageService etakemessageService;
	
	@RequestMapping(value="/closetake")
	@ResponseBody
	public Object closetake(){
		logBefore(logger, "最近聊天列表");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		int result_code = 0;
		String result_message = "success";	
		try{
			if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
				if(AppUtil.checkParam("closetake", pd)){	//检查参数
					map.put("data",etakemessageService.listclosetake(pd));
				}else {
					result_code = -1;
					result_message = "参数错误";
				}
			}else{
				result_code = -3;
				result_message = "key值不合法";
			}
		}catch (Exception e){
			logger.error(e.toString(), e);
		}finally{
			map.put("result_code", result_code);
			map.put("result_message", result_message);
			logAfter(logger);
		}
		
		return AppUtil.returnObject(new PageData(), map);
	}
	
	
	 //聊天记录
	@RequestMapping(value="/takelist")
	@ResponseBody
	public Object takelist(){
			logBefore(logger, "聊天记录");
			Map<String,Object> map = new HashMap<String,Object>();
			PageData pd = new PageData();
			pd = this.getPageData();
			int result_code = 0;
			String result_message = "success";
			try{
				if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
					if(AppUtil.checkParam("takelist", pd)){	//检查参数
						//TODO 留下最近聊天列表接口
						map.put("data",etakemessageService.listtakelist(pd));
					}else {
						result_code = -1;
						result_message = "参数错误";
					}
				}else{
					result_code = -3;
					result_message = "key值不合法";
				}
			}catch (Exception e){
				logger.error(e.toString(), e);
			}finally{
				map.put("result_code", result_code);
				map.put("result_message", result_message);
				logAfter(logger);
			}
			
			return AppUtil.returnObject(new PageData(), map);
		}
	
	 //删除最近聊天记录
	@RequestMapping(value="/delclosetake")
	@ResponseBody
	public Object delclosetake(){
			logBefore(logger, "聊天记录");
			Map<String,Object> map = new HashMap<String,Object>();
			PageData pd = new PageData();
			pd = this.getPageData();
			int result_code = 0;
			String result_message = "success";		
			try{
				if(Tools.checkKey("nid", pd.getString("FKEY"))){	//检验请求key值是否合法
					if(AppUtil.checkParam("delclosetake", pd)){	//检查参数
						//TODO 留下最近聊天列表接口
					}else {
						result_code = -1;
						result_message = "参数错误";
					}
				}else{
					result_code = -3;
					result_message = "key值不合法";
				}
			}catch (Exception e){
				logger.error(e.toString(), e);
			}finally{
				map.put("result_code", result_code);
				map.put("result_message", result_message);
				logAfter(logger);
			}
			
			return AppUtil.returnObject(new PageData(), map);
		}
	//查看聊天推送
		@RequestMapping(value="/seetakepush")
		@ResponseBody
		public Object seetakepush(){
						logBefore(logger, "查看聊天推送");
						Map<String,Object> map = new HashMap<String,Object>();
						PageData pd = new PageData();
						pd = this.getPageData();
						int result_code = 0;
						String result_message = "success";
						
						try{
							if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
								if(AppUtil.checkParam("seetakepush", pd)){	//检查参数
									//TODO 留下查看聊天推送接口
								}else {
									result_code = -1;
									result_message = "参数错误";
								}
							}else{
								result_code = -3;
								result_message = "key值不合法";
							}
						}catch (Exception e){
							logger.error(e.toString(), e);
						}finally{
							map.put("result_code", result_code);
							map.put("result_message", result_message);
							logAfter(logger);
						}
						
						return AppUtil.returnObject(new PageData(), map);
					}
		//发送消息接口
		@RequestMapping(value="/sendmessage")
		@ResponseBody
		public Object sendmessage(){
						logBefore(logger, "发送消息");
						Map<String,Object> map = new HashMap<String,Object>();
						PageData pd = new PageData();
						pd = this.getPageData();
						int result_code = 0;
						String result_message = "success";
						
						try{
							if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
								if(AppUtil.checkParam("sendmessage", pd)){	//检查参数
									//TODO 留下发送消息接口
								}else {
									result_code = -1;
									result_message = "参数错误";
								}
							}else{
								result_code = -3;
								result_message = "key值不合法";
							}
						}catch (Exception e){
							logger.error(e.toString(), e);
						}finally{
							map.put("result_code", result_code);
							map.put("result_message", result_message);
							logAfter(logger);
						}
						
						return AppUtil.returnObject(new PageData(), map);
					}
		//修改最近聊天推送状态
		@RequestMapping(value="/changetakestatus")
		@ResponseBody
		public Object changetakestatus(){
			logBefore(logger, "修改最近聊天推送状态");
			Map<String,Object> map = new HashMap<String,Object>();
			PageData pd = new PageData();
			pd = this.getPageData();
			int result_code = 0;
			String result_message = "success";
			
			try{
				if(Tools.checkKey("nid", pd.getString("FKEY"))){	//检验请求key值是否合法
					if(AppUtil.checkParam("changetakestatus", pd)){	//检查参数
						//TODO 修改最近聊天推送状态接口
					}else {
						result_code = -1;
						result_message = "参数错误";
					}
				}else{
					result_code = -3;
					result_message = "key值不合法";
				}
			}catch (Exception e){
				logger.error(e.toString(), e);
			}finally{
				map.put("result_code", result_code);
				map.put("result_message", result_message);
				logAfter(logger);
			}
			
			return AppUtil.returnObject(new PageData(), map);
		}
}