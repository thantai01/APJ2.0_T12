package Task1;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "brand,name,type,price,cc,color,time";

    static void overwriteCSVFile(String path, List<Product> products) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        fileWriter.append(FILE_HEADER);
        fileWriter.append(NEW_LINE_SEPARATOR);
        for (Product product : products) {
            fileWriter.append(String.valueOf(product.getBrand()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(product.getName());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append("").append(String.valueOf(product.typeProduct(product.getType())));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append("").append(String.valueOf(product.getPrice()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append("").append(String.valueOf(product.getSpecialize().getCc()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(product.getSpecialize().getColor());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append("").append(product.getLocalDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(NEW_LINE_SEPARATOR);
        }
        System.out.println("CSV file was created successfully");
        fileWriter.flush();
        fileWriter.close();
    }
    static void overwriteCSV2(String path,List<Product> products) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bfw = new BufferedWriter(fw);
        for (Product product:products) {
            fw.write(product.getBrand() +","
                    + product.getName() +","
                    + product.getType()+","
                    + product.getPrice()+","
                    + product.getSpecialize().getCc() +","
                    + product.getSpecialize().getColor() + ","
                    +product.getLocalDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
                    +NEW_LINE_SEPARATOR);
        }
        System.out.println("Data has written to CSV file");
        fw.flush();
        bfw.close();
        fw.close();
    }
    static Product readFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String content = br.readLine();
        String[] line = content.split(",");
        List<Product> newList = new ArrayList<>();
        for(int i =0;i < line.length;i++) {
            newList.add(new Product(line[0],
                    line[1],
                    (Integer.parseInt(line[2])),
                    (Float.parseFloat(line[3])),
                    (Specialize)new Specialize((Integer.parseInt(line[4])),line[5])));
        }
        return (Product) newList;
    }
}
