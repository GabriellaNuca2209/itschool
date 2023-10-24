package session15_equals_and_hashcode.challenges.challenge07;

import java.sql.Timestamp;
import java.util.Objects;

public class DatabaseEntities {

    private int entityId;
    private String name;
    private Timestamp timestamp;

    public DatabaseEntities(int entityId, String name, Timestamp timestamp) {
        this.entityId = entityId;
        this.name = name;
        this.timestamp = timestamp;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatabaseEntities that = (DatabaseEntities) o;
        return entityId == that.entityId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId);
    }
}
