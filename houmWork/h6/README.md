# Ноутбук для магазина техники

## Задание
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
 - NoteBook notebook1 = new NoteBook
 - NoteBook notebook2 = new NoteBook
 - NoteBook notebook3 = new NoteBook
 - NoteBook notebook4 = new NoteBook
 - NoteBook notebook5 = new NoteBook

**Например**: 

“Введите цифру, соответствующую необходимому критерию:
 - 1 - ОЗУ
 - 2 - Объем ЖД
 - 3 - Операционная система
 - 4 - Цвет

___

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

___

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

______

## Реализовано

Создан файл с классом **NoteBook**

Создан интерфейс взаимодействия с пользователем

Данные о ноутбуках сохранены в массив который содержит класс данных NoteBook. 
Пользователь выбирает критерий фильра, после чего в зависимости от выбранного фильтра он так же выбирает утачняющие данные для фильтрации. В зависимости от критерия фильтра уточняющие данные разные.

Для каждого фильтра создан отдельный метод отдобора подходящих ноутбуков

Например:

 1. Ситуация первая. пользователь выбрал фильтрацию по **производителю ноутбука**
  - пользователю предлагается выбрать производителя из доступных
  - пользователь выбирает производителя
  - в консоль выводятся отфильтрованные ноутбуки

  2. Ситуация вторая. Пользователь выбрал фильтр по объему памяти:
  - пользователю поступает запрос на уточнение максимального и минимального объема памяти
  - в консоль выводятся все подходящие под фильтр ноутбуки