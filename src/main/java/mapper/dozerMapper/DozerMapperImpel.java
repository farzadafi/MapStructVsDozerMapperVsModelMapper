package mapper.dozerMapper;

import dto.UserDto;
import model.User;
import org.dozer.DozerBeanMapper;

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
}
