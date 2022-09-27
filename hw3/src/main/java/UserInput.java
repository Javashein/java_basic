public interface UserInput {
    String readString();
    int readInt();
    boolean isReadString();
    boolean isReadInt();
    int readInt(int minValue, int maxValue);
}
