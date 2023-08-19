package com.keb.kebsmartfarm.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.keb.kebsmartfarm.entity.ArduinoKit;
import com.keb.kebsmartfarm.entity.Plant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ArduinoResponseDto {
    private Long kitNo;
    private String kitSerialNum;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Plant plant;
    private LocalDateTime date;
    private String kitDeviceName;

    public static ArduinoResponseDto of(ArduinoKit arduinoKit) {
        return ArduinoResponseDto.builder()
                .kitNo(arduinoKit.getKitNo())
                .kitSerialNum(arduinoKit.getSerialNum())
                .date(arduinoKit.getDate())
                .plant(arduinoKit.getActivePlant().orElse(null))
                .kitDeviceName(arduinoKit.getDeviceName())
                .build();
    }

    public static List<ArduinoResponseDto> ofList(List<ArduinoKit> arduinoKitList) {
        return arduinoKitList.stream().map(ArduinoResponseDto::of).collect(Collectors.toList());
    }
}
