package ru.job4j.pojo;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 3. Удаление моделей из массива. [176470#271563]
 * @Описание 1. Вам нужно написать метод, который вернет индекс первой пустой ячейки.
 * Реализуйте метод public static int indexOfNull(Product[] products).
 * 2. Протестируйте код в junit.
 * 3. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 22.05.2021
 * @version 1
 */

public class Shop {
    public static int indexOfNull(Product[] products) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Product[] delete(Product[] products, int index) {
        for (int ind = index; ind < products.length - 1; ind++) {
            products[ind] = products[ind + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + " - " + product.getCount());
            }
        }

        System.out.println();
        System.out.println("Using method class Shop - delete():");
        Shop shop = new Shop();
        shop.delete(products, 0);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }  else {
                System.out.println("null");
            }
        }

        products[2] = new Product("Apple", 20);
        products[3] = new Product("Orange", 200);
        System.out.println();
        System.out.println("Second using method class Shop - delete():");
        shop.delete(products, 2);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }  else {
                System.out.println("null");
            }
        }
    }
}
