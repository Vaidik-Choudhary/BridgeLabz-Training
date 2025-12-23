import java.util.Scanner;

public class StudentReportCard{

    // Method for random PCM marks
    public static int[][] generateScores(int students){

        int[][] scores=new int[students][3];

        for(int i=0;i<students;i++){
            scores[i][0]=10+(int)(Math.random()*90); 
            scores[i][1]=10+(int)(Math.random()*90); 
            scores[i][2]=10+(int)(Math.random()*90); 
        }
        return scores;
    }

    // Method to get total, average and percentage
    public static String[][] results(int[][] scores){

        String[][] result=new String[scores.length][3];

        for(int i=0;i<scores.length;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double percentage=(total/300.0)*100;

            avg=Math.round(avg*100.0)/100.0;
            percentage=Math.round(percentage*100.0)/100.0;

            result[i][0]=String.valueOf(total);
            result[i][1]=String.valueOf(avg);
            result[i][2]=String.valueOf(percentage);
        }
        return result;
    }

    // Method to calculate grade
    public static String[][] grades(String[][] result){

        String[][] grades=new String[result.length][1];

        for(int i=0;i<result.length;i++){
            double percentage=Double.parseDouble(result[i][2]);

            if(percentage>=80)
                grades[i][0]="A";
            else if(percentage>=70)
                grades[i][0]="B";
            else if(percentage>=60)
                grades[i][0]="C";
            else if(percentage>=50)
                grades[i][0]="D";
            else if(percentage>=40)
                grades[i][0]="E";
            else
                grades[i][0]="R";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(
            int[][] scores,
            String[][] result,
            String[][] grades){

        System.out.println("\nScore Card");
        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAverage\tPercentage\tGrade");
 
        for(int i=0;i<scores.length;i++){
            System.out.println(
                (i+1)+"\t"+
                scores[i][0]+"\t"+
                scores[i][1]+"\t"+
                scores[i][2]+"\t"+
                result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]+"\t\t"+
                grades[i][0]
            );
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int students=input.nextInt();

        int[][] scores=generateScores(students);
        String[][] results=results(scores);
        String[][] grades=grades(results);

        displayScoreCard(scores,results,grades);

        input.close();
    }
}