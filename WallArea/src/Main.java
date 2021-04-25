public class Main {
    public static void main(String[] args) {
        Wall redWall = new Wall();
        Wall creamWall = new Wall(10.5,2);

        redWall.setWidth(10.5);
        redWall.setHeight(2);

        System.out.println(redWall.getWidth());
        System.out.println(redWall.getHeight());
        System.out.println(redWall.getArea());
        System.out.println();


        System.out.println(creamWall.getWidth());
        System.out.println(creamWall.getHeight());
        System.out.println(creamWall.getArea());
    }
}
