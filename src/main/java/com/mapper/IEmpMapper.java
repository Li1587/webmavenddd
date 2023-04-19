package com.mapper;

import com.po.Emp;
import com.po.PageBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IEmpMapper")
public interface IEmpMapper {
   public int save(Emp emp);
   public int update(Emp emp);
   public int  delById(Integer eid);
   public Emp findById(Integer eid);
   public List<Emp> findPageAll(PageBean pb);
   public int findMaxRows();
   /**��ѯ�¼����Ա�����*/
   public int findMaxEid();
   
   
}
