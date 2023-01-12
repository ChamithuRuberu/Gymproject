package com.GymNonCommercialUse.GymBackEnd.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "oder")
public class Oder {

    @Id
    @Column(name = "oder_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderid;

    @Column(name = "order_date", columnDefinition = "DATETIME")
    private Date date;

    @Column(name = "total", nullable = false)
    private Double total;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "oders")
    private Set<OderDetails> oderDetails;

    public Oder(Date date, Double total, Member member) {
        this.date = date;
        this.total = total;
        this.member = member;
    }

}
