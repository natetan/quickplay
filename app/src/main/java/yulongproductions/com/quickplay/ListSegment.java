package yulongproductions.com.quickplay;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class ListSegment extends ActionBarActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_segment);

        mImageView = (ImageView) findViewById(R.id.gameListImage);
        mImageView.setImageDrawable(getResources().getDrawable(R.drawable.games_list));
    }
}
