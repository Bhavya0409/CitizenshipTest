package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;

import butterknife.BindView;

public class QuestionFragment extends BaseFragment implements OnItemClickCallback {

    @BindView(R.id.answer_choices) ListView mChoices;
    @BindView(R.id.next_button)    Button   mNextButton;

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
        mChoices.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void onClick() {
        mNextButton.setEnabled(true);
        mNextButton.setClickable(true);
        mNextButton.setVisibility(View.VISIBLE);
    }
}
