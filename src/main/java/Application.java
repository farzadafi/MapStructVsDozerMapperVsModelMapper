import dto.AddressDto;
import dto.UserDto;
import mapper.dozerMapper.DozerMapperImpel;
import mapper.mapStruct.MapStruct;
import mapper.modelMapper.ModelMapperImpel;
import model.User;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

    private final DozerMapperImpel dozerMapper;
    private final ModelMapperImpel modelMapper;
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

    public Application(){
        dozerMapper = new DozerMapperImpel();
        modelMapper = new ModelMapperImpel();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    public void run(){
        AddressDto addressDto = new AddressDto("Iran", "Kerman", "Zarand");
        UserDto userDto = new UserDto("Farzad", "Afshar", "FarzadAfi",
                "aaa", "farzadAfi40", addressDto, new String[]{"programmer", "math"});

        System.out.println(ANSI_PURPLE_BACKGROUND + "my CPU is Intel(R) Core(TM) i7-7700HQ CPU @ 2.80GHz");
        System.out.println(ANSI_PURPLE_BACKGROUND + "And the result is Amazing!!!");

        List<UserDto> userDtoList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++)
            userDtoList.add(userDto);

        dozerMapperTest(userDtoList);
        modelMapperTest(userDtoList);
        mapStructTest(userDtoList);
    }

    public void dozerMapperTest(List<UserDto> userDtoList){
        Instant start = Instant.now();
        List<User> userList = dozerMapper.dtoListToModelList(userDtoList);
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        float seconds = TimeUnit.MILLISECONDS.toSeconds(timeElapsed);
        System.out.println(ANSI_CYAN_BACKGROUND + seconds + " second elapsed for dozer mapper");
    }

    public void modelMapperTest(List<UserDto> userDtoList) {
        Instant start = Instant.now();
        List<User> userList = modelMapper.dtoListToModelList(userDtoList);
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        float seconds = TimeUnit.MILLISECONDS.toSeconds(timeElapsed);
        System.out.println(ANSI_RED_BACKGROUND + seconds + " second elapsed for model mapper");
    }

    public void mapStructTest(List<UserDto> userDtoList) {
        Instant start = Instant.now();
        List<User> userList = MapStruct.INSTANCE.dtoListToModelList(userDtoList);
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        float seconds = TimeUnit.MILLISECONDS.toSeconds(timeElapsed);
        System.out.println(ANSI_GREEN_BACKGROUND + seconds + " second elapsed for map Struct");
    }
}
