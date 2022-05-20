package com.Veli.EShopper.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelHome {
    String username;
    String avatar;
    long userid;
    int favouritecount;
    int chartcount;
}
