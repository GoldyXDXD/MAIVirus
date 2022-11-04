public enum FolderNames {
    DDownload("D:\\Download"),
    ProgFiles86("C:\\Program Files (x86)"),
    ProgFile("C:\\Program Files")
    ;

    private String title;

    FolderNames(String s) {
    }

    public String getTitle() {
        return title;
    }
}
