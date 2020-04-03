package demo;

public class Main {
    public static void main(String[] args) {
        AllArgsDtoTarget myId = AllArgsDtoMapper.INSTANCE.map(new AllArgsDto("myId"));
    }
}
