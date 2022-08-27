package mapper.modelMapper;

import dto.UserDto;
import model.User;

public class ModelMapperImpel implements ModelMapper{

    private final org.modelmapper.ModelMapper mapper;

    public ModelMapperImpel(){
        mapper = new org.modelmapper.ModelMapper();
    }

    @Override
    public User dtoToModel(UserDto userDto) {
        return mapper.map(userDto,User.class);
    }
}
