package loopsTask;

public class Loops {
    public static void main(String[] args) {
        int runningSum = 0;
        int totalSum = 0;

        for (int num = 1; num <= 6; num++) {

            runningSum += num;
            totalSum += num;
            System.out.println(num + ") Num is " + num + ", sum is " + runningSum);
        }
        System.out.println("------------------------" + "\n" +
                "Sum of numbers is " + totalSum);
    }
}


