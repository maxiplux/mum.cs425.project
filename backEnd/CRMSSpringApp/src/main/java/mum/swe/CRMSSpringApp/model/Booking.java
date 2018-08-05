package mum.swe.CRMSSpringApp.model;


import javax.persistence.*;


@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String color;

    private Long num_of_seat;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = true)
    private Car car;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;


}
