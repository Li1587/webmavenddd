package com.mapper;

import com.po.Welfare;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IWelfareMapper")
public interface IWelfareMapper {
	/**��ѯ����*/
   public List<Welfare> findAll();
   
   
}
