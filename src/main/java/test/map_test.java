package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		// 자료 추가 => put(key값, value값);

		map.put("name", "홍길동");
		map.put("addr", "대전");
		map.put("tel", "010-1234-5678");

		System.out.println("map => " + map);

		// 자료 수정 => 데이터를 저장할 때 key값이 같으면 나중에 입력한 값이 저장된다.
		// => put(수정할 key값, 새로운 value값)
		map.put("addr", "서울");
		System.out.println("map => " + map);

		// 자료 삭제 => remove(삭제할 key값)
		map.remove("name");
		System.out.println("map => " + map);

		// 자료 읽기 => get(key값);
		System.out.println("addr => " + map.get("addr"));
		System.out.println("==============================================");

		// key값들을 읽어와 자료를 출력하는 방법

		// 방법 1 => keySet()메서드를 이용하기
		// keySet()메서드 => Map의 key 값들만 읽어와 Set형으로 반환한다.
		Set<String> keySet = map.keySet();

		System.out.println("Iterator를  이용한 방법");
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("==============================================");

		// 방법 2 => Set형의 데이터를 '향상된 for문'을 이용하여 처리한다.
		System.out.println("향상된 for문을 이용하는 방법");
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("==============================================");

		// 방법 3 => value값만 읽어와 출력하기 => values()메서드 이용하기
		System.out.println("values()메서드 이용하는 방법");
		for (String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("==============================================");

		// 방법 4 => Map에는 Entry라는 내부 클래스가 만들어져 있다.
		// 이 Entry 클래스에는 key와 value라는 멤버변수로 구성되어 있다.
		// Map에서 이 Entry클래스들을 Set형식으로 저장하여 관리한다.

		// Entry 객체 전체를 가져오기(가져온 Entry들은 Set형식으로 되어있다.)
		// => entrySet()메서드를 이용하여 가져온다.
		Set<Map.Entry<String, String>> mapSet = map.entrySet();

		// 가져온 Entry 객체들을 순서대로 처리하기 위해서 Iterator 객체를 가져온다.
		Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
		while (entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();

			System.out.println("key 값 : " + entry.getKey());
			System.out.println("value 값 : " + entry.getValue());
		}
	}
}