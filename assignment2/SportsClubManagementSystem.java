import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SportsClubManagementSystem {
    public static void main(String[] args) {

        Sport sport1 = new Sport("1", "Football", "Team Sport");
        Sport sport2 = new Sport("2", "Tennis", "Individual Sport");

        Athlete athlete1 = new Athlete("1", "Islambek Kuat", 25, "Football");
        Athlete athlete2 = new Athlete("2", "Elena Rybakina", 22, "Tennis");

        SportsClub club1 = new SportsClub("1", "Champion Club", "Astana");
        SportsClub club2 = new SportsClub("2", "Victory Club", "Almaty");

        club1.addAthlete(athlete1);
        club2.addAthlete(athlete2);

        System.out.println(sport1);
        System.out.println(sport2);
        System.out.println(athlete1);
        System.out.println(athlete2);
        System.out.println(club1);
        System.out.println(club2);

        System.out.println("Filtering athletes by sport 'Football':");
        club1.getAthletes().stream()
                .filter(a -> a.getSport().equals("Football"))
                .forEach(System.out::println);

        List<SportsClub> clubs = Arrays.asList(club1, club2);
        clubs.sort(Comparator.comparing(SportsClub::getClubName));
        System.out.println("Sorted clubs by name:");
        clubs.forEach(System.out::println);
    }
}
