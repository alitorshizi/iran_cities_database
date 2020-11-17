package ir.torshizi.iran_cities_database.iran_cities_database.repository;

import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.TownshipEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TownshipRepository extends CrudRepository<TownshipEntity, Long> {
    Optional<TownshipEntity> findById(Long townshipId);
    Optional<TownshipEntity> findByName(String townshipName);
    List<TownshipEntity> findAllByProvinceId(Long provinceId);
}
