import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now(); //Máquina sem hora
        LocalDateTime d02 = LocalDateTime.now(); //Máquina com hora
        Instant d03 = Instant.now(); //Greenwitch

        // Transformando String em LocalDate e LocalDateTime
        LocalDate d04 = LocalDate.parse("2022-08-12");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-12T01:30:26");
        Instant d06 = Instant.parse("2022-08-12T01:30:26Z"); //Padrão UTC
        Instant d07 = Instant.parse("2022-08-12T01:30:26-03:00"); //Padrão São Paulo

        //Padronizando para receber em um formato diferente do ISO
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("12/08/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("12/08/2022 01:30",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        //Dados isolados
        LocalDate d10 = LocalDate.of(2022, 8, 12);
        LocalDateTime d11 = LocalDateTime.of(2022,8,12,1,30);

        //Printando de forma custumizada
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault()); // Formatando o Instant com a zona da Máquina
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d12 = LocalDate.parse("2022-08-12");
        LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d14 = Instant.parse("2022-07-20T01:30:26Z"); //Tem de colocar o Fuso em Instant
        LocalDateTime d15 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d16 = Instant.parse("2022-07-20T01:30:26Z");

        //Convertendo data-hora global para local

        LocalDate d17 = LocalDate.parse("2022-07-20");
        LocalDateTime d18 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d19 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d19, ZoneId.systemDefault()); //Pega o LocalDate de instant da zona do Pc
        LocalDate r2 = LocalDate.ofInstant(d19, ZoneId.of("Portugal")); //Pega o LocalDate com a zona de PT
        LocalDateTime r3 = LocalDateTime.ofInstant(d19, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d19, ZoneId.of("Portugal"));

        //Calculos data-hora

        //Acrescentando e diminuindo uma data em cada variavel
        LocalDate pastWeekLocalDate = d17.minusDays(7);
        LocalDate nextWeekLocalDate = d17.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d18.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d18.plusDays(7);

        Instant pastWeekInstant = d19.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d19.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d17.atTime(0,0));
        Duration t2 = Duration.between(pastWeekLocalDateTime, d18);
        Duration t3 = Duration.between(pastWeekInstant, d19);
        Duration t4 = Duration.between(d19, pastWeekInstant);



        //Printando as situações
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        System.out.println("d12 = " + d12.format(fmt1));
        System.out.println("d12 = " + fmt1.format(d12));
        System.out.println("d13 = " + d13.format(fmt1));
        System.out.println("d13 = " + d13.format(fmt2));
        System.out.println("d14 = " + fmt3.format(d14)); // O Instant não tem .format
        System.out.println("d15 = " + d15.format(fmt4));
        System.out.println("d16 = " + fmt5.format(d16));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d17 dia = " + d17.getDayOfMonth());
        System.out.println("d17 mes = " + d17.getMonthValue());
        System.out.println("d17 ano = " + d17.getYear());

        System.out.println("d18 hora = " + d18.getHour());
        System.out.println("d18 minuto = " + d18.getMinute());

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("pastWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("pastWeekLocalDate = " + pastWeekInstant);
        System.out.println("pastWeekLocalDate = " + nextWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }
}