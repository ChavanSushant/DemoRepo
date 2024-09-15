package Com.Ecommerce.Utilitities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class XLUtils {

    public static FileInputStream fi;
    public static XSSFWorkbook wb;
    public static XSSFSheet XS;
    public static XSSFRow row;
    public static XSSFCell Cell;

    public static int getRowCount(String Xfile, String Xsheet) throws IOException {

        fi = new FileInputStream(Xfile);
        wb = new XSSFWorkbook(fi);
        XS = wb.getSheet(Xsheet);
        int rowcount = XS.getLastRowNum();
        wb.close();
        fi.close();

        return rowcount;
    }

    public static int getCellCount(String Xfile, String Xsheet, int rownum) throws IOException {

        fi = new FileInputStream(Xfile);
        wb = new XSSFWorkbook(fi);
        XS = wb.getSheet(Xsheet);
        row = XS.getRow(rownum);
        int CellCount = row.getLastCellNum();

        wb.close();
        fi.close();
        return CellCount;

    }

    public static String getCellData(String Xfile, String Xsheet, int rownum, int colnum) throws IOException {

        fi = new FileInputStream(Xfile);
        wb = new XSSFWorkbook(fi);
        XS = wb.getSheet(Xsheet);
        row = XS.getRow(rownum);
        Cell = row.getCell(colnum);

        String data;

        try {
            DataFormatter formatter = new DataFormatter();
            String Celldata = formatter.formatCellValue(Cell);

            return Celldata;
        } catch (Exception e) {

            data = "";
        }
        wb.close();
        fi.close();
        return data;

    }

}
