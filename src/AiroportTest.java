import room.model.Plane;
import room.service.PlaneService;

import java.util.Scanner;

public class AiroportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();

        Plane[] planes = new Plane[10];

        int g = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isActive = true;

        while (isActive) {
            System.out.println("1. Print all information of the plane");//1
            System.out.println("2. Print cost and topSpeed if the plane is military otherwise print model and country");//2
            System.out.println("3. Return the plane which one is newer (if they have the same age return first one)");//3
            System.out.println("4. Return the model of the plane which has  bigger wingspan (if they have the same - return second one)");//4
            System.out.println("5. Print country of the plane whit smallest seats count(if they have the same - print first)");//5
            System.out.println("6. Print all not military planes");//6
            System.out.println("7. Print all military planes which were in air more then 100 hours");//7
            System.out.println("8. Return the plane whit minimal weigth (if there are some of them return last one)");//8
            System.out.println("9. Return the plane whit minimal cost from all military planes");//9
            System.out.println("10. Print planes in ascending  form order by year");//10


            Plane plane1 = new Plane("Boeing 757", "Russia", 2010, 1800, true, 180000, (byte) 30, (short) 900, (short) 400, 1000);
            Plane plane2 = new Plane("Airship", "England", 2018, 2700, false, 150000, (byte) 60, (short) 1010, (short) 500, 209000);
            Plane plane3 = new Plane("Glider", "Armenia", 2021, 957, false, 500, (byte) 10, (short) 250, 2, 50000);


            switch (n) {
                case 1:
                    plane1.Task1();
                    break;
                case 2:
                    PlaneService planeService1 = new PlaneService();
                    planeService1.Task2(plane1);
                    break;
                case 3:
                    Plane p1 = planeService.Task3(plane1, plane2);
                    p1.Task1();
                    break;
                case 4:
                    Plane p2 = planeService.Task4(plane1, plane2);
                    System.out.println(p2.getModel());
                    break;
                case 5:
                    Plane p3 = planeService.Task5(plane1, plane2, plane3);
                    System.out.println(p3.getCountry());
                    break;
                case 6:
                    planeService.Task6(plane1, plane2, plane3);
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    isActive = false;
            }
        }
    }
}
