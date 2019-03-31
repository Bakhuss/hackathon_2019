package ru.hackathon.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Camera {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cameraId;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_till")
    private Date dateTill;

    @Column(name = "path_video")
    private String pathVideo;


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "{cameraId:" + cameraId +
                "}";
    }
}
