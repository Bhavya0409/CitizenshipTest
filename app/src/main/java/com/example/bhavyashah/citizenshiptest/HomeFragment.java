package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class HomeFragment extends BaseFragment {

    public static final String NEW_QUIZ = "new_quiz";
    public static int numQuestions;

    @BindView(R.id.num_questions_layout) protected TextInputLayout mNumQuestionsLayout;
    @BindView(R.id.num_questions) protected        EditText        mNumQuestions;
    @BindView(R.id.begin_quiz_button) protected    Button          mBeginQuizButton;

    public static List<Integer> mQuestionnaire;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        mQuestionnaire = new ArrayList<>();
        getActivity().getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        return view;
    }

    @OnClick(R.id.begin_quiz_button)
    public void onClick() {
        numQuestions = Integer.valueOf(mNumQuestions.getText().toString());
        for (int i = 0; i < numQuestions; i++) {
            int newQuestion = (int) (Math.random() * 100);
            while (mQuestionnaire.contains(newQuestion)) {
                newQuestion = (int) (Math.random() * 100);
            }
            mQuestionnaire.add(newQuestion);
        }
        QuestionFragment questionFragment = new QuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(NEW_QUIZ, true);
        questionFragment.setArguments(bundle);
        BaseFragment.replaceFragmentNotInBackstack(R.id.fragment_container,
                                                   (AppCompatActivity) getActivity(),
                                                   questionFragment,
                                                   QuestionFragment.class.getSimpleName());
    }

    @OnTextChanged(R.id.num_questions)
    public void onNumQuestionsChanged() {
        int questions;
        try {
            questions = Integer.valueOf(mNumQuestions.getText().toString());
            if (questions <= 0 || questions > 100) {
                mNumQuestionsLayout.setErrorEnabled(true);
                mBeginQuizButton.setEnabled(false);
                mBeginQuizButton.setClickable(false);
                mBeginQuizButton.setVisibility(View.GONE);
            } else {
                mNumQuestionsLayout.setErrorEnabled(false);
                mBeginQuizButton.setEnabled(true);
                mBeginQuizButton.setClickable(true);
                mBeginQuizButton.setVisibility(View.VISIBLE);
            }
        } catch (Exception e) {
            mNumQuestionsLayout.setErrorEnabled(true);
            mBeginQuizButton.setEnabled(false);
            mBeginQuizButton.setClickable(false);
            mBeginQuizButton.setVisibility(View.GONE);
        }
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_home;
    }
}
