import java.util.ArrayList;

public class MainActivity {
    // TODO #1: add integer member variables here
    int currentQuestionIndex;
    int totalCorrect;
    int totalQuestions;
    // TODO #2: add ArrayList member variable here
    ArrayList<Question> questions;
    // TODO #3 add startNewGame() here    
    public void startNewGame() {
      Question q1 = new Question(921238, "How tall is the Eiffel tower?", "1024 ft", "1063 ft", "1124 ft", "1163 ft", 1);
      Question q2 = new Question(107343, "Who invented the computer algorithm?", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
      Question q3 = new Question(748294, "What is the name for the patch of skin found on your elbow?", "Elbow Skin", "Fascia Elbora","Wenis", "Todd", 2);
      ArrayList<Question> newArray = new ArrayList<>();
      this.questions = newArray;
      this.questions.add(q1);
      this.questions.add(q2);
      this.questions.add(q3);
      this.totalCorrect = 0;
      this.totalQuestions = this.questions.size();
      Question firstQuestion = chooseNewQuestion();
      // displayQuestion(firstQuestion);
      // displayQuestionsRemaining(questions.size());
    }
    // TODO #4 add chooseNewQuestion() here
    public Question chooseNewQuestion() {
      int randomIndex = generateRandomNumber(this.questions.size());
      this.currentQuestionIndex = randomIndex;
      return getCurrentQuestion();
    }
    // TODO #5 add getCurrentQuestion() here
    public Question getCurrentQuestion(){ 
      return this.questions.get(this.currentQuestionIndex);
    }
    // TODO #6 add onAnswerSubmission() here
    public void onAnswerSubmission() {
      if(getCurrentQuestion().isCorrect()) {
        this.totalCorrect++;
      }
      questions.remove(this.currentQuestionIndex);
      // displayQuestionsRemaining(questions.size());
      if(this.questions.size() == 0) {
        System.out.println(this.getGameOverMessage(this.totalCorrect,this.totalQuestions));
        this.startNewGame();
      } else {
          this.chooseNewQuestion();
      }
      // TODO: uncomment after implementing displayQuestion()
      // displayQuestion(getCurrentQuestion());
    }
    int generateRandomNumber(int max) {
      double randomNumber = Math.random();
      double result = max * randomNumber;
      return (int) result;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        }
    }
}