package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question {
    public String question;
    public String correctAnswer;
    public String answer2;
    public String answer3;
    public String answer4;

    public Question(String question, String correctAnswer, String ans2, String ans3, String ans4) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answer2 = ans2;
        this.answer3 = ans3;
        this.answer4 = ans4;
    }

    public List<String> getAnswers() {
        List<String> list = new ArrayList<>();
        list.add(correctAnswer);
        list.add(answer2);
        list.add(answer3);
        list.add(answer4);
        Collections.shuffle(list);

        return list;
    }
}