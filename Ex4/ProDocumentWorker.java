package Ex4;

public class ProDocumentWorker extends DocumentWorker{
    void editDocument(){
        System.out.println("Document was edited.");
    }
    void saveDocument(){
        System.out.println("Document was saved in old format, " +
                "saving in other formats available in Expert version.");
    }
}
