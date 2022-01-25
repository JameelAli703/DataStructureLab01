package DSA_LAB_01;

public class Q16 {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++){
            for (int k=6;k>=i;k--){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=6;i>=1;i--){
            for (int k=6;k>=i;k--){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
