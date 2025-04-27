public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPdf();
        pdf.open();
        System.out.println(pdf);

        Document text = registry.createText();
        text.open();
        System.out.println(text);

        Document spreadsheet = registry.createSpreadsheet();
        spreadsheet.open();
        System.out.println(spreadsheet);

        PdfDocument pdf2 = (PdfDocument) registry.createPdf();
        pdf2.setFileName("summary_report.pdf");
        pdf2.open();
    }
}
