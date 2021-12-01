public class ConversionTipos {
  public static void main(String[] args){
    String numeroStr = "87";
    int numeroInt = Integer.parseInt(numeroStr);
    System.out.println(numeroInt);

    String numeroDoubleStr = "4345742.875e-5";
    double numeroDouble = Double.parseDouble(numeroDoubleStr);
    System.out.println(numeroDouble);

    String booleanStr = "false";
    boolean numeroBoolean = Boolean.parseBoolean(booleanStr);
    System.out.println(numeroBoolean);
  }
}
