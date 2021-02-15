package FirstSteps.exercises;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
      //"The architect {името на архитекта} will need {необходими часове}
        // hours to complete {брой на проектите} project/s."
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int hoursNeededPerProject = 3;
        int projectsNum = Integer.parseInt(scanner.nextLine());
        int result = projectsNum * hoursNeededPerProject;
        int totalProjects = projectsNum;

        System.out.printf("The architect %s will need %d hours to complete %d project/s. ",name,result,totalProjects);






    }
}
