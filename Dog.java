public class Dog extends Animal {

    @Override
    public void speak() {
        // invoke the original Animal class speak()
        super.speak();
        System.out.println("woof!");

    }

}


