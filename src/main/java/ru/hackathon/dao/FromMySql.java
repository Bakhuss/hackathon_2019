package ru.hackathon.dao;

import ru.hackathon.model.Camera;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FromMySql implements CameraRepository {
    @Override
    public void setCamera(Camera camera) {

    }

    @Override
    public Camera getCameras() {
        SQLHandler sqlHandler = new SQLHandler();
        String sql = "select * from camera_times";
        try {
            sqlHandler.connect();
            ResultSet rs = sqlHandler.getStmt().executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("camera_id"));
                System.out.println(rs.getString("path_video"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sqlHandler.disconnect();
        }
        return null;
    }

    @Override
    public void updateCamera(Camera camera) {

    }

    @Override
    public void removeCamera(Camera camera) {

    }
}
