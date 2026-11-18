public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int a = Integer.parseInt(args[0]);
        for (int i = 0 ; i < a ; i++){
            double part = 1.0 / (2*i + 1);
            if (i % 2 ==0){
                approxPi = approxPi + part;
            }
             else {
                approxPi = approxPi - part;
             }
        }
        approxPi = 4 * approxPi;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
