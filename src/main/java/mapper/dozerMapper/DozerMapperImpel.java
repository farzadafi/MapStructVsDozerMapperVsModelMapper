package mapper.dozerMapper;

import dto.UserDto;
import model.User;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class DozerMapperImpel implements DozerMapper {

    private final DozerBeanMapper mapper;

    public DozerMapperImpel() {
        mapper = new DozerBeanMapper();
    }

    @Override
    public User dtoToModel(UserDto userDto) {
        return mapper.map(userDto,User.class);
    }

    @Override
    public UserDto modelToDto(User user) {
        return mapper.map(user,UserDto.class);
    }

    @Override
    public List<User> dtoListToModelList(List<UserDto> userDtoList) {
        List<User> userList = new ArrayList<>();
        for (UserDto u:userDtoList
             ) {
            userList.add(mapper.map(u,User.class));
        }
        return userList;
    }
}
