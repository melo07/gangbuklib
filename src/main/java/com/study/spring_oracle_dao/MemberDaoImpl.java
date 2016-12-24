package com.study.spring_oracle_dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private SqlSession sqlSession;
	
//	private static final String mapper = "mappers.memberMapper."; 아 쓸데없는거 써놔가지고 ㅠ.ㅠ 
	
	@Override
	public int userIdCheck(String userid) throws Exception {
		
		System.out.println("userIdCheck start..");
//		int a = sqlSession.selectOne(mapper+"useridcheck",userid);
		int a = sqlSession.selectOne("useridcheck",userid);
		System.out.println("userIdCheck end..");
		return  a;
	}
	
}
