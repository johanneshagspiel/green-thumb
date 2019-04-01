package entity;


/** Gives the CO2 count to the GUI **/
public class CO2_Supplier {
    /**THE SOURCE OF ANY OF THESE NUMBERS CAN BE FOUND IN THE FEATURES FOLDER
        OR ../../../../../../doc/features(compared to the directory of this file**/
    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  the amount of co2 it cost to drive x kilometers by bike.
     */
    public static double bike(int km) {
        if (km < 0) {
            return 0;
        }
        return 0.016 * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return the amount of co2 to drive x kilometers in the average car.
     */
    public static double car(int km) {
        if (km < 0) {
            return 0;
        }
        return 0.271 * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 to travel x kilometers with the public transport.
     */
    public static double publicTransport(int km) {
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
    public static double bikeVsCar(int km) {
        double difference = car(km) - bike(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by taking the public transport instead.
     */
    public static double publicTransportVsCar(int km) {
        double difference = car(km) - publicTransport(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by cycling a distance instead.
     */
    public static double bikeVsPublicTransport(int km) {
        double difference = publicTransport(km) - bike(km);
        return difference;
    }

    /**
     *
     * @param vegetarian    Wheter your meal was vegetarian.
     * @param localProduce  Wheter your meal was locally grown or produced.
     * @return  The amount of co2 it cost to produce your meal.
     */
    public static double meal(boolean vegetarian, boolean localProduce) {
        double co2 = 0;
        if (vegetarian) {
            co2 = 1.2700;
        } else {
            co2 = 1.8748;
        }
        if(localProduce) {
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
    public static double mealDifference(boolean vegetarian, boolean localProduce) {
        double difference;
        difference = meal(false, false) - meal(vegetarian, localProduce);
        return difference;
    }

    /**
     *
     * @param amountOfSolarPanels the amount of average size solar panels.
     * @return  the amount of co2 those average solar panels would yield.
     */

    public static double solarPanel(int amountOfSolarPanels) {
        if (amountOfSolarPanels < 0) {
            return 0;
        }
        return 4.5 * amountOfSolarPanels * 0.300 * 0.558;
    }

    /**
     *
     * @param amountOfSolarPanels The amount of average size solar panels you have on your house.
     * @param inhabitants   The amount of people living in your house.
     * @return  The amount of CO2 you used, excluding what you saved with your solar panels.
     */
    public static double solarPanelUsed(int amountOfSolarPanels, int inhabitants) {
        if (amountOfSolarPanels < 0) {
            return 0;
        }
        double used = getKWH(inhabitants, 0) * .558;
        double solar = solarPanel(amountOfSolarPanels);
        return  used - solar;
    }


    /**
     *
     * @param inhabitants   the amount of people living in your household
     * @param degreesLowered    the amount of degrees you have lowered your temperature.
     * @return  the amount of co2 you have saved.
     */

    public static double temperature(int inhabitants, int degreesLowered) {
        double kwh = getKWH(inhabitants, degreesLowered);
        double temp = kwh;
        //multiplying co2 *.92 for every degree lowered
        for (int i = degreesLowered; i > 0; i--) {
            temp *= .92;
        }
        double co2 = (kwh - temp) *.558;
        return co2;
    }

    /**
     *
     * @param inhabitants   The amount of people living in your house.
     * @param degreesLowered    The amount of degrees you lowered your temperature.
     * @return  The amount of co2 it cost.
     */

    public static double usedTemperature(int inhabitants, int degreesLowered) {
        double kwh = getKWH(inhabitants, degreesLowered);
        //multiplying co2 *.92 for every degree lowered
        for (int i = degreesLowered; i > 0; i--) {
            kwh *= .92;
        }
        double co2 = kwh * .558;
        return co2;
    }


    /**
     *
     * @param inhabitants   The amount of people living in your house.
     * @param degreesLowered The amount of degrees you lowered your temperature
     * @return  The amount of KWH a average household uses.
     */
    public static double getKWH(int inhabitants, int degreesLowered) {
        if (inhabitants < 1) {
            return 0;
        }
        if (degreesLowered < 0) {
            return 0;
        }
        double kwh;
        if (inhabitants == 1) {
            kwh = 1800.0 / 365.0;
        } else if (inhabitants == 2) {
            kwh = 2900.0 / 365.0;
        } else if (inhabitants == 3) {
            kwh = 4000.0 / 365.0;
        } else if (inhabitants == 4) {
            kwh = 4600.0 / 365.0;
        } else {
            kwh = 5300.0 / 365.0;
        }
        return kwh;
    }
}
