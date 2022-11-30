public class Skateboard extends Vehicle {
    private int scratches;
    private boolean needsPolish;
    
    public Skateboard(String name, int speed) {
        super(name, speed);
    }
    
    public void addScratch() {
        scratches++;
        if (scratches > 10) {
            needsPolish = true;
        }
    }
    
    public void polish() {
        scratches = 0;
        needsPolish = false;
    }
}