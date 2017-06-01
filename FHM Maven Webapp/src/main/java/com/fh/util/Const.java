package com.fh.util;

import org.springframework.context.ApplicationContext;
/**
 * 项目名称：
 * @author:fh
 * 
*/
public class Const {
	public static final String SESSION_SECURITY_CODE = "sessionSecCode";
	public static final String SESSION_USER = "sessionUser";
	public static final String SESSION_ROLE_RIGHTS = "sessionRoleRights";
	public static final String SESSION_menuList = "menuList";			//当前菜单
	public static final String SESSION_allmenuList = "allmenuList";		//全部菜单
	public static final String SESSION_QX = "QX";
	public static final String SESSION_userpds = "userpds";			
	public static final String SESSION_USERROL = "USERROL";				//用户对象
	public static final String SESSION_USERNAME = "USERNAME";			//用户名
	public static final String TRUE = "T";
	public static final String FALSE = "F";
	public static final String LOGIN = "/login_toLogin.do";				//登录地址
	public static final String SYSNAME = "admin/config/SYSNAME.txt";	//系统名称路径
	public static final String PAGE	= "admin/config/PAGE.txt";			//分页条数配置路径
	public static final String EMAIL = "admin/config/EMAIL.txt";		//邮箱服务器配置路径
	public static final String SMS1 = "admin/config/SMS1.txt";			//短信账户配置路径1
	public static final String SMS2 = "admin/config/SMS2.txt";			//短信账户配置路径2
	public static final String FWATERM = "admin/config/FWATERM.txt";	//文字水印配置路径
	public static final String IWATERM = "admin/config/IWATERM.txt";	//图片水印配置路径
	public static final String WEIXIN	= "admin/config/WEIXIN.txt";	//微信配置路径
	public static final String FILEPATHIMG = "uploadFiles/uploadImgs/";	//图片上传路径
	public static final String FILEPATHFILE = "uploadFiles/file/";		//文件上传路径
	public static final String FILEPATHTWODIMENSIONCODE = "uploadFiles/twoDimensionCode/"; //二维码存放路径
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(code)|(app)|(weixin)|(static)|(main)|(websocket)).*";	//不对匹配该值的访问路径拦截（正则）
	
	
	public static ApplicationContext WEB_APP_CONTEXT = null; //该值会在web容器启动时由WebAppContextListener初始化
	
	/**
	 * APP Constants
	 */
	//app注册接口_请求协议参数)
	public static final String[] APP_REGISTERED_PARAM_ARRAY = new String[]{"countries","uname","passwd","title","full_name","company_name","countries_code","area_code","telephone","mobile"};
	public static final String[] APP_REGISTERED_VALUE_ARRAY = new String[]{"国籍","邮箱帐号","密码","称谓","名称","公司名称","国家编号","区号","电话","手机号"};
	
	//app根据用户名获取会员信息接口_请求协议中的参数
	public static final String[] APP_GETAPPUSER_PARAM_ARRAY = new String[]{"USERNAME"};
	public static final String[] APP_GETAPPUSER_VALUE_ARRAY = new String[]{"用户名"};
	
	//app注销接口
	public static final String[] APP_USEROFF_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_USEROFF_VALUE_ARRAY = new String[]{"用户id"};
	
	//app密码生成接口
	public static final String[] APP_PUSHPASSWORD_PARAM_ARRAY = new String[]{"username","password"};
	public static final String[] APP_PUSHPASSWORD_VALUE_ARRAY = new String[]{"账号","密码"};
	
	//app注册接口
	public static final String[] APP_REGISTER_PARAM_ARRAY = new String[]{"username","password","nickname","sex","phone","email","sign"};
	public static final String[] APP_REGISTER_VALUE_ARRAY = new String[]{"账号","密码","昵称","性别","电话","邮箱","个性签名"};
    
	//app最近聊天列表接口
	public static final String[] APP_CLOSETAKE_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_CLOSETAKE_VALUE_ARRAY = new String[]{"用户id"};

	//app聊天记录接口
	public static final String[] APP_TAKELIST_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_TAKELIST_VALUE_ARRAY = new String[]{"用户id"};
	
	//app删除最近聊天记录接口
	public static final String[] APP_DELCLOSETAKE_PARAM_ARRAY = new String[]{"nid"};
	public static final String[] APP_DELCLOSETAKE_VALUE_ARRAY = new String[]{"nid"};
	
	//app查看聊天推送接口
	public static final String[] APP_SEETAKEPUSH_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_SEETAKEPUSH_VALUE_ARRAY = new String[]{"用户id"};
	
	//发送消息
	public static final String[] APP_SENDMESSAGE_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_SENDMESSAGE_VALUE_ARRAY = new String[]{"uid"};
	
	//修改最近聊天推送状态
	public static final String[] APP_CHANGETAKESTATUS_PARAM_ARRAY = new String[]{"nid"};
	public static final String[] APP_CHANGETAKESTATUS_VALUE_ARRAY = new String[]{"nid"};
	
	//app通讯录列表
	public static final String[] APP_linklist_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_linklist_VALUE_ARRAY = new String[]{"用户id"};
	
	//app好友申请列表
	public static final String[] APP_friendlist_PARAM_ARRAY = new String[]{"type","uid"};
	public static final String[] APP_friendlist_VALUE_ARRAY = new String[]{"0 被申请 1 我申请","用户id"};
	
	//app同意好友请求
	public static final String[] APP_agree_PARAM_ARRAY = new String[]{"uid","touid","agree"};
	public static final String[] APP_agree_VALUE_ARRAY = new String[]{"用户id","申请人id","0 同意 1 不同意"};

	//app加好友模糊查询
	public static final String[] APP_friendselect_PARAM_ARRAY = new String[]{"uid","message"};
	public static final String[] APP_friendselect_VALUE_ARRAY = new String[]{"用户id","查询内容"};

	//app好友信息查询
	public static final String[] APP_friendinfo_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_friendinfo_VALUE_ARRAY = new String[]{"好友id"};

	//app删除好友
	public static final String[] APP_delfriend_PARAM_ARRAY = new String[]{"uid"};
	public static final String[] APP_delfriend_VALUE_ARRAY = new String[]{"好友id"};

}
