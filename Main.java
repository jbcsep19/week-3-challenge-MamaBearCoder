import java.util.Scanner;
        import java.util.List;
        import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your first name:\n");
        String nombre = keyboard.nextLine();


        System.out.println("Please enter your last name:\n");
        String nombre2 = keyboard.nextLine();


        System.out.println("Please enter your e-mail address:\n");
        String email1 = keyboard.next();

        System.out.println("How many jobs would you like to enter?\n (Minimum of 1)\n");
        List<ArrayList<String>> ListOfJobLists = new ArrayList<ArrayList<String>>();

        int trabajo = Integer.parseInt(keyboard.next());

        System.out.println("Please Enter Job Information:");

        do {
            System.out.println("Enter company name");
            String company = keyboard.nextLine();
            keyboard.nextLine();

            System.out.println("Enter Job Title");
            String Title = keyboard.nextLine();


            System.out.println("Enter Job start date: \n");
            String start = keyboard.next();

            System.out.println("Enter Job end date: \n");
            String end = keyboard.next();
            String JobTime = start + "-" + end;

            System.out.println("Enter job description");
            String descript = keyboard.next();

            ArrayList<String> JobInfo = new ArrayList<String>();
            JobInfo.add(company);
            JobInfo.add(Title);
            JobInfo.add(JobTime);
            JobInfo.add(descript);

            ListOfJobLists.add(JobInfo);
            trabajo --;
        }
        while (trabajo > 0);{}
        System.out.println(nombre);
        System.out.println(email1);
        // System.out.println(ListOfJobLists); was using this to just list the master list of jobs. Following lines list out all info for each job inputted by the user
        ListOfJobLists.forEach(job ->
                job.forEach(System.out::println)
        );
        System.out.println("____________________________");
        System.out.println(nombre + nombre2);
        System.out.println(email1);
        System.out.println("----------------------------");
        System.out.println("WORK EXPERIENCE");
        ListOfJobLists.forEach(job ->
                job.forEach(System.out::println)
        );
        System.out.println("-----------------------------");
    }
}