class Animal{
    public void grow(){
        System.out.println("I'm animal, I grow up.");
    }
    public void sleep(){
        System.out.println("I'm animal, I am sleeping.");
    }
}
class Dog extends Animal{
    // overriding method
    public void grow(){
        System.out.println("I'm dog, I grow up.");
    }
}
class Bird extends Animal{
    // keep superclass grow(), add own statements
    // overriding method
    public void grow(){
        super.grow();
        System.out.println("I'm bird, I grow up.");
    }
    // overriding method
    public void sleep(){
        System.out.println("I'm bird, I am sleeping...");
    }
    // Bird own method
    public void sing(){
        System.out.println("I'm bird, I am singing a song...");
    }
}
public class overridingTest{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.grow();
        Bird bird = new Bird();
        bird.grow();
    }
}
