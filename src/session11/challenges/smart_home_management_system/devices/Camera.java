package session11.challenges.smart_home_management_system.devices;

import session11.challenges.smart_home_management_system.utility.Room;

public class Camera extends Device {

    private boolean isRecording;

    public Camera(String deviceName, String deviceType, Room room, boolean isRecording) {
        super(deviceName, deviceType, room);
        this.isRecording = isRecording;
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void setRecording(boolean recording) {
        isRecording = recording;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "isRecording=" + isRecording +
                '}';
    }
}
