package helper;

public class PointsMissing {

    public static int determiningPoints (int pointsIn) {

        return 1000 - (pointsIn % 1000);

    }
}
