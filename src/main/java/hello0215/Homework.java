package hello0215;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Homework {

    public static void main(String[] args) {

        // 1) 상품명으로 상품 아이디 가져오기
        // FIXME 상품 검색 기능이 되도록 메서드 불리 해주세요 >>> searchGoods("상품명") -- 사용자가 상품별로 검색이
        // 가능(단건)
        // ** 상품명은 전부 적어야합니다. (java_book)
        // ** 상품명은 포함하고 있을 시 (java) 적으면 검색안됨 >> 본인이 시간 남으면 검색 되도록 수정 요망

        // 하단을 참조하여 상품명으로 상품 아이디를 검색해오세요.

//      ex) String goodsId = homework.getGoodsIdByName("상품명");
//      List<GoodsVo> goodsList = homework.setBaseGoodsVo(); -- 활용할것

        // -----------1,2번 문제가 연결 되어도 좋으나 연결 안되어도 됩니다.-------------------

        // 2) event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
        Homework homework = new Homework();

        List<String> goodsIds = new ArrayList<>();


        // 상품 아이디값을 추가 하면 상품이 조회된다.
        /*----- // ex -------*/
        //System.out.println("----전체 물품 리스트----");

        //1. id 로 상품들 조회
       // List<GoodsVo> goodsList = homework.getGoodsList(goodsIds);
        //System.out.println("goodsList = " + goodsList);
        System.out.println("-----------------1번-------------");
        System.out.println(homework.getGoodsIdByName("java_book"));
        System.out.println(homework.getGoodsIdByName("BtOne"));
        System.out.println(homework.getGoodsIdByName("springMaster"));

        
        
        
        System.out.println("------------------ 할인율 구한 메소드 확인----------------------");
        List<GoodsVo> list = homework.fixDisCountGoods();
        
        
        
        //System.out.println("test " + list.get(1));
        
        
        System.out.println("2번 상품 리스트 = " + list);
        
        System.out.println("-------------double을 string으로------------");
        String result = String.format("%.0f", list.get(1));
        
        System.out.println(result);
        
     
        
       
        
        


//        List<EventVo2> eventInfoList = homework.getEventInfo();
        // System.out.println("goodsVo :: " +goodsList);
        // System.out.println("eventInfo :: " +eventInfoList);

        // A1,2,3 상품의 eventID A
        // B1,2,3 상품의 eventID B

//      event 정보에 fixDiscount 가 존재하면 고정 할인으로, rate 할인이면 할인율로적용
//      이벤트 적용 날짜도 적용! 오늘날짜가 기준으로 적용시켜야합니다.

//      적용시켜서 HomeworkVo에 List<GoodsVo> 에 담아주세요

        // System.out.println("homeworkVo :: " +homeworkVo);

//        System.out.println("책 이름을 검색하면 아이디가 나오는 것.");
//        System.out.println(homework.getGoodsIdByName("java_book"));
//        System.out.println(homework.getGoodsIdByName("BtOne"));
//
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
    
    public String searchGoodsVersion1 (String goodsName){
		Homework homework = new Homework();
		
		List<String> goodsIds = new ArrayList<>();
		List<GoodsVo> goodsList = homework.getGoodsList(goodsIds);
		
		//1번
		GoodsVo searchGoodsVo = Optional.ofNullable(goodsList).orElseGet(ArrayList::new).stream()
//		.filter(item -> item.getGoodsName().equals(goodsName))
		.filter(item -> item.getGoodsName().contains(goodsName))
		.findFirst()
		.get();
		
		//2번
		String goodsId = "";
		for(GoodsVo goodsVo : goodsList) {
			if(goodsName.equalsIgnoreCase(goodsVo.getGoodsName())) {
				goodsId = goodsVo.getGoodsId();
				break;
			}
		}
		
		return searchGoodsVo.getGoodsId();
	}
    
    
//    List<GoodsVo> temp3 = Optional.ofNullable(goodsVoList).orElseGet(ArrayList::new).stream()
//    		.filter(goods->
//    			eventInfoList.stream().anyMatch(
//    					(event) -> {
//    						System.out.println("event.getEventId()  "+ event.getEventId());
//    							System.out.println("12312312312");
//    							if(event.getFixDiscount() != null && !event.getFixDiscount().equals("")) {
//    								goods.setDiscountGoodsPrice(String.valueOf(goods.getGoodsPrice() - event.getFixDiscount()));
//    							} else if(event.getRate() != null && !event.getRate().equals("")) {
//    								goods.setDiscountGoodsPrice(String.valueOf(goods.getGoodsPrice() - (goods.getGoodsPrice() * (event.getRate().intValue() % 100))));
//    							}
//    						System.out.println("goods"+goods);
//    						return goods.getGoodsId().contains(event.getEventId());
//    					}
//    					
//    					)
//    			
//    			)
//    		.collect(Collectors.toList());
    
    

    // ---------------------------로직 공부용----------------------------//
    /**
     * 상품 ID로 상품 목록 조회
     *
     * @param goodsIds
     * @return
     */
    public List<GoodsVo> getGoodsList(List<String> goodsIds) {

        Homework homework = new Homework();

        // 상품정보
        List<GoodsVo> goodsList = homework.setBaseGoodsVo();

        // 상품 아이디값으로 검색기능
        if (goodsIds != null && goodsIds.size() > 0) {
            List<GoodsVo> selGoodsList = new ArrayList<>();
            // 이렇게 만들면 2중 for문 안넣으셔도 됩니다
            for (GoodsVo goodsVo : goodsList) {
                if (goodsIds.contains(goodsVo.getGoodsId().toUpperCase()) ) {
                    GoodsVo selGoodsVo = new GoodsVo();
                    selGoodsVo.setGoodsId(goodsVo.getGoodsId());
                    selGoodsVo.setGoodsName(goodsVo.getGoodsName());
                    selGoodsVo.setGoodsPrice(goodsVo.getGoodsPrice());
                    selGoodsList.add(selGoodsVo);
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

    /**
     * 할인율 구하는 메소드 -> 여러개의 상품 id를 받아서 리턴을 어떤 값을 하려는건가요?
     * 리턴은 최종 할인된 금액만 받으면 될거 같아요.//? 어떤 상품의 할인된 금액인가요?
     * 파라미터로 들어온건 상품"들" 이고, 리턴은 상품하나의 할인된 금액이에요? 받은 소스긴한데 그런거 같습니다.
     * 완전 뜯어고쳐야겠습니다.
     *
     * @param goodsIds
     * @return
     */
//
//    public String fixDisCountGoods(GoodsVo2  goodsVo) {
//        List<EventVo2> eventInfoList = this.getEventInfo();
//        System.out.println("eventInfoList = " + eventInfoList);
//        int discountPrice = 0;
//
//        for(EventVo2 eventVo : eventInfoList) {
//            if (eventVo.getEventId().equalsIgnoreCase(goodsVo.getGoodsId().substring(0, 1))) {
//                if (eventVo.getRate() == null) {
//                    discountPrice = (goodsVo.getGoodsPrice() - eventVo.getFixDiscount());
//                    System.out.println("------- A정책 --------");
//                    System.out.println("discountPrice = " + discountPrice);
//
//                } else if (eventVo.getFixDiscount() == null) {
//                    discountPrice = goodsVo.getGoodsPrice() - (goodsVo.getGoodsPrice() * (eventVo.getRate().intValue()/100));
//                    System.out.println("-------B 정책 -------");
//                    System.out.println("discountPrice = " + discountPrice);
//
//                }
//            }
//        }
//        return String.valueOf(discountPrice);
//    }

    public List<GoodsVo> fixDisCountGoods() {

        List<GoodsVo> goodsList = this.setBaseGoodsVo();
        List<EventVo> eventInfoList = this.getEventInfo();
        //setBase, getEvent 를 goodsList eventInfo 리스트들에 넣어준다.

        double discountPrice;
        //할인된 값을 지정해주고
        
        
        for (EventVo eventVo : eventInfoList) {
        	//eventVo에 인포리스트를 넣고
//            List<GoodsVo> goodsVo2s = new ArrayList<>();
            for (GoodsVo goodsVo : goodsList) {
            	//굿즈 리스트도 넣고
//                GoodsVo goodsVo2 = new GoodsVo();
            	
            	
            	String startDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            	String endDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            	LocalDate now = LocalDate.now();
            	
            	
            	
            	//요래
            //if((now.isEqual(startDate)==true || now.isAfter(startDate)==true) && now.isBefore(endDate.plusDays(1))==true) {
                if (eventVo.getEventId().equalsIgnoreCase(goodsVo.getGoodsId().substring(0, 1))) {
                	//분기로 먼저 굿즈 아이디의 첫글자랑 이벤트아이디가 같은걸 찾는다.
                    if (eventVo.getFixDiscount() != null) {
                    	//그리고 만약 그머시기가 널이 아닐 경우 -> A
                        discountPrice = (goodsVo.getGoodsPrice() - eventVo.getFixDiscount());
                        //할인된 가격 = 물건 가격 - 고정할인가
                        goodsVo.setDiscountGoodsPrice(String.valueOf(discountPrice));
                        //그리고 그 값을 넣어준다.
//                        goodsVo2.setGoodsId(goodsVo.getGoodsId());
//                        goodsVo2.setGoodsName(goodsVo.getGoodsName());
//                        goodsVo2.setGoodsPrice(goodsVo.getGoodsPrice());
//                        goodsVo2.setDiscountGoodsPrice(goodsVo.getDiscountGoodsPrice());
//                        goodsVo2s.add(goodsVo);
                        System.out.println("---------A.할인된 가격-----------");
                        System.out.println("가격 : " + goodsVo.getDiscountGoodsPrice());
                        
                    } else if (eventVo.getRate() != null) {
                    	//그 이외에 B일경우 
                        discountPrice = goodsVo.getGoodsPrice() - (goodsVo.getGoodsPrice() * (eventVo.getRate().doubleValue() / 100.0));
                        //가격 - (가격 * (10/100)) 로 계산하고                  
                        goodsVo.setDiscountGoodsPrice(String.valueOf(discountPrice));
                        //다시 그 값을 넣어준다.
                        System.out.println("---------B.할인된 가격-----------");
                        System.out.println("가격 : " + goodsVo.getDiscountGoodsPrice());
                        
//                          goodsVo2.setGoodsId(goodsVo.getGoodsId());
//                        goodsVo2.setGoodsName(goodsVo.getGoodsName());
//                        goodsVo2.setGoodsPrice(goodsVo.getGoodsPrice());
//                        goodsVo2.setDiscountGoodsPrice(goodsVo.getDiscountGoodsPrice());
//                        goodsVo2s.add(goodsVo2);
                    }
                    }
                }
            }
            
        
        return goodsList;
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
    	

    	//오늘 날짜구하기
    	
        EventVo eventAVo = new EventVo();
        eventAVo.setEventId("A");
        eventAVo.setFixDiscount(500);
        eventAVo.setRateStrDay("20230214");
        eventAVo.setRateEndDay("20230217");
        eventVoList.add(eventAVo);
        
        System.out.println("날짜가 바뀌었나요 : " + eventAVo);

        EventVo eventBVo = new EventVo();
        eventBVo.setEventId("B");
        eventBVo.setRate(BigDecimal.TEN); // 상수 10
        eventBVo.setRateStrDay("20230215");
        eventBVo.setRateEndDay("20230215");
        eventVoList.add(eventBVo);
        
        System.out.println("한번더 : " + eventBVo);
        
    }


}