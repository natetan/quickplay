package yulongproductions.com.quickplay;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class ProfileSegment extends ActionBarActivity {

    private TextView statsTextView;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_segment);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        this.username = intent.getStringExtra(getString(R.string.username));
        int numbers[] = this.getNumbers();

        statsTextView = (TextView) findViewById(R.id.statTextView);
        statsTextView.setText(
                "Username: " + this.username +
                        "\nSkill: Advanced" +
                        "\nFavorite Sport: Basketball" +
                        "\nGames Played: " + numbers[0] +
                        "\nGames Created: " + numbers[1] +
                        "\nGames Joined: " + numbers[2]

        );


    }

    private int[] getNumbers() {
        int[] list = new int[3];
        Random r = new Random();
        list[0] = r.nextInt(31) + 1;
        list[1] = r.nextInt(list[0]);
        list[2] = list[0] - list[1];
        return list;
    }
}
