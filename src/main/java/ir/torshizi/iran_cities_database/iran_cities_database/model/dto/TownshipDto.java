package ir.torshizi.iran_cities_database.iran_cities_database.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TownshipDto {
    private Long id;
    private String name;
    private Long provinceId;

    @Override
    public String toString() {
        return "TownshipDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }
}
