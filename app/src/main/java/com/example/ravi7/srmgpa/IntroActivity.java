package com.example.ravi7.srmgpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by ravi7 on 13-10-2017.
 */
public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Welcome!", "Calculate gpa", R.drawable.ic_calculator, ContextCompat.getColor(this,R.color.bgcolor1)));
        addSlide(AppIntroFragment.newInstance("Student Portal!", "Seperate Portal for students to check their results", R.drawable.ic_graduate,  ContextCompat.getColor(this,R.color.bgcolor2)));
        addSlide(AppIntroFragment.newInstance("Teacher Portal!", "To check class wise results", R.drawable.ic_teacher,  ContextCompat.getColor(this,R.color.bgcolor3)));
        addSlide(AppIntroFragment.newInstance("Portable!", "Easy to access", R.drawable.ic_smartphone,  ContextCompat.getColor(this,R.color.bgcolor4)));

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this,MainActivity.class));
        finish();
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(this,MainActivity.class));
        finish();
        // Do something when users tap on Done button.
    }

}
