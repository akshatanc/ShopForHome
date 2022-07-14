package eshop.homedecor.shopapi.vo.helper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import eshop.homedecor.shopapi.entity.ProductInfo;
public class CSVHelper {
  public static String TYPE = "text/csv";
  static String[] HEADERs = { "Id", "Title", "Description", "Published" };
  public static boolean hasCSVFormat(MultipartFile file) {
    if (!TYPE.equals(file.getContentType())) {
      return false;
    }
    return true;
  }
  public static List<ProductInfo> csvToTutorials(InputStream is) {
    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        CSVParser csvParser = new CSVParser(fileReader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
      List<ProductInfo> productList = new ArrayList<ProductInfo>();
      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
      for (CSVRecord csvRecord : csvRecords) {
    	  ProductInfo product = new ProductInfo();
    	  	product.setProductId(csvRecord.get("ProductId"));
    	  	product.setProductName(csvRecord.get("ProductName"));
    	  	product.setProductPrice(BigDecimal.valueOf(Double.parseDouble(csvRecord.get("Price"))));
    	  	product.setProductStock(Integer.parseInt(csvRecord.get("Stock")));
    	  	product.setProductDescription(csvRecord.get("Description"));
    	  	product.setProductStatus(0);
    	  	product.setProductIcon(csvRecord.get("ProductIcon"));
    	  	product.setCategoryType(Integer.parseInt(csvRecord.get("CategoryType")));
    	  	productList.add(product);
      }
      return productList;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
    }
  }
}