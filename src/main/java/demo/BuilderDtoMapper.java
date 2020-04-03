package demo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CycleAvoidingMappingContext.class)
public interface BuilderDtoMapper {
    BuilderDtoMapper INSTANCE = Mappers.getMapper( BuilderDtoMapper.class );

    BuilderDtoTarget map(BuilderDto object);
}
