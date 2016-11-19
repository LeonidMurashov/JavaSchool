package systemprops.leonid.ru.systemprops;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
        int time = 200;
        while(true)
        {
            if (toneGen1.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT))
            {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            toneGen1.stopTone();
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(time - 10 > 0)
                time -= 10;
            else
                time = 0;
        }
*/

        /*
        TextView view1 = (TextView) findViewById(R.id.textView2);
        TextView view2 = (TextView) findViewById(R.id.textView1);
        TextView view3 = (TextView) findViewById(R.id.textView3);

        view1.setText(System.getProperty("java.vendor.url"));
        view2.setText(System.getProperty("java.version"));
        view3.setText(System.getProperty("user.name"));


        Log.d("Warning", "Something goes wrong");*/
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.wtf("on start", "rrgrgrgrgrgrgrgrg");
    }


}
