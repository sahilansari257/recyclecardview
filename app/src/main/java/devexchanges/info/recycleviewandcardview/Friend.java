package devexchanges.info.recycleviewandcardview;

/**
 * Created by Atiqul Alam on 9/12/2015.
 */
public class Friend {

    private String name;
    private String job;
    private boolean gender;

    public Friend(String name, boolean gender, String job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public boolean isGender() {
        return gender;
    }
}
