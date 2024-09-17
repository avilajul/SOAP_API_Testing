package co.com.company.certification.soap.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Generated("jsonschemapojo2")
public class NumbersData {
    private String multiplying;
    private String multiplier;
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

    public String getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
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
