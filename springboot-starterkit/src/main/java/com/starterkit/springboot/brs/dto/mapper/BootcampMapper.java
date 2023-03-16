package com.starterkit.springboot.brs.dto.mapper;

import com.starterkit.springboot.brs.dto.model.bootcamp.BootcampDto;
import com.starterkit.springboot.brs.dto.model.user.RoleDto;
import com.starterkit.springboot.brs.model.bootcamp.Bootcamp;
import com.starterkit.springboot.brs.model.bootcamp.Technology;
import com.starterkit.springboot.brs.model.user.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
@Component
public class BootcampMapper {

    public static BootcampDto toBootcampDto(Bootcamp bootcamp) {
        return new BootcampDto()
                .setId(bootcamp.getId())
                .setDescription(bootcamp.getDescription())
                .setEndDate(bootcamp.getEndDate())
                .setLongHtml(bootcamp.getLongHtml())
                .setBannerSmallImage(bootcamp.getBannerSmallImage())
                .setBannerLargeImage(bootcamp.getBannerLargeImage())
                .setBannerVideoLink(bootcamp.getBannerVideoLink())
                .setName(bootcamp.getName())
                .setSessions(SessionMapper.toSessionDtoList(bootcamp.getSessions()))
                .setStartSate(bootcamp.getStartDate())
                .setTechnologyStack(TechnologyStackMapper.toTechnologyStackDtoList(bootcamp.getTechnologyStack()))
                .setUsers(bootcamp.getUsers());
    }

    public static Bootcamp toBootcamp(BootcampDto bootcamp) {
       // List<Technology> getTechno = bootcamp.getTechnologyStack();
        return new Bootcamp()
                .setId(bootcamp.getId())
                .setDescription(bootcamp.getDescription())
                .setEndDate(bootcamp.getEndDate())
                .setLongHtml(bootcamp.getLongHtml())
                .setName(bootcamp.getName())
                .setBannerSmallImage(bootcamp.getBannerSmallImage())
                .setBannerLargeImage(bootcamp.getBannerLargeImage())
                .setBannerVideoLink(bootcamp.getBannerVideoLink())
                .setSessions(SessionMapper.toSessionList(bootcamp.getSessions()))
                .setStartDate(bootcamp.getStartSate())
                .setTechnologyStack(TechnologyStackMapper.toTechnologyStackList(bootcamp.getTechnologyStack()))
                .setUsers(bootcamp.getUsers());
    }

    public static Role toRole(RoleDto role) {
        return new Role()
                .setRole(role.getRole())
                .setId(role.getId());
    }

    public static List<BootcampDto> toBootcampDtoList(List<Bootcamp> all) {
        List<BootcampDto> bootcampDtos = new ArrayList<>();
        all.stream().forEach(x->{
            bootcampDtos.add(toBootcampDto(x));
        });
        return bootcampDtos;
    }

}
