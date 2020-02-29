package com.example.multiplechoicequiz;

import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    private QuestionBank mQuestionBank = new QuestionBank();
    private TextView mScoreview;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonQuit;
    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreview = (TextView) findViewById(R.id.score_value);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        updateQuestion();
       //Button Listener Event for button logic goes here
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    if(view instanceof Button) {
                        ((Button)mButtonChoice1).setBackgroundColor(Color.parseColor("#228B22"));
                    }
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!

                        }
                        }, 1000);
                }
                else{
                    ((Button)mButtonChoice1).setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
            }
        }
        );
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    if(view instanceof Button) {
                        ((Button)mButtonChoice2).setBackgroundColor(Color.parseColor("#228B22"));
                    }
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
                else{
                    ((Button)mButtonChoice2).setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
            }
        }
        );
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    if(view instanceof Button) {
                        ((Button)view).setBackgroundColor(Color.parseColor("#228B22"));
                    }
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
                else{
                    ((Button)view).setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
            }
        }
        );
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore++;
                    updateScore(mScore);
                    if(view instanceof Button) {
                        ((Button)view).setBackgroundColor(Color.parseColor("#228B22"));
                    }
                    Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                             }
                             }, 1000);
                }
                else{
                    ((Button)view).setBackgroundColor(Color.parseColor("#228B22"));
                    Toast.makeText(MainActivity.this,"Incorrect",Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            updateQuestion(); //call function!
                        }
                        }, 1000);
                }
            }
        }
        );
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionBank.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionBank.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionBank.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionBank.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionBank.getChoice4(mQuestionNumber));
        mAnswer = mQuestionBank.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        ((Button)mButtonChoice1).setBackgroundColor(Color.parseColor("#C0A000"));
        ((Button)mButtonChoice2).setBackgroundColor(Color.parseColor("#C0A000"));
        ((Button)mButtonChoice3).setBackgroundColor(Color.parseColor("#C0A000"));
        ((Button)mButtonChoice4).setBackgroundColor(Color.parseColor("#C0A000"));
    }

    private void updateScore(int point){
        mScoreview.setText(""+point);
        //Changed.d
    }
}
