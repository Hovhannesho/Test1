package room.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private int weight;
    private byte wingspan;
    private short topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, int hours, boolean military, int weight, byte wingspan, short topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        this.isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte getWingspan() {
        return wingspan;
    }

    public void setWingspan(byte wingspan) {
        this.wingspan = wingspan;
    }

    public short getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(short topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void Task1() {
        if (getYear() > 1903 && getYear() < 2021) {
            System.out.println("Year: " + year);
        } else {
            System.out.println("Year is old");
        }
        if (getHours() > 0 && getHours() < 10000) {
            System.out.println("Hours: " + hours);
        } else {
            System.out.println("");
        }
        if (getWeight() > 10000 && getWeight() < 160000) {
            System.out.println("Weight: " + weight);
        } else {
            System.out.println("");
        }
        if (getWingspan() > 10 && getWingspan() < 45) {
            System.out.println("Wingspan: " + wingspan);
        } else {
            System.out.println("");
        }
        if (getTopSpeed() > 0 && getTopSpeed() < 1000) {
            System.out.println("Top Speed: " + topSpeed);
        } else {
            System.out.println("");
        }
        if (getSeats() > 0) {
            System.out.println("Seats: " + seats);
        } else {
            System.out.println("");
            System.out.println("Model: " + model);
            System.out.println("Country: " + country);
            System.out.println("Year: " + year);
            System.out.println("Hours: " + hours);
            System.out.println("Military: " + isMilitary);
            System.out.println("Weight: " + weight);
            System.out.println("Wingspan: " + wingspan);
            System.out.println("TopSpeed: " + topSpeed);
            System.out.println("Seats: " + seats);
            System.out.println("Cost: " + cost);
        }
    }
}
