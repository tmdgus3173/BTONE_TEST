package Vo0211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연",
				"박영서", "박민호", "전경헌", "송정환", "김재성", "이유덕", "전경헌");


		StudentVo studentVo = new StudentVo();
		
		
//		List<NameVo> choinNameVoList = new ArrayList<NameVo>();
//		List<NameVo> leeNameVoList = new ArrayList<NameVo>();
		
		List<NameVo> nameVo = new ArrayList<NameVo>();

		//nameVo를 객체로 
		
		
		// nameList의 이름중 이씨만 studentVo의 이름에 넣기 
		
		for(int i= 0; i < nameList.size(); i++) {
			NameVo mameVo = new NameVo();
			//이름의 양만큼 반복시키고
			String name = nameList.get(i);
			//그 수만큼 DB에서 이름을 꺼냄.
			name.substring(0,1);
			//이름 앞글자만 따오고
			if(name.equals("이")) {
			//만약 그 이름 앞글자가 "이" 일경우
//			nameVo.setName(name);
			
			//studentVo 리스트에 넣어야한다.
			
			
			//자 for문의 
			
			
			
			
			}
			
		}
		System.out.println(studentVo.getList());
		//여기 이가 들어가있어야한다.
	}
}

//NameVo nameVo = new NameVo()
		//		nameVo.setName("김영진 차장님");
//		nameVo.setSum(100);



/**
 * 
 * @author 승현
 * 
 */

//FIXME 내일 작업해야함.
//TODO 오늘 작업해야함.