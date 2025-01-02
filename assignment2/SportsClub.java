import java.util.ArrayList;
import java.util.List;

class SportsClub extends AbstractEntity {
    private String clubName;
    private String location;
    private List<Athlete> athletes;

    public SportsClub(String id, String clubName, String location) {
        super(id);
        this.clubName = clubName;
        this.location = location;
        this.athletes = new ArrayList<>();
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void addAthlete(Athlete athlete) {
        this.athletes.add(athlete);
    }

    public void removeAthlete(Athlete athlete) {
        this.athletes.remove(athlete);
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "id='" + getId() + '\'' +
                ", clubName='" + clubName + '\'' +
                ", location='" + location + '\'' +
                ", athletes=" + athletes +
                '}';
    }
}