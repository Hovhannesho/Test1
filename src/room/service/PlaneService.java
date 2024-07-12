package room.service;

import room.model.Plane;

public class PlaneService {
    public void Task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost());
            System.out.println(plane.getTopSpeed());
        } else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCountry());
        }
    }

    public Plane Task3(Plane plane1, Plane plane2) {
        if (plane1.getYear() > plane2.getYear()) {
            return plane1;
        }
        return plane2;
    }

    public Plane Task4(Plane plane1, Plane plane2) {
        if (plane1.getWingspan() > plane2.getWingspan()) {
            return plane1;
        }
        return plane2;
    }

    public Plane Task5(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            return plane1;
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            return plane2;
        }
        return plane3;
    }

    public void Task6(Plane plane1, Plane plane2, Plane plane3) {
        if (!plane1.isMilitary()) {
            plane1.Task1();
            System.out.println("__________________");
        }
        if (!plane2.isMilitary()) {
            plane2.Task1();
            System.out.println("__________________");
        }
        if (!plane3.isMilitary()) {
            plane3.Task1();
            System.out.println("____________________");
        }
        System.out.println("No one");
    }
}