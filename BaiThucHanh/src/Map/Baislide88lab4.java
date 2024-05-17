package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Baislide88lab4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("QNg"," Quang Ngai");
        hashMapCity.put("QN"," Quang Nam");
        hashMapCity.put("QN"," Quang Ninh");
        hashMapCity.put("HCM"," Thanh Pho Ho Chi Minh");
        System.out.println("danh sach cac thanh pho trong hashMapCity");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);
        System.out.println("QNg : " + hashMapCity.get("QNg"));
        System.out.println("NT : " + hashMapCity.get("NT"));
        if(hashMapCity.containsKey("Thanh Pho Ho Chi Minh")){
            System.out.println("Co Thanh Pho Ho Chi Minh Trong hashMapCity");
        }

    }
}
