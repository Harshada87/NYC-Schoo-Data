package retrofit.harshada.com.retrofitdemo.Interface;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit.harshada.com.retrofitdemo.Data.SchoolDetailRepo;
import retrofit.harshada.com.retrofitdemo.Data.SchoolListRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface SchoolDetailClient {

    @GET("/resource/{user}")

    Call<List<SchoolDetailRepo>> reposForUser(@Path("user") String user);


}
