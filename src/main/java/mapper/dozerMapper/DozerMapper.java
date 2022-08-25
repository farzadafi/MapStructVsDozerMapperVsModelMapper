package mapper.dozerMapper;

import dto.UserDto;
import model.User;

public interface DozerMapper {
    User dtoToModel(UserDto user);
    UserDto modelToDto(User user);
}
