package yulongproductions.com.quickplay;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    private EditText username;
    private EditText password;
    private Button loginButton;
    private GlobalFunctions mGlobalFunctions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.username = (EditText) findViewById(R.id.nameEditText);
        this.password = (EditText) findViewById(R.id.passwordEditText);
        this.loginButton = (Button) findViewById(R.id.loginButton);
        this.mGlobalFunctions = new GlobalFunctions(this);
        this.mGlobalFunctions.setupUI(findViewById(R.id.mainLayout));
    }
}
