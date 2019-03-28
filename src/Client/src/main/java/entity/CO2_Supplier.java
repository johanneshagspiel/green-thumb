package entity;

public class CO2_Supplier {
    // returns the amount of kg CO2 you spent while cycling
    public static double bike(int km){
        if(km < 0){
            return 0;
        }
        return 0.016*km;
    }

    //returns the amount of kg co2 you spent while riding the average car
    public static double car(int km){
        if(km < 0){
            return 0;
        }
        return 0.271 * km;
    }

    //returns the amount of co2 you spent taking the bus
    public static double publicTransport(int km){
        if (km < 0) {
            return 0;
        }
        return .101 * km;
    }

    //shows how much co2 you save taking the bike instead of the car
    public static double bikeVsCar(int km){
        double difference = car(km) - bike(km);
        return difference;
    }

    //shows how much co2 you save taking the pulbic transport instead of the car
    public static double publicTransportVsCar(int km){
        double difference = car(km) - publicTransport(km);
        return difference;
    }

    //shows how much co2 you save taking the bike instead of the public transport
    public static double bikeVsPulbicTransport(int km){
        double diffrence = publicTransport(km) - bike(km);
        return diffrence;
    }

    public static double meal(boolean vegetarian, boolean localProduce){
        double co2 = 0;
        if(vegetarian){
            co2 = 1.2700;
        } else{
            co2 = 1.8748;
        }
        if(localProduce){
            co2 *= 0.95;
        }
        return co2;
    }

    //returns the amount of co2 saved by using solar panels
    public static double solarPanel(int amountOfSolarPanels){
        return 4.5 * amountOfSolarPanels * 0.300 * 0.558;
    }

    //returns the amount of co2 used by heating your room
    public static double temperature(int inhabitants, int degreesLowered){
        if(inhabitants < 1){
            return 0;
        }
        if(degreesLowered < 0){
            return 0;
        }
        double kwh = 0;
        if(inhabitants == 1){
            kwh = 1800 / 365;
        } else if(inhabitants == 2) {
            kwh = 2900 / 365;
        }else if(inhabitants == 3){
            kwh = 4000 / 365;
        }else if(inhabitants == 4){
            kwh = 4600 / 365;
        } else{
            kwh = 5300 / 365;
        }

        //multiplying co2 *.92 for every degree lowered
        for(int i = degreesLowered; i > 0; i--){
            kwh *= .92;
        }
        double co2 = kwh *.558;
        return co2;
    }

    //returns the amount of co2

}
