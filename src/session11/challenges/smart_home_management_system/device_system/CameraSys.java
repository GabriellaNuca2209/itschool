package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface CameraSys {

    String cameraType = "Camera";

    void startRecording(Room room);
    void stopRecording(Room room);
    void snapshot(Room room);
}
