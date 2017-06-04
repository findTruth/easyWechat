package com.fh.service.EW.etakemessage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;


@Service("etakemessageService")
public class EtakemessageService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/*
	* 新增
	*/
	public void save(PageData pd)throws Exception{
		dao.save("EtakemessageMapper.save", pd);
	}
	
	/*
	* 删除
	*/
	public void delete(PageData pd)throws Exception{
		dao.delete("EtakemessageMapper.delete", pd);
	}
	
	/*
	* 修改
	*/
	public void edit(PageData pd)throws Exception{
		dao.update("EtakemessageMapper.edit", pd);
	}
	
	/*
	*列表
	*/
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("EtakemessageMapper.datalistPage", page);
	}
	
	/*
	*列表(全部)
	*/
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EtakemessageMapper.listAll", pd);
	}
	
	/*
	* 通过id获取数据
	*/
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("EtakemessageMapper.findById", pd);
	}
	
	/*
	* 批量删除
	*/
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("EtakemessageMapper.deleteAll", ArrayDATA_IDS);
	}
	
	/*
	* 最近聊天列表接口
	*/
	public List<PageData> listclosetake(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EtakemessageMapper.closetake", pd);
	}
	/*
	* 聊天记录接口
	*/
	public List<PageData> listtakelist(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("EtakemessageMapper.takelist", pd);
	}
	/*
	* 删除最近聊天记录
	*/
	public void deletedelclosetake(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("EtakemessageMapper.deletedelclosetake", ArrayDATA_IDS);
	}
}

