package oth.mastermind;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainMenu extends Activity implements View.OnClickListener {

    Button btnPlay, btnSettings, btnBest;
    TextView txtMastermind;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        context =getApplicationContext();

        btnPlay=(Button) findViewById(R.id.btnPlay);
        btnSettings=(Button) findViewById(R.id.btnSettings);
        btnBest=(Button) findViewById(R.id.btnBest);

        txtMastermind=(TextView) findViewById(R.id.txtMastermind);

        btnPlay.setOnClickListener(this);
        btnBest.setOnClickListener(this);
        btnSettings.setOnClickListener(this);

    }

    public void onClick(View v){
            Intent intent;

            if(v.getId()==btnPlay.getId())
                intent = new Intent(context, Play.class);
            else if(v.getId()==btnSettings.getId())
                intent = new Intent(context, Settings.class);
            else if(v.getId()==btnBest.getId())
                intent = new Intent(context, Best.class);
            else
                intent = new Intent(context, MainMenu.class);

            startActivity(intent);
            setContentView(R.layout.activity_play);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
