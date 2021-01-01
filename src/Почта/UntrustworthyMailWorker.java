package Почта;
/**
 * UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того,
 * чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект
 * набору третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService.
 * У UntrustworthyMailWorker должен быть конструктор от массива MailService ( результат вызова processMail первого элемента
 * массива передается на вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку
 * на внутренний экземпляр RealMailService.
 */


class UntrustworthyMailWorker implements MailService {
    private RealMailService rms;  /* внутренний экземпляр RealMailService*/
    private MailService[] mailserv; //набор третьих лиц

    //   У UntrustworthyMailWorker должен быть конструктор от массива MailService
    public UntrustworthyMailWorker(MailService[] mailserv) {
        this.mailserv = mailserv;
        this.rms = new RealMailService();
    }

    /* моделирующий ненадежного работника почты, который вместо того,
     *  чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект
     *  набору третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService.*/
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        for (int i = 0; i < mailserv.length; i++) { /*перебор набора третьих лиц*/
            mail = mailserv[i].processMail(mail); /*результат вызова processMail первого элемента
             *  массива передается на вход processMail второго элемента, и т. д. */
        }
        return rms.processMail(mail); /* а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. */

    }
}