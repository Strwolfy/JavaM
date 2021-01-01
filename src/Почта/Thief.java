package Почта;

/**
 * Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе переменную int
 * – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен присутствовать метод getStolenValue,
 * который возвращает суммарную стоимость всех посылок, которые он своровал. Воровство происходит следующим образом: вместо посылки,
 * которая пришла вору, он отдает новую, такую же, только с нулевой ценностью и содержимым посылки "stones instead of {content}".
 */
class Thief implements MailService {
    private int min_stoimost; /* минимальная стоимость посылки, которую он будет воровать.*/
    private int StolenValue; /*Здесь будем хранить сумму украденного */

    public Thief(int min_stoimost) {
        this.min_stoimost = min_stoimost;
        this.StolenValue = 0;   /* При создании Вора сумма украденного будет равна 0*/
    }

    public int getStolenValue() {
        return StolenValue;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mail2 = (MailPackage) mail;

            /**Наша посылка состоит из:
             *   private final Package content;
             *
             *   a Package, в свою очередь, состоит из:
             *   public static class Package {
             private final String content;
             private final int price;
             *
             *ПОэтому для того, что бы получить стоимость посылки, надо взять метод getPrice () от
             * метода getContent () объекта mail2.
             */
            if (mail2.getContent().getPrice() >= this.min_stoimost) { /* Проверяем ценная ли посылка*/
                this.StolenValue += mail2.getContent().getPrice();

                return new MailPackage(mail2.getFrom(), mail2.getTo(),
                        new Package(
                                "stones instead of " + mail2.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
