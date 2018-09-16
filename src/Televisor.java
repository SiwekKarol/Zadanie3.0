public class Televisor {

    private boolean enabled;
    public void turnOn() {
        enabled = true;
    }
    public void turnOff() {
        enabled = false;
    }
    public void showStatus() {
        if(enabled) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}
