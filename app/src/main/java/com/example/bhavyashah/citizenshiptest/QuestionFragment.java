package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class QuestionFragment extends BaseFragment implements OnItemClickCallback {

    @BindView(R.id.answer_choices)           ListView mChoices;
    @BindView(R.id.next_button)              Button   mNextButton;
    @BindView(R.id.fragment_question_number) TextView mQuestionNumber;
    @BindView(R.id.fragment_question_text)   TextView mQuestionText;

    public static int count = 0;
    List<String> masterQuestionList = Arrays.asList(Questions.questions);

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_question;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        String[] answers = new String[]{"The Constitution", "Declaration of Independence", "Articles of Confederation", "Freedom Papers"};
        ArrayAdapter<String> arrayAdapter = new AnswersAdapter(getActivity(),
                                                               android.R.layout.simple_list_item_1,
                                                               Arrays.asList(answers),
                                                               0,
                                                               this);
        mQuestionNumber.setText(String.format(getString(R.string.question_number), count+1));
        mQuestionText.setText(masterQuestionList.get(HomeFragment.questionnaire.get(count)));
        mChoices.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void onClick() {
        mNextButton.setEnabled(true);
        mNextButton.setClickable(true);
        mNextButton.setVisibility(View.VISIBLE);
    }

    @OnClick (R.id.next_button)
    public void onNextClick() {
        count++;
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               new QuestionFragment(),
                                               QuestionFragment.class.getSimpleName());
    }


}
