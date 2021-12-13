/*Create a class Car having properties manufacturer and price. Create three instances of the class and display the details of
        each car sorted with respect to the price.
*/
        import java.util.*;
 class car{
        String manufacture;
        int price;
        car(String name, int price){
            this.manufacture = name;
            this.price = price;
        }
    }
 class Ass2
    {
        public static void main(String[] args) {
            car c1 = new car("BMW",2345);
            car c2 = new car("audi",2745);
            car c3 = new car("lambo",2445);
            int arr[] = new int[3];
            arr[0] = c1.price;
            arr[1] = c2.price;
            arr[2] = c3.price;
            String arr1[] = new String[3];
            arr1[0] = c1.manufacture;
            arr1[1] = c2.manufacture;
            arr1[2] = c3.manufacture;
            Arrays.sort(arr);
            for(int i=0;i<3;i++){
                System.out.println(arr[i]);
                System.out.println(arr1[i]);
            }
        }
    }



