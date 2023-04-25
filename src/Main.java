import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Member> memberList = new HashMap<String, Member>();
        String name;
        int age;
        Scanner consoleInput = new Scanner(System.in);
        int input = -1;
        while (input != 3) {
            System.out.println("1. Add a member\n2. Remove a member\n3. Quit");
            while (true) {
                try {
                    input = consoleInput.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input, try again.");
                    consoleInput.next();
                    continue;
                }
                break;
            }
            if (input == 1) {
                addMember(memberList, consoleInput);
                printUserList(memberList);
                System.out.println();
            } else if (input == 2) {
                removeMember(memberList, consoleInput);
                printUserList(memberList);
                System.out.println();
            }
        }

    }
    public static void addMember(HashMap memberList, Scanner consoleInput) {
        String name;
        int age;
        int ID;
        while(true) {
            try {
                System.out.print("Enter ID: ");
                ID = consoleInput.nextInt();
                System.out.print("Enter the name: ");
                name = consoleInput.next();
                System.out.print("Enter the age: ");
                age = consoleInput.nextInt();
                System.out.println();
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                consoleInput.next();
                continue;
            }
            break;
        }
        memberList.put(ID, new Member(ID, name, age));
        System.out.println("Member added successfully\n");
    }

    public static void removeMember(HashMap memberList, Scanner consoleInput) {
        int ID;
        while(true) {
            try {
                System.out.println("Enter ID to remove: ");
                ID = consoleInput.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                consoleInput.next();
                continue;
            }
            break;
        }
        memberList.remove(ID);
        System.out.println("Member removed successfully\n");
    }

    public static void printUserList(HashMap memberList) {
        for (Object i : memberList.values()) {
            System.out.println(i);
        }

    }
}