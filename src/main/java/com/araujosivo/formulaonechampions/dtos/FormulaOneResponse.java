package com.araujosivo.formulaonechampions.dtos;

import java.time.Year;

public record FormulaOneResponse(
            Long id,
            String driver,
            String constructor,
            Year season,
            Long points,
            String car,
            String engine
) {
    
}