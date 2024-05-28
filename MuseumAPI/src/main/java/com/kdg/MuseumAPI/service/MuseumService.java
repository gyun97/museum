package com.kdg.MuseumAPI.service;

import com.kdg.MuseumAPI.dto.MuseumDTO;
import com.kdg.MuseumAPI.entity.MuseumEntity;
import com.kdg.MuseumAPI.repository.MuseumRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class MuseumService{
    private final MuseumRepository museumRepository;

    public void save(MuseumDTO museumDTO) {
        MuseumEntity museumEntity = MuseumEntity.toEntity(museumDTO);
        museumRepository.save(museumEntity);
    }

    public List<MuseumDTO> findAll() {
        List<MuseumEntity> museumEntityList = museumRepository.findAll();
        ArrayList<MuseumDTO> museumDTOList = new ArrayList<>();
        for (MuseumEntity museumEntity : museumEntityList) {
            MuseumDTO museumDTO = MuseumDTO.toDTO(museumEntity);
            museumDTOList.add(museumDTO);
        }

        return museumDTOList;

    }


}
