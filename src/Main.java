import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner1 = new Scanner(System.in);
        int size = scanner1.nextInt();

        double [] numbers= new double[size];
        System.out.println("Введите " + size + " дробных/обычных чисел:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner1.nextDouble();
        }
        System.out.println(Arrays.toString(numbers));


        boolean negative = false;
        double sum = 0.0;
        int count = 0;
        for (double number : numbers) {
            if (!negative) {
                if (number < 0) {
                    negative = true;
                }
            }else {
                    if (number>0){
                        sum+=number;
                        count++;
                    }

            }

        }
        if (count>0){
            double summ = sum/count;
            System.out.println(sum+"/ "+count + " или " + summ);
        }
        }


 }
