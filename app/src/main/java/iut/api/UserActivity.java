package iut.api;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class UserActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView avatar;
    @BindView(R.id.Button)
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        avatar = (ImageView)findViewById(R.id.avatar);
        Picasso.with(getApplicationContext().load("url_image").into(avatar));
        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
    }

}


-----------------------------RETROFIT(Appeler l'API)---------------------------------------------

@GET("user")
Call<User> getUser(@Header("Authorization") String authorization)