public class CreditPaymentService {
    public double calculate(double sum, double creditTerm, double percent){
        double percentM = percent / (100 * 12);
        return sum * ((percentM * Math.pow(1 + percentM, creditTerm)) / (((Math.pow(1 + percentM, creditTerm)))-1));

    }
}
