package Strings;

public class StringQuestions {

    public static void main(String[] args) {

        testStringBuilderStringBuffer();
    }

    static String interpretString(String command){

        return  (command.replace("()", "o")).replace("(al)", "al");
    }

   static void testStringBuilderStringBuffer(){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        long strBuilderStartTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - strBuilderStartTime) + "ms");

    }
}
