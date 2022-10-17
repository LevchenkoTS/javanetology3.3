public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double sum;
        double creditTerm;
        double percent;
        double payment1 = service.calculate(1_000_000, 12, 9.99);
        double payment2 = service.calculate(1_000_000, 24, 9.99);
        double payment3 = service.calculate(1_000_000, 36, 9.99);


        System.out.println("Ежемесячный платеж:" + Math.round(payment1));
        System.out.println("Ежемесячный платеж:" + Math.round(payment2));
        System.out.println("Ежемесячный платеж:" + Math.round(payment3));
    }

}