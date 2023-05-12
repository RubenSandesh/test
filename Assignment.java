class AssignmentClass {
    public static void main(String[] args) {
       System.out.println(calculateNextNum(19));
    }
    
    private static int calculateNextNum(int fetchedValue) {
        int nextNo = fetchedValue + 1;
        while (!hasDesiredSum(nextNo)) {
            nextNo++;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nextNo;
    }

    private static  boolean hasDesiredSum(int number) {
        int sum = calculateSum(number);
        while (sum > 9) {
            sum = calculateSum(sum);
        }
        return sum == 1;
    }

    private static int calculateSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
