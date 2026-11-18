public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int[] feb = new int[x];
        feb[0] = 1;
        feb[1] = 1;
        for(int i=2 ; i<x ; i++){
            feb[i] = feb[i-1] + feb[i-2] ;
        }
         
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(feb[i]);
            if (feb[i] % 2 != 0 ){
                numOdd++ ;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
