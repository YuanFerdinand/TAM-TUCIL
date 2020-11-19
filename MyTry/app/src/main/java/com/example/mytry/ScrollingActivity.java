package com.example.mytry;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.format.DateFormat;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScrollingActivity extends AppCompatActivity {
    public TextView tvAlarm1,tvAlarm2,tvAlarm3,tvAlarm4;
    int t1Hour,t1Minute,t2Hour,t2Minute,t3Hour,t3Minute,t4Hour,t4Minute;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tvAlarm1=(TextView)findViewById(R.id.tv_alarm1);
        tvAlarm2=(TextView)findViewById(R.id.tv_alarm2);
        tvAlarm3=(TextView)findViewById(R.id.tv_alarm3);
        tvAlarm4=(TextView)findViewById(R.id.tv_alarm4);

        tvAlarm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(ScrollingActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        t1Hour=hourOfDay;
                        t1Minute=minute;
                        //nyetor jam dan menit
                        String time = t1Hour+":"+t1Minute;
                        //atur format jam 24
                        SimpleDateFormat f24Hours = new SimpleDateFormat("HH:mm");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,t1Hour,t1Minute);
                        tvAlarm1.setText(DateFormat.format("hh:mm aa",calendar));
                    }
                },12,0,false
                );
                //back transparant
                timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //Menampilkan jam yang sudah ditentukam
                timePickerDialog.updateTime(t1Hour,t1Minute);
                timePickerDialog.show();

            }
        });

        tvAlarm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(ScrollingActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        t2Hour=hourOfDay;
                        t2Minute=minute;
                        //nyetor jam dan menit
                        String time = t2Hour+":"+t2Minute;
                        //atur format jam 24
                        SimpleDateFormat f24Hours = new SimpleDateFormat("HH:mm");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,t2Hour,t2Minute);
                        tvAlarm2.setText(DateFormat.format("hh:mm aa",calendar));

                    }
                },12,0,false
                );
                //back transparant
                timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //Menampilkan jam yang sudah ditentukam
                timePickerDialog.updateTime(t2Hour,t2Minute);
                timePickerDialog.show();

            }
        });

        tvAlarm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(ScrollingActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        t3Hour=hourOfDay;
                        t3Minute=minute;
                        //nyetor jam dan menit
                        String time = t3Hour+":"+t3Minute;
                        //atur format jam 24
                        SimpleDateFormat f24Hours = new SimpleDateFormat("HH:mm");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,t3Hour,t3Minute);
                        tvAlarm3.setText(DateFormat.format("hh:mm aa",calendar));

                    }
                },12,0,false
                );
                //back transparant
                timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //Menampilkan jam yang sudah ditentukam
                timePickerDialog.updateTime(t3Hour,t3Minute);
                timePickerDialog.show();

            }
        });

        tvAlarm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(ScrollingActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        t4Hour=hourOfDay;
                        t4Minute=minute;
                        //nyetor jam dan menit
                        String time = t4Hour+":"+t4Minute;
                        //atur format jam 24
                        SimpleDateFormat f24Hours = new SimpleDateFormat("HH:mm");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0,0,0,t4Hour,t4Minute);
                        tvAlarm4.setText(DateFormat.format("hh:mm aa",calendar));
                    }
                },12,0,false
                );
                //back transparant
                timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //Menampilkan jam yang sudah ditentukam
                timePickerDialog.updateTime(t4Hour,t4Minute);
                timePickerDialog.show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Settings settings = new Settings();
                FragmentManager mFragmentManager = getSupportFragmentManager();
                FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.fragment_container,settings);
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();

                return true;
            case R.id.action_About:
                Intent i = new Intent(this,About.class);
                startActivity(i);
                return true;
            default:
                return true;
        }
    }


}
