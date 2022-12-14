public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int sumEvens = 0;
        int sumOdds = 0;
        int i = - 10;
        do {
            if (i % 2 == 0) {
                sumEvens += i;
            } else {
                sumOdds += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvens + ", а нечетных = " + sumOdds);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num3;
        int max = num1;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        if (num3 < num2) {
            min = num3;
        } else {
            min = num2;
        }
        for (i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("исходное число в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10; 
        }
        System.out.println("\nсумма чисел: " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%3d", i);
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        for (i = 1; i <= 5 - count % 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n5.Проверка количества единиц на четность");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (copyNum > 0) {
            int digit = copyNum % 10;
            if (digit == 1) {
                countOnes++;
            }
            copyNum /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println(num + " содержит " + countOnes + " (четное) количество единиц");
        } else {
            System.out.println(num + " содержит " + countOnes + " (нечетное) количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        i = 4;
        int j = 0;
        while (i >= 0) {
            while(j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            j = 0;
            i--;
        }
        i = 5;
        do {
            if (i < 3) {
                j = i - 1;
            } else {
                j = 5 - i;
            }
            do {
                System.out.print("$");
                j--;
            } while (j >= 0);
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (i = 1; i <= 47; i += 2) {
            System.out.printf("%3d%4c%n", i, (char) i);
        }
        for (i = 98; i <= 122; i += 2) {
            System.out.printf("%3d%4c%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        copyNum = num;
        int reversed = 0;
        while (copyNum != 0) {
            int digit = copyNum % 10;
            reversed = reversed * 10 + digit;
            copyNum /= 10;
        }
        if (num == reversed) {
            System.out.println("число " + num + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int firstNum = 425;
        int secondNum = 823;
        int firstDigits = 0;
        int secondDigits = 0;
        int firstSumDigits = 0;
        int secondSumDigits = 0;
        for (i = 0; i < 3; i++) {
            firstDigits = firstNum % 10;
            firstSumDigits += firstDigits;
            firstNum /= 10;
            secondDigits = secondNum % 10;
            secondSumDigits += secondDigits;
            secondNum /= 10;
        }
        System.out.println("сумма первых трех цифр = " + firstSumDigits);
        System.out.println("сумма вторых трех цифр = " + secondSumDigits);
        if (firstSumDigits == secondSumDigits) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("/n10. Вывод таблицы умножения Пифагора");
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);

            }
            System.out.println();
        }
    }

}



