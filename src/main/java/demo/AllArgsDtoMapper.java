package demo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CycleAvoidingMappingContext.class)
public interface AllArgsDtoMapper {
    AllArgsDtoMapper INSTANCE = Mappers.getMapper( AllArgsDtoMapper.class );

    AllArgsDtoTarget map (AllArgsDto object);
}
