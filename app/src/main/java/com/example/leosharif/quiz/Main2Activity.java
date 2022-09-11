package com.example.leosharif.quiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
        private Button submit;
        private TextView result;

        private Button b1;
        private RadioGroup r1;
        private RadioButton radioButton;
        //private TextView textView;
        private Button b2;
        private RadioGroup r2;
        private RadioButton radioButton2;

        private Button b3;
        private RadioGroup r3;
        private RadioButton radioButton3;

        private Button b4;
        private RadioGroup r4;
        private RadioButton radioButton4;

        private Button b5;
        private RadioGroup r5;
        private RadioButton radioButton5;

        private Button b6;
        private RadioGroup r6;
        private RadioButton radioButton6;

        private Button b7;
        private RadioGroup r7;
        private RadioButton radioButton7;

        private Button b8;
        private RadioGroup r8;
        private RadioButton radioButton8;

        private Button b9;
        private RadioGroup r9;
        private RadioButton radioButton9;

        private Button b10;
        private RadioGroup r10;
        private RadioButton radioButton10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.b1);
        r1=(RadioGroup)findViewById(R.id.r1);
        b2=(Button)findViewById(R.id.b2);
        r2=(RadioGroup)findViewById(R.id.r2);
        b3=(Button)findViewById(R.id.b3);
        r3=(RadioGroup)findViewById(R.id.r3);
        b4=(Button)findViewById(R.id.b4);
        r4=(RadioGroup)findViewById(R.id.r4);
        b5=(Button)findViewById(R.id.b5);
        r5=(RadioGroup)findViewById(R.id.r5);
        b6=(Button)findViewById(R.id.b6);
        r6=(RadioGroup)findViewById(R.id.r6);
        b7=(Button)findViewById(R.id.b7);
        r7=(RadioGroup)findViewById(R.id.r7);
        b8=(Button)findViewById(R.id.b8);
        r8=(RadioGroup)findViewById(R.id.r8);
        b9=(Button)findViewById(R.id.b9);
        r9=(RadioGroup)findViewById(R.id.r9);
        b10=(Button)findViewById(R.id.b10);
        r10=(RadioGroup)findViewById(R.id.r10);

        submit=(Button)findViewById(R.id.submit) ;
        result=(TextView)findViewById(R.id.result);
        //textView = (TextView)findViewById(R.id.textView1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //b1.setText("int score=0");
                int score = 0;
                int rb = r1.getCheckedRadioButtonId();
                radioButton = (RadioButton)findViewById(rb);
                if(rb == R.id.radioButton7)
                {
                    b1.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b1.setBackgroundColor(Color.RED);
                    b1.setText("Correct Answer:    'D'");
                }

                int rb2 = r2.getCheckedRadioButtonId();
                radioButton2 = (RadioButton)findViewById(rb2);
                if(rb2 == R.id.radioButton10)
                {
                    b2.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b2.setBackgroundColor(Color.RED);
                    b2.setText("Correct Answer:    'B'");
                }

                int rb3 = r3.getCheckedRadioButtonId();
                radioButton3 = (RadioButton)findViewById(rb3);
                if(rb3 == R.id.radioButton15)
                {
                    b3.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b3.setBackgroundColor(Color.RED);
                    b3.setText("Correct Answer:    'C'");
                }

                int rb4 = r4.getCheckedRadioButtonId();
                radioButton4 = (RadioButton)findViewById(rb4);
                if(rb4 == R.id.radioButton18)
                {
                    b4.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b4.setBackgroundColor(Color.RED);
                    b4.setText("Correct Answer:    'B'");
                }

                int rb5 = r5.getCheckedRadioButtonId();
                radioButton5 = (RadioButton)findViewById(rb5);
                if(rb5 == R.id.radioButton24)
                {
                    b5.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b5.setBackgroundColor(Color.RED);
                    b5.setText("Correct Answer:    'D'");
                }

                int rb6 = r6.getCheckedRadioButtonId();
                radioButton6 = (RadioButton)findViewById(rb6);
                if(rb6 == R.id.radioButton25)
                {
                    b6.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b6.setBackgroundColor(Color.RED);
                    b6.setText("Correct Answer:    'A'");
                }

                int rb7 = r7.getCheckedRadioButtonId();
                radioButton7 = (RadioButton)findViewById(rb7);
                if(rb7 == R.id.radioButton28)
                {
                    b7.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b7.setBackgroundColor(Color.RED);
                    b7.setText("Correct Answer:    'B'");
                }

                int rb8 = r8.getCheckedRadioButtonId();
                radioButton8 = (RadioButton)findViewById(rb8);
                if(rb8 == R.id.radioButton31)
                {
                    b8.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b8.setBackgroundColor(Color.RED);
                    b8.setText("Correct Answer:    'A'");
                }

                int rb9 = r9.getCheckedRadioButtonId();
                radioButton9 = (RadioButton)findViewById(rb9);
                if(rb9 == R.id.radioButton35)
                {
                    b9.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b9.setBackgroundColor(Color.RED);
                    b9.setText("Correct Answer:    'C'");
                }

                int rb10 = r10.getCheckedRadioButtonId();
                radioButton10 = (RadioButton)findViewById(rb10);
                if(rb10 == R.id.radioButton40)
                {
                    b10.setBackgroundColor(Color.GREEN);
                    score++;
                }

                else
                {
                    b10.setBackgroundColor(Color.RED);
                    b10.setText("Correct Answer:    'D'");
                }

                result.setText("Obtained marks:  "+score);
            }
        });
    }
}
