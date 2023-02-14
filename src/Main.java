import java.sql.ClientInfoStatus;

public class Main {
    public static void main(String[] args) {

// First Part
//         1.2
        Figure figureDefault = new Figure();


        Figure figurevolume = new Figure(1.2 , 3.7 , 2.1);
        System.out.println(figurevolume.calculateVolume());
//        1.4
        Figure square = new Figure (1.2, 3.7, 2.1);
        System.out.println(square.calculateFigureSurfArea());

//        Second part, 2.3.
        Client clientOne = new Client("Aleksandr", 12000.01, 432587458);
        Client clientTwo = new Client ("Sonia", 958.23, 325423142);
        Client clientThree = new Client ( "Mihail", 10236.12, 365478458);
//        2.5
        String greeting = clientOne.greeting()+"," + clientOne.name;
//        2.7
        double balanceDifference = clientOne.balanceDifference(clientOne.accountBalance,clientTwo.accountBalance);










    }

}
