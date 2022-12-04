package atm;

public class Handler20 extends Handler {
    @Override
    public void process(int price) {
        System.out.println(price/20 + "* 20");
        Handler next = getNext();
        if (next == null && price%20>0){
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price%20);
        }
    }
}
