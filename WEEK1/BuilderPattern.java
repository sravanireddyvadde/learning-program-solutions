 package WEEK1;

class Car {
    private String engine;
    private String body;
    private int wheels;

    public void setEngine(String engine) { this.engine = engine; }
    public void setBody(String body) { this.body = body; }
    public void setWheels(int wheels) { this.wheels = wheels; }

    public void showCar() {
        System.out.println("Car built with " + engine + " engine, " + body + " body, and " + wheels + " wheels.");
    }
}

class CarBuilder {
    private Car car = new Car();

    public CarBuilder addEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder addBody(String body) {
        car.setBody(body);
        return this;
    }

    public CarBuilder addWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    public Car build() {
        return car;
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .addEngine("V6")
                .addBody("SUV")
                .addWheels(4)
                .build();
        car.showCar();
    }
}
