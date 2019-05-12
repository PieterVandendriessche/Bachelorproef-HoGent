package be.pietervandendriessche.vergrotenlettertype;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Magnifier;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(geefSchaalTekst());
    }

    private float geefSchaalTekst() {
        float fontScale = 0;
        try {
          fontScale = Settings.System.getFloat(this.getApplicationContext().getContentResolver(), Settings.System.FONT_SCALE);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        return fontScale;
    }
}
