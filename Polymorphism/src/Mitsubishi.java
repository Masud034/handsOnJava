public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " engine is starting...";
    }
    public String accelerate(){
        return this.getClass().getSimpleName() + " is accelerating...";
    }
    public String brake(){
        return this.getClass().getSimpleName() + " is braking";
    }
}
