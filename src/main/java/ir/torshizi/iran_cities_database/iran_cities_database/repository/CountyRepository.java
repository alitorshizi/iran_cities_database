package ir.torshizi.iran_cities_database.iran_cities_database.repository;

import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.CountyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountyRepository extends CrudRepository<CountyEntity, Long> {
    Optional<CountyEntity> findById(Long countyId);
    Optional<CountyEntity> findByName(String countyName);
    List<CountyEntity> findAllByProvinceId(Long provinceId);
    List<CountyEntity> findAllByTownshipId(Long townshipId);
    List<CountyEntity> findAllByProvinceIdAndTownshipId(Long provinceId, Long townshipId);
}
