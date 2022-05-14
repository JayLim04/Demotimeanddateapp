package sg.edu.rp.c346.id21033869.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);
        btnReset = findViewById(R.id.buttonReset);


        int hour = tp.getCurrentHour();
        int min = tp.getCurrentMinute();


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String timeString = "Time is "+hour+":"+min;
                tvDisplay.setText(timeString);

            }
        });

        int date = dp.getDayOfMonth();
        int month = dp.getMonth();~
        int yr = dp.getYear();
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateString = "Date is " +date+"/"+month+"/"+yr;
                tvDisplay.setText(dateString);

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("");
                tp.setCurrentHour(12);
                dp.updateDate(2020,1,1);
            }
        });


    }


}