package ir.torshizi.iran_cities_database.iran_cities_database.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    private Long id;
    private String name;
    private String amar_code;
    private Integer cityType;
    private Long provinceId;
    private Long townshipId;
    private Long countyId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CityEntity )) return false;
        return id != null && id.equals(((CityEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
