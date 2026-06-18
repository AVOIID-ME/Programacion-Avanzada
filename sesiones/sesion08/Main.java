public class Main {
    public static void main(String[] args) {

        int i = 0;
        Integer num = 0;
        float decimal = 10.56f;


        float numConvertido = num.floatValue();

        System.out.println(numConvertido);

        String decimalEnTexto = String.valueOf(decimal);
        System.out.println(decimalEnTexto);

        Integer decimalConvertido = Integer.getInteger(decimalEnTexto);
        System.out.println(decimalConvertido);
        // Código de inicio
    }
}
