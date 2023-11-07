import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class SuperKeyword {

    public static void main(String[] args)
    {
        Horse h1 = new Horse();
        System.out.println(h1.color);

    }

    class Animal{

        String color;

        Animal()
        {
            System.out.println(" Animal constructor is called");
        }
    }

    class Horse extends Animal {
        Horse(){
        super();
        System.out.println("Horse constructor is called");

        }
    }
    
}
