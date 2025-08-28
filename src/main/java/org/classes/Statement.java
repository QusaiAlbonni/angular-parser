package org.classes;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ReturnStatement.class, name = "return"),
        @JsonSubTypes.Type(value = ExpressionStatement.class, name = "expression"),
})
public abstract class Statement {
}
