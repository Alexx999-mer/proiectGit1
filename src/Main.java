public class Main {
   /*public static void main(String[] args) {
        TV tvPhi = new TV("Philips");
        AirConditioner air = new AirConditioner("Bosch");
        CoffeeMachine coffee = new CoffeeMachine("Krups");

        tvPhi.turnOn();
        air.turnOn();
        coffee.turnOn();

        tvPhi.turnOn();
        air.turnOn();
        coffee.turnOn();
    }*/
   public static void main(String[] args) {
       Alexa alexa = new Alexa();
       TV tvPhi = new TV("Philips");
       AirConditioner air = new AirConditioner("Bosch");
       CoffeeMachine coffee = new CoffeeMachine("Krups");

       alexa.turnOn();

       alexa.addDevice(tvPhi);
       alexa.addDevice(air);
       alexa.addDevice(coffee);

       alexa.printDevices();

       alexa.removeDevice(coffee);

       alexa.printDevices();

       alexa.turnOn(tvPhi);
       alexa.turnOn(air);
   }
}
