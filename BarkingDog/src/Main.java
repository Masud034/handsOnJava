public class Main {
    public static void main(String[] args) {
        BarkingDog germanShepard = new BarkingDog();
        System.out.println(germanShepard.shouldWakeUp(false , 2));
        System.out.println(germanShepard.shouldWakeUp(true , 8));
        System.out.println(germanShepard.shouldWakeUp(true , -1));
        System.out.println(germanShepard.shouldWakeUp(true , 0));
        System.out.println(germanShepard.shouldWakeUp(false , 6));

    }
}
