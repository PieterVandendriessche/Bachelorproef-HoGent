package be.pietervandendriessche.talkback;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button knop;
    private Button announceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeButton();
        initializeButtonAnnounce();

        //Nagaan of talkback aan is.
        AccessibilityManager am = (AccessibilityManager) this.getSystemService(Context.ACCESSIBILITY_SERVICE);
        boolean isExploreByTouchEnabled = am.isTouchExplorationEnabled();
        System.out.println(isExploreByTouchEnabled);

    }

    private void initializeButton() {
        knop = (Button) findViewById(R.id.button);

        knop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                knop.setContentDescription("TalkBack should change Content Description");
            }
        });
    }

    private void initializeButtonAnnounce() {
        announceBtn = (Button) findViewById(R.id.button5);
        announceBtn.setOnClickListener(new View.OnClickListener() {
            int times = 0;
            @Override
            public void onClick(View v) {
                announceBtn.announceForAccessibility(String.format("%d times",++times));
            }
        });
    }
}
