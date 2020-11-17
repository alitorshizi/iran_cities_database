package ir.torshizi.iran_cities_database.iran_cities_database.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceDto {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "ProvinceDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
