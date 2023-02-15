package hello0215;

public class GoodsVo {
	
	private String goodsId; //상품아이디
	private String goodsName; //상품명
	private Integer goodsPrice; //상품가격
	private String discountGoodsPrice; //상품할인가
	
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getDiscountGoodsPrice() {
		return discountGoodsPrice;
	}
	public void setDiscountGoodsPrice(String discountGoodsPrice) {
		this.discountGoodsPrice = discountGoodsPrice;
	}
	@Override
	public String toString() {
		return "{goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", discountGoodsPrice=" + discountGoodsPrice + "}\n";
	}
	
	
	

}
