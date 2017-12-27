package workoutguru.astrobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import workoutguru.astrobot.feature_userlist.view.activity.UserListDisplayActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtMain)
    TextView txtMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        txtMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UserListDisplayActivity.class);
                startActivity(intent);
            }
        });
    }
}
