package hello0215;

import java.math.BigDecimal;

public class EventVo {
	
	private String eventId; // 이벤트 아이디
	private BigDecimal rate; // 할인율
	private Integer fixDiscount; // 고정할인
	private String rateStrDay; // 할인 시작일
	private String rateEndDay; // 할인 종료일
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public Integer getFixDiscount() {
		return fixDiscount;
	}
	public void setFixDiscount(Integer fixDiscount) {
		this.fixDiscount = fixDiscount;
	}
	public String getRateStrDay() {
		return rateStrDay;
	}
	public void setRateStrDay(String rateStrDay) {
		this.rateStrDay = rateStrDay;
	}
	public String getRateEndDay() {
		return rateEndDay;
	}
	public void setRateEndDay(String rateEndDay) {
		this.rateEndDay = rateEndDay;
	}
	@Override
	public String toString() {
		return "{eventId=" + eventId + ", rate=" + rate + ", fixDiscount=" + fixDiscount + ", rateStrDay="
				+ rateStrDay + ", rateEndDay=" + rateEndDay + "}\n";
	}

}
