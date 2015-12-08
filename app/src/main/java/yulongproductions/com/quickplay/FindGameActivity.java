package yulongproductions.com.quickplay;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class FindGameActivity extends ActionBarActivity {

    private ImageView mImageView;
    private Button listButton;
    private Button createButton;
    private Button profileButton;
    private String mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_game);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        mUserName = intent.getStringExtra(getString(R.string.username));

        listButton = (Button) findViewById(R.id.gameListButton);
        createButton = (Button) findViewById(R.id.createButton);
        profileButton = (Button) findViewById(R.id.profileButton);
        mImageView = (ImageView) findViewById(R.id.mainImage);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageDrawable(getImage(R.drawable.games_list));
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView.setImageDrawable(getImage(R.drawable.create_game));
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getProfile(mUserName);
            }
        });
    }

    private void getProfile(String name) {
        Intent intent = new Intent(FindGameActivity.this, ProfileSegment.class);
        intent.putExtra(getString(R.string.username), name);
        startActivity(intent);
    }

    private Drawable getImage(int imageId) {
        return getResources().getDrawable(imageId);
    }
}
