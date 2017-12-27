package workoutguru.astrobot.feature_userlist.presenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import workoutguru.astrobot.model.UsersList.UserList;
import workoutguru.astrobot.module.ApiModule;

/**
 * Created by sutirthchakravarty on 27/12/17.
 */

public class UserPresenter {

    ApiModule apiModule ;
    public  UserPresenter(){

    }

    public void getUserList(){
        apiModule = ApiModule.getInstance();
        final Call<UserList> getUserList = apiModule.getService().getUsersList();
        getUserList.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {

            }
        });
    }
}
