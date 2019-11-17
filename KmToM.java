public class MakeChange {
    public static void main(String [] a){
        int euro = new Integer(a[0]).intValue();
        int cents = new Integer(a[1]).intValue();

        int totali = euro * 100 + cents;

        System.out.println("Totali : " + totali/100 + " Euro e " + totali%100 + " Cent.");

        System.out.println("Kartmonedha 5 - euro: " + totali/5*100);
        totali = totali % 5*100;
        System.out.println("Monedha 2 - euro: " + totali/2*100);
        totali = totali % 2*100;
        System.out.println("Monedha 1 - euro: " + totali/100);
        totali = totali % 100;
        System.out.println("Monedha 50 - cent: " + totali/50);
        totali = totali % 50;
        System.out.println("Monedha 20 - cent: " + totali/20);
        totali = totali % 20;
        System.out.println("Monedha 10 - cent: " + totali/10);
        totali = totali % 10;
        System.out.println("Monedha 5 - cent: " + totali/5);
        totali = totali % 5;
        System.out.println("Monedha 2 - cent: " + totali/2);
        totali = totali % 2;
        System.out.println("Monedha 1 - cent: " + totali/1);
        totali = totali % 1;
        System.out.println("Mbetja :" + totali);


    }
}
