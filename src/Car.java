public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public static String Car (String brand ){
        if (brand != null){
            brand = brand;
        } else{
            brand = "default";
        }
        return brand;

}
public static int Car1 (int year1){
        if (year1 <= 0){
            year1 = 2000;
        }
        return year1;
}

    Car(String brand, String model, double engineVolume, String color, int year, String country){

        if (this.brand == null){
            this.brand = "default";
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        Car1(this.year);
        this.country = country;
        System.out.println(brand + " " + year + " " + model + " " + engineVolume + " " + color + " " + country);
    }

}
