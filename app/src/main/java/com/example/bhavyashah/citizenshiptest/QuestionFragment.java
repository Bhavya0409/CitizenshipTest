package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;

public class QuestionFragment extends BaseFragment {

    @BindView(R.id.answer_choices) ListView mChoices;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_question;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        String[] answers = new String[] {"The Constitution", "Declaration of Independence", "Articles of Confederation", "Freedom Papers"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, answers);
        mChoices.setAdapter(arrayAdapter);
        return view;
    }
}
