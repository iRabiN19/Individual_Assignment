package individual_assignment;

public class Ans_4 {
    public static void main(String[] args) {
        int num=7;

        int i,j,k=1;

        for(i=1; i<=num;i++){
            for( j=1;j<=i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}


