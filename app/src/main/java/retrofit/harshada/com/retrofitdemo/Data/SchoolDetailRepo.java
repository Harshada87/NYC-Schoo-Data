package retrofit.harshada.com.retrofitdemo.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit.harshada.com.retrofitdemo.UI.SchoolDetailActivity;
/*POJO class for NYC High school SAT details**/
public class SchoolDetailRepo {

    @SerializedName("dbn")
    @Expose
    private String dbn;

    @SerializedName("school_name")
    @Expose
    private String schoolName;

    @SerializedName("num_of_sat_test_takers")
    @Expose
    private String totalSatTestTakers;

    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    private String readingAvg;

    @SerializedName("sat_math_avg_score")
    @Expose
    private String mathAvg;

    @SerializedName("sat_writing_avg_score")
    @Expose
    private String writingAvg;
    public SchoolDetailRepo(SchoolDetailActivity schoolDetailActivity,String dbn, String schoolName, String totalSatTestTakers, String readingAvg, String mathAvg, String writingAvg) {
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.totalSatTestTakers = totalSatTestTakers;
        this.readingAvg = readingAvg;
        this.mathAvg = mathAvg;
        this.writingAvg = writingAvg;
    }
    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getTotalSatTestTakers() {
        return totalSatTestTakers;
    }

    public void setTotalSatTestTakers(String totalSatTestTakers) {
        this.totalSatTestTakers = totalSatTestTakers;
    }

    public String getReadingAvg() {
        return readingAvg;
    }

    public void setReadingAvg(String readingAvg) {
        this.readingAvg = readingAvg;
    }

    public String getMathAvg() {
        return mathAvg;
    }

    public void setMathAvg(String mathAvg) {
        this.mathAvg = mathAvg;
    }

    public String getWritingAvg() {
        return writingAvg;
    }

    public void setWritingAvg(String writingAvg) {
        this.writingAvg = writingAvg;
    }






}
