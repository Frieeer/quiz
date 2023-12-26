package com.example.quiz;

import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizData {


    public static String[] questions_space = {
            "Какая галактика является ближайшей к Млечному Пути?",
            "Как называется самая крупная щель у колец Сатурна?",
            "В каком созвездии находится Полярная звезда?",
            "Какая самая яркая звезда на звёздном небе?",
            "В каком рукаве находится Солнечная система?",
            "Спутник какой планеты является крупнейшим в Солнечной системе?",
            "У какого тела, кроме Земли, доказано стабильное существование жидкости?",
            "Как открыли Нептун?",
            "Какой космический зонд быстрее всего удаляется от Солнечной системы?",
            "Какая звезда находится ближе всех к Солнечной системе?",
            "В каком сверхскоплении галактик находится Местная группа галактик?",
            "Какая крупнейшая галактика-спутник у Млечного пути?",
            "Какое среднее расстояние от Земли до Луны?",
            "К какому классу звёзд относится Солнце?",
            "Что разделяет Марс и Юпитер?",
            "На каком расстоянии от Солнца находится Земля?",
            "Какие единицы измерения используют для определения расстояния между очень далёкими объектами Вселенной?",
            "Какие единицы измерения используют для определения расстояния между объектами Солнечной системы?",
            "Что такое гравитационное красное смещение?",
            "Как образуются чёрные дыры?"
    };

    public static String[][] options_space = {
            {"Галактика Треугольник", "Галактика Андромеда", "Галактика Боде", "Галактика Сомбреро"},
            {"Щель Гюйгенса", "Щель Гершеля", "Щель Максвелла", "Щель Кассини"},
            {"Малая Медведица", "Андромеда", "Кассиопея", "Большая Медведица"},
            {"Полярная", "Сириус", "Бетельгейзе", "Альфа Центавра"},
            {"Рукав Центавра", "Рукав Персея", "Рукав Ориона", "Рукав Стрельца"},
            {"Земля", "Сатурн", "Юпитер", "Нептун"},
            {"Венера", "Титан", "Ио", "Нептун"},
            {"Был найден космическим зондом во время исследования Урана", "Были найдены упоминания в древних писаниях", "Был найден в телескоп", "Предсказан на основе возмущений орбиты Урана"},
            {"Вояджер-1", "Пионер-11", "Пионер-10", "Вояджер-2"},
            {"Полярная", "Сириус", "Проксима Центавра", "Альфа Центавра"},
            {"Ланиакея", "Девы", "Гидры-Центавра", "Геркулеса"},
            {"Большое Магелланово Облако", "Малое Магелланово Облако", "Скульптор", "Геркулес"},
            {"401 005 км", "279 587 км", "327 058 км", "384 467 км"},
            {"Нейтронная звезда", "Красный карлик", "Жёлтый карлик", "Красный гигант"},
            {"Гелиосфера", "Облако Оорта", "Пояс Койпера", "Пояс астероидов"},
            {"149 600 000 км", "156 750 000 км", "138 900 000 км", "150 100 000 км"},
            {"Километры", "Световые года", "Астрономические единицы", "Гигапарсеки"},
            {"Метры", "Километры", "Астрономические единицы", "Световые года"},
            {"Явление, при котором свет от объектов в космосе изменяет своё направление под воздействием гравитационных волн", "Эффект, вызванный наложением красных фильтров на космические телескопы", "Изменение цвета света от удаленных объектов под воздействием сильного гравитационного поля", "Процесс, при котором свет от звезды становится красным из-за долгосрочного воздействия атмосферы Земли"},
            {"В результате коллапса ядра сверхмассивных звёзд под действием собственной гравитации", "В результате слияния двух некрупных звёзд", "Могут образоваться из скопления межзвёздного газа и пыли", "Образовались сразу после Большого взрыва"}
    };

    public static int[] correctAnswers_space = {1, 3, 0, 1, 2, 2, 1, 3, 0, 2, 1, 0, 3, 2, 3, 0, 3, 2, 2, 0};

    public static String[] questions_geo = {
            "Какое озеро самое крупное по площади?",
            "Какая самая высокая горная вершина Европы?",
            "Какая самая длинная река в мире?",
            "Какую глубину имеет Марианская Впадина?",
            "Что такое кальдера?",
            "Какой действующий вулкан является самым южным на Земле?",
            "У какой горной вершины самая большая относительная высота?",
            "К какому классу вулканов относится Эльбрус?",
            "Какой абсолютный минимум температуры на Земле?",
            "Какой абсолютный максимум температуры на Земле?",
            "Какова длина окружности Земли по экватору?",
            "По периметру какого океана проходит вулканическое огненное кольцо?",
            "Какая река является самой длинной в Европе?",
            "Какая глубина у озера Байкал?",
            "Сколько морей омывает Монголию?",
            "Сколько стран-анклавов в мире?",
            "Сколько морей омывает Россию?",
            "Что такое фьорды?",
            "Какая горная цепь является самой крупной по длине?",
            "Какой ударный кратер является самым большим по диаметру?"
    };

    public static String[][] options_geo = {
            {"Виктория", "Каспийское море", "Байкал", "Мичиган-Гурон"},
            {"Монблан", "Пик Дюфур", "Джомолунгма", "Эльбрус"},
            {"Нил", "Амазонка", "Миссисипи", "Енисей"},
            {"10 012 м", "11 034 м", "8 878 м", "9 274 м"},
            {"Кратер от метеорита", "Название горной вершины", "Котловина вулканического происхождения", "Название озера"},
            {"Эребус", "Мельбурн", "Террор", "Уайт"},
            {"Джомолунгма", "Мауна-кеа", "Арарат", "Килиманджаро"},
            {"Щитовидный", "Шлаковый", "Купольный", "Стратовулкан"},
            {"-87,9 °C", "-73,5 °C", "-93,2 °C", "-97,8 °C"},
            {"+49,4 °C", "+56,7 °C", "+60,3 °C", "+52,1 °C"},
            {"41 195 км", "40 075 км", "40 286 км", "39 852 км"},
            {"Северного Ледовитого", "Атлантического", "Тихого", "Индийского"},
            {"Дунай", "Волга", "Днепр", "Дон"},
            {"1 283 м", "1 442 м", "1 642 м", "1 753 м"},
            {"Ноль", "Два", "Одно", "Три"},
            {"Ноль", "Три", "Пять", "Два"},
            {"Тринадцацать", "Двенадцать", "Шестнадцать", "Четырнадцать"},
            {"Общее название группы заливов", "Название национального парка", "Название горного хребта", "Глубоко врезающийся в сушу морской залив со скалистыми берегами"},
            {"Гималаи", "Главный Кавказский хребет", "Анды", "Уральские горы"},
            {"Кратер Садбери", "Кратер Чикшулуб", "Кратер Вредефорт", "Кратер Каракуль"}
    };

    public static int[] correctAnswers_geo = {1, 3, 0, 1, 2, 0, 1, 3, 2, 1, 1, 2, 1, 2, 0, 1, 3, 3, 2, 2};

    public static String[] questions_random;

    public static String[][] options_random;

    public static int[] correctAnswers_random;


    static {

        questions_random = new String[questions_space.length + questions_geo.length];
        System.arraycopy(questions_space, 0, questions_random, 0, questions_space.length);
        System.arraycopy(questions_geo, 0, questions_random, questions_space.length, questions_geo.length);


        options_random = new String[options_space.length + options_geo.length][];
        System.arraycopy(options_space, 0, options_random, 0, options_space.length);
        System.arraycopy(options_geo, 0, options_random, options_space.length, options_geo.length);


        correctAnswers_random = new int[correctAnswers_space.length + correctAnswers_geo.length];
        System.arraycopy(correctAnswers_space, 0, correctAnswers_random, 0, correctAnswers_space.length);
        System.arraycopy(correctAnswers_geo, 0, correctAnswers_random, correctAnswers_space.length, correctAnswers_geo.length);
    }
    public static List<Integer> getRandomQuestionsIndexes(int count, String type) {
        List<Integer> allIndexes = new ArrayList<>();
        String[] questions;
        if ("space".equals(type)) {
            questions = questions_space;
        } else if ("geo".equals(type)) {
            questions = questions_geo;
        } else if ("random".equals(type)) {
            questions = questions_random;
        } else {
            return Collections.emptyList();
        }

        for (int i = 0; i < questions.length; i++) {
            allIndexes.add(i);
        }

        Collections.shuffle(allIndexes);

        return allIndexes.subList(0, count);
    }

    public static String[] getQuestionsSubset(List<Integer> indexes, String type) {
        String[] subset = new String[indexes.size()];
        String[] questions;
        if ("space".equals(type)) {
            questions = questions_space;
        } else if ("geo".equals(type)) {
            questions = questions_geo;
        } else if ("random".equals(type)){
            questions = questions_random;
        } else {
            return new String[0];
        }

        for (int i = 0; i < indexes.size(); i++) {
            subset[i] = questions[indexes.get(i)];
        }
        return subset;
    }

    public static String[][] getOptionsSubset(List<Integer> indexes, String type) {
        String[][] subset = new String[indexes.size()][];
        String[][] options;
        if ("space".equals(type)) {
            options = options_space;
        } else if ("geo".equals(type)) {
            options = options_geo;
        } else if ("random".equals(type)) {
            options = options_random;
        } else {
            return new String[0][];
        }

        for (int i = 0; i < indexes.size(); i++) {
            subset[i] = options[indexes.get(i)];
        }
        return subset;
    }

    public static int[] getCorrectAnswersSubset(List<Integer> indexes, String type) {
        int[] subset = new int[indexes.size()];
        int[] correctAnswers;
        if ("space".equals(type)) {
            correctAnswers = correctAnswers_space;
        } else if ("geo".equals(type)) {
            correctAnswers = correctAnswers_geo;
        } else if ("random".equals(type)) {
            correctAnswers = correctAnswers_random;
        } else {
            return new int[0];
        }

        for (int i = 0; i < indexes.size(); i++) {
            subset[i] = correctAnswers[indexes.get(i)];
        }
        return subset;
    }
}

