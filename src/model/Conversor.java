package model;

import com.google.gson.Gson;

public class Conversor {
    ApiConversor apiConversor = new ApiConversor();


    public String getConversion(int option, double value){
        Gson gson = new Gson();
        ApiJSON apiModel= null;
        switch (option){
            case 1:
                // "\n1-Dolar a Peso Colombiano" +
                apiModel =gson.fromJson(apiConversor.cargarData("USD"), ApiJSON.class);
                return "Dolar a Peso Colombiano: "+(apiModel.conversion_rates().get("COP") * value)+" COP";
            case 2:
                //"\n2-Dolar a Peso Mexicano" +
                apiModel =gson.fromJson(apiConversor.cargarData("USD"), ApiJSON.class);
                return "Dolar a Pesos Mexicano: "+(apiModel.conversion_rates().get("MXN") * value)+" MXN";
            case 3:
                //"\n3-Dolar a Rublo" +
                apiModel =gson.fromJson(apiConversor.cargarData("USD"), ApiJSON.class);
                return "Dolar a rublos: "+(apiModel.conversion_rates().get("RUB") * value)+" RUB";
            case 4:
                //"\n4-Peso Colombiano a dolar" +
                apiModel =gson.fromJson(apiConversor.cargarData("COP"), ApiJSON.class);
                return "Peso Colombiano a Dolar: "+(apiModel.conversion_rates().get("USD") * value)+" USD";
            case 5:
                //"\n5-Rublo a dolar" +
                apiModel =gson.fromJson(apiConversor.cargarData("RUB"), ApiJSON.class);
                return "Rubos a Dolar:"+(apiModel.conversion_rates().get("USD") * value)+" USD";
            default:
                return  "";
        }
    }
}
