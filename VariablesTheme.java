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
        int x = 100;
        int y = 200;
        double discount = 0.11;
        System.out.println("Сумма скидки = " + ((x + y) * discount) + " рублей");
        System.out.println("Общая сумма товаров со скидкой = " + ((x + y) * (1 - 0.11)) + " рублей");

        System.out.println("\n 3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n\n   J   a a  v   v  a a" + "\n\nJ  J  aaaaa  V V  aaaaa");
        System.out.println("\n JJ  a     a  V  a     a");
        
        System.out.println("\n 4.Отображение min и max значений числовых типов данных");
        byte by = 127;
        short s = 32767;
        int i = 2147483647;
        long ln = 9223372036854775807L;
        System.out.println("первоначальные значения:by = " + by + ", s = " + s + ", i = " + i + ", ln = " + ln);
        System.out.println("значения после инкремента:by = " + (++by) + ", s = " + (++s) + ", i = " + (++i) + ", ln = " + (++ln));
        System.out.println("значения после декремента:by = " + (--by) + ", s = " + (--s) + ", i = " + (--i) + ", ln = " + (--ln));

        System.out.println("\n 5.Перестановка значений переменных");
        int i1 = 2;
        int i2 = 5;
        System.out.println("Замена переменных с помощью третьей переменной");
        System.out.println("Исходные данные: " + "i1 = " + i1 + " i2 = " + i2);
        int i3 = i1;
         i1 = i2;
         i2 = i3;
        System.out.println("Текущие значения: " + "i1 = " + i1 + " i2 = " + i2);
        System.out.println("Замена переменных с помощью арифметических операций");
         i1 -= 3;
         i2 += 3;
        System.out.println("Текущие значения: " + "i1 = " + i1 + " i2 = " + i2);
        System.out.println("Замена переменных с помощью с помощью побитовой операции ^");
        i1 ^= i2;
        i2 ^= i1;
        i1 ^= i2;
        System.out.println("Текущие значения: " + "i1 = " + i1 + " i2 = " + i2);
        
        System.out.println("\n 6.Вывод символов и их кодов");
        int a1 = 35;
        int a2 = 38;
        int a3 = 64;
        int a4 = 94;
        int a5 = 95;
        System.out.println(a1 + " " + (char)35);
        System.out.println(a2 + " " + (char)38);
        System.out.println(a3 + " " + (char)64);
        System.out.println(a4 + " " + (char)94);
        System.out.println(a5 + " " + (char)95);

        System.out.println("\n 7.Произведение и сумма цифр числа");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit3 = srcNum % 10;
        int digit2 = srcNum / 10 % 10;
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
        srcNum = 86399;
        int min = srcNum / 60;
        int sec = srcNum % 60;
        int hour = min / 60;
        min = min % 60;
        System.out.println(hour + ":" + min + ":" + sec);



    }
}