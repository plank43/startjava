public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int even = 0;
        int odd = 0;
        int i = - 10;
        do {
            if (i % 2 ==0) {
                even++;
            } else {
                odd++;
            }
            i++;
            } while (i <= 21);
            System.out.println("в промежутке [-10, 21] сумма четных чисел = " + even + ", а нечетных = " + odd);

            System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
            int num1 = 10;
            int num2 = 5;
            int num3 = -1;
            int min;
            int max;
            if (num1 < num2 && num2 < num3) {
                min = num1;
                max = num3;
            } else if (num2 < num1 && num1 < num3) {
                min = num2;
                max = num3;
            } else if (num3 < num1 && num1 < num2) {
                min = num3;
                max = num2;
            } else if (num3 < num2 && num2 < num1) {
                min = num3;
                max = num1;
            } else if (num1 < num3 && num3 < num2) {
                min = num1;
                max = num2;
            } else {
                min = num2;
                max = num1;
            }
            for (i = max - 1; i > min; i--) {
                System.out.print(i);
            }

            System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
            int num = 1234;
            int reversed = 0;
            int sumDigit = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                sumDigit += digit;
                num /= 10; 
            }
            System.out.println("исходное число в обратном порядке: " + reversed);
            System.out.println("сумма чисел: " + sumDigit);

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
            num1 = 0;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 1) {
                    num1 += 1;
                }
                    num /= 10;
                }
                if (num1 % 2 == 0) {
                    System.out.println(num + " содержит " + num1 + " (четное) количество единиц");
                } else {
                    System.out.println(3141591 + " содержит " + num1 + " (нечетное) количество единиц");
                }

                System.out.println("\n6. Отображение фигур в консоли");
                for (i = 1; i <= 50; i++) {
                    System.out.print("*");
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                }
                i = 15;
                while (i > 0) {
                    System.out.print("#");
                    if (i == 11 || i == 7 || i == 4 || i == 2 || i == 1) {
                        System.out.println();
                    }
                    i--;
                }
                i = 0;
                do {
                    System.out.print("$");
                    i++;
                    if (i == 1 || i == 3 || i == 6 || i == 8 || i == 9) {
                    System.out.println();
                }
                } while (i < 9);
                if (i == 1 || i == 3 || i == 6 || i == 8 || i == 9) {
                    System.out.println();
                }

                System.out.println("\n7. Отображение ASCII-символов");
                System.out.println("Dec Char");
                for (i = 1; i <= 47; i += 2) {
                    System.out.printf("%3d%4c%n", i, (char)i);
                }
                for (i = 98; i <= 122; i += 2) {
                    System.out.printf("%3d%4c%n", i, (char)i);
                }

                System.out.println("\n8. Проверка, является ли число палиндромом");
                num = 1234321;
                num1 = num;
                int digit = 0;
                reversed = 0;
                while (num1 != 0) {
                    digit = num1 % 10;
                    reversed = reversed * 10 + digit;
                    num1 /= 10;
                }
                if (num == reversed) {
                    System.out.println("число " + num + " является палиндромом");
                }

                System.out.println("\n9. Определение, является ли число счастливым");
                num = 425823;
                num1 = num;
                int digit123 = 0;
                int digit456 = 0;
                int sumDigit123 = 0;
                int sumDigit456 = 0;
                for (i = 0; i < 3; i++) {
                    digit456 = num1 % 10;
                    sumDigit456 += digit456;
                    num1 /= 10;
                }
                for (i = 0; i < 3; i++) {
                    digit123 = num1 % 10;
                    sumDigit123 += digit123;
                    num1 /= 10;
                }
                System.out.println("сумма первых трех цифр = " + sumDigit123);
                System.out.println("сумма вторых трех цифр = " + sumDigit456);
                if (sumDigit123 == sumDigit456) {
                    System.out.println("число " + num + " является счастливым");
                    } else {
                        System.out.println("число " + num + " не является счастливым");
                    }

                        System.out.println("/n10. Вывод таблицы умножения Пифагора");
                        for (i = 1; i < 10; i++) {
                            for (int j = 1; j < 10; j++) {
                                System.out.printf("%3d", i * j);

                            }
                                System.out.println();
                        }
                }

            }
        
    
    
