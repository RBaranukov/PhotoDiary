package photo_diary.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_surname")
    private String nameSurname;

    @Column(name = "communication")
    private String communication;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "cost")
    private double cost;

    @Column(name = "conditions")
    private String conditions;

    @Column(name = "notes")
    private String notes;

    @Column(name = "advertising_source")
    private String advertising_source;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAdvertising_source() {
        return advertising_source;
    }

    public void setAdvertising_source(String advertising_source) {
        this.advertising_source = advertising_source;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", nameSurname='" + nameSurname + '\'' +
                ", communication='" + communication + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cost=" + cost +
                ", conditions='" + conditions + '\'' +
                ", notes='" + notes + '\'' +
                ", advertising_source='" + advertising_source + '\'' +
                '}';
    }
}
