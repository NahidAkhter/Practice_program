public class DigitalRoot {

    public static void main(String[] args) {
       // System.out.println(String.valueOf(121).length());

       System.out.println(getDigitalRoot(434));
    }

    private static int getDigitalRoot(int n){

            if(n==0) return 0;  if(n==1) return 1;
            return String.valueOf(getDigitalRoot(n / 10) + (n % 10)).length() == 1 ? n : getDigitalRoot(n / 10) + (n % 10);
    }

}
