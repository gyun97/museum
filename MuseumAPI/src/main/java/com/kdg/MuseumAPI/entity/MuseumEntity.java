package com.kdg.MuseumAPI.entity;

import com.kdg.MuseumAPI.dto.MuseumDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="museum_table")
@Getter
@Setter
public class MuseumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double posX;

    @Column(nullable = false)
    private Double posY;

    @Column(length = 100)
    private String address;


    @Column(nullable = false)
    private Double adultAdmission;

    @Column(nullable = false)
    private Double teenagerAdmission;

    @Column(nullable = false)
    private Double childAdmission;



    public static MuseumEntity toEntity(MuseumDTO museumDTO) {
        MuseumEntity museumEntity = new MuseumEntity();

        museumEntity.setName(museumDTO.getName());
        museumEntity.setPosX(museumDTO.getPosX());
        museumEntity.setPosY(museumDTO.getPosY());
        museumEntity.setAddress(museumDTO.getAddress());
        museumEntity.setAdultAdmission(museumDTO.getAdultAdmission());
        museumEntity.setTeenagerAdmission(museumDTO.getTeenagerAdmission());
        museumEntity.setChildAdmission(museumDTO.getChildAdmission());

        return museumEntity;
    }
}
