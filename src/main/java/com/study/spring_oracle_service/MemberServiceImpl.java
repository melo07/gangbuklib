package com.study.spring_oracle_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring_oracle_dao.MemberDao;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int userIdCheck(String userId) throws Exception {
//		System.out.println("dao ¡¯¿‘");
		System.out.println("userId : "+userId);
		return memberDao.userIdCheck(userId);
	}

}
