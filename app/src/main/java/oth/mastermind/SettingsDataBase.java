package oth.mastermind;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Fryta on 22.02.15.
 */
public class SettingsDataBase {
    int[] settings = new int[3];
    static String fileName = "Settings.db";

    SettingsDataBase() {
        for (int i = 0; i <= 3; i++)
            settings[i] = 0;
    }

    void readSettingFromFile(View view) {
        //File file = new File(fileName);
        try {
            FileInputStream fis = view.getContext().openFileInput(fileName);
            for (int i = 0; i < 3; i++)
                settings[i] =fis.read();
            fis.close();
            Toast.makeText(view.getContext(), "Settings:READ:Done!", Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            Toast.makeText(view.getContext(), "Settings:READ:FileNotFoundException", Toast.LENGTH_LONG).show();
            e.printStackTrace();

        } catch (IOException e) {
            Toast.makeText(view.getContext(), "Settings:READ:IOException", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }


    }

    void saveSettingsToFile(View view) {
        try {
            FileOutputStream fos = view.getContext().openFileOutput(fileName, Context.MODE_PRIVATE);
            for(int i=0; i<3; i++)
                fos.write(settings[i]);
            fos.close();
            Toast.makeText(view.getContext(), "Settings:SAVE:Done!", Toast.LENGTH_LONG).show();
        } catch(FileNotFoundException e){
            Toast.makeText(view.getContext(), "Settings:SAVE:FileNotFoundException", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {
            Toast.makeText(view.getContext(), "Settings:SAVE:IOException", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
