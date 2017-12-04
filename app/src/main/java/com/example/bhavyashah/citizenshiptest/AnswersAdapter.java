package com.example.bhavyashah.citizenshiptest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AnswersAdapter extends ArrayAdapter<String> {

    private Context      context;
    private List<String> answers;
    private int          correctAnswer;
    private int answerClicked = -1;
    private static List<String> answerLetters = new ArrayList<>();
    private OnItemClickCallback callback;
    private boolean isCorrect;

    public AnswersAdapter(Context context, int resource, List<String> answers, int correctAnswer, OnItemClickCallback callback) {
        super(context, resource);
        this.context = context;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.callback = callback;
        answerLetters.add("A.");
        answerLetters.add("B.");
        answerLetters.add("C.");
        answerLetters.add("D.");
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.answer_choice_item, parent, false);
        final TextView questionLetter = rowView.findViewById(R.id.answer_choice_letter);
        final TextView questionText = rowView.findViewById(R.id.fragment_question_text);
        questionLetter.setText(answerLetters.get(position));
        questionText.setText(answers.get(position));
        if (answerClicked != -1) { //if an answer was clicked
            rowView.setOnClickListener(null);
            if (position == correctAnswer) {
                //if the view being loaded is the correct answer, set background to correct
                isCorrect = true;
                rowView.setBackground(context.getResources().getDrawable(R.drawable.answer_choice_background_correct));
            } else if (position == answerClicked) {
                //if the view being loaded was the selected answer, but it is incorrect, set background to incorrect
                rowView.setBackground(context.getResources().getDrawable(R.drawable.answer_choice_background_incorrect));
                questionLetter.setTextColor(context.getResources().getColor(R.color.white));
                questionText.setTextColor(context.getResources().getColor(R.color.white));
                isCorrect = false;
            } //else use the default background
        } else {
            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answerClicked = position;
                    callback.onClick(isCorrect);
                    notifyDataSetChanged();
                }
            });
        }
        return rowView;
    }

    @Override
    public int getCount() {
        return answers.size();
    }
}
