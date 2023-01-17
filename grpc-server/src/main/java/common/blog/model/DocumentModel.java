package common.blog.model;

import com.proto.blog.Blog;
import org.bson.Document;

public enum DocumentModel {
    AUTHOR("author"), TITLE("title"), CONTENT("content");
    private String value;

    private DocumentModel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Document getDocument(Blog request) {
        return new Document(AUTHOR.value, request.getAuthor()).append(TITLE.value, request.getTitle()).append(CONTENT.value, request.getContent());
    }

   public static Blog documentToBlog(Document document) {
        return Blog.newBuilder()
                .setAuthor(document.getString("author"))
                .setTitle(document.getString("title"))
                .setContent(document.getString("content"))
                .setId(document.getObjectId("_id").toString())
                .build();
    }
}
