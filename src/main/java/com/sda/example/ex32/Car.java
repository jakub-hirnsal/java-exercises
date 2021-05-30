package com.sda.example.ex32;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private String spz;
    private String brand;

}
