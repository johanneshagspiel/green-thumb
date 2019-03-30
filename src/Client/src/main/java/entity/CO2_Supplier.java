package entity;

public class CO2_Supplier {
    /*
        THE SOURCE OF ANY OF THESE NUMBERS CAN BE FOUND IN THE ROOT/DOC/FEATURES FOLDER
        OR ../../../../../../doc/features   (compared to the directory of this file)
     */
    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  the amount of co2 it cost to drive x kilometers by bike.
     */
    public static double bike(int km){
        if(km < 0){
            return 0;
        }
        return 0.016*km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  the amount of co2 it cost to drive x kilometers in the average car.
     */
    public static double car(int km){
        if(km < 0){
            return 0;
        }
        return 0.271 * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 it cost to travel x kilometers with the public transport.
     */
    public static double publicTransport(int km){
        if (km < 0) {
            return 0;
        }
        return .101 * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by cycling instead of riding your car.
     */
    public static double bikeVsCar(int km){
        double difference = car(km) - bike(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by taking the public transport instead of riding your car.
     */
    public static double publicTransportVsCar(int km){
        double difference = car(km) - publicTransport(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by cycling a distance instead of taking the buss.
     */
    public static double bikeVsPulbicTransport(int km){
        double diffrence = publicTransport(km) - bike(km);
        return diffrence;
    }

    /**
     *
     * @param vegetarian    Wheter your meal was vegetarian.
     * @param localProduce  Wheter your meal was locally grown or produced.
     * @return  The amount of co2 it cost to produce your meal.
     */
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

    /**
     *
     * @param vegetarian    Wheter the meal you ate was vegetarian.
     * @param localProduce  Wheter your meal was grown or produced locally.
     * @return  The amount of co2 saved by eating in this way.
     */
    public static double mealDifference(boolean vegetarian, boolean localProduce){
        double difference;
        difference = meal(false, false) - meal(vegetarian, localProduce);
        return difference;
    }

    /**
     *
     * @param amountOfSolarPanels the amount of average size solar panels you have on your house.
     * @return  the amount of co2 those average solar panels would yield on an average day
     */
    public static double solarPanel(int amountOfSolarPanels){
        return 4.5 * amountOfSolarPanels * 0.300 * 0.558;
    }

    /**
     *
     * @param inhabitants   the amount of people living in your household
     * @param degreesLowered    the amount of degrees you have lowered your temperature compared to your average temperature
     * @return  the amount of co2 you have saved by lowering your temperature
     */
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
