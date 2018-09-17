package tw.edu.tut.mis.a2018_9_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"asdaihdoaid");
        Log.i(TAG,"This is a book");
        super.onCreate(savedInstanceState);
        Log.d(TAG,"This a book");
        setContentView(R.layout.activity_main);
        Log.w(TAG,"This a book");
        Log.e(TAG,"This a book");
    }
}
