package yulongproductions.com.quickplay;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

        final String username = this.convert(this.username);
        final String password = this.convert(this.username);

        this.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startApp(username, password);
            }
        });
    }

    private void startApp(String username, String password) {
        Intent intent = new Intent();
        intent.putExtra("username", username);
        intent.putExtra("password", password);
    }

    private String convert(EditText e) {
        return e.getText().toString();
    }
}
