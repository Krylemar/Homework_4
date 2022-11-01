package bg.tu_varna.sit.task07;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да се получи изместване на битовете на числото на ляво или на дясно със 6 бита.
 *  Ако бит, вдигнат в 1, излезе от значещата част на числото, той трябва да се прехвърли от другата страна:
 *
 * Вход 1:
 * 32
 * "right right"
 *
 * Очакван резултат:
 * 8
 *
 *  Вход 2:
 * 63
 * "left"
 *
 * Очакван резултат:
 * 63
 *
 *  Вход 3:
 * 59;
 * "left left left left"
 *
 * Очакван резултат:
 * 62
 *
 *  Вход 4:
 * 45
 * "left right left"
 *
 * Очакван резултат:
 * 27
 */

public class Application {
    public static void main(String[] args) {
        byte number = Byte.parseByte(args[0]);
        BitShifter bitShifter = new BitShifter(args[1].split(" "));
        System.out.println(bitShifter.shift(number));
    }
}
