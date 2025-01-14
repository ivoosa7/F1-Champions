package com.araujosivo.formulaonechampions.dtos;

import java.time.Year;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record FormulaOneRequest(
            @NotBlank(message = "Nome do piloto não pode ser em branco")
            String driver,

            @NotBlank(message = "Nome da construtora não pode ser em branco")
            String constructor,

            Year season,

            @Min(value=0, message = "Pontos não pode ser menor que zero")
            Long points,
            
            @Min(value=0, message = "Número de vitórias não pode ser menor que zero")
            Long wins,

            String car,
            String engine
) 
{

}
