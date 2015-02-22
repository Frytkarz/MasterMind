package oth.mastermind;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Play extends Activity implements View.OnClickListener {

    Button btnWhite, btnBlack, btnGreen, btnYellow, btnBrown, btnRed, btnBlue, btnMagenta;
    Button btnBall0, btnBall1, btnBall2, btnBall3;
    Button btnCheck, btnBack;
    ImageView imgBall00, imgBall01, imgBall02, imgBall03;
    ImageView answer00, answer01, answer02, answer03;

    int[] playerBall=new int[4];

    Context context;

    int ballPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        context =getApplicationContext();

        ballPosition=-1;

        btnWhite=(Button) findViewById(R.id.btnColorWhite);
        btnBlack=(Button) findViewById(R.id.btnColorBlack);
        btnGreen=(Button) findViewById(R.id.btnColorGreen);
        btnYellow=(Button) findViewById(R.id.btnColorYellow);
        btnBrown=(Button) findViewById(R.id.btnColorBrown);
        btnRed=(Button) findViewById(R.id.btnColorRed);
        btnBlue=(Button) findViewById(R.id.btnColorBlue);
        btnMagenta=(Button) findViewById(R.id.btnColorMagenta);

        btnBall0=(Button) findViewById(R.id.btnBall0);
        btnBall1=(Button) findViewById(R.id.btnBall1);
        btnBall2=(Button) findViewById(R.id.btnBall2);
        btnBall3=(Button) findViewById(R.id.btnBall3);

        btnCheck=(Button) findViewById(R.id.btnCheck);
        btnBack=(Button) findViewById(R.id.btnBack);

        imgBall00=(ImageView) findViewById(R.id.imgBall00);
        imgBall01=(ImageView) findViewById(R.id.imgBall01);
        imgBall02=(ImageView) findViewById(R.id.imgBall02);
        imgBall03=(ImageView) findViewById(R.id.imgBall03);

        answer00=(ImageView) findViewById(R.id.answer00);
        answer01=(ImageView) findViewById(R.id.answer01);
        answer02=(ImageView) findViewById(R.id.answer02);
        answer03=(ImageView) findViewById(R.id.answer03);

        btnWhite.setOnClickListener(this);
        btnBlack.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnBrown.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnMagenta.setOnClickListener(this);

        btnBall0.setOnClickListener(this);
        btnBall1.setOnClickListener(this);
        btnBall2.setOnClickListener(this);
        btnBall3.setOnClickListener(this);

        btnCheck.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v.getId()==btnWhite.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_white);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_white);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_white);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_white);
                    break;
                default:

            }
            playerBall[ballPosition]=1;
            ballPosition++;
        }
        else if(v.getId()==btnBlack.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_black);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_black);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_black);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_black);
                    break;
                default:

            }
            playerBall[ballPosition]=2;
            ballPosition++;
        }
        else if(v.getId()==btnBlue.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_blue);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_blue);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_blue);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_blue);
                    break;
                default:

            }
            playerBall[ballPosition]=3;
            ballPosition++;
        }
        else if(v.getId()==btnRed.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_red);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_red);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_red);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_red);
                    break;
                default:

            }
            playerBall[ballPosition]=4;
            ballPosition++;
        }
        else if(v.getId()==btnGreen.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_green);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_green);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_green);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_green);
                    break;
                default:

            }
            playerBall[ballPosition]=5;
            ballPosition++;
        }
        else if(v.getId()==btnYellow.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_yellow);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_yellow);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_yellow);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_yellow);
                    break;
                default:

            }
            playerBall[ballPosition]=6;
            ballPosition++;
        }
        else if(v.getId()==btnMagenta.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_magenta);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_magenta);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_magenta);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_magenta);
                    break;
                default:

            }
            playerBall[ballPosition]=7;
            ballPosition++;
        }
        else if(v.getId()==btnBrown.getId()){
            switch(ballPosition) {
                case 0:
                    btnBall0.setBackgroundResource(R.drawable.button_color_brown);
                    break;
                case 1:
                    btnBall1.setBackgroundResource(R.drawable.button_color_brown);
                    break;
                case 2:
                    btnBall2.setBackgroundResource(R.drawable.button_color_brown);
                    break;
                case 3:
                    btnBall3.setBackgroundResource(R.drawable.button_color_brown);
                    break;
                default:

            }
            playerBall[ballPosition]=8;
            ballPosition++;
        }

        else if(v.getId()==btnCheck.getId()){
            if(ballPosition==3) {
                ballPosition = -1;
            }
            else{
                Toast.makeText(context, "There are empty balls!", Toast.LENGTH_LONG);

            }
        }
        else if(v.getId()==btnBack.getId()) {
            Toast.makeText(context, "BACK!", Toast.LENGTH_LONG);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
