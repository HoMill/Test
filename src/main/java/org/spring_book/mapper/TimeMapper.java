package org.spring_book.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate From dual")
	public String getTime();
}
