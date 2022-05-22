package com.anshinbackend.service;

import com.anshinbackend.entity.Order;
import com.anshinbackend.entity.OrderDetail;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class UserPDFExporter {
//    private List<User> listUsers;
    private  Order order;

    public UserPDFExporter(Order order) {
        this.order = order;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);

        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("Ten san pham", font));

        table.addCell(cell);

        cell.setPhrase(new Phrase("Mau", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Size", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("So luong", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Don gia", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Tong tine", font));
        table.addCell(cell);


    }

    private void writeTableData(PdfPTable table) {
        List<OrderDetail> listOrderDetail = order.getListOrderDetail();
        Integer sum =0;
        for (OrderDetail x : listOrderDetail) {
            table.addCell(x.getDetailProduct().getProduct().getProductName());
            table.addCell(x.getDetailProduct().getColor().getColorName());
            table.addCell(x.getDetailProduct().getSize().getSize_name());
            table.addCell(String.valueOf(x.getQuantity()));
            table.addCell(String.valueOf(x.getPrice()));
            table.addCell(String.valueOf(x.getPrice()* x.getQuantity()));
            sum+= x.getQuantity()*x.getPrice();
        }
        table.addCell("SUM: ");
        table.addCell("");
        table.addCell("");
        table.addCell("");
        table.addCell(sum+" Đ");


    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("Anshin store", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        Font font2 = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(12);
        font.setColor(Color.BLACK);
        Paragraph p2 =  new Paragraph("Time " +currentDateTime, font2);
        p2.add("                                             ");

        p2.add("Ma hoa don: "+ order.getId());
        p2.add("                                        ");
        p2.add("Ten khach hang: " + order.getFullName());
        p2.add("                                                   ");
        p2.add("So dien thoai: " +order.getPhoneNumber());
        p2.add("                                            ");
        p2.add("Dia chi: "+order.getAddress());


        document.add(p);
        document.add(p2);
        PdfPTable table = new PdfPTable(6);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {2.5f, 2.5f, 2.0f, 2.0f, 2.0f, 2.0f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }
}
