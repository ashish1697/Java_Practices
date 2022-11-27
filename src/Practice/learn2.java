package Practice;

public class learn2 {
    private int id;
    private String tagName;
    private long tagId;

    public learn2(int id, String tagName, long tagId) {
        this.id = id;
        this.tagName = tagName;
        this.tagId = tagId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }
}
