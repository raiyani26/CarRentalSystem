import java.util.*;

class CarRentalSystem {
    public static void main(String args[]){
        String make,model,colour;
        int year;
        double dailyPrice;
        boolean available;
        Car []c3;
        int index = 10;
        Car c2[];
        Scanner sc = new Scanner(System.in);

        //Available Car List
        Car c[] ={
            new Car("Suzuki","Swift",2019,1500.0,"White",true),
            new Car("Suzuki","Dzire",2016,1650.0,"White",true),
            new Car("Toyota","Fortuner",2021,2000.0,"Black",true),
            new Car("Toyota","Innova",2018,1900.0,"White",true),
            new Car("Ford","Endevour",2018,2100.0,"Black",true),
            new Car("Ford","Freestyle",2017,1500.0,"Brown",true),
            new Car("Mahindra","Thar",2016,2000.0,"Grey",true),
            new Car("Mahindra","Xuv700",2022,2100.0,"Red",true),
            new Car("Tata","Tigor",2021,1500.0,"White",true),
            new Car("Tata","Harrier",2022,1900.0,"Red",true)};  

            System.out.println("\n==================== Welcome to Car Rental ====================");
            boolean ac = true;
            while(ac){
                System.out.println("\nEnter [1] for Admin Login ");
                System.out.println("Enter [2] for Customer ");
                System.out.println("Enter [3] to exit");
                System.out.print("Enter Choice : ");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:{
                        boolean lo = true;
                        while(lo)
						{
                            System.out.print("\nEnter Admin User ID : ");
                            String id = sc.next();
                            System.out.print("Enter Password : ");
                            String password = sc.next();
                            if(id.equals("admin@123") && password.equals("1234")){
                                boolean b1 = true;
                                while(b1)
								{
                                    System.out.println("\n[1] List of Available Cars ");
                                    System.out.println("[2] To Add a new Car ");
                                    System.out.println("[3] To delete car record ");
                                    System.out.println("[4] To search a car");
                                    System.out.println("[5] To see which cars are rented");
                                    System.out.println("[6] To Modify Rental Price");
                                    System.out.println("[7] For Further Process ");
                                    System.out.print("\nEnter your choice :");
                                    int n = sc.nextInt();
                                    switch(n)
									{
                                        //For List of available cars
                                        case 1:{     
                                            System.out.println("\nAvailable Cars ");
                                            for(int i=0;i<c.length;i++){
                                                if(c[i].available){
                                             		System.out.println("[" + (i+1) + "]" + c[i].make + " " + c[i].model + " " + "(" + c[i].year + ") " );
                                                }
                                            }
                                            break;
                                        }
                        
                                        //For adding a new car
                                        case 2:{                    
                                            System.out.print("\nMake of Car : ");
                                            make = sc.next(); 
                                            System.out.print("Model of Car : ");
                                            model = sc.next(); 
                                            System.out.print("Manufacturing Year : ");
                                            year = sc.nextInt(); 
                                            System.out.print("Colour of Car : ");
                                            colour = sc.next();
                                            System.out.print("Rental Price of Car : ");
                                            dailyPrice = sc.nextDouble(); 
                                            available = true;
                                            Car c1[] = {new Car(make, model, year, dailyPrice, colour, available)};
                                            c2 = new Car[c.length+c1.length];
                                            for(int i=0;i<c.length;i++){
                                                c2[i] = c[i];
                                            }
                                            for(int i=0;i<c1.length;i++){
                                                c2[c.length+i] = c1[i];
                                            }
                                            c=c2;
                                            System.out.println("Car Added Successfully!!");
                                            break;
                                        }
                        
                                        //For deleting car record
                                        case 3:{
                                            System.out.print("Enter Car Index to delete [Starting from 0] : ");
                                            int carIndex = sc.nextInt();
                                            for (int i = carIndex; i < c.length-1; i++) {
                                                c[i] = c[i + 1];
                                            } 
                                            c3 = new Car[c.length-1];
                                            for (int i = 0; i < c3.length; i++) {
                                                c3[i] = c[i];
                                            }
                                            c=c3;
                                            System.out.println("Car Deleted Successfully!!");
                                            break;
                                        }
                                        
                                        //For Searching a car
                                        case 4:{
                                            boolean b2 = true;
                                            while(b2){
                                                System.out.println("\n\t[1] to search by Make");
                                                System.out.println("\t[2] to search by Model");
                                                System.out.println("\t[3] to search by Manufacturing Year");
                                                System.out.println("\t[4] to search by Colour");
                                                System.out.println("\t[5] to quit");
                                                System.out.print("\tEnter Your Choice for searching : ");
                                                int ch1 = sc.nextInt();
                                                switch(ch1){
                                                    case 1:{
                                                        System.out.print("\n\tEnter Make of Car : ");
                                                        String mak = sc.next();
                                                        for(int i=0;i<c.length;i++){
                                                            c[i].search(mak);
                                                        }
                                                        break;
                                                    }
                                                    case 2:{
                                                        System.out.print("\n\tEnter Model of Car : ");
                                                        String mod = sc.next();
                                                        for(int i=0;i<c.length;i++){
                                                            c[i].searchbymodel(mod);
                                                        }
                                                        break;
                                                    }
                                                    case 3:{
                                                        System.out.print("\n\tEnter Manufacturing Year : ");
                                                        int man = sc.nextInt();
                                                        for(int i=0;i<c.length;i++){
                                                            c[i].search(man);
                                                        }
                                                        break;
                                                    }
                                                    case 4:{
                                                        System.out.print("\n\tEnter Colour : ");
                                                        String col = sc.next();
                                                        for(int i=0;i<c.length;i++){
                                                            c[i].searchbycolour(col);
                                                        }
                                                        break;
                                                    }
                                                    case 5:{
                                                        System.out.println("\tquiting...");
                                                        b2=false;
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println("\tWrong Choice!! \nTry again...");
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }

                                        //To see which cars are rented
                                        case 5:{
                                            System.out.println("\n===== Cars on Rent =====");
                                            for(int i=0;i<c.length;i++){
                                                if(c[i].available == false){
                                                    System.out.println("["+(i+1)+"] "+c[i].make + " " + c[i].model + " " + "(" + c[i].year + ") " );
                                                }
                                            }  
                                            break;
                                        }

                                        //To modify the rental price
                                        case 6:{
                                            System.out.print("\nEnter model of car : ");
                                            String mod = sc.next();
                                            for(int i=0;i<c.length;i++){
                                                c[i].modify(c, mod);
                                            }
                                            break;
                                        }

                                        //For further Process
                                        case 7:{
                                            b1=false;
                                            break;
                                        }
                        
                                        default:{
                                            System.out.println("\nWrong Choice!! \nTry again...");
                                            break;
                                        }    
                                    }
                                }
                                lo = false;
                            }
                            else{
                                System.out.println("Wrong ID or Password!!\nTry Again...");
                            }
                        }
                        break;
                    }
                    case 2:{
                        boolean flag = true;
                        while(flag){
                            System.out.println("\n[1] To filter Car");
                            System.out.println("[2] To Rent a Car");
                            System.out.print("Enter Choice : ");
                            int ch3 = sc.nextInt();
                            switch (ch3) {
                                case 1:{
                                    boolean b2 = true;
                                    while(b2){
                                        System.out.println("\n\t[1] filter by Make");
                                        System.out.println("\t[2] filter by Model");
                                        System.out.println("\t[3] filter by Manufacturing Year");
                                        System.out.println("\t[4] filter by Colour");
                                        System.out.println("\t[5] to quit");
                                        System.out.print("\tEnter Your Choice for searching : ");
                                        int ch1 = sc.nextInt();
                                        switch(ch1){
                                            case 1:{
                                                System.out.print("\n\tEnter Make of Car : ");
                                                String mak = sc.next();
                                                for(int i=0;i<c.length;i++){
                                                    c[i].search(mak);
                                                }
                                                break;
                                            }
                                            case 2:{
                                                System.out.print("\n\tEnter Model of Car : ");
                                                String mod = sc.next();
                                                for(int i=0;i<c.length;i++){
                                                    c[i].searchbymodel(mod);
                                                }
                                                break;
                                            }
                                            case 3:{
                                                System.out.print("\n\tEnter Manufacturing Year : ");
                                                int man = sc.nextInt();
                                                for(int i=0;i<c.length;i++){
                                                    c[i].search(man);
                                                }
                                                break;
                                            }
                                            case 4:{
                                                System.out.print("\n\tEnter Colour : ");
                                                String col = sc.next();
                                                for(int i=0;i<c.length;i++){
                                                    c[i].searchbycolour(col);
                                                }
                                                break;
                                            }
                                            case 5:{
                                                System.out.println("\tquiting...");
                                                b2=false;
                                                break;
                                            }
                                            default:{
                                                System.out.println("\tWrong Choice!! \nTry again...");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 2:{
                                    flag = false;
                                    break;
                                }
                                default:{
                                    System.out.println("\nEnter Correct Choice!! \nTry Again...");
                                    break;
                                }
                            }
                        }
                        
                        System.out.println("\n=============== Available Cars ===============");
                        for(int i=0;i<c.length;i++){
                            if(c[i].available){
                                System.out.println("["+(i+1)+"] "+c[i].make + " " + c[i].model + " " + "(" + c[i].year + ") " );
                            }
                        }
                        //Ask the user to choose the car to rent
                        System.out.print("\nChoose Car for rent : ");
                        int carIndex = sc.nextInt() - 1;
                        
                        //Ask the user for Personal Detail
                        System.out.print("Enter Your First Name : ");
                        String fname = sc.next();
                        System.out.print("Enter Your Last Name : ");
                        String lname = sc.next();
                        String mob_num ="";
                        boolean m = true;
                        while(m){
                            System.out.print("Enter Your Mobile Number : ");
                            mob_num = sc.next();
                            if(mob_num.length()==10){
                                m = false;
                            }
                            else{
                                System.out.println("Enter Correct Mobile Number!! \nTry Again");
                            }
                        }
    
                        //Ask the user for rent days;
                        System.out.print("Enter Rental Period (in days) : ");
                        int rentalPeriod = sc.nextInt();
                        double rentalPrice = rentalPeriod * c[carIndex].dailyPrice;
                        if(rentalPeriod>8){
                            rentalPrice -= 0.15*rentalPrice;
                        }
                        double TotalPrice = rentalPrice + (0.18*rentalPrice);
    
                        //Seating car as unavailable
                        c[carIndex].available = false;
    
                        // Print the rental information
                        System.out.println("\n========== Rental Information ==========");
                        System.out.println("Name : "+fname + " "+ lname);
                        System.out.println("Mobile Number : "+mob_num);
                        System.out.println("Car: " + c[carIndex].make + " " + c[carIndex].model + " (" + c[carIndex].year + ")");
                        System.out.println("Rental Period: " + rentalPeriod + " days");
                        System.out.println("Rental Price: " + rentalPrice + "Rs." );
                        System.out.println("Net Payable: " + TotalPrice + "Rs.\n" );

                        //For Payment method called
                        c[carIndex].payment();     
                        break;
                    }
                    case 3:{
                        ac = false;
                        break;
                    }
                    default:{
                        System.out.println("Wrong Choice!!\nTry Again...");
                    }
                }
            }    
    }
}
class Car{
    String make,model,colour;
    int year;
    double dailyPrice,rentalPrice;
    boolean available;
    Scanner sc = new Scanner(System.in);

    public Car(String make,String model,int year,double dailyPrice,String colour,boolean available){
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyPrice = dailyPrice;
        this.colour = colour;
        this.available = true;
    }

    //To search by Make
    void search(String mak){
        if(mak.equalsIgnoreCase(make)){
            display();
        }
    }
    
    //To search by Manufacturing Year
    void search(int man){
        if(man == year){
            display();
        }
    }

    //To search by Model
    void searchbymodel(String mod){
        if(mod.equalsIgnoreCase(model)){
            display();
        }
    }

    //To search by Colour
    void searchbycolour(String col){
        if(col.equalsIgnoreCase(colour)){
            display();
        }
    }

    //To modify rental price
    void modify(Car c[], String mod){
        if(mod.equalsIgnoreCase(model)){
           System.out.print("Enter New Rental Price : ");
           double dp = sc.nextDouble();
           for(int i=0;i<c.length;i++){
                c[i].dailyPrice = dp;
            }
        }
    }

    //For Displaying after Search
    void display(){
        System.out.println("\n\t\t"+make + " " + model + " " + "("+ year + ")");
    }

    //To delete car Record
    void delete(Car c[],int i){
        c[i].make=null;
        c[i].model=null;
        c[i].colour=null;
        c[i].year = 0;
        c[i].dailyPrice = 0;
    }

    //For Payment
    void payment(){
        System.out.println("\n===== Payment =====");
        System.out.println("\n[1] for Credit/Debit Card");
        System.out.println("[2] for Upi Payment");
        System.out.print("Enter Choice : ");
        int ch2 = sc.nextInt();
        switch(ch2){
            case 1:{
                boolean flag = true;
                while(flag){
                    System.out.print("\nEnter Card Number : ");
                    String card_num = sc.next();
                    if(card_num.length()==16){
                        flag = false;
                    }
                    else{
                        System.out.println("Payment failed!! Try Again");
                        flag = true;
                    }
                }
                sc.nextLine();
                System.out.print("Enter Card Holder Name : ");
                String hol_name = sc.nextLine();
                System.out.print("Enter Expiry Month and Year (MM/YY) : ");
                String exp = sc.next();
                boolean flag1 = true;
                int temp = 0;
                while(flag1){
                    System.out.print("Enter CVV : ");
                    String cvv = sc.next();
                    if(cvv.length()==3){
                        flag1 = false;
                        System.out.println("\nPayment is Successfully Done ");
                    }
                    else{
                        System.out.println("Enter correct CVV!!");
                        temp++;
                        if(temp==3){
                            System.out.println("\nPayment Failed!!");
                            System.out.println("Card Blocked for 24 hours!!");
                            flag1 = false;
                            payment();
                        }
                    }
                }
                break;
            }

            case 2:{
                System.out.print("\nEnter UPI ID : ");
                String upi = sc.next();
                boolean flag1 = true;
                int temp = 0;
                while(flag1){
                    System.out.print("Enter UPI Pin : ");
                    String pin = sc.next();
                    if(pin.length()==4){
                        flag1 = false;
                        System.out.println("\nPayment is Successfully Done ");
                    }
                    else{
                        System.out.println("Enter correct Pin!!");
                        temp++;
                        if(temp==3){
                            System.out.println("\nPayment Failed!!");
                            System.out.println("UPI ID blocked for 24 hours!!");
                            flag1 = false;
                            payment();
                        }
                    }
                }
                break;
            }
            default:{
                System.out.println("Choose Correct Option!!");
                payment();
                break;
            }
        }
    }
}