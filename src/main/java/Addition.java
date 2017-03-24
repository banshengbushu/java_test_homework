public class Addition {
    public int sum = 0;
    public int add(int num) {
        if (num % 2 == 0) {
            sum++;
        } else {
            sum--;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
}
