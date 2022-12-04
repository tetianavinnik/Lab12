package atm;

public class Handler5 extends Handler {
    @Override
    public void process(int price) {
        System.out.println(price/5 + "* 5");
        Handler next = getNext();
        if (next == null && price%5>0){
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price%5);
        }
    }
}
