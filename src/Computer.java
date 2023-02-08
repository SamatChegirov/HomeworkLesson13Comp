public class Computer {
    private String brand;
    private double display;
    private String color;
    private String ssd;
    private int ozu;
    private String VidCard;
    private double usb;
    private String keyboard;

    public Computer(String brand, double display, String color, String ssd, int ozu, String vidCard, double usb, String keyboard) {
        this.brand = brand;
        this.display = display;
        this.color = color;
        this.ssd = ssd;
        this.ozu = ozu;
        this.VidCard = vidCard;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public int getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public String getVidCard() {
        return VidCard;
    }

    public void setVidCard(String vidCard) {
        VidCard = vidCard;
    }

    public double getUsb() {
        return usb;
    }

    public void setUsb(double usb) {
        this.usb = usb;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
