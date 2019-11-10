package chainOfResponsibilityPattern;

/**
 * 
 * @ClassName: PurchaseRequest
 * @Description: �ɹ�����, �䵱������ 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:11:34
 */
public class PurchaseRequest {
	private double amount;//�ɹ����
	private int number;//�ɹ�����
	private String purpose;//�ɹ�Ŀ��
	
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
