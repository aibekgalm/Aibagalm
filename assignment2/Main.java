import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        String[] sports = new String[]{"SportsClub:\n","Football ,","Basketball ,","Valleyball","Tennis ,","Chess ,","Golf"};
        System.out.println("Registration of teams or participate:\n" +
                "1.Name of the Sports\n" + "2.Type of Sport \n" + "3.Athlete\n" + "4.Age \n"+"5.Yore emaill:\n");

        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the sports number:");
        int rigs = cs.nextInt();
         while (true) {
            if (rigs == 1) {
                System.out.println("Team Sport:\n " + "Football ,"+"Basketball ,"+"Valleyball");
                 printALLSpots(sports);
                sports = addSports(cs,sports);
                sports = removeSport(cs,sports);
                sports = mailSports(cs,sports);
            } else if (rigs == 2) {
                System.out.println("Individual Sport:\n"+"Tennis ,"+"Chess ,"+"Golf");
                printALLSpots(sports);
                sports = addSports(cs,sports);
                sports = removeSport(cs,sports);
                sports = mailSports(cs,sports);


            } else if (rigs == 3) {
                sports = removeSport(cs,sports);

            } else if (rigs == 4) {
                sports = mailSports(cs,sports);


            }
            System.out.println("Thank you for your survey! \n");
            System.exit(0);
            rigs = cs.nextInt();

        }



    }

    private static String[] mailSports(Scanner cs, String[] sports) {
        System.out.println("Enter your emaill:");
        String inputSport = cs.next();
        String[] resArray = new String[sports.length+ 1];
        for (int i = 0; i < sports.length; i++) {

            resArray[i]= sports[i];


        }
        return resArray;
    }

    private static String[] removeSport(Scanner cs, String[] sports) {
        System.out.println("Enter your age:");
        String inputSport = cs.next();
        String[] resArray = new String[sports.length +1];
        for (int i = 0; i < sports.length; i++) {
            resArray[i] = sports[i];
        }

        return resArray;
    }


    private static String[] addSports(Scanner cs, String[] sports) {
        System.out.println("Enter your name:");
        String inputSport =cs.next();
        String[] resArray =new String[sports.length +1];
        for (int i = 0; i < sports.length; i++) {
            resArray[i] = sports[i];


        }
        resArray[sports.length] = inputSport;
        return resArray;
    }

    private static void printALLSpots(String[] sports){
        for (int i = 0; i <sports.length ; i++) {
            System.out.print(sports[i] +" ");
        }
        System.out.println();

    }
    }

