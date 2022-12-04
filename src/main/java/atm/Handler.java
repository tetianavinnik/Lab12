package atm;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    @Getter@Setter
    private Handler next;
    public abstract void process(int price);
}
