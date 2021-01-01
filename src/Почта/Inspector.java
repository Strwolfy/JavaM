package Почта;

/**
 * Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
 * если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * "weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из
 * камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны
 * объявить самостоятельно в виде непроверяемых исключений.
 */

class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public Sendable processMail(Sendable mail) throws StolenPackageException, IllegalPackageException {
        if (mail instanceof MailPackage) { /*Проверка посылка ли пришла?*/
            MailPackage mail2 = (MailPackage) mail;

            if (mail2.getContent().getContent().contains(WEAPONS) ||
                    mail2.getContent().getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }

            if (mail2.getContent().getContent().contains("stones"))
                throw new StolenPackageException();
            return mail2;
        }
        return mail;
    }
}
