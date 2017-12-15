/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itexttut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Utilities;
import static com.itextpdf.text.pdf.PdfName.DEST;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;

/**
 *
 * @author ekaranja
 */
public class ItextTut {
    
    public static final String DEST = "results/tables/simple_table.pdf";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {

//            OutputStream file = new FileOutputStream(new File("text1.pdf"));
//
//            Document document = new Document();
//            PdfWriter.getInstance(document, file);
//            document.open();
//            String name = "Karanja";
//            String age = "20";
//            String lname = "Eric Muthike";
//            document.add(new Paragraph("i am sujesh "));
//            document.add(new Paragraph(new Date().toString()));
//            document.add(new Paragraph(name));
//            document.add(new Paragraph(" "));
//            document.add(new Paragraph(lname));
//            document.add(new Paragraph(" "));
//            document.add(new Paragraph(age));
//            document.close();
//            file.close();
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new ItextTut().createPdf(DEST);
        
    }
    
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document();
        Rectangle rec = new Rectangle(Utilities.millimetersToPoints(130), Utilities.millimetersToPoints(100));
        
        document.setPageSize(rec);
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        String name = "Erick Karanja Muthike";
        String amountInWords = "Eight Thousand only";
        
        Paragraph p1 = new Paragraph("No:              " + "Ann Mumbi Karanja LTD          " + "Date:");
        Paragraph p2 = new Paragraph("Received From:   " + name);
        Paragraph p3 = new Paragraph("The sum of shillings: " + amountInWords);
        Paragraph p4 = new Paragraph("Being payment of: " + "Rent for month of December");
        Paragraph p5 = new Paragraph("By Cash/Cheque:  " + "for     " + "WITH THANKS");
        Paragraph p6 = new Paragraph("Shs.      " + "8000/=");
        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(p4);
        document.add(p5);
        document.add(p6);
      
        document.close();
    }
    
}
