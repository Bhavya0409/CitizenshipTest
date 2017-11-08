package com.example.bhavyashah.citizenshiptest;

import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @OnClick(R.id.begin_quiz_button)
    public void onClick() {
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               new QuestionFragment(),
                                               QuestionFragment.class.getSimpleName());
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_home;
    }
}
