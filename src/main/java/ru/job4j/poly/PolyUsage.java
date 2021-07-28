package ru.job4j.poly;

/**
 * @Раздел Блок 2. ООП / 4. Полиморфизм
 * @Задание 3.2. Зачем нужно приведение типов. [#310019]
 * @Описание 1. Добавьте интерфейс Транспортное средство (Vehicle), определите в нем метод без возвращаемого типа move().
 * По желанию можете добавить еще один метод, который будет характеризовать любое транспортное средство
 * с учетом п. 2 задания;
 * 2. Добавьте три реализации - Самолет, Поезд, Автобус. В каждом реализуйте метод move() - каждый по своему, поскольку
 * самолет летает по воздуху, поезд передвигается по рельсам, а автобус двигается по скоростным трассам;
 * 3. Создайте несколько объектов каждого класса, при этом приведите их к типу Vehicle. Сложите все объекты в массив,
 * а потом в цикле for() выведите все объекты в консоль с вызовом их методов;
 * 4. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 28.07.2021
 * @version 1
 */

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal gPig =  new GuineaPig();

        Animal[] animals = new Animal[] {cow, goose, dog, gPig};
        for (Animal animal: animals) {
            animal.sound();
        }

        Vehicle planeA350 = new Plane(120);
        Vehicle planeA380 = new Plane(150);
        Vehicle planeB787 = new Plane(5);
        Vehicle busPAZ3205 = new Bus2(30);
        Vehicle busPAZ3203 = new Bus2(36);
        Vehicle busNEFAZ5299 = new Bus2(40);
        Vehicle trainTEM23M = new Train(140);
        Vehicle trainFTV001 = new Train(100);
        Vehicle[] vehicles = new Vehicle[] {planeA350, planeA380, planeB787, busPAZ3205, busPAZ3203, busNEFAZ5299,
                trainTEM23M, trainFTV001};
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
            vehicle.passengers();
            System.out.println();
        }
    }
}
