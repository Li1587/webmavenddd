package com.mapper;

import com.po.EmpWelfare;
import com.po.Welfare;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IEmpWelfareMapper")
public interface IEmpWelfareMapper {
	/**����Ա������*/
   public int save(EmpWelfare ewf);
   /**����Ա�����ɾ������**/
   public int  delByEid(Integer eid);
   /**����Ա����Ų�ѯԱ����������**/
   public List<Welfare> findByEid(Integer eid);
   
   
   
}
