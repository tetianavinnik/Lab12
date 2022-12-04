package decorator;

import lombok.Getter;
import lombok.Setter;
import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.LocalTime;

public class TimeDocument extends DocumentDecorator{
    public TimeDocument(Document document) {
        super(document);
    }

    @Override
    public String parse() {
        LocalTime start = LocalTime.now();
        this.getDocument().parse();
        LocalTime finish = LocalTime.now();
        return String.valueOf(SECONDS.between(start, finish));
    }
}
