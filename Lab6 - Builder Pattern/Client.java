public class Client {

    public Document newDocument(String type) {
        Document document;

        if (type.equalsIgnoreCase("Normal")) {
            document = new NormalDoc();
        } else if (type.equalsIgnoreCase("Confidential")) {
            document = new ConfidentialDoc();
        } else {
            throw new IllegalArgumentException("Unknown document type: " + type);
        }

        return document.buildDoc();
    }

    public static void main(String[] args) {
        Client client = new Client();

        // Create a Normal Document
        Document normalDoc = client.newDocument("Normal");
        System.out.println(normalDoc);

        // Create a Confidential Document
        Document confidentialDoc = client.newDocument("Confidential");
        System.out.println(confidentialDoc);
    }
}
