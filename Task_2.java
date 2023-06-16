// Вывести все простые числа от 1 до 1000

public class Task_2 {
    public static void main(String[] args) {
        int countRow = 12;
        int min = 1;
        int max = 1000;
        int count;
        String resultStr;
        int result;
        int k = -1;
		  
        resultStr = String.format("%4d", 1) + " ";
        resultStr += String.format("%4d", 2) + " ";
        resultStr += String.format("%4d", 3) + " ";
        resultStr += String.format("%4d", 5) + " ";
        System.out.printf(resultStr);
        count = 4;
        while ((6 * min) + k < max) {
            k = k * -1;
            result = (6 * min - k);
            if ((result % 5) != 0) {
                resultStr = String.format("%4d", result) + " ";
                count += 1;
                System.out.printf(resultStr);
                if (count == countRow) {
                    System.out.println();
                    count = 0;
                }
            }
            if (k < 0) {
                min += 1;
            }

        }

    }

}
