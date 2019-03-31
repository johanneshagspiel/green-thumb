package helper;

public class PointsMissing {

    public static int determiningPoints (int pointsIn) {

        System.out.println(pointsIn);

        while (pointsIn > 1000)
        {
            pointsIn = pointsIn - 1000;
        }

        Integer pointsOut = (pointsIn - 1000)*(-1);

        System.out.println(pointsOut);

        return pointsOut;
    }
}
