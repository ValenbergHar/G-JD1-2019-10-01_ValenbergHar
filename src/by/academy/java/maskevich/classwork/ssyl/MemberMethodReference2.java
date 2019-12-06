package by.academy.java.maskevich.classwork.ssyl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Car4 {
private int fuelVolume;

public void addFuel(final int volume) {
fuelVolume += volume;
}

@Override
public String toString() {
return "Car [fuelVolume=" + fuelVolume + "]";
}
}

@FunctionalInterface
interface ConsumerWith2Params<T, O> {
void accept(T t, O o);
}

public class MemberMethodReference2 {
public static void main(String[] args) {
final List<Car4> cars = new ArrayList<>();
cars.add(new Car4());
cars.add(new Car4());

System.out.println("initial cars state");
Consumer<? super Car4> objectPrinter = System.out::println;
cars.forEach(objectPrinter);

add30Liters(cars, Car4::addFuel);

System.out.println("cars after fuel append");

cars.forEach(objectPrinter);
}

public static void add30Liters(List<Car4> cars, ConsumerWith2Params<Car4, Integer> consumer) {
for (Car4 car : cars) {
consumer.accept(car, 30);
}
}
}