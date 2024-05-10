public class Main {
    public static void main(String[] args) {
       /*Создать массив дробных (не целых) чисел размером 15 элементов и наполнить
         его положительными и отрицательными числами,
        первые 2 числа в массиве должны быть положительными;
     Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел
 расположенных после первого отрицательного числа и
 вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3*/
        double[] array = {3.5, 6.8, -5.5, -4.4, 3.3, 4.6, 7.7, -7.5, 4.1, -8.8, -23.5, -2.5, 1.1, 5.5, 1.1};

        double sum = 0;
        int count = 0;
        boolean negativeNum = false;
        for (double num : array) {
            if (negativeNum && num > 0) {
                sum = sum + num;
                count++;

            } else if (num < 0) {
                negativeNum = true;
            }
        }
        if(count>0){
            double average=sum/count;
            System.out.println("среднее арифметическое положительных чисел после 1 отрицательного: "+average);
            }
        }
    }
