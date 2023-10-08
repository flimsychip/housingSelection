import java.util.Scanner;
public class HousingSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        var points = 0;
        System.out.println("hi, welcome to housing selection. we will be asking a few questions to determine your eligibility for campus housing.\nthe higher your score at the end, the higher your priority status.");
        //age
        System.out.print("how old are you? ");
        int age = input.nextInt();
        if (age > 22){
            points += 3;
        }
        //class year
        input.nextLine();
        System.out.print("what class year are you? (freshman, sophomore, junior, senior) ");
        var classYear = input.nextLine();
        if (classYear.equalsIgnoreCase("junior") || classYear.equalsIgnoreCase("senior")){
            points += 1;
        }
        //part or full time
        System.out.print("are you a part time or full time student? ");
        var load = input.nextLine();
        if (load.equalsIgnoreCase("part time") || load.equalsIgnoreCase("part")){
            points -= 1;
        }
        //in or out of state
        System.out.print("are you from in state or out of state? ");
        var residency = input.nextLine();
        if (residency.equalsIgnoreCase("out of state") || residency.equalsIgnoreCase("out")){
            points += 5;
        } else {
            System.out.print("how many miles are you from school? please estimate. ");
            int distance = input.nextInt();
            input.nextLine();
            //farther means higher priority, super close means less. in the middle doesn't change anything
            if (distance >= 25){
                points += 3;
            } else if (distance < 5){
                points -= 1;
            }
        }
        //economic background
        System.out.print("do you receive financial aid? ");
        var aid = input.nextLine();
        if (aid.equalsIgnoreCase("yes") || aid.equalsIgnoreCase("y")){
            points += 4;
            System.out.print("does your financial aid cover your entire tuition? ");
            var aidExtent = input.nextLine();
            if (aidExtent.equalsIgnoreCase("yes") || aidExtent.equalsIgnoreCase("y")){
                points += 1;
            }
        } else {
            points -= 1;
        }
        //disability needs
        System.out.print("do you have a disability and need housing accommodations? ");
        var accommodations = input.nextLine();
        if (accommodations.equalsIgnoreCase("yes") || accommodations.equalsIgnoreCase("y")){
            points += 5;
        }
        //on campus job
        System.out.print("do you have an on campus job? ");
        var campusJob = input.nextLine();
        if (campusJob.equalsIgnoreCase("yes") || campusJob.equalsIgnoreCase("y")){
            points += 3;
        }
        System.out.printf("your score for housing is: %d", points);
    }
}
