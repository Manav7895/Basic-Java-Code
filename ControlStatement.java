public class ControlStatement {
    public static void main(String[] args) {
        

        int i;

        //For -Loop
        for(i=1;i<=10;i++){
            System.out.println("This value of i "+i);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        int j;
        for(j=10;j>=0;j--){
            System.out.println("This value of j-- "+ j);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        int a =10;
        //While-Loop
        while(a!=0){
            System.out.println("This value of in while Loop  "+ a);
            a--;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        //While Loop
        int b=10;
        while (b!=20) {
            if(b==12){
                System.out.println("This value of a with break ++ increment in while Loop  "+ b);
                b++;
                continue;
            }
            b++;
        }

        System.out.println();
        System.out.println();
        System.out.println();


        //D- While Loop
        int c =10;
        do{
            System.out.println("This value of c "+ c);

            c--;
        }while(c!=2);
        
        
    }
}
