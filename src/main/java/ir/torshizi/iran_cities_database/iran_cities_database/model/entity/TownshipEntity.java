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
@Table(name = "township")
public class TownshipEntity {
    @Id
    private Long id;
    private String name;
    private String amar_code;
    private Long provinceId;

    @Override
    public String toString() {
        return "TownshipEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amar_code='" + amar_code + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TownshipEntity)) return false;
        return id != null && id.equals(((TownshipEntity) o).getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
