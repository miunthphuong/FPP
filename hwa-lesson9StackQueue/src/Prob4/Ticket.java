package Prob4;

public class Ticket {
    private int id;
    private String description;

    // Constructor
    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
