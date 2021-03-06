package com.github.ethendev.jdruid.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * logical expression filter
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
@EqualsAndHashCode(callSuper = true)
public class LogicalFilter extends BaseFilter {

    private List<BaseFilter> fields;

    public LogicalFilter(@NonNull String type, @NonNull List<BaseFilter> fields) {
        super(type);
        this.fields = fields;
    }

    public LogicalFilter(@NonNull LogicalType type, @NonNull List<BaseFilter> fields) {
        super(type.getValue());
        this.fields = fields;
    }
}
