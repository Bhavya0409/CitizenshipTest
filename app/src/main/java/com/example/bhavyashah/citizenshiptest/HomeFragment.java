package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    public static final String NEW_QUIZ = "new_quiz";
    public static final int NUM_QUESTIONS = 2;
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
        for (int i = 0; i < NUM_QUESTIONS; i++) {
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
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               questionFragment,
                                               QuestionFragment.class.getSimpleName());
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_home;
    }
}
