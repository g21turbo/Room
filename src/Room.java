public class Room {

    private String wallColor;
    private String floorType;
    private Door theDoor;
    private Lamp theLamp;
    private Window theWindow;

    public Room(String wallColor, String floorType, Door theDoor, Lamp theLamp, Window theWindow) {
        this.wallColor = wallColor;
        this.floorType = floorType;
        this.theDoor = theDoor;
        this.theLamp = theLamp;
        this.theWindow = theWindow;
    }

    public void enterRoom() {
        theDoor.unlockDoor();
        theDoor.openDoor();
        theLamp.turnOn();
        theWindow.openWindow();
    }




}
