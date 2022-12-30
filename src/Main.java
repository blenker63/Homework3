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
    long b = 987678965549l;
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
    byte LudPavl = 23;
    byte AnSerg = 27;
    byte EkatAndr = 30;
    short copybook = 480;
    byte totalStudent = (byte) (LudPavl + AnSerg + EkatAndr);
    byte copybookOnStudent = (byte) (copybook/totalStudent);
        System.out.println("На каждого ученика рассчитано " + copybookOnStudent + " листов бумаги.");}
    public static  void task4() {
        System.out.println("Задача 4");
    byte bottle = 16;
    byte timeMin = 2;
    byte performanceBottleTime = (byte) (bottle/timeMin); //расчет производительности за 1 минуту
    byte OneSpecifiedIntervalMinute = 20;
    byte TwoSpecifiedIntervalDay = 1;
    byte ThreeSpecifiedIntervalDay = 3;
    byte FourSpecifiedIntervalMonth = 1;
    byte minuteHour = 60; // количество минут в часе
    byte hourDay = 24; // количество часов в сутках
    byte dayMonth = 30; // количество дней в месяце
    short OnePerformanceBottle = (short) (performanceBottleTime * OneSpecifiedIntervalMinute);
    System.out.println("За " + OneSpecifiedIntervalMinute + " минут машина произвела " + OnePerformanceBottle + " штук бутылок.");
    short TwoSpecifiedIntervalMinute = (short) (TwoSpecifiedIntervalDay * hourDay * minuteHour);
    short TwoPerformanceBottle = (short) (TwoSpecifiedIntervalMinute * performanceBottleTime);
    System.out.println("За " + TwoSpecifiedIntervalDay + " сутки машина произвела " + TwoPerformanceBottle + " штук бутылок.");
    short ThreeSpecifiedIntervalMinute = (short) (ThreeSpecifiedIntervalDay * hourDay * minuteHour);
    int ThreePerformanceBottle = (short) (ThreeSpecifiedIntervalMinute * performanceBottleTime);
    System.out.println("За " + ThreeSpecifiedIntervalDay + " дня машина произвела " + ThreePerformanceBottle + " штук бутылок.");
    int FourSpecifiedIntervalMinute = (short) (FourSpecifiedIntervalMonth * dayMonth * hourDay * minuteHour);
    int FourPerformanceBottle = (short) (FourSpecifiedIntervalMinute * performanceBottleTime);
    System.out.println("За " + FourSpecifiedIntervalMonth + " месяц машина произвела " + FourPerformanceBottle + " штук бутылок.");}
    public static  void task5() {
        System.out.println("Задача 5");
    byte potTotal = 120;
    byte oneClassPotWhite = 2;
    byte oneClassPotBrown = 4;
    byte oneClassPotTotal = (byte) (oneClassPotBrown + oneClassPotWhite); // Сколько банок красок уходит на 1 класс
    byte totalClassSchool = (byte) (potTotal / oneClassPotTotal); // Всего классов в школе
    byte potTotalWhite = (byte) (totalClassSchool * oneClassPotWhite); // сколько банок белой краски на 1 класс
    byte potTotalBrown = (byte) (totalClassSchool * oneClassPotBrown); // сколько банок коричневой краски на 1 класс
    System.out.println("В школе, где " + totalClassSchool + " классов, нужно " + potTotalWhite + " банок белой краски и " + potTotalBrown + " банок коричневой краски.");}
    public static  void task6() {
        System.out.println("Задача 6");
    byte quantityBanana = 5;
    byte weightBananaGrams = 80;
    float weightBananaGramsTotal = (float) (quantityBanana * weightBananaGrams);
    short volumeMilkMl = 200;
    float gramsInMl = 1.05f;
    float weightMilkGramsTotal = (float) (volumeMilkMl * gramsInMl);
    byte quantityIceCreamSundae = 2;
    byte weightIceCreamSundaeGrams = 100;
    float weightIceCreamSundaeTotal = (float) (quantityIceCreamSundae * weightIceCreamSundaeGrams);
    byte quantityEgg = 4;
    byte weightEggGrams = 70;
    float weightEggGramsTotal = (float) (quantityEgg * weightEggGrams);
    float weightBreakfastTotalGrams = (float) (weightBananaGramsTotal + weightMilkGramsTotal + weightIceCreamSundaeTotal+ weightEggGramsTotal);
    short gramsInKilogram = 1000;
    float weightBreakfastTotalKg = (float) (weightBreakfastTotalGrams / gramsInKilogram);
    System.out.println(" Вес завтрака спортсмена составляет " + weightBreakfastTotalGrams + " грамма или " + weightBreakfastTotalKg + " килограмм.");}
}
