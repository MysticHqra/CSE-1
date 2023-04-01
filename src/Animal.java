public class Animal {
    void eat() {
        System.out.println("Nom nom");
    }

    void sleep() {

    }

}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eating");
    }

    void roar() {

    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eating");
    }

    void pounce() {

    }
}

class Bear extends Animal {
    void eat() {
        System.out.println("Bear eating");
    }

    void hibernate() {

    }
}

class AnimalMain {

    static void feed_animals(Animal[] arr) {
        for (Animal i : arr) {
            i.eat();
        }
    }

    public static void main(String[] args) {
        Animal[] arr = {new Lion(), new Tiger(), new Bear()};
        feed_animals(arr);
    }
}