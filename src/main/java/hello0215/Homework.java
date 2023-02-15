package hello0215;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Homework {
	
	public static void main(String[] args) {
		
		//1) 상품명으로 상품 아이디 가져오기
		//FIXME 상품 검색 기능이 되도록 메서드 불리 해주세요 >>> searchGoods("상품명") -- 사용자가 상품별로 검색이 가능(단건)
		//** 상품명은 전부 적어야합니다. (java_book)
		//** 상품명은 포함하고 있을 시  (java) 적으면 검색안됨 >> 본인이 시간 남으면 검색 되도록 수정 요망
		
		//하단을 참조하여 상품명으로 상품 아이디를 검색해오세요.
		
//		ex) String goodsId = homework.getGoodsIdByName("상품명");
//		List<GoodsVo> goodsList = homework.setBaseGoodsVo(); -- 활용할것
		
		GoodsVo goodsVo = new GoodsVo();
		HomeworkVo homeworkVo = new HomeworkVo();
		//먼저 생성자를 호출해주고
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//-----------1,2번 문제가 연결 되어도 좋으나 연결 안되어도 됩니다.-------------------
		
		
		
		//2) event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
		Homework homework = new Homework();
		
		List<String> goodsIds = new ArrayList<>();
		// 상품 아이디값을 추가 하면 상품이 조회된다.
		/*----- // ex -------*/
//		goodsIds.add("A1");
//		goodsIds.add("C1");
//		goodsIds.add("B2");
		/*-----  ex //-------*/
		
		List<GoodsVo> goodsList = homework.getGoodsList (goodsIds);
		
		List<EventVo> eventInfoList = homework.getEventInfo();
//		System.out.println("goodsVo :: " +goodsList);
//		System.out.println("eventInfo :: " +eventInfoList);
		
		//A1,2,3 상품의 eventID A
		//B1,2,3 상품의 eventID B

//		event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
//		이벤트 적용 날짜도 적용! 오늘날짜가 기준으로 적용시켜야합니다.
		
//		적용시켜서 HomeworkVo에 List<GoodsVo> 에 담아주세요
		
//		System.out.println("homeworkVo :: " +homeworkVo);
	}
	
		
	
	
		
	
	
	//---------------------------로직 공부용----------------------------//
	/**
	 * 상품 ID로 상품 목록 조회
	 * @param goodsIds
	 * @return
	 */
	public List<GoodsVo> getGoodsList (List<String> goodsIds){
		
		Homework homework = new Homework();
		//상품정보
		List<GoodsVo> goodsList = homework.setBaseGoodsVo();
		//GoodsVo 타입의 데이터를 담은 List
		
		//System.out.println(goodsList);
		//굿즈리스트 내에 있는 정보들이 다 나옵니다.
		
		
		
		//상품 아이디값으로 검색기능
		if(goodsIds != null && goodsIds.size() > 0) {
			List<GoodsVo> selGoodsList = new ArrayList<>();
			for(String item : goodsIds) {
				for(GoodsVo goodsVo : goodsList) {
					if(item.equalsIgnoreCase(goodsVo.getGoodsId())) {
						GoodsVo selGoodsVo = new GoodsVo();
						selGoodsVo.setGoodsId(goodsVo.getGoodsId());
						selGoodsVo.setGoodsName(goodsVo.getGoodsName());
						selGoodsVo.setGoodsPrice(goodsVo.getGoodsPrice());
						
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
	 * @return
	 */
	public List<EventVo> getEventInfo() {

		Homework homework = new Homework();
		
		List<EventVo> eventVoList = new ArrayList<>();
		
		
		homework.setBaseEventVo(eventVoList);
		
		return eventVoList;
		
	}
	
	//기본 상품 정보 셋팅
	public List<GoodsVo> setBaseGoodsVo () {
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
	
	//이벤트 기본정보 셋팅
	public void setBaseEventVo (List<EventVo> eventVoList) {
		EventVo eventAVo = new EventVo();
		eventAVo.setEventId("A");
		eventAVo.setFixDiscount(500);
		eventAVo.setRateStrDay("20230214");
		eventAVo.setRateEndDay("20230217");
		eventVoList.add(eventAVo);
		
		EventVo eventBVo = new EventVo();
		eventBVo.setEventId("B");
		eventBVo.setRate(BigDecimal.TEN);
		eventBVo.setRateStrDay("20230215");
		eventBVo.setRateEndDay("20230215");
		eventVoList.add(eventBVo);
	}

}
