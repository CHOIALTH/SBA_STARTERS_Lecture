package anno.memberservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("memberdao")
public class MemberDAO {
	@Autowired
	@Qualifier("dto2") // spring 1111
	MemberDTO dto;
	/*<property name = "dto" ref = "dto 정의 bean id"> in member.xml */
	/*
	 * public void setDto(MemberDTO dto) { // dto1, dto2, dto3 + 하위클래스 객체(ioc, 구현..)
	 * // dependency INJECTION // 1> SETTER // 2> CONSTRUCTOR INJECTION this.dto =
	 * dto; }
	 */
	
	public boolean selectMember() {
		// id spring / pw 1111이면 정상 로그인!
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) {
			System.out.println("정상적으로 로그인 되었습니다");
			return true;
		}
		else {
			return false;
		}// if end
	} // selectMember end
	public void insertMember(){
		System.out.println(dto.getId() + " 님 회원가입되셨습니다.");
	}
	
}
