package com.fh.service.EW.eaddfriend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;


@Service("eaddfriendService")
public class EaddfriendService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/*
	* 新增
	*/
	public void save(PageData pd)throws Exception{
		dao.save("EaddfriendMapper.save", pd);
	}
	
	/*
	* 删除
	*/
	public void delete(PageData pd)throws Exception{
		dao.delete("EaddfriendMapper.delete", pd);
	}
	
	/*
	* 修改
	*/
	public void edit(PageData pd)throws Exception{
		dao.update("EaddfriendMapper.edit", pd);
	}
	
	/*
	*列表
	*/
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("EaddfriendMapper.datalistPage", page);
	}
	
	/*
	*列表(全部)
	*/
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EaddfriendMapper.listAll", pd);
	}
	
	/*
	* 通过id获取数据
	*/
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EaddfriendMapper.findById", pd);
	}
	
	/*
	* 批量删除
	*/
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("EaddfriendMapper.deleteAll", ArrayDATA_IDS);
	}
	
	/*
	*申请列表(type)
	*/
	public List<PageData> listById(PageData pd)throws Exception{
		
		return (List<PageData>)dao.findForList("EaddfriendMapper.listById", pd);
	}
	
	/*
	*被申请列表(type)
	*/
	public List<PageData> blistById(PageData pd)throws Exception{
		
		return (List<PageData>)dao.findForList("EaddfriendMapper.blistById", pd);
	}
	
	/*
	*同意申请，修改状态(addstatus)
	*/
	public void editById(PageData pd)throws Exception{
		dao.update("EaddfriendMapper.editById", pd);
	}
	
	/*
	*加好友模糊查询(message)
	*/
	public List<PageData> findBymessage(PageData pd)throws Exception{
		return (List<PageData>)dao.update("EaddfriendMapper.findBymessage", pd);
	}
	
	/*
	*好友信息查询(uid)
	*/
	public List<PageData> findByUid(PageData pd)throws Exception{
		return (List<PageData>)dao.update("EaddfriendMapper.findByUid", pd);
	}
	
	/*
	*删除好友(uid)
	*/
	public void deleteByuid(PageData pd)throws Exception{
		dao.update("ElinkbookMapper.deleteByuid", pd);
	}
}

