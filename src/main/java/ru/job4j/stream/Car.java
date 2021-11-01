package ru.job4j.stream;

/**
 * Класс Car пример создания класса через паттерн строитель (builder)
 * 1) создание класса (#126) 2) убрал поле brand из класса (#131)
 * @author Sergei Begletsov
 * @since 12.09.2021
 * @version 2
 */

public class Car {
    private Model model;
    private Color color;
    private EquipmentConfiguration equipment;
    private double wheels;
    private double costs;
    private Weight weight;

    static class Builder {
        private Model model;
        private Color color;
        private EquipmentConfiguration equipment;
        private double wheels;
        private double costs;
        private Weight weight;

        Builder buildModels(Model model) {
            this.model = model;
            return this;
        }

        Builder buildColor(Color color) {
            this.color = color;
            return this;
        }

        Builder buildEquipment(EquipmentConfiguration equipment) {
            this.equipment = equipment;
            return this;
        }

        Builder buildWheels(double wheels) {
            this.wheels = wheels;
            return this;
        }

        Builder buildCosts(double costs) {
            this.costs += costs;
            return this;
        }

        Builder buildWeight(Weight weight) {
            this.weight = weight;
            return this;
        }

        Car buildCar() {
            Car car = new Car();
            car.model = model;
            car.color = color;
            car.equipment = equipment;
            car.wheels = wheels;
            car.costs = costs;
            car.weight = weight;
            return car;
        }
    }

    enum Color {
        YELLOW, GREEN, BLUE, RED, ORANGE, BROWN, GREY, BLACK, WHITE
    }

    enum Model {
        SPARK, COBALT, NEXIA
    }

    enum EquipmentConfiguration {
        LOW, MIDDLE, PREMIUM
    }

    enum Weight {
        LIGHT, MEDIUM, HEAVY
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color=" + color +
                ", equipment=" + equipment +
                ", wheels=" + wheels +
                ", costs=" + costs +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Car chevroletSpark = new Builder()
                .buildModels(Model.SPARK)
                .buildColor(Color.GREY)
                .buildWheels(19)
                .buildCosts(1900)
                .buildEquipment(EquipmentConfiguration.LOW)
                .buildWeight(Weight.LIGHT)
                .buildCar();
        System.out.println("Spark: " + chevroletSpark);

        Car chevroletCobalt = new Builder()
                .buildModels(Model.COBALT)
                .buildColor(Color.WHITE)
                .buildWheels(24)
                .buildCosts(2800)
                .buildEquipment(EquipmentConfiguration.PREMIUM)
                .buildWeight(Weight.HEAVY)
                .buildCar();
        System.out.println("Cobalt: " + chevroletCobalt);

        Car chevroletNexia = new Builder()
                .buildModels(Model.NEXIA)
                .buildColor(Color.BLACK)
                .buildWheels(20)
                .buildCosts(2100)
                .buildEquipment(EquipmentConfiguration.MIDDLE)
                .buildWeight(Weight.MEDIUM)
                .buildCar();
        System.out.println("Nexia: " + chevroletNexia);
    }
}
