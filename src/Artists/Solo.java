package Artists;

import java.time.LocalDate;

public class Solo extends Artist{
    private String first_name;
    private String last_name;
    private LocalDate birthdate;

    public Solo(int id, String stage_name, LocalDate career_debut, String nationality) {
        super(id, stage_name, career_debut, nationality);
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthdate = birthdate;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
