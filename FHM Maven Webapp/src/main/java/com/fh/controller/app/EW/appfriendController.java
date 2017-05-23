package com.fh.controller.app.EW;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleIfStatement.Else;
import com.fh.controller.base.BaseController;
import com.fh.service.EW.eaddfriend.EaddfriendService;
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
@RequestMapping(value="/appfriend")
public class appfriendController extends BaseController {
	@Resource(name="eaddfriendService")
	private EaddfriendService eaddfriendService;
	
	@RequestMapping(value="/friendlist")
	@ResponseBody
	public Object linklist(){
		logBefore(logger, "好友申请列表");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		int result_code = 0;
		String result_message = "success";
		try{
			if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
				if(AppUtil.checkParam("friendlist", pd)){	//检查参数
						if (pd.get("type").equals("1")) {
							map.put("data", eaddfriendService.listById(pd));
						}else if (pd.get("type").equals("0")) {
							map.put("data", eaddfriendService.blistById(pd));
						}else {
							result_code = -4101;
							result_message = "type值错误";
						}	
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
	
	@RequestMapping(value="/agree")
	@ResponseBody
	public Object agree(){
		logBefore(logger, "同意好友请求");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		int result_code = 0;
		String result_message = "success";
		try{
			if(Tools.checkKey("uid", pd.getString("FKEY"))){	//检验请求key值是否合法
				if(AppUtil.checkParam("agree", pd)){	//检查参数
						if (pd.get("agree").equals("0")) {
							//修改状态
							eaddfriendService.editById(pd);
							//添加好友到通讯录
							
							
						}
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
	
 