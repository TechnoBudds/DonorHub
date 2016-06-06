package org.poc.Donor.DonorHub.Util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SQLUtil {

	
	public static SqlMapClient sqlMapper;
	public SqlMapClient getSqlInstance()
	{
	try {
	Reader reader= Resources.getResourceAsReader("SqlConfigMap.xml");
	sqlMapper= SqlMapClientBuilder.buildSqlMapClient(reader);
	reader.close();
	} catch (IOException e) {
	throw new RuntimeException("Errorbuilding the SqlMapClientinstance." + e, e);
	
	
	}
	
	return sqlMapper;
	}
	
}
