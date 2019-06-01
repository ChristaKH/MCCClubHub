/**
 * This is the class for handling the splash screen of the app.
 * In this splash screen it should have a gradient background
 * of green and blue. It should also have a center logo with the
 * school's mascot. When the splash screen first appears it
 * will wait for 2 seconds then the logo will jump up and off the
 * screen.
 */
package chatch.jtaylor.estewart.mccclubhub;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private ImageView logoSplashImageView;  // Image view of the logo on the splash page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logoSplashImageView = findViewById(R.id.logoSplashImageView);

        /** Delay any action on the splash screen for 2 seconds
         *  Delay the activity with a TimerTask
         *  Have the logo jump up and off the screen
         */
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                //Animation animation = AnimationUtils.loadAnimation( getApplicationContext(), R.anim.logo_lift_anim);
                //logoSplashImageView.startAnimation(animation);
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                // Finish current activity
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 2000); // Delay is in milliseconds
    }
/*
    private void doBounceAnimation(View targetView) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(targetView, "translationX", 0, 25, 0);
        //animator.setInterpolator(new EasingInterpolator(Ease.ELASTIC_IN_OUT));
        animator.setStartDelay(500);
        animator.setDuration(1500);
        animator.start();
    */
}
