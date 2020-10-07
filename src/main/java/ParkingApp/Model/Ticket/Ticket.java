package ParkingApp.Model.Ticket;

import javax.persistence.*;

@Entity
@Table(name = "Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vehicleId;
    private TypeOfTicket type;
    private double price;

    public Ticket() {
    }

    public Ticket(String vehicleId, TypeOfTicket type, double price) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public TypeOfTicket getType() {
        return type;
    }

    public void setType(TypeOfTicket type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}