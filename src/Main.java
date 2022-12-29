public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
public static  void task1() {
    System.out.println("Задача 1");
    int dogLarge = 25000;
    System.out.println("Значение переменной" + " dogLarge" + " с типом" + " int " + "равно "  +  dogLarge);
    byte catSmall = 5;
    System.out.println("Значение переменной catSmall с типом byte равно " + catSmall);
    short parrot = 1000;
    System.out.println("Значение переменной parrot с типом shourt равно " + parrot);
    long butterfly=100000;
    System.out.println("Значение переменной butterfly с типом shourt равно " + butterfly);
    float  width=5.6f;
    System.out.println("Значение переменной width с типом float равно " + width);
    double length=10.2f;
    System.out.println("Значение переменной length с типом shourt равно " + length);}
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
    byte perfomanceBottleTime = (byte) (bottle/timeMin);
    byte OneSpecifiedIntervalMinute = 20;
    byte TwoSpecifiedIntervalDay = 1;
    byte ThreeSpecifiedIntervalDay = 3;
    byte FourSpecifiedIntervalMonth = 1;
    short OnePerfomanceBottle = (short) (perfomanceBottleTime * OneSpecifiedIntervalMinute);
    System.out.println("За " + OneSpecifiedIntervalMinute + " минут машина произвела " + OnePerfomanceBottle + " штук бутылок.");
    short TwoSpecifiedIntervalMinute = (short) (TwoSpecifiedIntervalDay * 24 * 60);
    short TwoPerfomanceBottle = (short) (TwoSpecifiedIntervalMinute * perfomanceBottleTime);
    System.out.println("За " + TwoSpecifiedIntervalDay + " сутки машина произвела " + TwoPerfomanceBottle + " штук бутылок.");
    short ThreeSpecifiedIntervalMinute = (short) (ThreeSpecifiedIntervalDay * 24 * 60);
    int ThreePerfomanceBottle = (int) (ThreeSpecifiedIntervalMinute * perfomanceBottleTime);
    System.out.println("За " + ThreeSpecifiedIntervalDay + " дня машина произвела " + ThreePerfomanceBottle + " штук бутылок.");
    int FourSpecifiedIntervalMinute = (int) (FourSpecifiedIntervalMonth * 30 * 24 * 60);
    int FourPerfomanceBottle = (int) (FourSpecifiedIntervalMinute * perfomanceBottleTime);
    System.out.println("За " + FourSpecifiedIntervalMonth + " месяц машина произвела " + FourPerfomanceBottle + " штук бутылок.");}
}
