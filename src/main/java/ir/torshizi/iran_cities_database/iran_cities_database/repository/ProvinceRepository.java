package ir.torshizi.iran_cities_database.iran_cities_database.repository;

import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.ProvinceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinceRepository extends CrudRepository<ProvinceEntity, Long> {
    Optional<ProvinceEntity> findById(Long provinceId);
    Optional<ProvinceEntity> findByName(Long provinceName);
}
