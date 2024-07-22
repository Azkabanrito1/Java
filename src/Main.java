public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) console.readNumber("Period (Years): ", 1, 30);

        MortageReport.printMortgage(principal, annualInterest, years);
        MortageReport.printPaymentSchedule(principal, annualInterest, years);
    }

}
