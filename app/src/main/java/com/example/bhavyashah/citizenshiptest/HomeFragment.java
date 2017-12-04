package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    public static final int NUM_QUESTIONS = 3;
    public static List<Integer> questionnaire;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        questionnaire = new ArrayList<>();
        return view;
    }

    @OnClick(R.id.begin_quiz_button)
    public void onClick() {
        //TODO prevent duplicates
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            questionnaire.add((int) (Math.random() * 100));
        }
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
