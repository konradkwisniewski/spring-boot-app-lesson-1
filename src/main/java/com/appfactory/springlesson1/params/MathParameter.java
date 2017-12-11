package com.appfactory.springlesson1.params;

import java.util.List;

/**
 * Created by Korepetycje on 08.12.2017.
 */
public class MathParameter {
    Integer calulationTypeId;
    List<Integer> part;

    public Integer getCalulationTypeId() {
        return calulationTypeId;
    }

    public void setCalulationTypeId(Integer calulationTypeId) {
        this.calulationTypeId = calulationTypeId;
    }

    public List<Integer> getPart() {
        return part;
    }

    public void setPart(List<Integer> part) {
        this.part = part;
    }
}
