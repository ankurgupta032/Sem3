public interface LibraryUser {
    public abstract void registerAccount();
    public  abstract void requestBook();
}

class KidUsers implements LibraryUser {
    private int age;
    private String booktype;
    void setValues(int x,String y){
        age=x;
        booktype=y;
    }


    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered into the kids account");
        } else {
            System.out.println("Age must be less then 12 to register as kid");
        }
    }

    @Override
    public void requestBook() {
        if (booktype.equals("kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

    class AdultUsers implements LibraryUser {
        private int age;
        private String booktype;

        void setValues(int x,String y){
            age=x;
            booktype=y;
        }

        @Override
        public void registerAccount() {
            if (age > 12) {
                System.out.println("You have successfully registered into the adult account");
            } else {
                System.out.println("Age must be greater then 12 to register as adult");
            }
        }

        @Override
        public void requestBook() {
            if (booktype.equals("Fiction")) {
                System.out.println("Book Issued successfully, please return the book within 7 days");
            } else {
                System.out.println("Oops, you are allowed to take only adult fiction books");
            }
        }
}

class LibraryInterfaceDemo{
    public static void main(String[] args) {
        KidUsers k1=new KidUsers();
        AdultUsers a1=new AdultUsers();
        k1.setValues(10,"Kids");
        a1.setValues(18,"Fiction");
        a1.registerAccount();
        a1.requestBook();
        k1.registerAccount();
        k1.requestBook();

        k1.setValues(5,"Kids");
        a1.setValues(23,"Fiction");
        a1.registerAccount();
        a1.requestBook();
        k1.registerAccount();
        k1.requestBook();

    }
}