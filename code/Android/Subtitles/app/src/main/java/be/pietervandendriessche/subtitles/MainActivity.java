package be.pietervandendriessche.subtitles;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.accessibility.CaptioningManager;
import android.widget.VideoView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeVideoView();
        InformatieCustomCaptions();
    }

    private void InformatieCustomCaptions() {
        //Nagaan van informatie voor eigengemaakte caption service a.d.h.v CaptionManager
        CaptioningManager captioningManager = (CaptioningManager) getApplicationContext().getSystemService(getApplicationContext().CAPTIONING_SERVICE);

        float tekenGrootte = captioningManager.getFontScale();
        CaptioningManager.CaptionStyle ondertitelStijl = captioningManager.getUserStyle();
        Locale ondertitelingTaal = captioningManager.getLocale();


        //Opvangen van veranderingen bij ondertitelingen
        captioningManager.addCaptioningChangeListener(new CaptioningManager.CaptioningChangeListener() {
            @Override
            public void onEnabledChanged(boolean enabled) {
                super.onEnabledChanged(enabled);
                System.out.println("Captions zijn aan of uitgezet!");
            }
            @Override
            public void onUserStyleChanged(@NonNull CaptioningManager.CaptionStyle userStyle) {
                super.onUserStyleChanged(userStyle);
                System.out.println("De ondertitelStijl is aangepast!");
            }
            @Override
            public void onLocaleChanged(@Nullable Locale locale) {
                super.onLocaleChanged(locale);
                System.out.println("De ondertiteling taal is aangepast");
            }
            @Override
            public void onFontScaleChanged(float fontScale) {
                super.onFontScaleChanged(fontScale);
                System.out.println("De tekengrootte is aangepast");
            }
        });

    }

    private void InitializeVideoView() {
        VideoView videoView = findViewById(R.id.videoView);
        //Toevoegen van captions aan een video
        videoView.addSubtitleSource(/*InputStream*/,/*MediaFormat*/);

    }


}
