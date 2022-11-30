public class Bike extends Vehicle {
    private boolean flatTire;
    
    public Bike(String name, int speed) {
        super(name, speed);
    }
    
    public void ranOverNail() {
        flatTire = true;
    }
    
    public void fixTire() {
        flatTire = false;
    }
    
    @Override
    public void travel(double time, int direction) {
        if (!flatTire) {
            super.travel(time, direction);
        }
    }
}
