package DSA_LAB_01;

public class Q11 {
    public static void main(String[] args) {
        Q11.stringE("Hello");
        Q11.stringE("Heele");
        Q11.stringE("Jameeeel");
    }
    private static boolean stringE(String str) {
        char[] let =  str.toCharArray();
        int count =0;
        for (int i=0;  i< let.length; i++){
            if (let[i]=='e'){
                count++;
            }
        }
        if (count==1 || count==3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        return false;
    }
}
