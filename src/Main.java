public class Main {
    public static void main(String[] args) {
        Families []dormitoryfamily= {new Dormitory("Kanymgul",19),
                new Dormitory("Khafiz",18),
                new Dormitory("Kanykei",16),
                new Hotel("Camat", 40),
                new Hotel("Aikejan", 45),
        };
        for (Families a:
                dormitoryfamily) {
            System.out.println("Dormitory family members "+a);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Families []hotelfamily= {
                new Hotel("Aizat", 19),
                new Hotel("Madina",16),
                new Apartment("Alikhan",23),
        };
        for (Families b:hotelfamily) {
            System.out.println("Hotel family members "+b);

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Families []apartmentfamily= {new Apartment("Manas", 28),
                new Apartment("Matmusa", 21),
        };
        for (Families c:apartmentfamily) {
            System.out.println("Apartment family members "+c);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Apartment apartmentleader=new Apartment("Manas", 28);
        apartmentleader.Comusluga();
        Dormitory dormitoryleader=new Dormitory("Khafiz",18);
        dormitoryleader.Arenda();
        Hotel hotelleader=new Hotel("Madina",16);
        hotelleader.Arenda();


    }
}