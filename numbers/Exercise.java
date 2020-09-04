public class Exercise{

    public static void main(String[] args){

    // The methods you want to run:

      System.out.print(factorial(5));
    
    }

    public static void printMultiplesOfSevenA(){
      // Exer 2.1: 
      // Just adding 7 to i and printing it out

        for(int i = 7; i<500; i=i+7){
            System.out.println(i);
        }
    }

    public static void printMultiplesOfSevenB(int n){
      // Exer 2.2:
      // running through all the numbers and print it out if it divides with 7
      // Note: This one is computationally harder than the A-version of printMultiples.

        for(int i = 7; i<n ; i++){
            if(i%7 == 0)
                System.out.println(i);
        }
    }

    public static void printMultiplesOf(int k, int n){
        //Exer 2.3
        //take in k and and and start at that number. Then print it out, add k and print again. Do this while i is less than n.

        for(int i = k; i<n; i=i+k){
            System.out.println(i);
        }
    }

    public static void sumUpTo(int n){
        // Exer 2.4
        // We calculate som of all numbers lower than n, by running through them all and add them to the sum.
        int sum = 0;
        for(int i = 0; i<n;i++)
            sum = sum+i;
        
        System.out.println(sum);
    }

    public static void sumBeyond(int k){
        /* Exer 2.5
        
                n | 1 | 2 | 3 | 4  | 5  | 6  | 7  | 8  | 9  |  10
                -------------------------------------------
            sum(n)| 1 | 3 | 6 | 10 | 15 | 21 | 28 | 36 | 45 | 55 
        
        So, we are after the smallest n, where sum(n) is bigger than k.
        Example:
            k = 14 than the smallest n where sum(n) is bigger than k is n = 5

        */

        int sum = 0;
        int count = 0;
        while(sum < k){
            count++;
            sum = sum+count;
        }
    
        System.out.println(count);
    
    }

    public static void sumBetween(int m, int k){
        /* Exer 2.6
           Sum of numbers between m and k.  
        
         */
       
        int sum = 0;

        for(int i = m; i<=k; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void sumEven(int n){
        // Exer 2.7
        // Sum of all even numbers lower than n.
        // To save computation we add every other number together.

        int sum = 0;

        for(int i = 0; i<n ; i = i+2){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static int factorial(int n){
        /* It didnt take long for Luíz, to blow our minds with a recursion exercise.    
           Now, you surely can solve this with a forloop. But the "mathyness" of the factorial function
           kinda calls for this special kind of function in programming called recursion. All you need to know, is that its a function that calls itself.
           Here we go:

           factorial(5) is defined by 5*4*3*2*1
           We see that factorial(4) is 4*3*2*1
           Therefor factorial(5) = 5*fact(4) = 5*4*fact(3) = 5*4*3*fact(2) = 5*4*3*2*1
           
           In other words:
        */        
        if(n == 1)
            return 1;

        return n*factorial(n-1); 
    }

}