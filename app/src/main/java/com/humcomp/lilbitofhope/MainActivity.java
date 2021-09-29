/*
* Charles Lett Jr.
* Program 1 (A Little Bit of Hope)
* CS-3203 (12:30 Tue, Thur)
* So far this program is only a UI, will apparently expand upon this throughout the semester
*
* NOTES
* may move button functionality to another class and import it to clean up the main class
* consider using fragments opposed to separate activities (might be faster?)
*/

package com.humcomp.lilbitofhope;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //var for buttons
    Button button1_HealthEmp;
    Button button2_Finance;
    Button button3_EduSteam;
    Button button4_ComServ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this removes the splash screen after app load
        //hacky; can't edit UI further > deleted activity in drawable; use drawable-v24
        //no longer needed; make app theme the parent
        //setTheme(R.style.Theme_AppCompat_DayNight_NoActionBar);

        //sets the main view? (main page)
        super.onCreate(savedInstanceState);
       // for (int timer = 0; timer < (419 / 4); timer++) {
            // No idea how this is viable but it does display the splash screen for however long
            // 'timer' is set (after 419 loops / 4?) this can't be efficient at all. find a better
            // way later.
        setContentView(R.layout.activity_main);
        //}
        //retrieve buttons from xml
        button1_HealthEmp = (Button) findViewById(R.id.Button1);
        button2_Finance = (Button) findViewById(R.id.Button2);
        button3_EduSteam = (Button) findViewById(R.id.Button3);
        button4_ComServ = (Button) findViewById(R.id.Button4);

        //methods for button actions
        button1_HealthEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openB1_HealthEmp_Activity();
            }
        });

        button2_Finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openB2_Finance_Activity();
            }
        });

        button3_EduSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openB3_EduSteam_Activity();
            }
        });


        button4_ComServ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openB4_ComService_Activity();
            }
        });
    }

        //this creates the open method for button1
        //implemented
        public void openB1_HealthEmp_Activity(){
            Intent intentB1 = new Intent(this, Button1_HealthEmp.class);
            startActivity(intentB1);
        }

        //this creates the open method for button2
        //implemented
        public void openB2_Finance_Activity(){
            Intent intentB2 = new Intent(this, Button2_Finance.class);
            startActivity(intentB2);
        }

        //this creates the call(?) method for button3
        public void openB3_EduSteam_Activity(){
            Intent intentB3 = new Intent(this, Button3_EduSteam.class);
            startActivity(intentB3);
        }

        //this creates the open method for button4
        //implemented
        public void openB4_ComService_Activity(){
        Intent intentB4 = new Intent(this, Button4_ComServ.class);
        startActivity(intentB4);
        }
}