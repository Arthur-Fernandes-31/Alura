import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela  = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela  = dataPrimeiraParcela.plusDays(30);

        if (dataSegundaParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterios ao dia do vencimento");
        }else {
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataClonclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusçao compra formatada: " + dataClonclusaoCompra);
        ZonedDateTime dataCompraNY = dataClonclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusçao compra NY: " + dataCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duracao do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutes() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias " + periodo.getDays());

    }
    }
