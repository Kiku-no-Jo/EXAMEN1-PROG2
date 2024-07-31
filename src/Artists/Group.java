package Artists;

import java.time.LocalDate;
import java.util.ArrayList;

public class Group extends Artist {
    private ArrayList<Solo> members;

    public Group(int id, String stage_name, LocalDate career_debut, String nationality, ArrayList<Solo> members) {
        super(id, stage_name, career_debut, nationality);
        this.members = members;
    }

    public ArrayList<Solo> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Solo> members) {
        this.members = members;
    }
}
