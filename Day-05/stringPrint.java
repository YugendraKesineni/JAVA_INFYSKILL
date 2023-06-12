public class stringPrint {
    public static void main(String[] args){
        String myString = "INFYSKILL";

        for(int i = myString.length() - 1; i >= 0 ;i = i - 1){
            System.out.print(myString.charAt(i));
        }
        System.out.println();
    }
}

