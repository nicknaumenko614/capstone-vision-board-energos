package co.visionaries.energos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Background {
    @Id
    @GeneratedValue
    private long id;
    private String backgroundLink;
    @JsonIgnore
    @ManyToOne
    private VisionBoard visionBoard;

    protected Background() { }

    public Background(String backgroundLink, VisionBoard visionBoard) {

        this.backgroundLink = backgroundLink;
        this.visionBoard = visionBoard;
    }

    public long getId() {
        return id;
    }

    public String getBackgroundLink() {
        return backgroundLink;
    }

    public void setBackgroundLink(String backgroundLink) {
        this.backgroundLink = backgroundLink;
    }

    public VisionBoard getVisionBoard() {
        return visionBoard;
    }

    public void setVisionBoard(VisionBoard visionBoard) {
        this.visionBoard = visionBoard;
    }
}
