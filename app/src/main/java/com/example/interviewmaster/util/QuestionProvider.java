package com.example.interviewmaster.util;

import com.example.interviewmaster.vo.QuestionOption;
import com.example.interviewmaster.vo.QuestionVO;

import java.util.ArrayList;
import java.util.List;

public class QuestionProvider {
    public static List<QuestionVO> getQuestions() {
        List<QuestionVO> result = new ArrayList<>();
        QuestionVO q = new QuestionVO();
        q.setId(1);
        q.setQtext("What is 2+5?");
        List<QuestionOption> options = new ArrayList<>();
        options.add(new QuestionOption(1,"10"));
        options.add(new QuestionOption(2,"7"));
        options.add(new QuestionOption(3,"20"));
        q.setAnswer("7");
        q.setOptions(options);
        result.add(q);

        q = new QuestionVO();
        q.setId(2);
        q.setQtext("What is 20+50?");
        options = new ArrayList<>();
        options.add(new QuestionOption(1,"10"));
        options.add(new QuestionOption(2,"20"));
        options.add(new QuestionOption(3,"70"));
        q.setAnswer("70");
        q.setOptions(options);

        result.add(q);

        return result;
    }
}
