package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class CompleteFragment extends BaseFragment {

    @BindView(R.id.final_score) TextView mFinalScore;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_complete;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mFinalScore.setText(String.format(getString(R.string.final_score), QuestionFragment.numCorrect, HomeFragment.NUM_QUESTIONS));
        return view;
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
