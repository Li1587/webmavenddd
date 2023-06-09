package com.util;

import com.service.IDepService;
import com.service.IEmpService;
import com.service.IWelfareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("BizService")
public class ServiceUtil {
	@Resource(name="DepServiceImpl")
	private IDepService depService;
	@Resource(name="EmpServiceImpl")
	private IEmpService empService;
	@Resource(name="WelfareServiceImpl")
	private IWelfareService empwWelfareService;
	public IDepService getDepService() {
		return depService;
	}
	public void setDepService(IDepService depService) {
		this.depService = depService;
	}
	public IEmpService getEmpService() {
		return empService;
	}
	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}
	public IWelfareService getEmpwWelfareService() {
		return empwWelfareService;
	}
	public void setEmpwWelfareService(IWelfareService empwWelfareService) {
		this.empwWelfareService = empwWelfareService;
	}
	
	
}
