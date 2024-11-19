public abstract class Document {
    protected String extension;
    protected String encryption;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public abstract Document buildDoc();

    @Override
    public String toString() {
        return "Document [Extension=" + extension + ", Encryption=" + encryption + "]";
    }
}
