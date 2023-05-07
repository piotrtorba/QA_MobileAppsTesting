package Document;

import javax.print.Doc;

public class DocumentRun {
    public static void main(String[] args) {

        Document excelDocument = new ExcelDocument();
        excelDocument.getDescription();

        Document pdfDocument = new pdfDocument();
        pdfDocument.getDescription();
    }
}
