package sem2;

import java.util.StringJoiner;

/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
 * используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class Task1 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("select * from students where ");
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String jsonSubstring = json.substring(1, json.length()-1);
        String[] jsonPairs = jsonSubstring.split(",");
        StringJoiner andQuery = new StringJoiner("and ");
        for (String jsonPair : jsonPairs) {
            jsonPair = jsonPair.trim();   //обрезает пробелы в начале и в конце строки
            String[] keyValue = jsonPair.split(":");
            String key = keyValue[0];
            key = key.substring(1,key.length()-1);
            String value = keyValue[1];
            if (!("\"null\"".equalsIgnoreCase(value) || "null".equalsIgnoreCase(value))){
                andQuery.add(key + "=" + value + " ");
            }
        }
        result.append(andQuery);
        System.out.println(result);
    }
}
