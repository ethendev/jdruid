package com.github.ethendev.jdruid.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/14
 */
@Getter
@EqualsAndHashCode(callSuper = true)
public class InFilter extends BaseFilter {
    private static final String FILTER_TYPE = "in";

    private String dimension;
    private List<Object> values;

    public InFilter(@NonNull String dimension, @NonNull List<Object> values) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.values = values;
    }
}
