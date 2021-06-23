package com.example.interviewmaster.vo;

public class QuestionOption {
    private int seq;
    private String optionText;

    public QuestionOption() {

    }
    public QuestionOption(int seq, String optionText) {
        this.seq = seq;
        this.optionText = optionText;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
