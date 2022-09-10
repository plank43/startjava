public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        boolean computer = true;
        char core = 'I';
        byte weight = 2;
        short coreI5 = 4;
        int ram = 6;
        long osWindows = 7;
        float cpu = 2.33f;
        double systemType = 64.0;
        System.out.println("Это компьютер? " + computer);
        System.out.println("У компьютера следующие характеристики: " + core + " + core");
        System.out.println(weight + " + weight + ");
        System.out.println(coreI5 + " + coreI5 + ");
        System.out.println(ram + " + ram + ");
        System.out.println(osWindows + " + osWindows");
        System.out.println(cpu + " + cpu + ");
        System.out.println(systemType + " + systemType");
        
        System.out.println("\n 2.Расчет стоимости товара со скидкой");
        int bookPrice = 100;
        int penPrice = 200;
        double discount = 0.11;
        System.out.println("Сумма скидки = " + ((bookPrice + penPrice) * discount) + " рублей");
        System.out.println("Общая сумма товаров со скидкой = " + ((bookPrice + penPrice) * (1 - 0.11)) + " рублей");

        System.out.println("\n 3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n\n   J   a a  v   v  a a" + "\n\nJ  J  aaaaa  V V  aaaaa");
        System.out.println("\n JJ  a     a  V  a     a");
        
        System.out.println("\n 4.Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.print("первоначальные значения:maxByte = " + maxByte + ", maxShort = " + maxShort);
        System.out.println(", maxInt = " + maxInt + ", maxLong = " + maxLong);
        System.out.print("значения после инкремента:maxByte = " + (++maxByte) + ", maxShort = " + (++maxShort));
        System.out.print(", maxInt = " + (++maxInt));
        System.out.println(", maxLong = " + (++maxLong));
        System.out.print("значения после декремента:maxByte = " + (--maxByte) + ", maxShort = " + (--maxShort));
        System.out.println(", maxInt = " + (--maxInt) + ", maxLong = " + (--maxLong));

        System.out.println("\n 5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Замена переменных с помощью третьей переменной");
        System.out.println("Исходные данные: " + "num1 = " + num1 + " num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Текущие значения: " + "num1 = " + num1 + " num2 = " + num2);
        System.out.println("Замена переменных с помощью арифметических операций");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Текущие значения: " + "num1 = " + num1 + " num2 = " + num2);
        System.out.println("Замена переменных с помощью с помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Текущие значения: " + "num1 = " + num1 + " num2 = " + num2);
        
        System.out.println("\n 6.Вывод символов и их кодов");
        char symbol1 = 35;
        char symbol2 = 38;
        char symbol3 = 64;
        char symbol4 = 94;
        char symbol5 = 95;
        System.out.println((int) symbol1 + " " + symbol1);
        System.out.println((int) symbol2 + " " + symbol2);
        System.out.println((int) symbol3 + " " + symbol3);
        System.out.println((int) symbol4 + " " + symbol4);
        System.out.println((int) symbol5 + " " + symbol5);

        System.out.println("\n 7.Произведение и сумма цифр числа");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum / 10 % 10;
        int digit3 = srcNum % 10;
        System.out.println("сумма цифр числа " + srcNum + " = " + (digit1 + digit2 + digit3));
        System.out.println("произведение цифр числа " + srcNum + " = " + (digit1 * digit2 * digit3));

        System.out.println("\n 8.Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char space = ' ';
        char underline = '_';
        char lBracket = '(';
        char rBracket = ')';
        char slantLine = '\\';
        System.out.println(space + "" + space + "" + space + "" + space + "" + slash + "" + slantLine);
        System.out.println(space + "" + space + "" + space + "" + slash + "" + space + "" + space + "" + slantLine);
        System.out.print(space + "" + space + "" + slash + "" + underline + "" + lBracket + "" + space);
        System.out.println(rBracket + "" + slantLine);
        System.out.print(space + "" + slash + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + slantLine);
        System.out.print(slash + "" + underline + "" + underline + "" + underline + "" + underline + "" + slash);
        System.out.println(slantLine + "" + underline + "" + underline + "" + slantLine);

        System.out.println("\n 9.Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        digit1 = srcNum / 100;
        digit2 = srcNum / 10 % 10;
        digit3 = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит: " + digit1 + " сотен");
        System.out.println(digit2 + " десятков");
        System.out.println(digit3 + " единиц");

        System.out.println("\n 10.Преобразование секунд");
        int srcSec = 86399;
        int min = srcSec / 60 % 60;
        int sec = srcSec % 60;
        int hour = srcSec / 3600;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}