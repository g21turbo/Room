public class Lamp {

    private String style;
    private String bulbType;
    private String height;
    private String finish;

    public Lamp(String style, String bulbType, String height, String finish) {
        this.style = style;
        this.bulbType = bulbType;
        this.height = height;
        this.finish = finish;
    }

    public void turnOn() {
        System.out.println("You walk to the lamp and turn it on.");
    }

    public String getStyle() {
        return style;
    }

    public String getBulbType() {
        return bulbType;
    }

    public String getHeight() {
        return height;
    }

    public String getFinish() {
        return finish;
    }
}
