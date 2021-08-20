public class Door {

    private int width;
    private int height;
    private String material;
    private boolean lock;

    public Door(int width, int height, String material, boolean lock) {
        this.width = width;
        this.height = height;
        this.material = material;
        this.lock = lock;
    }

    public void unlockDoor() {
        System.out.println("Door has been unlocked");
    }

    public void openDoor() {
        System.out.println("You open the door, AAAAAAAAAAHHHHHHHHHHH!!!!!!!");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isLock() {
        return lock;
    }
}
