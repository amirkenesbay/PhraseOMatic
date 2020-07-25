public class PhraseOMatic {
    public static void main(String[] args) {
        //Создание три набора слов
        String[] wordListOne = {"круглосуточный", "трех-звенный", "3000-футовый", "взаимный", "обоюдный выигрыщ", "фронтэнд", "на основе веб-технологии"};

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризованный"};

        String[] wordListThree = {"процесс", "пункт загрузки", "выход из положения", "тип структуры", "талант", "подход", "портал"};

        //Вычисляем сколько слов в списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Выводим фразу на экран
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
