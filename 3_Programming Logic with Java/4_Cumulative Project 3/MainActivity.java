public class MainActivity {
    // Add generateRandomNumber() here
    public int generateRandomNumber(int max) {
      int randomN = (int) (Math.random() * max);
      return randomN;
    }
    // Add getGameOverMessage() here
    public String getGameOverMessage(int totalCorrect, int totalQuestions) {
      if(totalCorrect == totalQuestions) {
        String a = "You got all " + totalQuestions + " right! You won!";
        return a;
      } else {
        String b = "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        return b;
      }
    }
  }