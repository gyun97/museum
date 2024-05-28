package com.kdg.MuseumAPI.dto;

import com.kdg.MuseumAPI.entity.MuseumEntity;
import lombok.*;

@Setter
@Getter
public class MuseumDTO {


    // RequestMessage Body에서 받는 데이터들
    private String name;
    private Double posX;
    private Double posY;
    private String address;
    private Double adultAdmission;
    private Double teenagerAdmission;
    private Double childAdmission;


    // Entity -> DTO 변환 메서드
    public static MuseumDTO toDTO(MuseumEntity museumEntity) {
        MuseumDTO museumDTO = new MuseumDTO();
        museumDTO.setName(museumEntity.getName());
        museumDTO.setPosX(museumEntity.getPosX());
        museumDTO.setPosY(museumEntity.getPosY());
        museumDTO.setAddress(museumEntity.getAddress());
        museumDTO.setAdultAdmission(museumEntity.getAdultAdmission());
        museumDTO.setTeenagerAdmission(museumEntity.getTeenagerAdmission());
        museumDTO.setChildAdmission(museumEntity.getChildAdmission());

        return museumDTO;
    }


}
