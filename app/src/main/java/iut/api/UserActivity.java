package iut.api;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

                            CONFIGURER



--------------------------BUTTERKNIFE (affichage de la vue)------------------------------

class ExampleActivity extends Activity {
    @BindView(R.id.title) TextView title;
    @BindView(R.id.subtitle) TextView subtitle;
    @BindView(R.id.footer) TextView footer;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        ButterKnife.bind(this);
        // TODO Use fields...
    }
};

----------------------------PICASSO (Appeler l'image)--------------------------------------

Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);


        Interface publique GitHubService {
        @GET ("utilisateurs / {utilisateur} / repos")
        Appelez <List <Repo >> listRepos (@Path ("user") String user);
        }

-----------------------------RETROFIT(Appelerl'API)---------------------------------------------

@GET("user")
Call<User> getUser(@Header("Authorization") String authorization)