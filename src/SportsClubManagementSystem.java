public class SportsClubManagementSystem {
    public static void main(String[] args) {
        Sport sport1 = new Sport("Football", "Team Sport");
        Sport sport2 = new Sport("Tennis", "Individual Sport");


        Athlete athlete1 = new Athlete("Islambek Kuat", 25, "Football");
        Athlete athlete2 = new Athlete("Jane Smith", 22, "Tennis");

        SportsClub club1 = new SportsClub("Champion Club", "Astana");
        SportsClub club2 = new SportsClub("Victory Club", "Almaty");
        System.out.println(sport1);
        System.out.println(sport2);
        System.out.println(athlete1);
        System.out.println(athlete2);
        System.out.println(club1);
        System.out.println(club2);

        if (club1.getClubName().equals(club2.getClubName())) {
            System.out.println("The clubs have the same name.");
        } else {
            System.out.println("The clubs have different names.");
        }
    }
}

