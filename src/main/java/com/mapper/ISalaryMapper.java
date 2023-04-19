package com.mapper;

import com.po.Salary;
import org.springframework.stereotype.Service;

@Service("ISalaryMapper")
public interface ISalaryMapper {
	/**����н��*/
   public int save(Salary sa);
   /**�޸�н��*/
   public int updateByEid(Salary sa);
   /**ɾ��н��*/
   public int  delByEid(Integer eid);
   /**����н��*/
   public Salary findByEid(Integer eid);
   
   
   
}
