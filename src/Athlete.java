class Athlete {
    private String name;
    private int age;
    private String sport;

    public Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Athlete{name='" + name + '\'' + ", age=" + age + ", sport='" + sport + '\'' + '}';
    }
}