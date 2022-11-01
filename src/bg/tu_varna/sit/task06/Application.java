package bg.tu_varna.sit.task06;

import java.util.Arrays;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 * така че да променят стойностите на първоначални масив според операциите:
 * <p>
 * <операция> <index> <value>
 * <p>
 * където <операция> е действието което трябва да се изпълни
 * <index> върху кой елемент на масива трябва да се изпълни действието и <value> втория операнд в операцията
 * <p>
 * Очакван резултат:
 * 2 0 11  999 11
 */

public class Application {
    public static void main(String[] args) {

        long[] array = {3, 0, 9, 333, 11};

        String[] commands = {
                "add 2 2",
                "subtract 1 1",
                "multiply 3 3",
                "stop",
        };
        int i = 0;
        while (!commands[i].contains("stop")) {
            int[] params = new int[2];
            if (commands[i].contains("add") || commands[i].contains("subtract") || commands[i].contains("multiply")) {
                String[] stringParams = commands[i].split(" ");
                params[0] = Integer.parseInt(stringParams[1]);
                params[1] = Integer.parseInt(stringParams[2]);

                Calculator.performAction(array, stringParams[0], params);
            }
            if (i< commands.length) i++;
        }
        ArrayWrapper.printArray(array);
    }
}
