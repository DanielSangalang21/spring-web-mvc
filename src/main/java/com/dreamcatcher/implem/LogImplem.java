package com.dreamcatcher.implem;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class LogImplem extends SqlSessionDaoSupport{

	public Object getLogs() {
		return getSqlSession().selectList("getLogs");
	}
}
