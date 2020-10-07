package ParkingApp.Model.Space;

import javax.persistence.*;

@Entity
@Table(name = "Space")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean hired = false;

    public Space() {
    }

    public Space(boolean hired) {
        this.hired = hired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Space(int id, boolean hired) {
        this.id = id;
        this.hired = hired;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }
}

