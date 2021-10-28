package com.example.gusto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {


    private CalendarView lunchCalendar;

    private TextView lunchTextView;

    private String originalDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lunchCalendar = findViewById(R.id.calendarView3);
        lunchTextView = findViewById(R.id.lunchTextView);
        lunchCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, day);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
                switch (dayOfWeek) {
                    case 2:
                        if(dayOfWeekInMonth % 2 == 0) {
                            lunchTextView.setText(getString(R.string.monday_week_1));
                        }
                        else {
                            lunchTextView.setText(getString(R.string.monday_week_2));
                        }
                        break;
                    case 3:
                        if(dayOfWeekInMonth % 2 == 0) {
                            lunchTextView.setText(getString(R.string.tuesday_week_1));
                        }
                        else {
                            lunchTextView.setText(getString(R.string.tuesday_week_2));
                        }
                        break;
                    case 4:
                        if(dayOfWeekInMonth % 2 == 0) {
                            lunchTextView.setText(getString(R.string.wednesday_week_1));
                        }
                        else {
                            lunchTextView.setText(getString(R.string.wednesday_week_2));
                        }
                        break;
                    case 5:
                        if(dayOfWeekInMonth % 2 == 0) {
                            lunchTextView.setText(getString(R.string.thursday_week_1));
                        }
                        else {
                            lunchTextView.setText(getString(R.string.thursday_week_2));
                        }
                        break;
                    case 6:
                        if(dayOfWeekInMonth % 2 == 0) {
                            lunchTextView.setText(getString(R.string.friday_week_1));
                        }
                        else {
                            lunchTextView.setText(getString(R.string.friday_week_2));
                        }
                        break;
                    default:
                        lunchTextView.setText(getString(R.string.weekend));
                }
            }
        });
    }
}