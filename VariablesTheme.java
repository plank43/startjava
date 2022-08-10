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
        int cost1 = 100;
        int cost2 = 200;
        double discount = 0.11;
        System.out.println("Сумма скидки = " + ((cost1 + cost2) * discount) + " рублей");
        System.out.println("Общая сумма товаров со скидкой = " + ((cost1 + cost2) * (1 - 0.11)) + " рублей");

        System.out.println("\n 3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n\n   J   a a  v   v  a a" + "\n\nJ  J  aaaaa  V V  aaaaa");
        System.out.println("\n JJ  a     a  V  a     a");
        
        System.out.println("\n 4.Отображение min и max значений числовых типов данных");
        byte max1 = 127;
        short max2 = 32767;
        int max3 = 2147483647;
        long max4 = 9223372036854775807L;
        System.out.print("первоначальные значения:max1 = " + max1 + ", max2 = " + max2);
        System.out.println(", max3 = " + max3 + ", max4 = " + max4);
        System.out.print("значения после инкремента:max1 = " + (++max1) + ", max2 = " + (++max2) + ", max3 = " + (++max3));
        System.out.println(", max4 = " + (++max4));
        System.out.print("значения после декремента:max1 = " + (--max1) + ", max2 = " + (--max2));
        System.out.println(", max3 = " + (--max3) + ", max4 = " + (--max4));

        System.out.println("\n 5.Перестановка значений переменных");
        int var1 = 2;
        int var2 = 5;
        System.out.println("Замена переменных с помощью третьей переменной");
        System.out.println("Исходные данные: " + "var1 = " + var1 + " var2 = " + var2);
        int var3 = var1;
        var1 = var2;
        var2 = var3;
        System.out.println("Текущие значения: " + "var1 = " + var1 + " var2 = " + var2);
        System.out.println("Замена переменных с помощью арифметических операций");
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("Текущие значения: " + "var1 = " + var1 + " var2 = " + var2);
        System.out.println("Замена переменных с помощью с помощью побитовой операции ^");
        var1 ^= var2;
        var2 ^= var1;
        var1 ^= var2;
        System.out.println("Текущие значения: " + "var1 = " + var1 + " var2 = " + var2);
        
        System.out.println("\n 6.Вывод символов и их кодов");
        var1 = 35;
        var2 = 38;
        var3 = 64;
        int var4 = 94;
        int var5 = 95;
        System.out.println(var1 + " " + (char) 35);
        System.out.println(var2 + " " + (char) 38);
        System.out.println(var3 + " " + (char) 64);
        System.out.println(var4 + " " + (char) 94);
        System.out.println(var5 + " " + (char) 95);

        System.out.println("\n 7.Произведение и сумма цифр числа");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum / 10 % 10;
        int digit3 = srcNum % 10;
        System.out.println("сумма цифр числа " + srcNum + " = " + (digit1 + digit2 + digit3));
        System.out.println("произведение цифр числа " + srcNum + " = " + (digit1 * digit2 * digit3));

        System.out.println("\n 8.Вывод на консоль ASCII-арт Дюка");
        String s1 = "/";
        String s2 = " ";
        String s3 = "_";
        String s4 = "(";
        String s5 = ")";
        String s6 = "\\";
        System.out.println(s2 + s2 + s2 + s2 + s1 + s6);
        System.out.println(s2 + s2 + s2 + s1 + s2 + s2 + s6);
        System.out.println(s2 + s2 + s1 + s3 + s4 + s2 + s5 + s6);
        System.out.println(s2 + s1 + s2 + s2 + s2 + s2 + s2 + s2 + s6);
        System.out.println(s1 + s3 + s3 + s3 + s3 + s1 + s6 + s3 + s3 + s6);

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