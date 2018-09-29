package darylle.baldove.com.baldovedaryllelab4;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("4ITH","onCreate() has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITH","onStart has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITH","onResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITH","onPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITH","onStop() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "onDestroy() has been executed");
    }

    public void snack(View v){
        Snackbar.make(v,"You clicked next...",Snackbar.LENGTH_LONG).show();
    }

    public void toast(View v){
        Toast.makeText(this, "You clicked back...", Toast.LENGTH_LONG).show();
    }

}
