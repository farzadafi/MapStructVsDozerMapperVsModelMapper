package mapper.dozerMapper;

import dto.UserDto;
import model.User;

import java.util.List;

public interface DozerMapper {
    User dtoToModel(UserDto user);
    UserDto modelToDto(User user);
    List<User> dtoListToModelList(List<UserDto> userDtoList);
}
