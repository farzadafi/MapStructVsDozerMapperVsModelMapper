import dto.AddressDto;
import dto.UserDto;
import mapper.dozerMapper.DozerMapperImpel;
import model.Address;
import model.User;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    private final DozerMapperImpel mapper;
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    public Application(){
        mapper = new DozerMapperImpel();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run(){
        AddressDto addressDto = new AddressDto("Iran", "Kerman", "Zarand");
        UserDto userDto = new UserDto("Farzad", "Afshar", "FarzadAfi",
                "aaa", "farzadAfi40", addressDto, new String[]{"programmer", "math"});

        List<UserDto> userDtoList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++)
            userDtoList.add(userDto);

        dozerMapperTest(userDtoList);
    }

}
