package com.fh.controller.app.EW;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;
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
    //最近聊天列表接口
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