import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adrian", 24, 1.82, 163.23);
        Person person2 = new Person("Irene", 29, 1.56, 156.34);
        Person person3 = new Person("Mario", 34, 1.87, 178.23);
        List<Person> personList = new ArrayList<>();
        personList.add(person1); personList.add(person2); personList.add(person3);
        for (Person persona :
                personList) {
            System.out.println(persona);
        }
    }
}

class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(height, person.height) == 0 && Double.compare(weight, person.weight) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
