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
@Table(name = "county")
public class CountyEntity {
    @Id
    private Long id;
    private String name;
    private String amar_code;
    private Long provinceId;
    private Long townshipId;

    @Override
    public String toString() {
        return "CountyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amar_code='" + amar_code + '\'' +
                ", provinceId=" + provinceId +
                ", townshipId=" + townshipId +
                '}';
    }
}
