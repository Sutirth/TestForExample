package workoutguru.astrobot.module;

import android.os.Build;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import workoutguru.astrobot.BuildConfig;
import workoutguru.astrobot.model.UsersList.UserList;

/**
 * Created by sutirthchakravarty on 27/12/17.
 */

public class ApiModule {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    public Retrofit retrofit;
    public ApiManager apiManager;
    private static ApiModule instance = null;
    public ApiModule(){

        try{
            OkHttpClient.Builder okClient = new OkHttpClient.Builder();
            if(BuildConfig.DEBUG){
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
                okClient.addInterceptor(interceptor);

            }

//            okClient.addInterceptor(new Interceptor() {
//                @Override
//                public Response intercept(Chain chain) throws IOException {
//                    Request.Builder builder = chain.request().newBuilder();
//                    builder.header()
//
//                    return null;
//                }
//            });

            retrofit = new Retrofit.Builder()
                        .baseUrl(ApiModule.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(okClient.build())
                        .build();
            apiManager = retrofit.create(ApiManager.class);

        }catch (Exception e){

        }finally {

        }
    }

    public static ApiModule getInstance(){
        if(instance == null){
            instance = new ApiModule();
        }
        return instance;
    }




    public ApiManager getService(){
        return  apiManager;
    }

    public interface ApiManager{

        String Users = BASE_URL+"users";
        @GET(Users)
        Call<UserList> getUsersList();
    }


}
