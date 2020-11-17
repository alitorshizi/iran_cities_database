package ir.torshizi.iran_cities_database.iran_cities_database.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountyDto {
    private Long id;
    private String name;
    private Long provinceId;
    private Long townshipId;

    @Override
    public String toString() {
        return "CountyDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", provinceId=" + provinceId +
                ", townshipId=" + townshipId +
                '}';
    }
}
