package com.util;

import com.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("DaoService")
public class MapperUtil {
	@Resource(name="IDepMapper")
	private IDepMapper depMapper;
	@Resource(name="IEmpMapper")
	private IEmpMapper empMapper;
	@Resource(name="IEmpWelfareMapper")
	private IEmpWelfareMapper empwWelfareMapper;
	@Resource(name="ISalaryMapper")
	private ISalaryMapper salaryMapper;
	@Resource(name="IWelfareMapper")
	private IWelfareMapper welfareMapper;
	public IDepMapper getDepMapper() {
		return depMapper;
	}
	public void setDepMapper(IDepMapper depMapper) {
		this.depMapper = depMapper;
	}
	public IEmpMapper getEmpMapper() {
		return empMapper;
	}
	public void setEmpMapper(IEmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	public IEmpWelfareMapper getEmpwWelfareMapper() {
		return empwWelfareMapper;
	}
	public void setEmpwWelfareMapper(IEmpWelfareMapper empwWelfareMapper) {
		this.empwWelfareMapper = empwWelfareMapper;
	}
	public ISalaryMapper getSalaryMapper() {
		return salaryMapper;
	}
	public void setSalaryMapper(ISalaryMapper salaryMapper) {
		this.salaryMapper = salaryMapper;
	}
	public IWelfareMapper getWelfareMapper() {
		return welfareMapper;
	}
	public void setWelfareMapper(IWelfareMapper welfareMapper) {
		this.welfareMapper = welfareMapper;
	}
	
	
}
