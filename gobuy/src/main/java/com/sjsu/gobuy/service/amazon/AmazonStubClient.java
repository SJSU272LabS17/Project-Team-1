package com.sjsu.gobuy.service.amazon;

import com.sjsu.gobuy.domain.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

@Component
public class AmazonStubClient {

    private Map<String, List<Product>> products = new HashMap<>();

    @PostConstruct
    public void initialize() {
        products.put("phone", aListOfPhones());
        products.put("charger", aListOfChargers());
        products.put("wireless", aListOfChargers());
        products.put("wireless charger", aListOfChargers());
    }

    public List<Product> listProductsFor(String name) {
        return products.get(name);
    }

    private List<Product> aListOfPhones() {
        return asList(aProduct_1(), aProduct_2(), aProduct_3(), aProduct_4(), aProduct_5(), aProduct_6(), aProduct_7(), aProduct_8(), aProduct_9());
    }

    private List<Product> aListOfChargers() {
        return asList(aCharger_2(), aCharger_3(), aCharger_4(), aCharger_5());
    }

    private Product aCharger_2() {
        return aProduct("PID13540", "Samsung Fast Charge Wireless Charging Stand", "$49.99", "https://images-na.ssl-images-amazon.com/images/I/81vyW4FijCL._SX522_.jpg", "https://www.amazon.com/Samsung-Wireless-Charging-Charger-Warranty/dp/B01BMDQ9U8/ref=sr_1_4?s=wireless&ie=UTF8&qid=1494885864&sr=1-4&keywords=Samsung+Wireless+Charger");
    }

    private Product aCharger_3() {
        return aProduct("PID13579", "Samsung Wireless Charging Pad with 2A Wall Charger", "$17.77", "https://images-na.ssl-images-amazon.com/images/I/61ZVda58nOL._SX522_.jpg", "https://www.amazon.com/Samsung-EP-PG920IBUGUS-Wireless-Charging-Charger/dp/B00UCZGS6S/ref=sr_1_5?s=wireless&ie=UTF8&qid=1494885864&sr=1-5&keywords=Samsung+Wireless+Charger");
    }

    private Product aCharger_4() {
        return aProduct("PID13579", "Samsung Fast Charge Wireless Charging Stand", "$29.99", "https://images-na.ssl-images-amazon.com/images/I/61jCLwT7LFL._SX522_.jpg", "https://www.amazon.com/Samsung-Wireless-Charging-Enabled-Devices/dp/B01IRSWBIU/ref=sr_1_6?s=wireless&ie=UTF8&qid=1494885864&sr=1-6&keywords=Samsung+Wireless+Charger");
    }

    private Product aCharger_5() {
        return aProduct("PID13579", "Samsung Fast Charge Wireless Charging Convertible", "$79.99", "https://images-na.ssl-images-amazon.com/images/I/51WdSeKnqLL._SX522_.jpg", "https://www.amazon.com/Samsung-Wireless-Charging-Convertible-Warranty/dp/B06XH4X7SZ/ref=sr_1_7?s=wireless&ie=UTF8&qid=1494885864&sr=1-7&keywords=Samsung+Wireless+Charger");
    }

    private Product aProduct_1() {
        return aProduct("PID13579", "Sony Xperia XA1 G3125", "$369", "https://images-na.ssl-images-amazon.com/images/I/51WdSeKnqLL._SX522_.jpg", "https://www.amazon.com/Sony-G3125-5-0-Inch-FACTORY-UNLOCKED/dp/B06XYJRM81/ref=sr_1_2?s=wireless&ie=UTF8&qid=1494885315&sr=1-2&keywords=xperia+xa1");
    }

    private Product aProduct_2() {
        return aProduct("PID13591", "Sony Xperia XA1", "$285.00", "https://images-na.ssl-images-amazon.com/images/I/61RvwDBfAzL._SX522_.jpg", "https://www.amazon.com/Sony-Factory-Unlocked-International-Warranty/dp/B06Y1B1Y1T/ref=sr_1_3?s=wireless&ie=UTF8&qid=1494885315&sr=1-3&keywords=xperia+xa1");
    }

    private Product aProduct_3() {
        return aProduct("PID13592", "Sony Xperia XA", "188.00", "https://images-na.ssl-images-amazon.com/images/I/71iaaasXEgL._SY679_.jpg", "https://www.amazon.com/Sony-Xperia-unlocked-smartphone-Warranty/dp/B01FJT7E0A/ref=sr_1_1?s=wireless&ie=UTF8&qid=1494885637&sr=1-1&keywords=sony+phone");
    }

    private Product aProduct_4() {
        return aProduct("PID13595", "Sony Xperia X Compact", "314.99", "https://images-na.ssl-images-amazon.com/images/I/61RIV-3yQkL._SY679_.jpg", "https://www.amazon.com/Sony-Xperia-Compact-Unlocked-Smartphone/dp/B01LACBMV2/ref=sr_1_2?s=wireless&ie=UTF8&qid=1494885671&sr=1-2&keywords=sony+phone");
    }

    private Product aProduct_5() {
        return aProduct("PID13596", "Sony Xperia L1 - Unlocked", "199.99", "https://images-na.ssl-images-amazon.com/images/I/71%2B0yjSNyVL._SY679_.jpg", "https://www.amazon.com/Sony-Xperia-L1-Unlocked-Smartphone/dp/B06XGYQWZN/ref=sr_1_4?s=wireless&ie=UTF8&qid=1494885671&sr=1-4&keywords=sony+phone");
    }

    private Product aProduct_6() {
        return aProduct("PID13598", "SONY XPERIA E5 White (F3313)", "157.99", "https://images-na.ssl-images-amazon.com/images/I/71Eb6jyozML._SY679_.jpg", "https://www.amazon.com/SONY-XPERIA-White-F3313-UNLOCKED/dp/B01JMAVP5M/ref=sr_1_5?s=wireless&ie=UTF8&qid=1494885671&sr=1-5&keywords=sony+phone");
    }

    private Product aProduct_7() {
        return aProduct("PID13598", "Sony Xperia Z5 Premium E6853", "466.98", "https://images-na.ssl-images-amazon.com/images/I/51PAYpodQdL._SX522_.jpg", "https://www.amazon.com/Sony-Xperia-Z5-Unlocked-International/dp/B0171GYNGW/ref=sr_1_6?s=wireless&ie=UTF8&qid=1494885671&sr=1-6&keywords=sony+phone");
    }

    private Product aProduct_8() {
        return aProduct("PID13598", "Sony Xperia XZ F8332 64GB 5.2-Inch 23MP", "483.85", "https://images-na.ssl-images-amazon.com/images/I/51WiHEfJjoL._SX522_.jpg", "https://www.amazon.com/Sony-F8332-5-2-Inch-UNLOCKED-International/dp/B01LXF0WML/ref=sr_1_7?s=wireless&ie=UTF8&qid=1494885671&sr=1-7&keywords=sony+phone");
    }

    private Product aProduct_9() {
        return aProduct("PID13598", "Sony Xperia E1 D2004", "49.99", "https://images-na.ssl-images-amazon.com/images/I/71aYr6IpKML._SY679_.jpg", "https://www.amazon.com/Sony-Xperia-Unlocked-Dual-Core-Android/dp/B01N7C4KF7/ref=sr_1_17?s=wireless&ie=UTF8&qid=1494885671&sr=1-17&keywords=sony+phone");
    }

    private Product aProduct(String id, String name, String price, String image, String url) {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setImage(image);
        product.setUrl(url);
        return product;
    }

}
