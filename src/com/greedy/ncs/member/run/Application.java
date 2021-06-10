package com.greedy.ncs.member.run;


import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {

		MemberDTO memberDTO = new MemberDTO(01, "thejoenNCSTest", "thejoenNCS", "choijungmin","2020/06/10", 175.5, 72.3, true);
		
		System.out.println(memberDTO.toString());

	}

}
