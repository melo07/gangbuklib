package com.study.spring_oracle_controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.spring_oracle_service.MemberService;

@Controller
public class MemberController {
	
	/*@Autowired
	private MemberService memberservice;*/
	
	@Resource(name="memberService")
	private MemberService memberservice;
	
	@RequestMapping(value="usercheck", method=RequestMethod.POST)
	public ModelAndView userCheck(@RequestParam("member_id")String member_id) throws Exception{
		int cnt = 0;
		
		System.out.println("MemberController ����");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("�Էµ� id" + member_id);
		cnt = memberservice.userIdCheck(member_id);
		
		System.out.println("return�� cnt �� : "+cnt);
		if(cnt>0){
			modelAndView.setViewName("/loginok"); //������ ������������ �̵�
			return modelAndView;
		}
		else{
			modelAndView.setViewName("/loginerror");
			return modelAndView;
		}
		
		
	}
}
