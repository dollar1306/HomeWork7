public class FactoryCar {


    public Drivable getCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("FIAT")) {
            return new Fiat();
        } else if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (carType.equalsIgnoreCase("Porsche")) {
            return new Porsche();
        }
        return null;
    }
}