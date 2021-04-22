public class FlourPacker {
    public static void main(String[] args) {
        
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int total = (5 * bigCount) + (1 * smallCount);
        int leftover = total - goal;

        if (leftover % 5 == 0) {
            return true;
        } else if (leftover > 0 && leftover < smallCount) {
            return true;
        } else if (leftover > 0) {
            while (leftover >= 0) {
                if (leftover - goal == 0) {
                    return true;
                }
                leftover--;
            }
        }
        return false;
    }
}
