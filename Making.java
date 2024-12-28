public class Making {

    public static void main(String[] args) {
        
   

    //   if(a>b){
    //     System.out.println("This conditonn is if executed "+ a);
    //   }else{
    //     System.out.println("This is else condition "+b);
    //   }


    //   if(a==b){
    //     System.out.println("This is block of if a==b");
    //   }else if(a<b){
    //     System.out.println("This is block of if a<b");
    //   }else if(a!=b){
    //     System.out.println("This is block of if a!=b");
    //   }else{
    //     System.out.println("This is block of else");
    //   }
    int a =10;
    int b=9;
    int c =5;
    int d =5;
    int f =10;

        if(c!=d){
            if(c!=d){
                System.out.println("This condition is c!=d");
            }else{
                System.out.println("This condition is nested else");
            }
        }else{
            if(f!=a){
                System.out.println("This code is else condition and f==a");
            }else{
                System.out.println("This code is else condition nested else");

            }

        }

        switch (a) {
            case 1:
                System.out.println(" a value is 1");
                break;
            case 2:
                System.out.println(" a value is 2");
                break;
            case 9:
                System.out.println(" a value is 10");
                break;
            default:
                System.out.println("No value");
                break;
        }

    }
    
}
