package com.mapper;

import com.po.Dep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IDepMapper")
public interface IDepMapper {
	/**��ѯ����Ա��*/
   public List<Dep> findAll();
   
}
