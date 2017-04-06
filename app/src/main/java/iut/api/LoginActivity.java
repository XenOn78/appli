package iut.api;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Retrofit;

import static android.R.attr.button;


public class LoginActivity extends ActionBarActivity {

    ImageView imageView;

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);


        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                 Picasso.with(getBaseContext()).load("http://i.imgur.com/DvpvklR.png").into(imageView)
                .load(imageView)
                .fit().centerInside()
                .into(imageView);

        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
            }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://adartza.iutbayonne.univ-pau.fr/~mvcrisostomo/Avatars/public/api/v1/avatar/alejandrovc.2194@gmail.com")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);

        Call<List<Repo>> repos = service.listRepos("octocat");
    }
}

