package lab24.task3;

public class Tester {
    public static void main(String[] args) {
        ICreateDocument document = new CreateImageDocument();

        IDocument newDocument = document.createNew();
        newDocument.save();

        IDocument openDocument = document.createOpen();
        openDocument.exit();
    }
}
