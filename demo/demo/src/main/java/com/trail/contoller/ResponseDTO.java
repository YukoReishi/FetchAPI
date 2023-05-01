package com.trail.contoller;

import com.trail.model.Mobile;
import lombok.Data;

import java.util.List;

@Data
public class ResponseDTO {

    private List<Mobile> listOfMobiles;
}
