package HomeWork;

public class Main {

    public static void main(String[] args) {

        //Passpport

        IdentityCardTest myCard = new IdentityCardTest();
        myCard.name = "Dmyrtro";
        myCard.surname = "zadorozhniy";
        myCard.dateOfBirth = "12/08/2002";
        myCard.isActive = true;

        myCard.printCardInfo();

        //Country

        CountryTest Country = new CountryTest();
        Country.name = "Ukrain";
        Country.capital = "Kyiv";
        Country.prezident = "Zelenskiy";
        Country.population = 41_167_336;

        Country.printCountryInfo();

        //Car

        CarTest Car = new CarTest();
        Car.mark = "moskvich";
        Car.model = "2140";
        Car.year = 1976;
        Car.collor = "yellow";
        Car.bodyType = "four door sedan";
        Car.maxSpeed = 140;

        Car.printCarInfo();


    }
}
