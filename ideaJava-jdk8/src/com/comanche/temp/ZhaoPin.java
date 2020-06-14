package com.comanche.temp;

import com.google.common.collect.Lists;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 * 把招聘文档中各个技术栈对应的技术点梳理出来
 * 最后的输出结果期待是：例如
 * 后端：aaaa bbbb cccc
 */
public class ZhaoPin {

    private static final String douduan = "后端";
    private static final String java = "JAVA";
    private static final String linux = "linux";
    private static final String shujuku = "数据库";
    private static final String chijiuceng = "持久层技术";
    private static final String huancun = "缓存";
    private static final String web = "web服务器";
    private static final String zhongjianjian = "中间件";
    private static final String other = "其他";
    private static final String qianduan = "前端";
    private static final List<String> keys =
            Lists.newArrayList(douduan,java,linux,shujuku,chijiuceng,huancun,web,zhongjianjian,other,qianduan);

    private static String fileName = "C:\\Users\\asus\\Desktop\\招聘.xls";

    private static Map<String,String> resultMap = new LinkedHashMap<>();
    static {
        for (String key : keys) {
            resultMap.put(key,":");
        }
    }

    //int firstRowNum = sheet.getFirstRowNum();//从0开始
    //int physicalNumberOfCells = row.getPhysicalNumberOfCells();获取每行实际有多少个单元格
    public static void main(String[] args) throws Exception {
        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        for (int i = 1; i <= 2; i++) {
            HSSFSheet sheet = workbook.getSheetAt(i);
            int totalRows = sheet.getPhysicalNumberOfRows();
            for (int j = 0; j < totalRows; j++) {
                HSSFRow row = sheet.getRow(j);
                if(row.getPhysicalNumberOfCells() <= 1){
                    continue;//说明本行什么技术点都没有
                }
                HSSFCell cell = row.getCell(1);
                String key = cell.getStringCellValue();//本行的技术栈
                String value = resultMap.get(key);
                StringBuilder builder = new StringBuilder(value);
                for (int i1 = 2; i1 < 8; i1++) {
                    HSSFCell rowCell = row.getCell(i1);
                    if(rowCell == null){
                        continue;
                    }
                    String stringCellValue = rowCell.getStringCellValue();
                    if (stringCellValue == null || "".equalsIgnoreCase(stringCellValue)){
                        break;//如果第二列之后有一个是空格子，则跳出循环
                    }
                    String s = stringCellValue.toLowerCase();
                    if(builder.indexOf(s) == -1){
                        builder.append(s+"\t");
                    }
                }
                resultMap.put(key,builder.toString());
            }
        }
        Iterator<Map.Entry<String, String>> iterator = resultMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }

    }


}
