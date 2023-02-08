public class Keyboard {
    private String Color;
    private String size;

    public Keyboard(String color, String size) {
        Color = color;
        this.size = size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
