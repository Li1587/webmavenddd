package com.mapper;

import com.po.Dep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IDepMapper")
public interface IDepMapper {
	/**查询所有员工*/
   public List<Dep> findAll();
   
}
