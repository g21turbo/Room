public class Window {

    private String style;
    private String height;
    private String width;

    public Window(String style, String height, String width) {
        this.style = style;
        this.height = height;
        this.width = width;
    }

    public void openWindow() {
        System.out.println("You open the window. A breeze comes in.");
    }


    public String getStyle() {
        return style;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }
}
