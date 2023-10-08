package session11.challenges.smart_home_management_system;

public class Entertainment extends Device {

    private String type;

    public Entertainment(String deviceName, String deviceType, Room room, String type) {
        super(deviceName, deviceType, room);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "type='" + type + '\'' +
                '}';
    }
}
