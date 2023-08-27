public class SquareRoot {
    public static double validate(int number,int precision){
        int res = 0;
        double numericalPart=0;
        for(int i =1;i<number/2;i++){
            int temp = i*i;
            if(temp>number){
                break;
            }
            numericalPart=i;
        }
        //for SquareRoot;
        double increement = 0.1;
        for(int i = 0;i<precision;i++){
            while (numericalPart*numericalPart<number){
                numericalPart += increement;
            }
            numericalPart -= increement;
            increement = increement/10;
        }

        return numericalPart;
    }
    public static void main(String args[]){
        int find = 50;
        int precision = 5;
        double result = validate(find,precision);
        System.out.printf("%.5f%n",result);
    }
}
