package decorator;

public class Main {
    public static void main(String[] args) {
        SmartDocument document = new SmartDocument("gs://oop-course/Geico-2021.png");
        TimeDocument timeDocument = new TimeDocument(document);
        System.out.println(timeDocument.parse());
    }
}
