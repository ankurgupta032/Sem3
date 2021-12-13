/*7-Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)*/
 class cmdex {

    public static void main(String[] args) {
        int k = args.length;
        if(k==0) {
            System.out.println("No values");
        }else {
            System.out.print(args[0]);
            for(int i=1;i<k;i++){
                System.out.print(","+ args[i]);
            }
        }
    }
}

