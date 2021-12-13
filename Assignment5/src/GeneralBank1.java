abstract public class GeneralBank1 {
    abstract int getSavinginterestrate();
    abstract double  getFixedInterestRate();
}
class Icici extends GeneralBank1{
    @Override
    int getSavinginterestrate() {
        return 4;
    }

    @Override
    double getFixedInterestRate() {
        return 8.5;
    }
}
class Kotmbank extends GeneralBank1{
    @Override
    int getSavinginterestrate() {
        return 6;
    }

    @Override
    double getFixedInterestRate() {
        return 9;
    }
}
class Main{
    public static void main(String[] args) {
        Icici i1=new Icici();
        Kotmbank k1=new Kotmbank();
        GeneralBank1 g1=new Icici();
        GeneralBank1 g2=new Kotmbank();
        System.out.println(i1.getFixedInterestRate());
        System.out.println(i1.getSavinginterestrate());
        System.out.println(k1.getSavinginterestrate());
        System.out.println(k1.getFixedInterestRate());
        System.out.println(g1.getFixedInterestRate());
        System.out.println(g1.getSavinginterestrate());
        System.out.println(g2.getFixedInterestRate());
        System.out.println(g2.getSavinginterestrate());
    }
}
