package javarush;

import java.util.HashSet;
import java.util.Set;

public class SetAddDogsCatsRemCats {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set <Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        
        Set<Object> pets = new HashSet<>(dogs);
        pets.addAll(cats);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
       pets.removeAll(cats);
       
    }

    public static void printPets(Set<Object> pets) {
        for(Object p: pets){
            System.out.println(p);
        }
    }

    public static class Cat{
        
    }
    public static class Dog{
        
    }
}
