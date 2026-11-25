/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Project: Personality Quiz Application
 * Course: INFO C 211 - Programming II
 * Author: Ana Gonzalez Hiraldo
 * Date: November 25, 2026
 * Description: Stores a quiz question and its two answer choices.
 */

package personalityquiz;

public class PersonalityQuiz {

    private String question;
    private String answerA;
    private String answerB;

    // Creates a question
    public PersonalityQuiz(String question, String answerA, String answerB) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
    }

    // Gets the question
    public String getQuestion() {
        return question;
    }

    // Gets answer A
    public String getAnswerA() {
        return answerA;
    }

    // Gets answer B
    public String getAnswerB() {
        return answerB;
    }
}
