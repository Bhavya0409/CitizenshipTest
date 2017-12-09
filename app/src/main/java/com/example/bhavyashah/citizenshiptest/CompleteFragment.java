package com.example.bhavyashah.citizenshiptest;

import android.content.Intent;
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
        mFinalScore.setText(String.format(getString(R.string.final_score), QuestionFragment.numCorrect, HomeFragment.numQuestions));
        return view;
    }

    @OnClick(R.id.retake_quiz_button)
    public void retakeQuiz() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}
