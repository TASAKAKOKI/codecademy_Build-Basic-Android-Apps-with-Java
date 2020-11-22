// Define your Question class here:
public class Question {
    int correctAnswer;
    int playerAnswer;
    int imageId;
    String questionText;
    String answer0;
    String answer1;
    String answer2;
    String answer3;
    public Question(int imageIdentifier, String questionString, String answerZero, String answerOne, String answerTwo, String answerThree, int correctAnswerIndex) {
      this.imageId = imageIdentifier;
      this.questionText = questionString;
      this.answer0 = answerZero;
      this.answer1 = answerOne;
      this.answer2 = answerTwo;
      this.answer3 = answerThree;
      this.correctAnswer = correctAnswerIndex;
      this.playerAnswer = -1;
    }
}