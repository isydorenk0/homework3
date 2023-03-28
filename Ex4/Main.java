package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentWorker documentWorker = returnDocumentWorker(scanner);
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }

    private static DocumentWorker returnDocumentWorker(Scanner scanner) {
        System.out.println("Enter access key: ");
        String accessKey = scanner.nextLine();
        if (accessKey.equals("pro")){
            System.out.println("You have access to Pro version.");
            return new ProDocumentWorker();
        } else if (accessKey.equals("exp")) {
            System.out.println("You have access to Expert version.");
            return new ExpertDocumentWorker();
        } else {
            System.out.println("Access key was not recognised, you have access to Basic version.");
            return new DocumentWorker();
        }
    }
}
