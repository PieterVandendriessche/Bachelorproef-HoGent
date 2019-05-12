package be.pietervandendriessche.magnifier;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Magnifier;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewText = findViewById(R.id.firstView);

        final Magnifier magnifier = new Magnifier(viewText);
        viewText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    //Bij indrukken element vergroten
                magnifier.show(event.getX(),event.getY());
                }
                else if (event.getAction() == MotionEvent.ACTION_MOVE){
                    //Bij beweging en indrukken vergroten
                    magnifier.show(event.getX(),event.getY());
                }
                else if (event.getAction() == MotionEvent.ACTION_UP){
                    //Bij opheffen vinger, verwijderen vergrootglas
                    magnifier.dismiss();
                }
                return  true;
            }
        });




    }
}
