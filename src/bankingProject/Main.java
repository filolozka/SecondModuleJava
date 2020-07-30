package bankingProject;

//Дан массив строк-клиентов банка следующего вида:
//:Til Schweiger Iban:DE15971891
//AG:Macrosoft Iban:DE15978765
//GmbH:Pupkin SoftLab Iban:DE15954356
//e.V.:PupkinSoftLab Iban:DE15954356
//т.е. форма собственности: Имя\Название Iban:счет. Если форма собственности не указана, клиент
//– физ.лицо.
//Необходимо создать класс для описания физ.лиц, с полями для имени и фамилии, и класс (или
//классы?) для описания юр.лиц. Для каждой строки исходного массива необходимо получить
//соответствующий Account с полями (owner, iban). Распечатать массив Account.

import lessonsExamples.lesson11.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] customerInfo = {
                ":Til Schweiger Iban:DE15971891",
                "AG:Macrosoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356",
                "e.V.:PupkinSoftLab Iban:DE15954356"
        };
        printAccounes(parsingInfoToAccount(customerInfo));
    }

    public static Account[] parsingInfoToAccount(String[] info) {
        Account[] accounts = null;
        if (info != null) {
            accounts = new Account[info.length];
            for (int i = 0; i < info.length; i++) {
                String[] strings = info[i].split(":");
                strings[1] = strings[1].substring(0, strings[1].length() - 5);

                if (strings[0].equals("")){
                    accounts[i] = new Account(new Individuals(strings[1], strings[2]));
                }
                else {
                    accounts[i] = new Account(new LegalEntities(strings[0], strings[1], strings[2]));
                }
            }
        } else {
            System.out.println("Error!");
        }
        return accounts;
    }

    public static void printAccounes(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
