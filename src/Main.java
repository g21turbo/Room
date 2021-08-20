import java.lang.invoke.LambdaMetafactory;

public class Main {

    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 12);

        Door theDoor = new Door(32, 84, "steel", true);
        Lamp theLamp = new Lamp("Industrial", "XED", "6ft", "Matte");
        Window theWindow = new Window("slider", "3ft", "4ft");


        Room theRoom = new Room("Light Gray", "Wood", theDoor, theLamp, theWindow);
        theRoom.enterRoom();




    }
}
