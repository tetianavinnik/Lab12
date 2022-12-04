package atm;

public class Handler50 extends Handler {
    @Override
    public void process(int price) {
        System.out.println(price/50 + "* 50");
        Handler next = getNext();
        if (next == null && price%50>0){
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price%50);
        }
    }
}
