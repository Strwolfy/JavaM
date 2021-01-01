package Почта;
/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
interface MailService {
    Sendable processMail(Sendable mail) throws StolenPackageException, IllegalPackageException;
}
