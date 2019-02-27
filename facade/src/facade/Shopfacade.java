package facade;

public class Shopfacade {
	// facade sẽ tổng hợp lại các lớp cần khỏi tạo cần dùng tới, theo tuần tự của bài toán.
	private static Shopfacade intance = new Shopfacade();
	private AccountService accountService;
	private EmailService emailService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private SmsService smsService;
	public static Shopfacade getIntance() {
		return intance;
	}
	public Shopfacade() {
		accountService = new AccountService();
		emailService = new EmailService();
		paymentService = new PaymentService();
		shippingService = new ShippingService();
		smsService = new SmsService();
	}
	public void buyProduct(String name) {
		accountService.getAccount(name);
		emailService.sendEmail();
		smsService.sendSms();
		shippingService.ship();
		paymentService.pay();
	}
}
