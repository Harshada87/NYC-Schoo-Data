package retrofit.harshada.com.retrofitdemo.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit.harshada.com.retrofitdemo.UI.MainActivity;

/*POJO class for NYC High school list**/
public class SchoolListRepo {

    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("school_name")
    @Expose
    private String schoolName;
    @SerializedName("location")
    @Expose
    private String location;

    public SchoolListRepo(MainActivity mainActivity, List<SchoolListRepo> repos) {
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.location = location;
    }

    public String getDbn() {
        return dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
