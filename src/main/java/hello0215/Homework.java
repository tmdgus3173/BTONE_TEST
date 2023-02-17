package hello0215;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Homework {

	public static void main(String[] args) {

		// 1) 상품명으로 상품 아이디 가져오기
		// FIXME 상품 검색 기능이 되도록 메서드 불리 해주세요 >>> searchGoods("상품명") -- 사용자가 상품별로 검색이
		// 가능(단건)
		// ** 상품명은 전부 적어야합니다. (java_book)
		// ** 상품명은 포함하고 있을 시 (java) 적으면 검색안됨 >> 본인이 시간 남으면 검색 되도록 수정 요망

		// 하단을 참조하여 상품명으로 상품 아이디를 검색해오세요.

//		ex) String goodsId = homework.getGoodsIdByName("상품명");
//		List<GoodsVo> goodsList = homework.setBaseGoodsVo(); -- 활용할것

		// -----------1,2번 문제가 연결 되어도 좋으나 연결 안되어도 됩니다.-------------------

		// 2) event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
		
		// 상품 아이디값을 추가 하면 상품이 조회된다.
		/*----- // ex -------*/
//		goodsIds.add("A1");
//		goodsIds.add("C1");
//		goodsIds.add("B2");
		/*-----  ex //-------*/

		
		// System.out.println("goodsVo :: " +goodsList);
		// System.out.println("eventInfo :: " +eventInfoList);

		// A1,2,3 상품의 eventID A
		// B1,2,3 상품의 eventID B

//		event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
//		이벤트 적용 날짜도 적용! 오늘날짜가 기준으로 적용시켜야합니다.

//		적용시켜서 HomeworkVo에 List<GoodsVo> 에 담아주세요

		// System.out.println("homeworkVo :: " +homeworkVo);
		Homework homework = new Homework();
		

		List<String> goodsIds = new ArrayList<>();
		
		
		
		
		List<GoodsVo> goodsList = homework.getGoodsList(goodsIds);

		 System.out.println("goodsVo굿즈리스트" + goodsList);

//		List<EventVo> eventInfoList = homework.getEventInfo();

		System.out.println(homework);

		System.out.println("책 이름을 검색하면 아이디가 나오는 것.");
		System.out.println(homework.getGoodsIdByName("java_book"));
		System.out.println(homework.getGoodsIdByName("BtOne"));

		List<EventVo> eventVoList = homework.getEventInfo();

		System.out.println("이벤트" + eventVoList);
		System.out.println(homework.fixDisCountGoods(goodsIds));
		
		
		
		

	}

	public String getGoodsIdByName(String goodsName) {
		String getGoodsName = "";
		String getGoodsId = "";
		// 먼저 아이디와 이름의 변수를 만들어주고

		List<String> goodsIds = new ArrayList<String>();
		List<GoodsVo> goodsList = getGoodsList(goodsIds);
		// 리스트 가져와주고

		for (GoodsVo goodsVo : goodsList) {
			// 향상된 for문으로 리스트를 반복시켜 쭉 가지고온다.
			// System.out.println("굿즈VO" + goodsVo);
			getGoodsName = goodsVo.getGoodsName();

			if (getGoodsName.contains(goodsName)) {
				// 만약 굿즈네임이라는게 있다면
				if (getGoodsName.equals(goodsName))
					;
				// 그리고 그 굿즈네임중 내가 입력한것과 같은 이름이 있다면

				getGoodsId = goodsVo.getGoodsId();
				// 겟 굿즈 아이디에 그 해당하는 네임의 아이디값을 가져온다.
			}
		}
		return getGoodsId;
		// 아이디값을 리턴한다.
	}

	// ---------------------------로직 공부용----------------------------//
	/**
	 * 상품 ID로 상품 목록 조회
	 * 
	 * @param goodsIds
	 * @return
	 */
	public List<GoodsVo> getGoodsList(List<String> goodsIds) {

		
		Homework homework = new Homework();
//		String disCountPrice = fixDisCountGoods(goodsIds);
		// 상품정보
		List<GoodsVo> goodsList = homework.setBaseGoodsVo();

		// 상품 아이디값으로 검색기능
		if (goodsIds != null && goodsIds.size() > 0) {
			List<GoodsVo> selGoodsList = new ArrayList<>();
			for (String item : goodsIds) {
				for (GoodsVo goodsVo : goodsList) {
					if (item.equalsIgnoreCase(goodsVo.getGoodsId())) {
						GoodsVo selGoodsVo = new GoodsVo();
						selGoodsVo.setGoodsId(goodsVo.getGoodsId());
						selGoodsVo.setGoodsName(goodsVo.getGoodsName());
						selGoodsVo.setGoodsPrice(goodsVo.getGoodsPrice());
//						selGoodsVo.setDiscountGoodsPrice(disCountPrice);
						

						selGoodsList.add(selGoodsVo);
					}
				}
			}
			return selGoodsList;
		}

		return goodsList;
	}

	/**
	 * 이벤트 목록조회
	 * 
	 * @return
	 */
	public List<EventVo> getEventInfo() {

		Homework homework = new Homework();

		List<EventVo> eventVoList = new ArrayList<>();

		homework.setBaseEventVo(eventVoList);

		return eventVoList;

	}

	public String fixDisCountGoods(List <String>  goodsIds) {
		
		List<GoodsVo> goodsList = this.getGoodsList (goodsIds);
		//굿즈를 가지고 와서~
		List<EventVo> eventInfoList = this.getEventInfo();
		

		//굿즈vo에서 가격을 가지고와서요
		//System.out.println("goodsPrice : " + goodsPrice);
		
		int discountPrice = 0;
				
		for(EventVo eventVo : eventInfoList) {
			// eventVo.getFixDiscount(); 
			//할인가격들을 다 담고
			for(GoodsVo goodsVo : goodsList) {
			//가격들을 다 가지고와서
			//goodsPrice = goodsVo.getGoodsPrice();
				if(goodsVo.getGoodsId().substring(0,1).equals(eventVo.getEventId())) {				
					if(goodsVo.getGoodsId().equals("A")) {
						discountPrice = goodsVo.getGoodsPrice() - eventVo.getFixDiscount();
						
					}
					else if(goodsVo.getGoodsId().equals("B")){
						discountPrice = goodsVo.getGoodsPrice() * (eventVo.getRate().intValue()/100);
						
						
					} else {
						break;
					}
			}
		}		
	}
		return String.valueOf(discountPrice) ;
		
	}

	// 기본 상품 정보 셋팅
	public List<GoodsVo> setBaseGoodsVo() {
		List<GoodsVo> goodsList = new ArrayList<>();
		GoodsVo goods1 = new GoodsVo();
		goods1.setGoodsId("A1");
		goods1.setGoodsName("java_book");
		goods1.setGoodsPrice(5000);
		goodsList.add(goods1);

		GoodsVo goods2 = new GoodsVo();
		goods2.setGoodsId("A2");
		goods2.setGoodsName("jsp_book");
		goods2.setGoodsPrice(3200);
		goodsList.add(goods2);

		GoodsVo goods3 = new GoodsVo();
		goods3.setGoodsId("A3");
		goods3.setGoodsName("mysql_book");
		goods3.setGoodsPrice(10000);
		goodsList.add(goods3);

		GoodsVo goods4 = new GoodsVo();
		goods4.setGoodsId("B1");
		goods4.setGoodsName("book  Name");
		goods4.setGoodsPrice(30000);
		goodsList.add(goods4);

		GoodsVo goods5 = new GoodsVo();
		goods5.setGoodsId("b2");
		goods5.setGoodsName("newBook        ");
		goods5.setGoodsPrice(2000);
		goodsList.add(goods5);

		GoodsVo goods6 = new GoodsVo();
		goods6.setGoodsId("B3");
		goods6.setGoodsName(" springMaster");
		goods6.setGoodsPrice(24000);
		goodsList.add(goods6);

		GoodsVo goods7 = new GoodsVo();
		goods7.setGoodsId("C1");
		goods7.setGoodsName("BtOne");
		goods7.setGoodsPrice(4000);
		goodsList.add(goods7);

		GoodsVo goods8 = new GoodsVo();
		goods8.setGoodsId("C3");
		goods8.setGoodsName("eclipseBook");
		goods8.setGoodsPrice(1000);
		goodsList.add(goods8);

		return goodsList;
	}

	// 이벤트 기본정보 셋팅
	public void setBaseEventVo(List<EventVo> eventVoList) {
		EventVo eventAVo = new EventVo();
		eventAVo.setEventId("A");
		eventAVo.setFixDiscount(500);
		eventAVo.setRateStrDay("20230214");
		eventAVo.setRateEndDay("20230217");
		eventVoList.add(eventAVo);

		EventVo eventBVo = new EventVo();
		eventBVo.setEventId("B");
		eventBVo.setRate(BigDecimal.TEN); // 상수 10
		eventBVo.setRateStrDay("20230215");
		eventBVo.setRateEndDay("20230215");
		eventVoList.add(eventBVo);
	}

}
