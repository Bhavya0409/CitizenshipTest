package com.example.bhavyashah.citizenshiptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               this,
                                               new HomeFragment(),
                                               HomeFragment.class.getSimpleName());
    }

    @Override
    public void onBackPressed() {
        if (QuestionFragment.count > 0) {
            QuestionFragment.count--;
        }
        super.onBackPressed();
    }
}
