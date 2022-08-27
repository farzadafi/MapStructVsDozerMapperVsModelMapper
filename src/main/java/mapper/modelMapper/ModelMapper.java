package mapper.modelMapper;

import dto.UserDto;
import model.User;

public interface ModelMapper {
    User dtoToModel(UserDto user);
}
