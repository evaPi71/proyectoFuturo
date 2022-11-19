public class veredicto {

    private static String veredict(String valor1, String valor2){


        if(valor1.equals(valor2)){
            return "Bien. Pero una hora de estudio para cada modulo puede ser insuficiente";
        }
        if(Integer.valueOf(valor1)<Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes Debes dedicar más tiempo";

        }
        return "Ideal. Trabajas los contenidos en casa";

    }



    }






