package com.example.test;

import com.example.test.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public Question question1;
    public Question question2;
    public Question question3;
    public Question question4;
    public Question question5;
    public Question question6;
    public Question question7;
    public Question question8;
    public Question question9;
    public Question question10;

    public Test(Question q1, Question q2, Question q3, Question q4, Question q5, Question q6, Question q7, Question q8, Question q9,Question q10) {
        this.question1 = q1;
        this.question2 = q2;
        this.question3 = q3;
        this.question4 = q4;
        this.question5 = q5;
        this.question6 = q6;
        this.question7 = q7;
        this.question8 = q8;
        this.question9 = q9;
        this.question10 = q10;
    }

    public List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();
        list.add(question1);
        list.add(question2);
        list.add(question3);
        list.add(question4);
        list.add(question5);
        list.add(question6);
        list.add(question7);
        list.add(question8);
        list.add(question9);
        list.add(question10);
        Collections.shuffle(list);
        return list;
    }
}
