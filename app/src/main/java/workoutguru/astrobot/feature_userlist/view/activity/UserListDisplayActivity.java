package workoutguru.astrobot.feature_userlist.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import workoutguru.astrobot.R;
import workoutguru.astrobot.feature_userlist.presenter.UserPresenter;

/**
 * Created by sutirthchakravarty on 27/12/17.
 */

public class UserListDisplayActivity extends AppCompatActivity {

    @BindView(R.id.rlUserList)
    RecyclerView rlUserList;

    UserPresenter userPresenter = new UserPresenter();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist_layout);
        ButterKnife.bind(this);

        intializeRecyclerView();

        userPresenter.getUserList();

    }


    public void intializeRecyclerView(){
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rlUserList.setLayoutManager(mLayoutManager);
    }


}
