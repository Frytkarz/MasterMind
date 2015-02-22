package oth.mastermind;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Settings extends Activity implements View.OnClickListener {

    RadioButton rdBtnOnly, rdBtnTime, rdBtnEasy, rdBtnHard, rdBtnOne, rdBtnMany;
    EditText eTxtNumber;
    Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        rdBtnOnly=(RadioButton) findViewById(R.id.rdBtnOnly);
        rdBtnTime=(RadioButton) findViewById(R.id.rdBtnTime);
        rdBtnEasy=(RadioButton) findViewById(R.id.rdBtnEasy);
        rdBtnHard=(RadioButton) findViewById(R.id.rdBtnHard);
        rdBtnOne=(RadioButton) findViewById(R.id.rdBtnOne);
        rdBtnMany=(RadioButton) findViewById(R.id.rdBtnMany);

        eTxtNumber=(EditText) findViewById(R.id.eTxtNumber);

        btnSave=(Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId()==btnSave.getId()){
            int[] settings=new int[3];
            if(rdBtnOnly.isChecked())
                settings[0]=0;
            else
                settings[0]=1;
            if(rdBtnEasy.isChecked())
                settings[1]=0;
            else
                settings[1]=1;
            if(rdBtnOne.isChecked())
                settings[2]=0;
            else
                settings[2]=1;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
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
