class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card payment: $" + amount);
    }
}