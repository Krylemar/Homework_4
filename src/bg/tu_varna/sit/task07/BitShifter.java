package bg.tu_varna.sit.task07;

public class BitShifter {
    private String[] rotations;

    public BitShifter(String[] rotations) {
        this.rotations = rotations;
    }

    public byte shift(byte number) {
        for (int i = 0; i < rotations.length; i++) {
            String direction = rotations[i];
            if (direction.equals("right")) {
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5;
            } else if (direction.equals("left")) {
                int leftMostBit = (number >> 5) & 1;
                number <<= 1;
                number |= leftMostBit;
                if (leftMostBit == 1){
                    number &= ~(1<<6);
                }
            }
        }
        return number;
    }
}
