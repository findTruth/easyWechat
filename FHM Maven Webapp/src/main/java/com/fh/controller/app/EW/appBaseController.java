package com.fh.controller.app.EW;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.crypto.hash.SimpleHash;
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
@RequestMapping(value="/appbase")
public class appBaseController extends BaseController {
    
	@RequestMapping(value="/pushpassword")
	@ResponseBody
	public Object useroff(){
		logBefore(logger, "生成password");
		Map<String,Object> map = new HashMap<String,Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		int result_code = 0;
		String result_message = "success";
		String passwd;
		try{
			if(Tools.checkKey("username", pd.getString("FKEY"))){	//检验请求key值是否合法
				if(AppUtil.checkParam("pushpassword", pd)){	//检查参数
					passwd = new SimpleHash("SHA-1", pd.get("username"), pd.get("password")).toString();	//密码加密
					map.put("password", passwd);
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
	
 