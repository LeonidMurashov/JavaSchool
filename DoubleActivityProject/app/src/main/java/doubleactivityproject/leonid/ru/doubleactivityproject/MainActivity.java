package doubleactivityproject.leonid.ru.doubleactivityproject;

import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        temp = new TextView(this);
        temp.setText("First activity");
        temp.setOnTouchListener(this);
        setContentView(temp);
    }

    @Override
    public boolean onTouch(View v, MotionEvent motionEvent)
    {
        Intent intent = new Intent(this, AbotClass.class);
        startActivity(intent);
        return true;
    }
}
