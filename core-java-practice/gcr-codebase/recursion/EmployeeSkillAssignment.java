import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] skills, int index,int target,
        ArrayList<Integer> team) {

        if (target == 0) {
            System.out.println(team);
            return;
        }

        if (index == skills.length || target < 0) {
            return;
        }

        team.add(skills[index]);
        findTeams(skills, index + 1,
                  target - skills[index], team);

        team.remove(team.size() - 1);

        findTeams(skills, index + 1,
                  target, team);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] skills = new int[n];

        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        System.out.print("Enter target skill score: ");
        int target = sc.nextInt();

        System.out.println("Possible Teams:");

        findTeams(skills, 0, target, new ArrayList<Integer>());

    }
}
