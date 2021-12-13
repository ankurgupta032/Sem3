/*
Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
        Name of the class - Patient
        Member Variables - patientName(String),height(double),width(double)
        Member Function - double computeBMI()
        The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
        Create an object of the Patient class and check the results.
*/

class Patient {
    String name;
    double height;
    double weight;

    double computebmi(String name,double height,double weight) {
        return weight / (height * height);
    }
}
    class Test{
        public static void main(String[] args) {
            Patient ob1=new Patient();
           double b= ob1.computebmi("Ankur",23,34);
            System.out.println(b);
        }
}
