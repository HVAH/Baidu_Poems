package com.data.entity;

/**
 * 诗词结构
 *
 * @author https://github.com/zhdh
 */
public class Poem {

    /**
     * 朝代
     */
    private String dynasty;
    /**
     * 作者
     */
    private String literatureAuthor;
    /**
     * 名称
     */
    private String displayName;
    /**
     * 内容
     */
    private String body;

    /**
     * 类型
     */
    private String type;

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getLiteratureAuthor() {
        return literatureAuthor;
    }

    public void setLiteratureAuthor(String literatureAuthor) {
        this.literatureAuthor = literatureAuthor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "dynasty='" + dynasty + '\'' +
                ", literatureAuthor='" + literatureAuthor + '\'' +
                ", displayName='" + displayName + '\'' +
                ", body='" + body + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
