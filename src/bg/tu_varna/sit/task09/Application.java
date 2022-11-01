package bg.tu_varna.sit.task09;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да се генерира конфигурация за команда за преобразуване на изображения
 * За изрязването се подава ширината на изходния правоъгълник, височината на изходния правоъгълник, x и y координати на горния ляв ъгъл
 * За ротазията
 *  - завъртане на 90 отговаря на код 0,
 *  - завъртане на 180 отговаря на код 1,
 *  - завъртане на -90 отговаря на код 2,
 *  - завъртане на -180 отговаря на код 3,
 *
 * Вход 1  през аргументите от команден ред
 *  "cropping 80 60 200 100"
 *
 *  Очакван резултат:
 *  crop=80:60:200:100
 *
 * Вход 2  през аргументите от команден ред
 *  "cropping 80 60 200 100" "rotate 90"
 *
 *  Очакван резултат:
 *  crop=80:60:200:100;transpose=0
 *
 * Вход 3  през аргументите от команден ред
 *  "rotate -180"
 *
 *  Очакван резултат:
 *  transpose=3
 */


public class Application {
    public static void main(String[] args) {

        ArrayWrapper arrayWrapper = new ArrayWrapper(args);
        CommandLineOption commandLineOption = new CommandLineOption();

        while (arrayWrapper.hasNext()) {

            commandLineOption.append(arrayWrapper.getArg());
        }

        System.out.println(commandLineOption.build());
    }
}
