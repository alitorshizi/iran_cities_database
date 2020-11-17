package ir.torshizi.iran_cities_database.iran_cities_database.repository;

import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Long> {
    Optional<CityEntity> findById(Long cityId);
    Optional<CityEntity> findByName(String cityName);
    List<CityEntity> findAllByProvinceId(Long provinceId);
    List<CityEntity> findAllByTownshipId(Long townshipId);
    List<CityEntity> findAllByCountyId(Long countyId);
    List<CityEntity> findAllByProvinceIdAndTownshipIdAndCountyId(Long provinceId, Long townshipId, Long countyId);
}
