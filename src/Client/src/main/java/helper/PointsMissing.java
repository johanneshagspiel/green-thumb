package helper;

public class PointsMissing {

    public static int determiningPoints (int pointsIn) {

        System.out.println(pointsIn);

        int pointsOut = 1000 - (pointsIn % 1000);

        System.out.println(pointsOut);

        return pointsOut;
    }
}
