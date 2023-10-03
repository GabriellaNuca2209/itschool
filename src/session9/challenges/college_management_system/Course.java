package session9.challenges.college_management_system;

import java.time.LocalDateTime;

public class Course {

    private String subject;
    private LocalDateTime schedule;
    private double duration;
    private String description;
    private Professor professor;

    public Course(String subject, LocalDateTime schedule, double duration, String description, Professor professor) {
        this.subject = subject;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.professor = professor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", schedule=" + schedule +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", professor=" + professor +
                '}';
    }
}
