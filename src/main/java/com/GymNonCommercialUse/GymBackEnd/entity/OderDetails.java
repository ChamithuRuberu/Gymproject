package com.GymNonCommercialUse.GymBackEnd.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "oder_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OderDetails {

    @Id
    @Column(name = "order_details_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int oderid;

    @Column(name = "name",length = 30)
    private String supplimentName;

    @Column(name = "quantity",length = 30)
    private int  quantity;

    @Column(name = "amount",length = 30)
    private Double  amount;




}
