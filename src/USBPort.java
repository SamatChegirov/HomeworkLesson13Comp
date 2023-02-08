public class USBPort {
    private double[] usbPort = {3.0, 3.2};  //2.0 or 3.0
    private int idPort;

    public USBPort(double[] usbPort, int idPort) {
        this.usbPort = usbPort;
        this.idPort = idPort;
    }

    public double[] isUsbPort() {
        return usbPort;
    }

    public void setUsbPort(double[] usbPort) {
        this.usbPort = usbPort;
    }

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }
}
