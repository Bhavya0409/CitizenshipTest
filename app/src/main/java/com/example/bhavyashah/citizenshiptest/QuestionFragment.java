package com.example.bhavyashah.citizenshiptest;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.Snackbar;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;

import static android.app.Activity.RESULT_OK;

public class QuestionFragment extends BaseFragment implements OnItemClickCallback {

    private static final String ONE                   = "one";
    private static final String TWO                   = "two";
    private static final String THREE                 = "three";
    private static final String QUESTION_TEXT         = "question";
    private static final int    REQ_CODE_SPEECH_INPUT = 100;

    @BindView(R.id.fragment_question_number) protected TextView  mQuestionNumber;
    @BindView(R.id.fragment_question_text) protected   TextView  mQuestionText;
    @BindView(R.id.next_button) protected              Button    mNextButton;
    @BindView(R.id.submit_button) protected            Button    mSubmitButton;
    @BindView(R.id.mic_1) protected                    ImageView mMic1Icon;
    @BindView(R.id.mic_2) protected                    ImageView mMic2Icon;
    @BindView(R.id.mic_3) protected                    ImageView mMic3Icon;

    @BindView(R.id.answer_choices_list) protected       ListView     mChoices;
    @BindView(R.id.answer_choices_user_input) protected LinearLayout mUserInputs;

    @BindView(R.id.answer_choices_user_input_1) protected LinearLayout mUserInput1;
    @BindView(R.id.answer_choices_user_input_2) protected LinearLayout mUserInput2;
    @BindView(R.id.answer_choices_user_input_3) protected LinearLayout mUserInput3;

    @BindView(R.id.answer_choices_user_input_1_editext) protected EditText mUserInput1EditText;
    @BindView(R.id.answer_choices_user_input_2_editext) protected EditText mUserInput2EditText;
    @BindView(R.id.answer_choices_user_input_3_editext) protected EditText mUserInput3EditText;

    @BindView(R.id.answer_choices_user_input_1_icon) protected ImageView mUserInput1Icon;
    @BindView(R.id.answer_choices_user_input_2_icon) protected ImageView mUserInput2Icon;
    @BindView(R.id.answer_choices_user_input_3_icon) protected ImageView mUserInput3Icon;

    @BindView(R.id.correct_answer_text) protected   TextView mCorrectAnswerText;
    @BindView(R.id.incorrect_answer_text) protected TextView mIncorrectAnswerText;
    @BindView(R.id.correct_answer) protected        ListView mCorrectAnswer;

    public static int count                         = 0;
    public static int numCorrect                    = 0;
    public static int MULTIPLE_CHOICE_QUESTION_TYPE = 0;
    public static int ONE_ANSWER_QUESTION_TYPE      = 1;
    public static int TWO_ANSWER_QUESTION_TYPE      = 2;
    public static int THREE_ANSWER_QUESTION_TYPE    = 3;

    private boolean isOneValid;
    private boolean isTwoValid;
    private boolean isThreeValid;

    private boolean isOneCorrect;
    private boolean isTwoCorrect;
    private boolean isThreeCorrect;

    private int questionType = -1;
    private int question     = -1;
    private int micOptionClicked = 1;
    private String[][] keywords;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_question;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        //TODO refactor to use arraylists and for loops instead of checking isOne, isTwo, isThree everywhere

        if (getArguments() != null) {
            boolean newQuiz = getArguments().getBoolean(HomeFragment.NEW_QUIZ);
            if (newQuiz) {
                count = 0;
                numCorrect = 0;
            }
        }
        mQuestionNumber.setText(String.format(getString(R.string.question_number), count + 1));
        question = HomeFragment.mQuestionnaire.get(count);

