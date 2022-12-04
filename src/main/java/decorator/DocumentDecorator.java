package decorator;

import lombok.Getter;
import lombok.Setter;

abstract class DocumentDecorator extends Document {
    @Getter@Setter
    private Document document;

    public DocumentDecorator(Document document) {
        this.document = document;
    }

    public abstract String parse();

}
