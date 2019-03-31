package ru.hackathon.dao;

import ru.hackathon.model.Camera;

public interface CameraRepository {
    void setCamera(Camera camera);

    Camera getCameras();

    void updateCamera(Camera camera);

    void removeCamera(Camera camera);
}
