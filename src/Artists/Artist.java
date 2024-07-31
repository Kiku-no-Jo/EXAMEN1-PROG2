package Artists;

import java.time.LocalDate;

public class Artist {
    private int id;
    private String stage_name;
    private LocalDate career_debut;
    private String nationality;

    public Artist(int id, String stage_name, LocalDate career_debut, String nationality) {
        this.id = id;
        this.stage_name = stage_name;
        this.career_debut = career_debut;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStage_name() {
        return stage_name;
    }

    public void setStage_name(String stage_name) {
        this.stage_name = stage_name;
    }

    public LocalDate getCareer_debut() {
        return career_debut;
    }

    public void setCareer_debut(LocalDate career_debut) {
        this.career_debut = career_debut;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
