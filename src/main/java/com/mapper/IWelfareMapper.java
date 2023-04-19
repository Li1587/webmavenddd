package com.mapper;

import com.po.Welfare;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IWelfareMapper")
public interface IWelfareMapper {
	/**²éÑ¯¸£Àû*/
   public List<Welfare> findAll();
   
   
}
