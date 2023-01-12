package com.GymNonCommercialUse.GymBackEnd.entity;

import com.GymNonCommercialUse.GymBackEnd.entity.enums.MeasuringUnitsType;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "supliments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Supliments {
    @Id
    @Column(name = "supliment_id", length = 10)
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int suplimntId;

    @Column(name = "name",length = 30)
    private String  suplimentName;

    @Enumerated(EnumType.STRING)
    @Column(name = "measure_Unit",length = 30)
    private MeasuringUnitsType measureUnit;

    @Column(name = "quantity",length = 30)
    private int  quantity;

    @Column(name = "supplier_price",length = 30)
    private double  supplierPrice;

    @Column(name = "selling_price",length = 30 )
    private double  selling_price;

    @Column(name = "active_state",columnDefinition = "TINYINT default 1")
    private boolean activestate;

    @OneToMany(mappedBy="supliments")
    private Set<OderDetails> oderDetails;


}
