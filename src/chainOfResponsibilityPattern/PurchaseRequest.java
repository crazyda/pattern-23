package chainOfResponsibilityPattern;

/**
 * 
 * @ClassName: PurchaseRequest
 * @Description: 采购单类, 充当请求类 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午9:11:34
 */
public class PurchaseRequest {
	private double amount;//采购金额
	private int number;//采购数量
	private String purpose;//采购目的
	
	public PurchaseRequest(double amount, int number, String purpose) {
		super();
		this.amount = amount;
		this.number = number;
		this.purpose = purpose;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
}
