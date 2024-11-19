public class ConfidentialDoc extends Document {

    @Override
    public Document buildDoc() {
        this.setExtension(".zip");
        this.setEncryption("AES");
        return this;
    }
}
