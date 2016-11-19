package doubleactivityproject.leonid.ru.doubleactivityproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by student4 on 19.11.16.
 */
public class AbotClass extends Activity implements View.OnTouchListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ((TextView)findViewById(R.id.textView)).setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        finish();
        return true;
    }
}
