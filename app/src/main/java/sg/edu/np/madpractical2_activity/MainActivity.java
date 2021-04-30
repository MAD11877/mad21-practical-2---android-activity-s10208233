package sg.edu.np.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG =  "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"Create!");

        final User melol = new User("Lester","Not the brightest",10208233,false);
        final Button followbtn = findViewById(R.id.followbtn);
        Button msg = findViewById(R.id.messagebtn);
        TextView nameHolder = findViewById(R.id.nameHolder);
        TextView descHolder = findViewById(R.id.descHolder);

        nameHolder.setText(melol.name);
        descHolder.setText(melol.description);

        followbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                if(melol.followed == false){
                    followbtn.setText("unfollow");
                    melol.setFollowed(true);

                }
                else{
                    followbtn.setText("follow");
                    melol.setFollowed(false);
                }
                Log.v(TAG, melol.getName()+melol.getId()+melol.followed);
            }
        });



//        Button button = findViewById(R.id.messagebtn);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(intent);
//            }
//        });


    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG,"Start!");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAG,"Resume!");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG,"Pause!");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG,"Stop!");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"Stop!");
    }
}