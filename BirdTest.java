
abstract class Bird {
    public abstract void fly();
}
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}
class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins can't fly, but they swim excellently!");
    }
}

// Main class 
public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();    
        penguin.fly();   
    }
}
