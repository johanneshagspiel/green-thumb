package helper;

public class PointsMissing {

    public static int determiningPoints2 (int pointsIn) {

        System.out.println(pointsIn);

        if (pointsIn > 1000)
        {
            pointsIn = pointsIn - 1000;
            determiningPoints2(pointsIn);
        }
        else
        {
            Integer pointsOut = 1000 - pointsIn;
            return pointsOut;
        }
        System.out.println(pointsIn);
        return 666;
    }

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
