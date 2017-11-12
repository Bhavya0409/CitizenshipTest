package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class QuestionFragment extends BaseFragment implements OnItemClickCallback {

    @BindView(R.id.fragment_question_number) TextView mQuestionNumber;
    @BindView(R.id.fragment_question_text)   TextView mQuestionText;
    @BindView(R.id.next_button)              Button   mNextButton;
    @BindView(R.id.submit_button)            Button   mSubmitButton;

    @BindView(R.id.answer_choices_list)       ListView     mChoices;
    @BindView(R.id.answer_choices_user_input) LinearLayout mUserInputs;

    @BindView(R.id.answer_choices_user_input_1) LinearLayout mUserInput1;
    @BindView(R.id.answer_choices_user_input_2) LinearLayout mUserInput2;
    @BindView(R.id.answer_choices_user_input_3) LinearLayout mUserInput3;

    @BindView(R.id.answer_choices_user_input_1_editext) EditText mUserInput1EditText;
    @BindView(R.id.answer_choices_user_input_2_editext) EditText mUserInput2EditText;
    @BindView(R.id.answer_choices_user_input_3_editext) EditText mUserInput3EditText;

    @BindView(R.id.answer_choices_user_input_1_icon) ImageView mUserInput1Icon;
    @BindView(R.id.answer_choices_user_input_2_icon) ImageView mUserInput2Icon;
    @BindView(R.id.answer_choices_user_input_3_icon) ImageView mUserInput3Icon;

    public static int count                         = 0;
    public static int MULTIPLE_CHOICE_QUESTION_TYPE = 0;
    public static int ONE_ANSWER_QUESTION_TYPE      = 1;
    public static int TWO_ANSWER_QUESTION_TYPE      = 2;
    public static int THREE_ANSWER_QUESTION_TYPE    = 3;

    private boolean isOneValid;
    private boolean isTwoValid;
    private boolean isThreeValid;

    private int questionType = -1;
    private int question     = -1;
    private String[][] keywords;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_question;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        mQuestionNumber.setText(String.format(getString(R.string.question_number), count + 1));
        question = HomeFragment.questionnaire.get(count);
        int isMultipleChoiceQuestion = Arrays.asList(Questions.multipleChoiceQuestions).indexOf(question);
        int isOneAnswerQuestion = Arrays.asList(Questions.oneAnswerQuestions).indexOf(question);
        int isTwoAnswerQuestion = Arrays.asList(Questions.twoAnswersQuestions).indexOf(question);
        int isThreeAnswerQuestion = Arrays.asList(Questions.threeAnswersQuestions).indexOf(question);

        if (isMultipleChoiceQuestion != -1) {
            questionType = MULTIPLE_CHOICE_QUESTION_TYPE;
        } else if (isOneAnswerQuestion != -1) {
            questionType = ONE_ANSWER_QUESTION_TYPE;
        } else if (isTwoAnswerQuestion != -1) {
            questionType = TWO_ANSWER_QUESTION_TYPE;
        } else if (isThreeAnswerQuestion != -1) {
            questionType = THREE_ANSWER_QUESTION_TYPE;
        } else {
            Toast.makeText(getActivity(), "Error displaying question.", Toast.LENGTH_SHORT).show();
        }
        if (questionType != -1) {
            setAnswerSection(questionType);
        }
        mQuestionText.setText(Questions.questions[question]);
        return view;
    }

    @Override
    public void onClick() {
        enableButton();
    }

    private void enableButton() {
        mNextButton.setEnabled(true);
        mNextButton.setClickable(true);
        mNextButton.setVisibility(View.VISIBLE);
    }

    private void enableSubmitButton() {
        mSubmitButton.setClickable(true);
        mSubmitButton.setEnabled(true);
        mSubmitButton.setVisibility(View.VISIBLE);
    }

    private void disableSubmitButton() {
        mSubmitButton.setClickable(false);
        mSubmitButton.setEnabled(false);
        mSubmitButton.setVisibility(View.GONE);
    }

    @OnClick(R.id.next_button)
    public void onNextClick() {
        count++;
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               new QuestionFragment(),
                                               QuestionFragment.class.getSimpleName());
    }

    @OnClick(R.id.submit_button)
    public void onSubmitClick() {
        mUserInput1EditText.setEnabled(false);
        mUserInput2EditText.setEnabled(false);
        mUserInput3EditText.setEnabled(false);
        validateUserInput();
        disableSubmitButton();
        enableButton();
    }

    private boolean validateKeywords(String input) {
        for (int set = 0; set < keywords.length; set++) {
            int count = 0;
            for (int j = 0; j < keywords[set].length; j++) {
                String keyword = keywords[set][j];
                if (input.contains(keyword)) {
                    count++;
                }
            }
            if (count == keywords[set].length) {
                return true;
            }
        }
        return false;
    }

    private void validateUserInput() {
        if (questionType == ONE_ANSWER_QUESTION_TYPE) {
            String userInput1 = mUserInput1EditText.getText().toString();
            keywords = Questions.getKeywords(question);
            if (validateKeywords(userInput1.toLowerCase())) {
                mUserInput1Icon.setVisibility(View.VISIBLE);
                mUserInput1Icon.setSelected(true);
            } else {
                mUserInput1Icon.setVisibility(View.VISIBLE);
                mUserInput1Icon.setSelected(false);
            }
        } else if (questionType == TWO_ANSWER_QUESTION_TYPE) {

        } else if (questionType == THREE_ANSWER_QUESTION_TYPE) {

        } else {
            Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
        }
    }

    @OnTextChanged(R.id.answer_choices_user_input_1_editext)
    public void onInput1Changed(CharSequence text) {
        if (!TextUtils.isEmpty(text) && text.toString().trim().length() > 0) {
            isOneValid = true;
        } else {
            isOneValid = false;
        }
        setNextButton();
    }

    @OnTextChanged(R.id.answer_choices_user_input_2_editext)
    public void onInput2Changed(CharSequence text) {
        if (!TextUtils.isEmpty(text) && text.toString().trim().length() > 0) {
            isTwoValid = true;
        } else {
            isTwoValid = false;
        }
        setNextButton();
    }

    @OnTextChanged(R.id.answer_choices_user_input_3_editext)
    public void onInput3Changed(CharSequence text) {
        if (!TextUtils.isEmpty(text) && text.toString().trim().length() > 0) {
            isThreeValid = true;
        } else {
            isThreeValid = false;
        }
        setNextButton();
    }

    private void setNextButton() {
        if (questionType == ONE_ANSWER_QUESTION_TYPE) {
            if (isOneValid) {
                enableSubmitButton();
            } else {
                disableSubmitButton();
            }
        } else if (questionType == TWO_ANSWER_QUESTION_TYPE) {
            if (isOneValid && isTwoValid) {
                enableSubmitButton();
            } else {
                disableSubmitButton();
            }
        } else if (questionType == THREE_ANSWER_QUESTION_TYPE) {
            if (isOneValid && isTwoValid && isThreeValid) {
                enableSubmitButton();
            } else {
                disableSubmitButton();
            }
        }
    }

    private void setAnswerSection(int questionType) {
        if (questionType == MULTIPLE_CHOICE_QUESTION_TYPE) {
            mChoices.setVisibility(View.VISIBLE);
            mUserInputs.setVisibility(View.GONE);

            String[] answers = Questions.getAnswerChoices(question);
            int correctAnswer = Questions.getCorrectAnswer(question);

            ArrayAdapter<String> arrayAdapter = new AnswersAdapter(getActivity(),
                                                                   android.R.layout.simple_list_item_1,
                                                                   Arrays.asList(answers),
                                                                   correctAnswer,
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
