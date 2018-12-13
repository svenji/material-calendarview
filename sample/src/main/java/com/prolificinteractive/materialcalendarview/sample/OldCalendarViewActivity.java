package com.prolificinteractive.materialcalendarview.sample;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Shows off the most basic usage
 */
public class OldCalendarViewActivity extends AppCompatActivity
        implements CalendarView.OnDateChangeListener {

    private static final DateFormat FORMATTER = SimpleDateFormat.getDateInstance();

    @BindView(R.id.calendarView)
    CalendarView widget;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_calendarview);
        ButterKnife.bind(this);

        widget.setOnDateChangeListener(this);
    }

    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month,
                                    int dayOfMonth) {
        textView.setText(FORMATTER.format(view.getDate()));
    }
}
