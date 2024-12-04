import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        System.out.println("In constructor");
        questions[0] = new Question(1, "What is your name", "Vaibhav", "Atharva", "Harshal", "Vivek","Vaibhav");
        questions[1] = new Question(2, "What is your age", "56", "21", "89", "25","21");
        questions[2] = new Question(3, "What is your hobby", "Reels", "Cricket", "Badminton", "Driving","Driving");
        questions[3] = new Question(4, "What is your fav Company", "Google", "Microsoft", "Amazon", "Flipkart","Amazon");
        questions[4] = new Question(5, "What is your car's name", "BMW", "alto", "Rit'z", "Nano","Rit'z");
    }
    public void PlayQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question NO:" +q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }
    }

    public void Calscore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String actualans = que.getAns();
            String userans = selection[i];
            if(actualans.equals(userans)){
                score++;
            }

        }
        System.out.println("your score is:" +score);
        if(score>3){
            System.out.println("Your Pass");
        }else System.out.println("Your Fail");
    }

}
