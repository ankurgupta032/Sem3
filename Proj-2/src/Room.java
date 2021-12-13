/*Q2. Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values
    to indicate whether the appliance is ON or OFF. Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message.
    If the total power consumed is more than 2kW, show a message Overload.
    Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt.*/
class room{
    boolean ac;
    boolean theatre;
    boolean fan;
    boolean light;

    public room(boolean ac, boolean theatre, boolean fan, boolean light) {
        this.ac = ac;
        this.theatre = theatre;
        this.fan = fan;
        this.light = light;
    }
    public void isOverload(){
        int load = 0;
        if(ac==true){
            load = load + 1200;
        }
        if(theatre == true){
            load = load + 600;
        }
        if(fan == true){
            load = load + 400;
        }
        if(light == true){
            load = load + 100;
        }
        if(load>=2000){
            System.out.println("Overload");
        }
        else{
            System.out.println("Not Overload");
        }
    }
}
class Ankur{
    public static void main(String[] args) {
        room r1=new room(false,true,true,true);
        r1.isOverload();
    }
}