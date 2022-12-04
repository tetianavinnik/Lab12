package atm;

public class ATM {
    public static void main(String[] args) {
        Handler handler50 = new Handler50();
        Handler handler5 = new Handler5();
        Handler handler20 = new Handler20();
        Handler handler1 = new Handler1();

        handler50.setNext(handler20);
        handler20.setNext(handler5);
        handler5.setNext(handler1);

        handler50.process(126);

    }
}
