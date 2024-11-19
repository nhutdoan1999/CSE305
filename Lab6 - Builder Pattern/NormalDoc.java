public class NormalDoc extends Document {

    @Override
    public Document buildDoc() {
        this.setExtension(".txt");
        this.setEncryption("None");
        return this;
    }
}
