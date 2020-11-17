package ir.torshizi.iran_cities_database.iran_cities_database.model.mapper;

import ir.torshizi.iran_cities_database.iran_cities_database.model.dto.ProvinceDto;
import ir.torshizi.iran_cities_database.iran_cities_database.model.entity.ProvinceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProvinceMapper {
    ProvinceMapper INSTANCE = Mappers.getMapper(ProvinceMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name")
    })
    ProvinceDto toDto (ProvinceEntity provinceEntity);

    @InheritInverseConfiguration(name = "toDto")
    ProvinceEntity toEntity (ProvinceDto provinceDto);

    List<ProvinceDto> toDtoList (List<ProvinceEntity> provinceEntityList);
    List<ProvinceEntity> toEntityList (List<ProvinceDto> provinceDtoList);
}
