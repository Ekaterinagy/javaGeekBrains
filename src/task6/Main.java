package task6;

import java.util.*;

/**
 * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
 *
 * Создать множество ноутбуков.
 *
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 *
 * “Введите цифру, соответствующую необходимому критерию:
 *
 * 1 - ОЗУ
 *
 * 2 - Объём ЖД
 *
 * 3 - Операционная система
 *
 * 4 - Цвет …
 *
 * Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

 */
public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell", "Inspiron", 8, 256, "Windows 10", "Black", 799.99));
        laptops.add(new Laptop("Apple", "MacBook Air", 16, 512, "MacOS", "Silver", 1299.99));
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 1_000, "Windows 11", "Black", 1599.99));


        Map<Integer,String> criteria = new HashMap<>();
        criteria.put(1,"ОЗУ");
        criteria.put(2,"Объём ЖД");
        criteria.put(3,"Операционная система");
        criteria.put(4,"Цвет");

        for (Map.Entry<Integer, String> integerStringEntry : criteria.entrySet()) {
            System.out.println(integerStringEntry.getKey()+" - "+integerStringEntry.getValue());
        }

        Map<String, String> filters = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)){
            int k = scanner.nextInt();
            String field = criteria.get(k);
            String value = scanner.next();
            filters.put(field,value);
        }
        //Этот код выведет все ноутбуки из множества laptops,
        // у которых ОЗУ не менее 8 Гб, установлена операционная система Windows 10 и они черного цвета.
        filterLaptops(laptops, filters);
    }
    public static void filterLaptops(Set<Laptop> laptops, Map<String, String> filters) {
        for (Laptop laptop : laptops) {
            boolean match = true;
            //Далее, мы можем проверить каждый критерий из Map filters и сравнить
            // его с соответствующим полем объекта Laptop. Если хотя бы один критерий
            // не удовлетворяет условию, мы помечаем этот ноутбук как несоответствующий фильтру и продолжаем перебор.

            for (Map.Entry<String, String> entry : filters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                switch (key) {
                    case "ОЗУ":
                        if (laptop.getRam() < Integer.parseInt(value)) {
                            match = false;
                        }
                        break;
                    case "Объём ЖД":
                        if (laptop.getStorage() < Integer.parseInt(value)) {
                            match = false;
                        }
                        break;
                    case "Операционная система":
                        if (!laptop.getOs().equalsIgnoreCase(value)) {
                            match = false;
                        }
                        break;
                    case "Цвет":
                        if (!laptop.getColor().equalsIgnoreCase(value)) {
                            match = false;
                        }
                        break;
                }
                if (!match) {
                    break;
                }
            }
            if (match) {
                System.out.println(laptop);
            }
        }
    }
}
