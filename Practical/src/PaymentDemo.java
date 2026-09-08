public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new Esewa();

        p1.pay(100);
        p2.pay(200);
        p3.pay(300);
    }
}