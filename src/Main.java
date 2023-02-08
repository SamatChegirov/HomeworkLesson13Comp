import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Computer comp = new Computer("Acer Swift 3", 14.0, "Silver", "SSD", 16, "Integrated", 3.2, "Color");
        System.out.println("Brand: " + comp.getBrand() + "\n" + "Size: " + comp.getDisplay() + "\n" + "Color: " + comp.getColor() + "\n" + "Memory: " + comp.getSsd() + "\n" + "RAM: " + comp.getOzu() + "\n" + "VideoCard: " + comp.getVidCard() + "\n" + "USB: " + comp.getUsb() + "\n" + "Keyboard: " + comp.getKeyboard());
        System.out.println(" ");
        Display display = new Display("Acer", 14, "IPS");
        System.out.println("Display: " + display.getBrand() + "\n" + "Inch: " + display.getInch() + "\n" + "Matrix" + display.getMatrix());
        System.out.println(" ");
        HardSSD hardSSD = new HardSSD(512, 2);
        System.out.println("Size SSD: " + hardSSD.getSsd() + "\n" + "Chapter: " + hardSSD.getChapter());
        System.out.println(" ");
        RAM ram = new RAM("Samsung", 16);
        System.out.println("Brand: " + ram.getBrand() + "\n" + "Size RAM: " + ram.getRam());
        System.out.println(" ");
        USBPort usbPort = new USBPort(new double[]{3.0, 3.2}, 1234);
        System.out.print("USB, Type-C: ");
        for (double usb : usbPort.isUsbPort()) {
            System.out.print(usb + ", ");
        }
        System.out.println(" ");
        System.out.println("ID Port: " + usbPort.getIdPort());
        System.out.println(" ");
        Keyboard keyboard = new Keyboard("backlight", "not numPad");
        System.out.println("Keyboard: " + keyboard.getColor() + "\n" + "NumPad: " + keyboard.getSize());


    }
}