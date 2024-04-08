package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {



        if (counter == 0) { //Question 1
            question.setText("1. What is the highest mountain in Lesotho?");
            opt1.setText("Thaba-li-Mmela");
            opt2.setText("Thabana-Ntlenyana");
            opt3.setText("Qiloane");
            opt4.setText("Thaba-Tsoeu");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Which is the highest dam in Lesotho?");
            opt1.setText("Mohale Dam");
            opt2.setText("'Muela Dam");
            opt3.setText("Katse Dam");
            opt4.setText("Metolong Dam");
        }
        if (counter == 2) { //Question 3
            question.setText("3. What is the name of the traditional Basotho hat often worn by men in Lesotho?");
            opt1.setText("Mokorotlo");
            opt2.setText("Top Hat");
            opt3.setText("Ts'ets'e");
            opt4.setText("Cow Hat");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Which musical instrument is commonly associated with Basotho music and culture?");
            opt1.setText("Quiter");
            opt2.setText("Saxophone");
            opt3.setText("Piano");
            opt4.setText("Lesiba");
        }
        if (counter == 4) {//Question 5
            question.setText("5. Which traditional dance form is commonly performed during cultural events and festivals in Lesotho?");
            opt1.setText("Mohobelo");
            opt2.setText("Mables");
            opt3.setText("Flamenco");
            opt4.setText("StreetDance");
        }
        if (counter == 5) { //Question 6
            question.setText("6. which river is the key component of the Lesotho Highlands Water Project?");
            opt1.setText("Tsoaing");
            opt2.setText("Senqu");
            opt3.setText("Maliba-matsho");
            opt4.setText("Matsoku");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Which river is the primary source of water for the Katse Dam");
            opt1.setText("Makhaleng");
            opt2.setText("Matsoku");
            opt3.setText("Orange River");
            opt4.setText("Senqu");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Which river flows through the capital city of Lesotho, Maseru, before eventually joining the Orange River?");
            opt1.setText("Senqu River");
            opt2.setText("Malibamat'so River");
            opt3.setText("Thaba-Tseka River");
            opt4.setText("Matsoku River");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Which traditional Basotho dish is a staple food in Lesotho?");
            opt1.setText("Pap");
            opt2.setText("Rice");
            opt3.setText("Stamp");
            opt4.setText("Salads");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Which animal is prominently featured on the national emblem of Lesotho?");
            opt1.setText("Elephant");
            opt2.setText("Horse");
            opt3.setText("Crockdile");
            opt4.setText("Donkey");
        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("Thabana-Ntlenyana")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Katse Dam")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Mokorotlo")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Lesiba")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Mohobelo")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Senqu")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Senqu")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Malibamat'so River")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Pap")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Horse")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}

