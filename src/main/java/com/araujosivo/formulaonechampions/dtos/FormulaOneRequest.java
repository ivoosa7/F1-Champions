package com.araujosivo.formulaonechampions.dtos;

import java.time.Year;

public record FormulaOneRequest(
            String driver,
            String constructor,
            Year season,
            Long points,
            String car,
            String engine
) 
{

}
