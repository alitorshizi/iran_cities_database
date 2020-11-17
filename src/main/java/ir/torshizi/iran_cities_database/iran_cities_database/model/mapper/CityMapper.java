package ir.torshizi.iran_cities_database.iran_cities_database.model.mapper;

import ir.torshizi.iran_cities_database.iran_cities_database.model.dto.CityDto;
import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.CityEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "provinceId", target = "provinceId"),
            @Mapping(source = "townshipId", target = "townshipId"),
            @Mapping(source = "countyId", target = "countyId")
    })
    CityDto toDto (CityEntity cityEntity);

    @InheritInverseConfiguration(name = "toDto")
    CityEntity toEntity (CityDto cityDto);

    List<CityDto> toDtoList (List<CityEntity> cityEntityList);
    List<CityEntity> toEntityList (List<CityDto> cityDtoList);
}
