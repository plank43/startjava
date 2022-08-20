public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 20;
        if (age > 20) {
            System.out.println("Машину водить можно");
        } else {
            System.out.println("Машину водить нельзя");
        }
        boolean maleGender = true;
        if(!maleGender) {
            System.out.println(" Лучше не водить");
        }
        double height = 1.85;
        if(height < 1.80) {
            System.out.println("Еще нужно подрасти");
        } else {
            System.out.println("Ты уже вырос");
        }
        char firstLetterName = "Rembo".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Будешь богатым");
        } else if(firstLetterName == 'I') {
            System.out.println("Будешь счастливым");
        } else {
            System.out.println("Будешь сильным");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 10;
        int num2 = 3;
        if(num1 < num2) {
            System.out.println(num1 + " - минимальное число, " + num2 + " - максимальное число");
        } else {
            System.out.println(num2 + " - минимальное число, " + num1 + " - максимальное число");
        } 

        System.out.println("\n3. Работа с числом");
        num1 = 5;
        if (num1 == 0) {
            System.out.print(num1);
        } else {
            if (num1 < 0) {
                System.out.println("отрицательное число");
            } else {
                System.out.println("положительное число");
            } 
            if (num1 % 2 == 0) {
                System.out.println("четное число");
            } else {
                System.out.println("нечетно число");
            }
            System.out.println(num1);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int srcNum1 = 357;
        int srcNum2 = 467;
        System.out.println("Исходные числа: " + num1 + " " + num2);
        int digit1 = srcNum1 / 100;
        int digit2 = srcNum1 / 10 % 10;
        int digit3 = srcNum1 % 10;
        int digit4 = srcNum2 / 100;
        int digit5 = srcNum2 / 10 % 10;
        int digit6 = srcNum2 % 10;
        if (digit1 == digit4) {
            System.out.println("номера первого разряда равны: " + digit1 + " = " + digit4);
        }
        if (digit2 == digit5) {
            System.out.println("номера второго разряда равны: " + digit2 + " = " + digit5);
        }
        if (digit3 == digit6) {
            System.out.println("номера третьего разряда равны: " + digit3 + " = " + digit6);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if (symbol >= 48 && symbol <= 57) {
            System.out.println("цифра");
        } else if (symbol >= 65 && symbol <= 90) {
            System.out.println("большая буква");
        } else if (symbol >= 97 && symbol <= 122) {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double finalSum = 0;
        if (deposit < 100000) {
            finalSum = deposit * 1.05;
    //        System.out.println("Итоговая сумма с учетом % = " + (deposit * 1.05));
        } else if (deposit > 100000 && deposit <= 300000) {
            finalSum = deposit * 1.07;
        } else {
            finalSum = deposit * 1.1;
        }
        System.out.println("вклад " + deposit);
        System.out.println("начислено %: " + ((finalSum * 100 / deposit) - 100));
        System.out.println("Итоговая сумма с учетом % = " + finalSum);

        System.out.println("\n7.Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int markHistory = 0;
        int markProgramming = 0;
        if (percentHistory <= 60) {
            markHistory = 2;
            System.out.println(markHistory + " оценка по истории");
        } else if (percentHistory > 60 && percentHistory <= 73) {
            markHistory = 3;
            System.out.println(markHistory + " оценка по истории");
        } else if (percentHistory > 73 && percentHistory <= 91) {
            markHistory = 4;
            System.out.println(markHistory + " оценка по истории");
        } else if (percentHistory > 91) {
            markHistory = 5;
            System.out.println(markHistory + " оценка по истории");
        }
        if (percentProgramming <= 60) {
            markProgramming = 2;
            System.out.println(markProgramming + " оценка по программированию");
        } else if (percentProgramming > 60 && percentProgramming <= 73) {
            markProgramming = 3;
            System.out.println(markProgramming + " оценка по программированию");
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            markProgramming = 4;
            System.out.println(markProgramming + " оценка по программированию");
        } else if (percentProgramming > 91) {
            markProgramming = 5;
            System.out.println(markProgramming + " оценка по программированию");
        }
        System.out.println("средний бал по предметам: " + ((markHistory + markProgramming) / 2));
        System.out.println("средний процент по предметам: " + ((percentHistory + percentProgramming) / 2));

        System.out.println("\n8.Расчет прибыли");
        int rent = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int annualProfit = (sales - costPrice - rent) * 12;
        if (annualProfit <= 0) {
            System.out.println("прибыль за год: " + annualProfit);
        } else {
            System.out.println("прибыль за год: +" + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int num = 567;
        int hundreds = num / 100;
        int dozens = num / 10 % 10;
        int units = num % 10;
        int hundredsInBank = 5;
        int dozensInBank = 5;
        int missingAmountOfBanknotes = dozens - dozensInBank;
        int unitsRequiredNumberOfBanknotes = 17;
        int sumBanknot = hundredsInBank * 100 + dozensInBank * 10 + unitsRequiredNumberOfBanknotes;
        System.out.println("сотен требуется = " + hundredsInBank);
        System.out.println("десяток требуется = " + dozensInBank * 10);
        System.out.println("единиц требуется = " + unitsRequiredNumberOfBanknotes);
        System.out.println("исходная сумма = " + sumBanknot);

    }
}