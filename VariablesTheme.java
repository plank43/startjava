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
    System.out.println("У компьютера следующие характеристики: " + "core = " + core + ", weight = " + weight + ", coreI5 = " + coreI5 + ", ram= " + ram + ", osWindows = " + osWindows + ", cpu = " + cpu + ", systemType = " + systemType);
    
    System.out.println("\n 2.Расчет стоимости товара со скидкой");
    int x = 100;
    int y = 200;
    double discount = 0.11;
    System.out.println("Сумма скидки = " + ((x + y) * discount) + "\n рублей" + "Общая сумма товаров со скидкой = " + ((x + y) * (1 - 0.11)) + " рублей");

    System.out.println("\n 3.Вывод на консоль слова JAVA");
    System.out.println("   J    a  v     v  a" + "\n\n   J   a a  v   v  a a" + "\n\nJ  J  aaaaa  V V  aaaaa" + "\n\n JJ  a     a  V  a     a");
    
    System.out.println("\n 4.Отображение min и max значений числовых типов данных");
    byte by = 127;
    short s = 32767;
    int i = 2147483647;
    long ln = 9223372036854775807L;
    System.out.println("первоначальные значения: by = " + by + ", s = " + s + ", i = " + i + ", ln = " + ln);
    System.out.println("значения после инкремента: by = " + (++by) + ", s = " + (++s) + ", i = " + (++i) + ", ln = " + (++ln));
    System.out.println("значения после декремента: by = " + (--by) + ", s = " + (--s) + ", i = " + (--i) + ", ln = " + (--ln));

    System.out.println("\n 5.Перестановка значений переменных");
    int q = 1;
    int w = 2;
    System.out.println("Замена переменных с помощью третьей переменной");
    System.out.println("Исходные данные: " + "q = " + q + " w = " + w);
    int c = q;
     q = w;
     w = c;
    System.out.println("Текущие значения: " + "q = " + q + " w = " + w);
    System.out.println("Замена переменных с помощью арифметических операций");
     q -= 1;
     w += 1;
    System.out.println("Текущие значения: " + "q = " + q + " w = " + w);
    System.out.println("Замена переменных с помощью с помощью побитовой операции ^");
    q = q ^ w;
    w = q ^ w;
    q = q ^ w;
    System.out.println("Текущие значения: " + "q = " + q + " w = " + w);
    
    System.out.println("\n 6.Вывод символов и их кодов");
    int a1 = 35;
    int a2 = 38;
    int a3 = 64;
    int a4 = 94;
    int a5 = 95;
    System.out.println(a1 + " = #");
    System.out.println(a2 + " = &");
    System.out.println(a3 + " = @");
    System.out.println(a4 + " = ^");
    System.out.println(a5 + " = _");

    System.out.println("\n 7.Произведение и сумма цифр числа");
    int num = 345;
    int num1 = num / 100;
    int num3 = num % 10;
    int num2 = num / 10 % 10;
    System.out.println("сумма цифр числа 345 = " + (num1 + num2 + num3));
    System.out.println("произведение цифр числа 345 = " + (num1 * num2 * num3));

    System.out.println("\n 8.Вывод на консоль ASCII-арт Дюка");
    char s1 = '/';
    char s2 = ' ';
    char s3 = '_';
    char s4 = '(';
    char s5 = ')';
    char s6 = '\\';
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s1);
    System.out.println(s6);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s1);
    System.out.print(s2);
    System.out.print(s2);
    System.out.println(s6);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s1);
    System.out.print(s3);
    System.out.print(s4);
    System.out.print(s2);
    System.out.print(s5);
    System.out.println(s6);
    System.out.print(s2);
    System.out.print(s1);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.print(s2);
    System.out.println(s6);
    System.out.print(s1);
    System.out.print(s3);
    System.out.print(s3);
    System.out.print(s3);
    System.out.print(s3);
    System.out.print(s1);
    System.out.print(s6);
    System.out.print(s3);
    System.out.print(s3);
    System.out.println(s6);

    System.out.println("\n 9.Отображение количества сотен, десятков и единиц числа");
    int numb = 123;
    int numb1 = numb / 100;
    int numb2 = numb / 10 % 10;
    int numb3 = numb % 10;
    System.out.println("Число 123 содержит: " + numb1 + " сотен");
    System.out.println(numb2 + " десятков");
    System.out.println(numb3 + " единиц");

    System.out.println("\n 10.Преобразование секунд");
    int sec = 86399;
    int hour = sec / 3600;
    int min = (sec - (hour * 3600)) / 60;
    int sec1 = sec -  hour * 3600 -  min * 60;
    System.out.println(hour + ":" + min + ":" + sec1);



    }
}