package ru.job4j.pojo;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 3. Массивы и модели. [174892#271561]
 * @Описание 1. Практика создания моделей данных и их массивов на примере продуктового магазина (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class Store {
    public static void showProducts(Product[] prods) {
        for (Product product: prods) {
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println();
    }

    public static void showProductsMore10(Product[] prods) {
        for (int i = 0; i < prods.length; i++) {
            if (prods[i].getCount() > 10) {
                System.out.println(prods[i].getName() + " - " + prods[i].getCount());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[3];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        showProducts(prods);

        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        prods[0] = oil;

        showProducts(prods);

        System.out.println("Shown only product.count > 10");
        showProductsMore10(prods);
    }
}
