package bg.tu_varna.sit.task09;

public class CommandLineOption {
    private String[] options;

    public CommandLineOption() {
        this.options = new String[] {
                "transpose=",
                "crop="
        };
    }

    public void append(String arg) {
        String[] options = arg.split(" ");
        switch (options[0]) {
            case "cropping":
                addCrop(options[1], options[2], options[3], options[4]);
                break;
            case "rotate":
                addRotate(options[1]);
        }
    }

    private void addRotate(String option) {
        switch (option) {
            case "90" -> this.options[0] += "0";
            case "180" -> this.options[0] += "1";
            case "-90" -> this.options[0] += "2";
            case "-180" -> this.options[0] += "3";
        }
    }

    private void addCrop(String outWith, String outHeight, String x, String y) {
        this.options[1] += String.format("%s:%s:%s:%s",outWith, outHeight, x, y);
    }

    public String build() {
        String result = "";
        for (int i = this.options.length-1; i >= 0; i--) {
            if (!this.options[i].substring(options[i].length()-1).equals("=")) { //if crop or rotate is not used it is not printed, distinguished by it's string ending in "="
                result +=  this.options[i];
                if (i>0 && !this.options[i-1].substring(options[i-1].length()-1).equals("=")){
                    result += ";";   //if there is more than 1 command add semicolon in between them
                }
            }

        }
        return result;
    }
}
