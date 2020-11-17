package ir.torshizi.iran_cities_database.iran_cities_database.model.mapper;

import ir.torshizi.iran_cities_database.iran_cities_database.model.dto.CountyDto;
import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.CountyEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountyMapper {
    CountyMapper INSTANCE = Mappers.getMapper(CountyMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "provinceId", target = "provinceId"),
            @Mapping(source = "townshipId", target = "townshipId")
    })
    CountyDto toDto (CountyEntity countyEntity);

    @InheritInverseConfiguration(name = "toDto")
    CountyEntity toEntity (CountyDto countyDto);

    List<CountyDto> toDtoList (List<CountyEntity> countyEntityList);
    List<CountyEntity> toEntityList (List<CountyDto> countyDtoList);
}
