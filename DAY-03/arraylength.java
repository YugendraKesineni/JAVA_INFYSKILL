// Array.length
public class arraylength{
    public static void main(String[] args){
        int scores[] = new int[10];

        scores[0] = 90;
        scores[1] = 85;
        scores[2] = 70;

        scores[9] = 65;

        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }
    }
}