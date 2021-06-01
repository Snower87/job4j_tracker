package ru.job4j.poly;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 0. Что такое полиморфизм. [3819#271517]
 * @Описание 1. Практика создания классов при полиморфизме через интерфейсы (по описанию к задаче).
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 01.06.2021
 * @version 1
 */

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        //Store store = new DbStore();
        Store store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
