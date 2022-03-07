package com.example.leafletbackend.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "arch_1004901")
public class Archive {
    @Id
    Date date;
    int id_device;
    double latitude;
    double longitude;
}
