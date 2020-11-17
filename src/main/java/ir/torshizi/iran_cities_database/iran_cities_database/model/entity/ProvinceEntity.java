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
@Table(name = "province")
public class ProvinceEntity {
    @Id
    private Long id;
    private String name;
    private String amar_code;

    @Override
    public String toString() {
        return "ProvinceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amar_code='" + amar_code + '\'' +
                '}';
    }
}
