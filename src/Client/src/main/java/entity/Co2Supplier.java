package entity;


/** Gives the CO2 count to the GUI. **/
public class Co2Supplier { Co2Supplier() { }

   // /**THE SOURCE OF ANY OF THESE NUMBERS CAN BE FOUND IN THE FEATURES FOLDER
   //  *   OR ../../../../../../doc/features
   //  *(compared to the directory of this file**/

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  the amount of co2 it cost to drive x kilometers by bike.
     */

    public static double bike(final int km) {
        final double a = 0.016;
        if (km < 0) {
            return 0;
        }
        return a * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return the amount of co2 to drive x kilometers in the average car.
     */
    public static double car(final int km) {
        final double a = 0.271;
        if (km < 0) {
            return 0;
        }
        return a * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 to travel x kilometers with
     * the public transport.
     */
    public static double publicTransport(final int km) {
        final double a = 0.101;
        if (km < 0) {
            return 0;
        }
        return a * km;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by cycling instead of riding your car.
     */
    public static double bikeVsCar(final int km) {
        double difference = car(km) - bike(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by taking the public transport instead.
     */
    public static double publicTransportVsCar(final int km) {
        double difference = car(km) - publicTransport(km);
        return difference;
    }

    /**
     *
     * @param km    The amount of kilometers traveled.
     * @return  The amount of co2 saved by cycling a distance instead.
     */
    public static double bikeVsPublicTransport(final int km) {
        double difference = publicTransport(km) - bike(km);
        return difference;
    }

    /**
     *
     * @param vegetarian    Whether your meal was vegetarian.
     * @param localProduce  Whether your meal was locally grown or produced.
     * @return  The amount of co2 it cost to produce your meal.
     */
    public static double meal(final boolean vegetarian,
                              final boolean localProduce) {
        double co2 = 0;
        final double a = 1.2700;
        final double b = 1.8748;
        final double c = 0.95;
        if (vegetarian) {
            co2 = a;
        } else {
            co2 = b;
        }
        if (localProduce) {
            co2 *= c;
        }
        return co2;
    }

    /**
     *
     * @param vegetarian Wheter the meal you ate was vegetarian.
     * @param localProduce  Wheter your meal was grown or produced locally.
     * @return  The amount of co2 saved by eating in this way.
     */
    public static double mealDifference(final boolean vegetarian,
                                        final boolean localProduce) {
        double difference;
        difference = meal(false, false) - meal(vegetarian, localProduce);
        return difference;
    }

    /**
     *
     * @param amountOfSolarPanels the amount of average size solar panels.
     * @return  the amount of co2 those average solar panels would yield.
     */

    public static double solarPanel(final int amountOfSolarPanels) {
        final double a = 4.5;
        final double b = 0.300;
        final double c = 0.558;
        if (amountOfSolarPanels < 0) {
            return 0;
        }
        return a * amountOfSolarPanels * b * c;
    }

    /**
     *
     * @param amountOfSolarPanels The amount of average size solar panels
     * you have on your house
     * @param inhabitants   The amount of people living in your house.
     * @return  The amount of CO2 you used, excluding what you saved
     * with your solar panels.
     */
    public static double solarPanelUsed(final int amountOfSolarPanels,
                                        final int inhabitants) {
        final double a = 0.558;
        if (amountOfSolarPanels < 0) {
            return 0;
        }
        double used = getKWH(inhabitants, 0) * a;
        double solar = solarPanel(amountOfSolarPanels);
        return  used - solar;
    }


    /**
     *
     * @param inhabitants   the amount of people living in your household
     * @param degreesLowered    the amount of degrees you have
     *                          lowered your temperature.
     * @return  the amount of co2 you have saved.
     */

    public static double temperature(final int inhabitants,
                                     final int degreesLowered) {
        double kwh = getKWH(inhabitants, degreesLowered);
        double temp = kwh;
        final double a = 0.92;
        final double b = 0.558;
        //multiplying co2 *.92 for every degree lowered
        for (int i = degreesLowered; i > 0; i--) {
            temp *= a;
        }
        double co2 = (kwh - temp) * b;
        return co2;
    }

    /**
     *
     * @param inhabitants   The amount of people living in your house.
     * @param degreesLowered    The amount of degrees you
     *                          lowered your temperature.
     * @return  The amount of co2 it cost.
     */

    public static double usedTemperature(final int inhabitants,
                                         final int degreesLowered) {
        double kwh = getKWH(inhabitants, degreesLowered);
        final double a = 0.92;
        final double b = 0.558;

        //multiplying co2 *.92 for every degree lowered
        for (int i = degreesLowered; i > 0; i--) {
            kwh *= a;
        }
        double co2 = kwh * b;
        return co2;
    }


    /**
     *
     * @param inhabitants   The amount of people living in your house.
     * @param degreesLowered The amount of degrees you lowered your temperature
     * @return  The amount of KWH a average household uses.
     */
    public static double getKWH(final int inhabitants,
                                final int degreesLowered) {
        final double a = 365.0;
        final double b = 1800.0;
        final double c = 2900.0;
        final double d = 4000.0;
        final double e = 4600.0;
        final double f = 5300.0;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        if (inhabitants < 1) {
            return 0;
        }
        if (degreesLowered < 0) {
            return 0;
        }
        double kwh;
        if (inhabitants == one) {
            kwh = b / a;
        } else if (inhabitants == two) {
            kwh = c / a;
        } else if (inhabitants == three) {
            kwh = d / a;
        } else if (inhabitants == four) {
            kwh = e / a;
        } else {
            kwh = f / a;
        }
        return kwh;
    }
}
