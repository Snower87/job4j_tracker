package ru.job4j.pojo;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 3.2. Удаление моделей из массива. [#310016]
 * @Описание 1. Ниже приведен код класса ShopDrop с методом delete. Этот метод должен сместить ячейки
 * на одну позицию влево.
 * Метод delete() принимает индекс ячейки, которую нам необходимо удалить и все ячейки, стоящие справа от удаляемой
 * необходимо переместить на одну ячейку влево, как было изображено ранее на схеме.
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 23.07.2021
 * @version 1
 */

public class ShopDrop {
    /**
     * Метод удаляет и смещает ячейки на одну позицию влево
     * @param products входной массив
     * @param index индекс ячейки, которую необходимо удалить
     * @return смещенный массив на 1 элемент влево
     */
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        System.out.println("Original products:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
        System.out.println();
        System.out.println("Products after nulling second element:");
        products[1] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Products after swap 2 elements and delete last:");
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
