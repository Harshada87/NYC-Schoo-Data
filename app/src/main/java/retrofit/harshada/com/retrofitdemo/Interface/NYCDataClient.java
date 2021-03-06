package retrofit.harshada.com.retrofitdemo.Interface;

import java.util.List;

import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NYCDataClient {
    /* setting NYC High school list client**/
    @GET("/resource/{user}")
    Call<List<SchoolListRepo>> reposForUser(@Path("user") String user);
}
