public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
public static  void task1() {
    System.out.println("Задача 1");
    int dogLarge = 25000;
    System.out.println("Значение переменной" + " dogLarge" + " с типом" + " int " + "равно "  +  dogLarge);
    byte catSmall = 5;
    System.out.println("Значение переменной catSmall с типом byte равно " + catSmall);
    short parrot = 1000;
    System.out.println("Значение переменной parrot с типом short равно " + parrot);
    long butterfly=100000;
    System.out.println("Значение переменной butterfly с типом short равно " + butterfly);
    float  width=5.6f;
    System.out.println("Значение переменной width с типом float равно " + width);
    double length=10.2f;
    System.out.println("Значение переменной length с типом short равно " + length);}
    public static  void task2() {
        System.out.println("Задача 2");
    float a=27.12f;
    System.out.println(a);
    long b = 987678965549L;
    System.out.println(b);
    float c = 2.786f;
    System.out.println(c);
    short d = 569;
    System.out.println(d);
    short e = -159;
    System.out.println(e);
    short f = 27897;
    System.out.println(f);
    byte h = 67;
    System.out.println(h);}
    public static  void task3() {
        System.out.println("Задача 3");
    byte LudPavl = 23; // инициализация количества учеников в классе
    byte AnSerg = 27; // инициализация количества учеников в классе
    byte EkatAndr = 30; // инициализация количества учеников в классе
    short copybook = 480; // инициализация количество тетрадей
    byte totalStudent = (byte) (LudPavl + AnSerg + EkatAndr); // расчет количества всех учеников
    byte copybookOnStudent = (byte) (copybook/totalStudent); // расчет количества тетрадей на 1 ученика
        System.out.println("На каждого ученика рассчитано " + copybookOnStudent + " листов бумаги.");}
    public static  void task4() {
        System.out.println("Задача 4");
    byte bottle = 16; // инициализация количество бутылок произведенных за 2 минуты
    byte timeMin = 2; // инициализация количества времени для производства 16 бутылок
    byte performanceBottleTime = (byte) (bottle/timeMin); //расчет производительности за 1 минуту
    byte OneSpecifiedIntervalMinute = 20; // инициализация количества времени в 1 временном интервале
    byte TwoSpecifiedIntervalDay = 1; // инициализация количества времени во 2 временном интервале
    byte ThreeSpecifiedIntervalDay = 3; // инициализация количества времени в 3 временном интервале
    byte FourSpecifiedIntervalMonth = 1; // инициализация количества времени в 4 временном интервале
    byte minuteHour = 60; // количество минут в часе
    byte hourDay = 24; // количество часов в сутках
    byte dayMonth = 30; // количество дней в месяце
    short OnePerformanceBottle = (short) (performanceBottleTime * OneSpecifiedIntervalMinute); // расчет количества произведенных бутылок
    System.out.println("За " + OneSpecifiedIntervalMinute + " минут машина произвела " + OnePerformanceBottle + " штук бутылок.");
    short TwoSpecifiedIntervalMinute = (short) (TwoSpecifiedIntervalDay * hourDay * minuteHour); // расчет количества минут в заданном интервале времени
    short TwoPerformanceBottle = (short) (TwoSpecifiedIntervalMinute * performanceBottleTime); // расчет количества произведенных бутылок
    System.out.println("За " + TwoSpecifiedIntervalDay + " сутки машина произвела " + TwoPerformanceBottle + " штук бутылок.");
    short ThreeSpecifiedIntervalMinute = (short) (ThreeSpecifiedIntervalDay * hourDay * minuteHour); // расчет количества минут в заданном интервале времени
    int ThreePerformanceBottle = (ThreeSpecifiedIntervalMinute * performanceBottleTime); // расчет количества произведенных бутылок
    System.out.println("За " + ThreeSpecifiedIntervalDay + " дня машина произвела " + ThreePerformanceBottle + " штук бутылок.");
    int FourSpecifiedIntervalMinute = (short) (FourSpecifiedIntervalMonth * dayMonth * hourDay * minuteHour); // расчет количества минут в заданном интервале времени
    int FourPerformanceBottle = (short) (FourSpecifiedIntervalMinute * performanceBottleTime); // расчет количества произведенных бутылок
    System.out.println("За " + FourSpecifiedIntervalMonth + " месяц машина произвела " + FourPerformanceBottle + " штук бутылок.");}
    public static  void task5() {
        System.out.println("Задача 5");
    byte potTotal = 120; // инициализация потребности количества банок красок
    byte oneClassPotWhite = 2; // инициализация количества банок белой краски на 1 класс
    byte oneClassPotBrown = 4; // инициализация количества банок коричневой краски на 1 класс
    byte oneClassPotTotal = (byte) (oneClassPotBrown + oneClassPotWhite); // Сколько банок красок уходит на 1 класс
    byte totalClassSchool = (byte) (potTotal / oneClassPotTotal); // Всего классов в школе
    byte potTotalWhite = (byte) (totalClassSchool * oneClassPotWhite); // сколько банок белой краски на 1 класс
    byte potTotalBrown = (byte) (totalClassSchool * oneClassPotBrown); // сколько банок коричневой краски на 1 класс
    System.out.println("В школе, где " + totalClassSchool + " классов, нужно " + potTotalWhite + " банок белой краски и " + potTotalBrown + " банок коричневой краски.");}
    public static  void task6() {
        System.out.println("Задача 6");
    byte quantityBanana = 5; // инициализация количества бананов
    byte weightBananaGrams = 80; // инициализация веса одного банана
    float weightBananaGramsTotal = (float) (quantityBanana * weightBananaGrams); // расчет веса всех бананов
    short volumeMilkMl = 200; // инициализация количества молока в мл
    float gramsInMl = 1.05f; // инициализация количество грамм в 1 мл
    float weightMilkGramsTotal = volumeMilkMl * gramsInMl; // расчет веса молока
    byte quantityIceCreamSundae = 2; // инициализация количество брикетов мороженного
    byte weightIceCreamSundaeGrams = 100; // инициализация веса 1 брикета мороженного
    float weightIceCreamSundaeTotal = (float) (quantityIceCreamSundae * weightIceCreamSundaeGrams); // расчет веса всего мороженного
    byte quantityEgg = 4; // инициализация количества яиц
    byte weightEggGrams = 70; // инициализация веса 1 яйца
    float weightEggGramsTotal = (float) (quantityEgg * weightEggGrams); // расчет веса всего мороженного
    float weightBreakfastTotalGrams = (weightBananaGramsTotal + weightMilkGramsTotal + weightIceCreamSundaeTotal+ weightEggGramsTotal); // расчет веса всего завтрака
    short gramsInKilogram = 1000; // количество грамм в 1 кг
    float weightBreakfastTotalKg =  (weightBreakfastTotalGrams / gramsInKilogram); // перевод веса из грамм в кг
    System.out.println(" Вес завтрака спортсмена составляет " + weightBreakfastTotalGrams + " грамма или " + weightBreakfastTotalKg + " килограмм.");}
}
