// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива
// такой, что сумма элементов с индексами < i равна сумме
// элементов с индексами > i. 

public class task8 {

    public static int FindSum(int startIndex, int endIndex, int[] arr) {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {

            int sumFirst = FindSum(0, i, nums);
            int sumSecond = FindSum(i + 1, nums.length, nums);
            if (sumFirst == sumSecond) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}