        if (Arrays.asList(Questions.multipleChoiceQuestions).indexOf(question) != -1) {
            questionType = MULTIPLE_CHOICE_QUESTION_TYPE;
        } else if (Arrays.asList(Questions.oneAnswerQuestions).indexOf(question) != -1) {
            questionType = ONE_ANSWER_QUESTION_TYPE;
        } else if (Arrays.asList(Questions.twoAnswersQuestions).indexOf(question) != -1) {
            questionType = TWO_ANSWER_QUESTION_TYPE;
        } else if (Arrays.asList(Questions.threeAnswersQuestions).indexOf(question) != -1) {
            questionType = THREE_ANSWER_QUESTION_TYPE;
        } else {
            Toast.makeText(getActivity(), "Error displaying question.", Toast.LENGTH_SHORT).show();
        }
        if (questionType != -1) {
            setAnswerSection(questionType);
        }
        String questionText = Questions.questions[question];
        MainActivity.textToSpeech.speak(questionText, TextToSpeech.QUEUE_FLUSH, null, null);
        mQuestionText.setText(questionText);
        return view;
    }

    @Override
    public void onClick(boolean isCorrect) {
        enableNextButton();
        if (isCorrect) {
            numCorrect++;
        }
    }

    private void enableNextButton() {
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
        keywords = Questions.getKeywords(question);
        mUserInput1Icon.setVisibility(View.VISIBLE);
        mUserInput2Icon.setVisibility(View.VISIBLE);
        mUserInput3Icon.setVisibility(View.VISIBLE);

        if (validateKeywords(mUserInput1EditText.getText().toString().toLowerCase())) {
            isOneCorrect = true;
            mUserInput1Icon.setSelected(true);
        } else {
            mUserInput1Icon.setSelected(false);
        }

        if (questionType == TWO_ANSWER_QUESTION_TYPE) {
            String userInput2 = mUserInput2EditText.getText().toString().toLowerCase();

            if (validateKeywords(userInput2)) {
                isTwoCorrect = true;
                mUserInput2Icon.setSelected(true);
            } else {
                mUserInput2Icon.setSelected(false);
            }
        } else if (questionType == THREE_ANSWER_QUESTION_TYPE) {
            String userInput2 = mUserInput2EditText.getText().toString().toLowerCase();
            String userInput3 = mUserInput3EditText.getText().toString().toLowerCase();

            if (validateKeywords(userInput2)) {
                isTwoCorrect = true;
                mUserInput2Icon.setSelected(true);
            } else {
                mUserInput2Icon.setSelected(false);
            }

            if (validateKeywords(userInput3)) {
                isThreeCorrect = true;
                mUserInput3Icon.setSelected(true);
            } else {
                mUserInput3Icon.setSelected(false);
            }
        }

        setCorrectedText();
    }

    private void setCorrectedText() {
        if (questionType == ONE_ANSWER_QUESTION_TYPE && isOneCorrect) {
            setCorrectAnswerData();
        } else if (questionType == TWO_ANSWER_QUESTION_TYPE && isOneCorrect && isTwoCorrect) {
            setCorrectAnswerData();
        } else if (questionType == THREE_ANSWER_QUESTION_TYPE && isOneCorrect && isTwoCorrect && isThreeCorrect) {
            setCorrectAnswerData();
        } else {
            mIncorrectAnswerText.setVisibility(View.VISIBLE);
            String numQuestions = questionType == ONE_ANSWER_QUESTION_TYPE ? ONE : questionType == TWO_ANSWER_QUESTION_TYPE ? TWO : THREE;
            mIncorrectAnswerText.setText(String.format(getString(R.string.incorrect_answer_text), numQuestions));
            mCorrectAnswer.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, Questions.getAnswer(question)));
        }
    }

    private void setCorrectAnswerData() {
        numCorrect++;
        mCorrectAnswerText.setVisibility(View.VISIBLE);
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

    @OnClick({R.id.mic_1, R.id.mic_2, R.id.mic_3})
    public void onMicClick(View view) {
        if (MainActivity.textToSpeech.isSpeaking()) {
            MainActivity.textToSpeech.stop();
        }

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, getString(R.string.say_something));

        switch (view.getId()) {
            case R.id.mic_1:
                micOptionClicked = 1;
                break;
            case R.id.mic_2:
                micOptionClicked = 2;
                break;
            case R.id.mic_3:
                micOptionClicked = 3;
                break;
            default:
                micOptionClicked = 1;
                break;
        }
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getActivity(),
                           R.string.device_not_supported,
                           Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    switch (micOptionClicked) {
                        case 1:
                            mUserInput1EditText.setText(result.get(0));
                            break;
                        case 2:
                            mUserInput2EditText.setText(result.get(0));
                            break;
                        case 3:
                            mUserInput3EditText.setText(result.get(0));
                            break;
                        default:
                            Snackbar.make(mQuestionText, R.string.error_saving_input, Snackbar.LENGTH_SHORT).show();

                    }
                }
                break;
            }

        }
    }

    @OnClick(R.id.next_button)
    public void onNextClick() {
        count++;
        BaseFragment fragmentToOpen = new QuestionFragment();
        if (count == HomeFragment.NUM_QUESTIONS) {
            fragmentToOpen = new CompleteFragment();
        }
        BaseFragment.replaceFragmentInActivity(R.id.fragment_container,
                                               (AppCompatActivity) getActivity(),
                                               fragmentToOpen,
                                               fragmentToOpen.getClass().getSimpleName());
    }

    @OnClick(R.id.submit_button)
    public void onSubmitClick() {
        mUserInput1EditText.setEnabled(false);
        mUserInput2EditText.setEnabled(false);
        mUserInput3EditText.setEnabled(false);
        mMic1Icon.setVisibility(View.GONE);
        mMic2Icon.setVisibility(View.GONE);
        mMic3Icon.setVisibility(View.GONE);
        validateUserInput();
        disableSubmitButton();
        enableNextButton();
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
}
