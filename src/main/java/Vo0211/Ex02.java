package Vo0211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌",
				"송정환", "김재성", "이유덕", "전경헌");
		
		StudentVo studentVo = new StudentVo();
	
		System.out.println(nameList);
		
		
		
//		nameVoList.add(nameVo);
//		System.out.println(nameVoList);
//		[{name : "이유덕"}]
		
		// nameList의 이름중 이씨만 studentVo의 이름에 넣기 
		List<NameVo> nameVoList = new ArrayList<>();
		
		for(int i= 0; i < nameList.size(); i++) {
			//돌기 시작해서 이름 리스트의 길이만큼
			NameVo nameVo = new NameVo();
			//NameVo에 대해 nameVo라고 객체 생성을 하고
			if(nameList.get(i).substring(0,1).equals("이")) {
			//만약 이름 섭스트링으로 첫글자가 이 일 경우	
				nameVo.setName(nameList.get(i));
			//
				nameVoList.add(nameVo);
				
			}
			
			
		}
		studentVo.setList(nameVoList);
		System.out.println(studentVo.getList());
		
	}
	
}
