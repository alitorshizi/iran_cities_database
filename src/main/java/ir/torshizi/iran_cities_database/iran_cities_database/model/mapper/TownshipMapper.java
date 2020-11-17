package ir.torshizi.iran_cities_database.iran_cities_database.model.mapper;

import ir.torshizi.iran_cities_database.iran_cities_database.model.dto.TownshipDto;
import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.TownshipEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TownshipMapper {
    TownshipMapper INSTANCE = Mappers.getMapper(TownshipMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "provinceId", target = "provinceId")
    })
    TownshipDto toDto (TownshipEntity townshipEntity);

    @InheritInverseConfiguration(name = "toDto")
    TownshipEntity toEntity (TownshipDto townshipDto);

    List<TownshipDto> toDtoList (List<TownshipEntity> townshipEntityList);
    List<TownshipEntity> toEntityList (List<TownshipDto> townshipDtoList);
}
