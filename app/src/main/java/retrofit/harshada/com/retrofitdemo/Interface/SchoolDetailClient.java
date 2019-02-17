package retrofit.harshada.com.retrofitdemo.Interface;

import java.util.List;

import retrofit.harshada.com.retrofitdemo.Data.SchoolDetailRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SchoolDetailClient {
    /* setting NYC High school SAT list client**/
    @GET("/resource/{user}")
    Call<List<SchoolDetailRepo>> reposForUser(@Path("user") String user);
}
