package mapper.mapStruct;

import dto.UserDto;
import model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStruct {

    MapStruct INSTANCE = Mappers.getMapper(MapStruct.class);

    User dtoToModel(UserDto userDto);
}
