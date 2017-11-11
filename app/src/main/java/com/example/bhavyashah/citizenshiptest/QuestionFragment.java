package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class QuestionFragment extends BaseFragment implements OnItemClickCallback {

    @BindView(R.id.next_button)              Button   mNextButton;
    @BindView(R.id.fragment_question_number) TextView mQuestionNumber;
    @BindView(R.id.fragment_question_text)   TextView mQuestionText;

    @BindView(R.id.answer_choices_list)       ListView     mChoices;
    @BindView(R.id.answer_choices_user_input) LinearLayout mUserInputs;

    @BindView(R.id.answer_choices_user_input_1) LinearLayout mUserInput1;
    @BindView(R.id.answer_choices_user_input_2) LinearLayout mUserInput2;
    @BindView(R.id.answer_choices_user_input_3) LinearLayout mUserInput3;

    @BindView(R.id.answer_choices_user_input_1_editext) EditText mUserInput1EditText;
    @BindView(R.id.answer_choices_user_input_2_editext) EditText mUserInput2EditText;
    @BindView(R.id.answer_choices_user_input_3_editext) EditText mUserInput3EditText;

    public static  int count                         = 0;
    private static int MULTIPLE_CHOICE_QUESTION_TYPE = 0;
    private static int ONE_ANSWER_QUESTION_TYPE      = 1;
    private static int TWO_ANSWER_QUESTION_TYPE      = 2;
    private static int THREE_ANSWER_QUESTION_TYPE    = 3;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_question;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        mQuestionNumber.setText(String.format(getString(R.string.question_number), count + 1));
        int question = HomeFragment.questionnaire.get(count);
        int isMultipleChoiceQuestion = Arrays.asList(Questions.multipleChoiceQuestions).indexOf(question);
        int isOneAnswerQuestion = Arrays.asList(Questions.oneAnswerQuestions).indexOf(question);
        int isTwoAnswerQuestion = Arrays.asList(Questions.twoAnswersQuestions).indexOf(question);
        int isThreeAnswerQuestion = Arrays.asList(Questions.threeAnswersQuestions).indexOf(question);

        if (isMultipleChoiceQuestion != -1) {
            setAnswerSection(MULTIPLE_CHOICE_QUESTION_TYPE);
        } else if (isOneAnswerQuestion != -1) {
            setAnswerSection(ONE_ANSWER_QUESTION_TYPE);
        } else if (isTwoAnswerQuestion != -1) {
            setAnswerSection(TWO_ANSWER_QUESTION_TYPE);
        } else if (isThreeAnswerQuestion != -1) {
            setAnswerSection(THREE_ANSWER_QUESTION_TYPE);
        } else {
            Toast.makeText(getActivity(), "Error displaying question.", Toast.LENGTH_SHORT).show();
        }
        mQuestionText.setText(Questions.questions[question]);
        return view;
    }

    @Override
    public void onClick() {
        mNextButton.setEnabled(true);
        mNextButton.setClickable(true);
        mNextButton.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.next_button)
    public void onNextClick() {
        count++;
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               new QuestionFragment(),
                                               QuestionFragment.class.getSimpleName());
    }

    private void setAnswerSection(int questionType) {
        if (questionType == MULTIPLE_CHOICE_QUESTION_TYPE) {
            mChoices.setVisibility(View.VISIBLE);
            mUserInputs.setVisibility(View.GONE);

            String[] answers = new String[]{"The Constitution", "Declaration of Independence", "Articles of Confederation", "Freedom Papers"};
            ArrayAdapter<String> arrayAdapter = new AnswersAdapter(getActivity(),
                                                                   android.R.layout.simple_list_item_1,
                                                                   Arrays.asList(answers),
                                                                   0,
                                                                   this);
            mChoices.setAdapter(arrayAdapter);
        } else {
            mChoices.setVisibility(View.GONE);
            mUserInputs.setVisibility(View.VISIBLE);
            mUserInput1.setVisibility(View.VISIBLE);

            if (questionType == ONE_ANSWER_QUESTION_TYPE) {
                mUserInput2.setVisibility(View.GONE);
                mUserInput3.setVisibility(View.GONE);
            } else if (questionType == TWO_ANSWER_QUESTION_TYPE) {
                mUserInput2.setVisibility(View.VISIBLE);
                mUserInput3.setVisibility(View.GONE);
            } else if (questionType == THREE_ANSWER_QUESTION_TYPE) {
                mUserInput2.setVisibility(View.VISIBLE);
                mUserInput3.setVisibility(View.VISIBLE);
            } else {
                Toast.makeText(getActivity(), "Error setting answer section", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
