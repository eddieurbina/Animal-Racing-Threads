
package progressbar;

public class ProgressBar {

    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Rabbit ", 100);
        AnimalThread giraffe = new AnimalThread("Giraffe ", 100);
        AnimalThread turtle = new AnimalThread("Turtle ", 100);
        
        rabbit.start();
        giraffe.start();
        turtle.start(); 
        System.out.println("Race is over now");
    }
    
}
