class vehicle
{
    int no_of_wheels;
    double speed;
    
    vehicle(int wheels, double spd)
    {
        no_of_wheels=wheels;
        speed=spd;
    }
    
    void display()
    {
        System.out.println("Wheels: " +no_of_wheels);
        System.out.println("Speed: " +speed);
    }
}

class car extends vehicle
{
    int no_of_passengers;
    
    car(int Wheels, double spd , int passengers)
    {
        super(Wheels,spd);
        no_of_passengers=passengers;
    }
    void display()
    {
        super.display();
        System.out.println("No of passengers: " +no_of_passengers);
    }
}

class truck extends vehicle
{
    int load_limit;
    
    truck(int Wheels, double spd, int load_lmt )
    {
        super(Wheels,spd);
        load_limit=load_lmt;
    }
    
    void display()
    {
        super.display();
        System.out.println("Load limit" +load_limit);
    }
}

public class Main
{
    public static void main(String args[])
    {
        car c = new car(4,120.5,5);
        truck t = new truck(12,100.5,300);
        
        c.display();
        t.display();
        
        if(c.speed>t.speed)
        {
            System.out.println("The car is faster than the truck.");
        }
        else if(c.speed<t.speed)
        {
            System.out.println("The truck is faster than the car.");
        }
        else
        {
            System.out.println("The car is and the truck same .");
        }
        
    }
}



