package co.com.company.certification.soap.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Generated("jsonschemapojo2")
public class NumbersData {
    private String number1;
    private String number2;
    private int multiplyResult;
    private int result;

    public static List<NumbersData> setData(DataTable dataTable){
        List<NumbersData> data = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> map : mapInfo){
            data.add(new ObjectMapper().convertValue(map, NumbersData.class));
        }
        return data;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public int getMultiplyResult() {
        return multiplyResult;
    }

    public void setMultiplyResult(int multiplyResult) {
        this.multiplyResult = multiplyResult;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
