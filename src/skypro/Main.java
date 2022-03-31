package skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int wheel = 7;
        byte headlight = 3;
        short door = 10;
        long glass = 150L;
        double engineWeight = 4.5;
        float diskWeight = 1.5f;
        boolean wheelsBurst = wheel > 8;
        char bar = 35;

    // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weighOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weighOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightDifference);

    //  Задание 3
       int banana = 5;
       int milk = 200;
       int ice = 2;
       int egg = 4;
       int weightOfAllBananas = banana * 80;
       System.out.println("общий вес бананов" + weightOfAllBananas);
       int weightOfAllMilk = milk / 100 * 105;
       System.out.println("общий вес молока" +  weightOfAllMilk);
       int weightOfAllIce = ice * 100;
       System.out.println("общий вес мороженного" + weightOfAllIce);
       int weightOfAllEggs = egg * 70;
       System.out.println("общий вес яиц" + weightOfAllEggs);
       System.out.println("общий вес завтрака" + weightOfAllBananas + weightOfAllMilk + weightOfAllIce + weightOfAllEggs);

    }
}
