# language: ru
Функция: Расчёт доходности вклада в банке Ренессанс Кредит

  Сценарий: Расчёт доходности вклада с параметрами 500000, 6 месяцев и 70000
    * выбрано меню с параметром String "Вклады"
    * выбрана валюта с параметром String "Рубли"
    * введена сумма вклада "500000"
    * выбран срок вклада "6"
    * введено ежемесячное пополнение "70000"
    * поставлена галочка Ежемесячная капитализация
    * поставлена галочка Частичное снятие
    * проверяется процентная ставка с параметром "5.65%"
    * проверяется итоговая сумма к снятию "869 107,22"
    * проверяется пополнение "350 000"
    * проверяются начисленные проценты с параметром "19 107,22"