INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Валерия', 'Елисеевна', 'MASS', '2016-05-12', 'AA', 637282, 'CREATED', 1, '2023-04-12', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Валерия', 'Елисеевна', 'MASS', '2016-05-12', 'AA', 637282, 'CREATED', 2, '2023-03-01', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Валерия', 'Елисеевна', 'MASS', '2016-05-12', 'AA', 637282, 'CREATED', 3, '2023-06-05', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Валерия', 'Елисеевна', 'MASS', '2016-05-12', 'AA', 637282, 'CREATED', 2, '2023-04-20', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Валерия', 'Елисеевна', 'MASS', '2016-05-12', 'AA', 637282, 'CREATED', 6, '2023-05-21', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ларионов', 'Кирилл', 'Владимирович', 'MASS', '2017-08-25', 'A', 330836, 'CREATED', 5, '2023-03-24', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ларионов', 'Кирилл', 'Владимирович', 'MASS', '2017-08-25', 'A', 330836, 'CREATED', 4, '2023-04-08', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ларионов', 'Кирилл', 'Владимирович', 'MASS', '2017-08-25', 'A', 330836, 'CREATED', 1, '2023-05-19', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Селезнева', 'Мия', 'Андреевна', 'MASS', '2012-06-27', 'A', 699027, 'CREATED', 3, '2023-06-02', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Селезнева', 'Мия', 'Андреевна', 'MASS', '2012-06-27', 'A', 699027, 'CREATED', 2, '2023-06-13', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Владимирова', 'София', 'Сергеевна', 'MASS', '2012-05-20', 'A', 446560, 'CREATED', 6, '2023-06-06', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Владимирова', 'София', 'Сергеевна', 'MASS', '2012-05-20', 'A', 446560, 'CREATED', 5, '2023-06-18', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Владимирова', 'София', 'Сергеевна', 'MASS', '2012-05-20', 'A', 446560, 'CREATED', 4, '2023-06-14', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Клюев', 'Али', 'Михайлович', 'MASS', '2016-08-11', 'A', 617951, 'CREATED', 2, '2023-06-11', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Маркелов', 'Кирилл', 'Даниилович', 'MASS', '2015-03-04', 'A', 266791, 'CREATED', 10, '2023-06-13', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Антонова', 'Анастасия', 'Владиславовна', 'MASS', ' 2016-07-17', 'AA', 301646, 'CREATED', 11, '2023-06-03', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Сорокин', 'Дмитрий', 'Фёдорович', 'MASS', '2017-07-18', 'AA', 835694, 'CREATED', 12, '2023-06-13', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Сергеев', 'Александр', 'Матвеевич', 'MASS', '2017-02-07', 'AA', 581883, 'CREATED', 13, '2023-06-07', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Еремина', 'Яна', 'Платоновна', 'DRAW', '2017-09-01', 'AA', 271392, 'CREATED', 11, '2023-06-04', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Овчинникова', 'Виктория', 'Фёдоровна', 'MASS', '2021-11-26', 'AA', 646279, 'CREATED', 4, '2023-06-26', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Иванова', 'Варвара', 'Ильинична', 'MASS', '2023-01-18', 'BD', 815608, 'CREATED', 5, '2023-05-04', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Виноградов', 'Денис', 'Олегович', 'MASS', '2016-05-25', 'AA', 372823, 'CREATED', 4, '2023-05-16', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Шульгина', 'Ангелина', 'Степановна', 'MASS', '2015-02-08', 'BD', 743839, 'CREATED', 3, '2023-06-09', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Колесова', 'София', 'Фёдоровна', 'MASS', '2019-03-25', 'AA', 871853, 'CREATED', 1, '2023-06-01', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ульянов', 'Семён', 'Фёдорович', 'MASS', '2017-04-22', 'BD', 760971, 'CREATED', 2, '2023-06-03', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Семенов', 'Тихон', 'Тимофеевич', 'MASS', '2012-07-04', 'BD', 594265, 'CREATED', 4, '2023-03-28', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Тарасова', 'Александра', 'Константиновна', 'MASS', '2019-09-09', 'BD', 711390, 'CREATED', 5, '2023-03-29', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Орлов', 'Михаил', 'Алексеевич', 'MASS', '2022-07-13', 'BD', 708615, 'CREATED', 11, '2023-03-27', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Соколова', 'Анна', 'Руслановна', 'MASS', '2018-05-27', 'BD', 379236, 'CREATED', 5, '2023-03-20', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Лапшин', 'Денис', 'Маркович', 'MASS', '2012-03-27', 'BD', 730862, 'CREATED', 3, '2023-03-21', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Матвеева', 'Варвара', 'Евгеньевна', 'MASS', '2019-01-08', 'BA', 340185, 'CREATED', 2, '2023-03-16', (SELECT id from resource WHERE region = 'Стерлибашевский'AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Дроздов', 'Давид', 'Максимович', 'MASS', '2021-06-26', 'BD', 728576, 'CREATED', 10, '2023-03-18', (SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Кравцов', 'Алексей', 'Андреевич', 'MASS', '2021-01-22', 'BA', 614920, 'CREATED', 9, '2023-03-19', (SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Семенова', 'Светлана', 'Марковна', 'MASS', '2022-11-11', 'BD', 380489, 'CREATED', 8, '2023-03-27', (SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Куликова', 'Софья', 'Ивановна', 'MASS', '2018-07-20', 'A', 277645, 'CREATED', 7, '2023-03-22', (SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Кольцова', 'Алина', 'Тиграновна', 'DRAW', '2012-03-03', 'BA',858908, 'CREATED', 5, '2023-06-02', (SELECT id from resource WHERE region = 'Благовещенский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Богомолова', 'Алёна', 'Алексеевна', 'MASS', '2015-06-18', 'BA',369353, 'CREATED', 5, '2023-06-04', (SELECT id from resource WHERE region = 'Благовещенский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Прокофьева', 'Анастасия', 'Тимофеевна', 'DRAW', '2017-07-06', 'A', 638023, 'CREATED', 4, '2023-06-05', (SELECT id from resource WHERE region = 'Благовещенский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Митрофанова', 'Майя', 'Демидовна', 'MASS', '2020-04-06', 'A', 440544, 'CREATED', 3, '2023-06-10', (SELECT id from resource WHERE region = 'Благовещенский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Спиридонов', 'Максим', 'Иванович', 'DRAW', '2016-01-26', 'A', 444725, 'CREATED', 2, '2023-06-11', (SELECT id from resource WHERE region = 'Благовещенский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ермаков', 'Лев', 'Артёмович', 'DRAW', '2016-03-10', 'BA', 575822, 'CREATED', 3, '2023-06-15',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макарова', 'Ангелина', 'Михайловна', 'DRAW', '2011-07-05', 'BA', 788217, 'CREATED', 4, '2023-06-18',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Постникова', 'Полина', 'Романовна', 'MASS', '2017-09-20', 'BA', 424953, 'CREATED', 5, '2023-06-03',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Баранова', 'Вера', 'Данииловна', 'MASS', '2018-10-08', 'BA', 309791, 'CREATED', 6, '2023-07-02',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Нечаева', 'Максим', 'Платоновна', 'MASS', '2011-10-29', 'BA', 801001, 'CREATED', 5, '2023-06-03',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Тарасова', 'Мария', 'Михайловна', 'MASS', '2019-04-19', 'AA', 407116, 'CREATED', 4, '2023-06-03', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Малышева', 'Алёна', 'Ильинична', 'MASS', '2011-11-02', 'AA', 428272, 'CREATED', 3, '2023-06-02', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Никитина', 'Александра', 'Леонидовна','DRAW', '2017-05-09', 'AA', 323245, 'CREATED', 9, '2023-06-01', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ковалева', 'Милана', 'Артёмовна', 'MASS', '2022-10-11', 'AA', 864613, 'CREATED', 8, '2023-04-20', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Семенова', 'Анна', 'Михайловна', 'MASS', '2019-09-07', 'AA', 797717, 'CREATED', 7, '2023-04-20', (SELECT id from resource WHERE region = 'Дюртюлинский' AND name = 'Боровая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Третьяков', 'Александр', 'Вячеславович', 'MASS', '2016-04-08', 'AA', 369752, 'CREATED', 5, '2023-04-20', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Свиридов', 'Роман', 'Георгиевич', 'MASS', '2011-06-15', 'AA', 547709, 'CREATED', 6, '2023-04-20', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Баранов', 'Александр', 'Даниилович', 'DRAW', '2016-09-16', 'A', 524530, 'CREATED', 11, '2023-04-20', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Елизарова', 'Милана', 'Максимовна', 'MASS', '2012-04-10', 'A', 341350, 'CREATED', 10, '2023-04-20', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Шубина', 'Майя', 'Ивановна', 'MASS', '2019-01-04', 'A', 844767, 'CREATED', 9, '2023-04-20', (SELECT id from resource WHERE region = 'Бакалинский' AND name = 'Боровая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Дубинин', 'Георгий', 'Андреевич', 'MASS', '2021-06-09', 'A', 793110, 'CREATED', 7, '2023-04-01', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Кондратов', 'Макар', 'Павлович', 'MASS', '2020-09-04', 'A', 512173, 'CREATED', 6, '2023-03-22', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Романов', 'Александр', 'Платонович', 'MASS', '2021-12-21', 'A', 821248, 'CREATED', 5, '2023-05-19', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Виноградова', 'Александра', 'Даниэльевна', 'MASS', '2021-07-19', 'A', 715883, 'CREATED', 4, '2023-03-18', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Иванова', 'Вера', 'Кирилловна', 'MASS', '2021-04-07', 'A', 342326, 'CREATED', 5, '2023-04-14', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Колосова', 'Аврора', 'Егоровна', 'MASS', '2010-07-03', 'D', 782831, 'CREATED', 4, '2023-04-12',(SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Соболев', 'Матвей', 'Тимурович', 'MASS', '2017-05-15', 'D', 798016, 'CREATED', 8, '2023-06-14',(SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Головина', 'Мария', 'Данииловна', 'MASS', '2021-02-18', 'D', 655531, 'CREATED', 6, '2023-05-13',(SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Некрасов', 'Вадим', 'Платонович', 'DRAW', '2017-12-05', 'D', 586622, 'CREATED', 8, '2023-07-07',(SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Калинина', 'София', 'Марковна', 'MASS', '2019-10-03', 'D', 282820, 'CREATED', 7, '2023-03-17', (SELECT id from resource WHERE region = 'Стерлибашевский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Смирнова', 'Антонина', 'Александровна', 'DRAW', '2015-01-01', 'E', 296938, 'CREATED', 6, '2023-07-01', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Васильев', 'Макар', 'Маркович', 'DRAW', '2018-10-20', 'E', 672207, 'CREATED', 5, '2023-06-21', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Афанасьева', 'Ева', 'Богдановна', 'MASS', '2016-10-10', 'E', 607229, 'CREATED', 3, '2023-03-27', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Леонов', 'Владимир', 'Богдановна', 'DRAW', '2012-09-28', 'E', 748525, 'CREATED', 4, '2023-03-14', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Прокофьев', 'Арсений', 'Егорович', 'MASS', '2010-07-15', 'E', 370939, 'CREATED', 3, '2023-06-15', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Ильина', 'Диана', 'Анатольевна', 'MASS', '2018-05-24', 'A', 452790, 'CREATED', 2, '2023-06-11', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Макеев', 'Матвей', 'Леонидович', 'MASS', '2016-02-10', 'A', 385571, 'CREATED', 3, '2023-05-09', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Жданова', 'Светлана', 'Георгиевна','DRAW', '2012-11-27', 'A', 474206, 'CREATED', 5, '2023-05-01', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Воробьев', 'Иван', 'Всеволодович', 'MASS', '2015-11-09', 'A', 335254, 'CREATED', 4, '2023-04-02', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Котова', 'Виктория', 'Данииловна', 'MASS', '2019-05-06', 'A', 560192, 'CREATED', 6, '2023-03-16', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Плотников', 'Тимур', 'Александрович', 'MASS', '2015-09-06', 'A', 573062, 'CREATED', 2, '2023-04-06', (SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Плотников', 'Тимур', 'Александрович', 'MASS', '2015-09-06', 'A', 573062, 'CREATED', 5, '2023-03-04', (SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Румянцева', 'Варвара', 'Марковна', 'MASS', '2011-05-25', 'A', 539470, 'CREATED', 3, '2023-03-01', (SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Румянцева', 'Варвара', 'Марковна', 'MASS', '2011-05-25', 'A', 539470, 'CREATED', 4, '2023-05-09', (SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Румянцева', 'Варвара', 'Марковна', 'MASS', '2011-05-25', 'A', 539470, 'CREATED', 2, '2023-03-16', (SELECT id from resource WHERE region = 'Ишимбайский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Потапов', 'Михаил', 'Арсентьевич', 'DRAW', '2017-12-02', 'B', 684836, 'CREATED', 5, '2023-03-27', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Потапов', 'Михаил', 'Арсентьевич', 'DRAW', '2017-12-02', 'B', 684836, 'CREATED', 4, '2023-03-24',(SELECT id from resource WHERE region = 'Туймазинский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Потапов', 'Михаил', 'Арсентьевич', 'DRAW', '2017-12-02', 'B', 684836, 'CREATED', 3, '2023-03-23', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Греков', 'Сергей', 'Евгеньевич', 'MASS', '2013-02-07', 'B', 556772, 'CREATED', 1, '2023-03-27', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Греков', 'Сергей', 'Евгеньевич', 'MASS', '2013-02-07', 'B', 556772, 'CREATED', 2, '2023-03-22', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Бондарев', 'Иван', 'Захарович', 'MASS', '2015-10-15', 'C', 357850, 'CREATED', 3, '2023-06-05', (SELECT id from resource WHERE region = 'Федоровский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Бондарев', 'Иван', 'Захарович', 'MASS', '2015-10-15', 'C', 357850, 'CREATED', 3, '2023-03-30', (SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Бондарев', 'Иван', 'Захарович', 'MASS', '2015-10-15', 'C', 357850, 'CREATED', 3, '2023-04-01', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Бондарев', 'Иван', 'Захарович', 'MASS', '2015-10-15', 'C', 357850, 'CREATED', 1, '2023-03-30', (SELECT id from resource WHERE region = 'Илишевский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Бондарев', 'Иван', 'Захарович', 'MASS', '2015-10-15', 'C', 357850, 'CREATED', 1, '2023-06-03', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Коновалов', 'Кирилл', 'Дмитриевич', 'DRAW', '2021-05-05', 'C', 620371, 'CREATED', 4, '2023-06-27',(SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Крюкова', 'Ева', 'Арсентьевна', 'MASS', '2020-01-14', 'C', 615386, 'CREATED', 2, '2023-06-05',(SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Чесноков', 'Константин', 'Артёмович', 'MASS', '2022-03-04', 'C', 785246, 'CREATED', 1, '2023-06-13', (SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Крюков', 'Артём', 'Эминович', 'MASS', '2023-02-10', 'C', 316843, 'CREATED', 3, '2023-06-24', (SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Маркелова ', 'Алисия', 'Матвеевна', 'DRAW', '2020-06-01', 'C', 439011, 'CREATED', 1, '2023-06-03', (SELECT id from resource WHERE region = 'Буздякский' AND name = 'Боровая дичь'));

INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Никонов', 'Николай', 'Денисович', 'MASS', '2020-06-01', 'A', 736661, 'CREATED', 2, '2023-07-13',(SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Сидорова', 'Ева', 'Арсентьевна', 'DRAW', '2020-06-05', 'A', 424873, 'CREATED', 3, '2023-06-02', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Кольцова', 'Елизавета', 'Дмитриевна', 'MASS', '2015-10-15', 'A', 721180, 'CREATED', 2, '2023-06-21', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Калмыков', 'Олег', 'Дмитриевич', 'DRAW', '2015-10-15', 'A', 515162, 'CREATED', 1, '2023-05-03',(SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Болотно-луговая дичь'));
INSERT INTO application (lastname, firstname, middlename, type, license_date_of_issue, license_series, license_number, state, resource_count, creation_date, resource_id)
VALUES ('Зайцев', 'Лев', 'Ярославович', 'MASS', '2020-06-01', 'A', 515165, 'CREATED', 2, '2023-06-03', (SELECT id from resource WHERE region = 'Кармаскалинский' AND name = 'Полевая и степная дичь'));