public class ValueComparisionArg {
    public static void  main(String[] arg){
        int i = new Integer(arg[0]).intValue();
        int j = new Integer(arg[1]).intValue();

        System.out.println("First Value is equal with Second Value : " + (i==j));
        System.out.println("First Value is greater than Second Value : " + (i>j));
    }
}