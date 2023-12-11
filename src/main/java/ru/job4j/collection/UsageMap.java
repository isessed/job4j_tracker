package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("isessed@gmail.com", "Петров Павел Валентинович");
        map.put("parsentev@yandex.ru", "Петр Арсентьев");
        map.put("123@gmail.com", "Иван Иванов");
        map.put("123@gmail.com", "Иван Сидоров");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
