package bg.softuni.pathfinder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table
public class Messages extends BaseEntity {
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    @Column(name = "text_content")
    private String textContent;
    @ManyToOne
    private User author;
    @ManyToOne
    private User recipient;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Messages setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public Messages setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Messages setAuthor(User author) {
        this.author = author;
        return this;
    }

    public User getRecipient() {
        return recipient;
    }

    public Messages setRecipient(User recipient) {
        this.recipient = recipient;
        return this;
    }
}
