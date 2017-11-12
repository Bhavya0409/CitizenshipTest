package com.example.bhavyashah.citizenshiptest;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;

public class CompleteFragment extends BaseFragment {

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_complete;
    }

    @OnClick(R.id.retake_quiz_button)
    public void retakeQuiz() {
        BaseFragment.replaceFragmentNotInBackstack(R.id.fragment_container,
                                                   (AppCompatActivity) getActivity(),
                                                   new HomeFragment(),
                                                   HomeFragment.class.getSimpleName());
        FragmentManager fm = getActivity().getSupportFragmentManager();
        for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }
    }
}
