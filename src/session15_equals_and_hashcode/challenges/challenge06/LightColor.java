package session15_equals_and_hashcode.challenges.challenge06;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private String sign;
    private int duration;

    LightColor(String sign, int duration) {
        this.sign = sign;
        this.duration = duration;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
