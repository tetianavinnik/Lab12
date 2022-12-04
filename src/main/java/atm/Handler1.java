package atm;

public class Handler1 extends Handler {
    @Override
    public void process(int price) {
        System.out.println(price/1 + "* 1");
        Handler next = getNext();
        if (next == null && price%1>0){
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            next.process(price%1);
        }
    }
}
