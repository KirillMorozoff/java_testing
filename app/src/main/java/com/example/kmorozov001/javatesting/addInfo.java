package com.example.kmorozov001.javatesting;

import android.content.ContentValues;

/**
 * Created by kmorozov001 on 29.08.2016.
 */
public class addInfo {

    ContentValues[] array;

    public  void adding()
    {
        // Создание новой строки
        array = new ContentValues[64];
        for(int i = 0; i < 64; i++){
            array[i] = new ContentValues();
        }

        array[0] = new ContentValues();
        // Задайте значения для каждого столбца
        array[0].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Сколько ключевых слов зарезервировано языком, что это за слова, какие из них не используются?</h1>");
        array[0].put(DatabaseHelper.WRONG_ANSWER_1, "55, два из них не используются: yield, catch");
        array[0].put(DatabaseHelper.WRONG_ANSWER_2, "64, одно из них не используется, export");
        array[0].put(DatabaseHelper.WRONG_ANSWER_3, "80, два из них не используются: from, orderby");
        array[0].put(DatabaseHelper.WRITE_ANSWER, "50, два из них не используются: const, goto");
        array[0].put(DatabaseHelper.ARTICLE, "<h1>Для запоминания это:</h1>" +
                "<b>- Примитивы </b>(byte, short, int, long, char,<br> float, double, boolean)<br>" +
                "<b>- Циклы и ветвления</b> (if, else, switch, case,<br> default, while, do, break, continue, for)<br>" +
                "<b>- Исключения </b>(try, catch, finally, throw, throws)<br>" +
                "<b>- Области видимости</b> (private, protected, public)<br>" +
                "<b>- Объявление \\ Импорт </b>(import, package, class, interface,<br> extends, implements, static, final, void, abstract, native)<br>" +
                "<b>- Создание \\ Возврат \\ Вызов </b>(new, return, this, super)<br>" +
                "<b>- Многопоточность </b>(synchronized, volatile)<br>" +
                "<b>- instanceof, enum, assert, transient, strictfp, const, goto");

        //___001_____________________________________________________________________________________________________________________


        array[1] = new ContentValues();
        // Задайте значения для каждого столбца
        array[1].put(DatabaseHelper.QUESTION_COLUMN, "<h1>На какие основные группы можно поделить типы данных?</h1>");
        array[1].put(DatabaseHelper.WRONG_ANSWER_1, "Числовые и строчные");
        array[1].put(DatabaseHelper.WRONG_ANSWER_2, "Числовые, символьные и булевы");
        array[1].put(DatabaseHelper.WRONG_ANSWER_3, "Числовые и символьные");
        array[1].put(DatabaseHelper.WRITE_ANSWER, "Примитивные и ссылочные");
        array[1].put(DatabaseHelper.ARTICLE,  "<h1>Примитивные</h1>" +
                "\n" +
                "<b>- byte </b>(целые числа, 1 байт)<br>" +
                "<b>- short </b>(целые числа, 2 байта)<br>" +
                "<b>- int</b> (целые числа, 4 байта)<br>" +
                "<b>- long </b>(целые числа, 8 байт)<br>" +
                "<b>- float </b>(вещественные числа, 4 байта)<br>" +
                "<b>- double</b> (вещественные числа, 8 байт)<br>" +
                "<b>- char</b> (символ Unicode, 2 байта)<br>" +
                "<b>- boolean</b> (значение истина/ложь, 1 байт)<br>" +
                "\n" +
                "<h1>Ссылочные:</h1>" +
                " В ссылочные типы входят все классы, интерфейсы, массивы.");

        //_____002___________________________________________________________________________________________________________________


        array[2] = new ContentValues();
        // Задайте значения для каждого столбца
        array[2].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какие примитивные типы вы знаете?</h1>");
        array[2].put(DatabaseHelper.WRONG_ANSWER_1, "byte, short, int, long, float, double, char, boolean, decimal, IntPtr, UIntPtr");
        array[2].put(DatabaseHelper.WRONG_ANSWER_2, "byte, short, int, long, float, double, char, boolean, decimal");
        array[2].put(DatabaseHelper.WRONG_ANSWER_3, "byte, short, int, long, float, double, char, boolean, decimal, string, char");
        array[2].put(DatabaseHelper.WRITE_ANSWER, "byte, short, int, long, float, double, char, boolean");
        array[2].put(DatabaseHelper.ARTICLE,  "<h1>Примитивные</h1>" +
                "\n" +
                "<b>- byte</b> (целые числа, 1 байт)<br>" +
                "<b>- short</b> (целые числа, 2 байта)<br>" +
                "<b>- int </b>(целые числа, 4 байта)<br>" +
                "<b>- long </b>(целые числа, 8 байт)<br>" +
                "<b>- float </b>(вещественные числа, 4 байта)<br>" +
                "<b>- double</b> (вещественные числа, 8 байт)<br>" +
                "<b>- char</b> (символ Unicode, 2 байта)<br>" +
                "<b>- boolean</b> (значение истина/ложь, 1 байт)<br>" +
                "\n" +
                "<h1>Ссылочные.</h1>" +
                "В ссылочные типы входят все классы, интерфейсы, массивы.");

        //________003________________________________________________________________________________________________________________


        array[3] = new ContentValues();
        // Задайте значения для каждого столбца
        array[3].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Дан код:</h1><font color = \"blue\">public class </font>Clazz { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "         <font color = \"blue\">int</font> a = <font color = \"red\">0</font>; <br>" +
                "        System.out.println(<font color = \"teal\">\"a=\"</font> + <font color = \"blue\">new</font> Integer(a = 1)); <br>" +
                "    } <br>" +
                "} ");
        array[3].put(DatabaseHelper.WRONG_ANSWER_1, "a=0");
        array[3].put(DatabaseHelper.WRONG_ANSWER_2, "a=null");
        array[3].put(DatabaseHelper.WRONG_ANSWER_3, "Возникнет ошибка компиляции");
        array[3].put(DatabaseHelper.WRITE_ANSWER, "a=1");
        array[3].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Изначально <b>a=0</b>, оператор <b>\"=\"</b> имеет,<br> если говорить" +
                "абстрактно вот такую форму<br><b>int operator_= (int n){ return n; }</b><br>" +
                "то есть в результате <b>(a=1</b>) возвращает <b>1</b>, <br>что передается" +
                "в конструктор класса <b>Integer</b>");

        //________004________________________________________________________________________________________________________________


        array[4] = new ContentValues();
        // Задайте значения для каждого столбца
        array[4].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Скомпилируется ли следующий код, если оба класса будут объявлены в файле Test.java?</h1> <br>" +
                "<font color = \"green\">//Test.java</font><br>" +
                "<font color = \"blue\">public class</font> Car{ <br>" +
                "    <font color = \"blue\">public</font> String myCar = <font color = \"teal\">\"Ferrari\"</font> ; <br>" +
                "} <br>" +
                "<font color = \"blue\">public class Test</font>{ <br>" +
                "    <font color = \"blue\">public static void</font> main(String ... args){<br>" +
                "        Car myCar = <font color = \"blue\">new</font> Car(); <br>" +
                "        System.out.println(myCar.myCar); <br>" +
                "    } <br>" +
                "} ");
        array[4].put(DatabaseHelper.WRONG_ANSWER_1, "Да");
        array[4].put(DatabaseHelper.WRONG_ANSWER_2, "Наверное");
        array[4].put(DatabaseHelper.WRONG_ANSWER_3, "Возможно");
        array[4].put(DatabaseHelper.WRITE_ANSWER, "Нет");
        array[4].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Код не скомпилируется из-за класса <b>Car</b>.<br> Только один из классов в файле может быть объявлен как <b>public</b>.");


        //_________005______________________________________________________________________________________________________________


        array[5] = new ContentValues();
        // Задайте значения для каждого столбца
        array[5].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет результат выполнения кода? </h1> <br>" +
                "<font color = \"red\">1</font>: <font color = \"blue\">class</font> Foo { <br>" +
                "<font color = \"red\">2</font>:   <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "<font color = \"red\">3</font>:     Integer i = <font color = \"red\">42</font>; <br>" +
                "<font color = \"red\">4</font>:     String s = (i < <font color = \"red\">40</font>) ? <font color = \"teal\">\"life\"</font> : (i > <font color = \"red\">50</font>) ? <font color = \"teal\">\"universe\"</font> : <font color = \"teal\">\"everything\"</font>; <br>" +
                "<font color = \"red\">5</font>:     System.out.print(s); <br>" +
                "<font color = \"red\">6</font>:   } <br>" +
                "<font color = \"red\">7</font>: }  ");
        array[5].put(DatabaseHelper.WRONG_ANSWER_1, "null");
        array[5].put(DatabaseHelper.WRONG_ANSWER_2, "life");
        array[5].put(DatabaseHelper.WRONG_ANSWER_3, "universe");
        array[5].put(DatabaseHelper.WRITE_ANSWER, "everything");
        array[5].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Продвинутые программисты часто используют тернарный оператор <b>? :</b> вместо <b>if-else</b>. Тернарный оператор использует три операнда и<br>записывается в форме:<br><br>"
                +
                "<b>логическое_условие ? выражение1 : выражение2</b><br><br>"
                +
                "Если <b>логическое_условие</b> истинно, т.е.<br>возвращает <b>true</b>, то берётся (или вычисляется)<br>первоевыражение слева от двоеточия, если<br>возвращается <b>false</b>, то берётся второе<br>выражение справа от двоеточия.<br><br>" +
                "Например, нужно вычислить, какое из двух чисел больше и занести результат в третью переменную:<br><br>"
                +
                "<font color = \"blue\">int</font> largerNum;  <br>" +
                "<font color = \"blue\">int</font> lowNum = <font color = \"red\">9</font>;  <br>" +
                "<font color = \"blue\">int</font> highNum = <font color = \"red\">27</font>; <br>" +
                "<br>" +
                "<font color = \"blue\">if</font>(lowNum < highNum)  <font color = \"green\">// если первое число меньше второго</font><br>" +
                "{  <br>" +
                "    largerNum = highNum;<br>" +
                "} <font color = \"blue\">else</font> {  // иначе<br>" +
                "    largerNum = lowNum;  <br>" +
                "}  ");

        //_________006______________________________________________________________________________________________________________


        array[6] = new ContentValues();
        // Задайте значения для каждого столбца
        array[6].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет результат выполнения кода? </h1> <br>" +
                "<font color = \"red\">1</font>: <font color = \"blue\">class</font> Foo { <br>" +
                "<font color = \"red\">2</font>:   <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "<font color = \"red\">3</font>:     Integer i = <font color = \"red\">42</font>; <br>" +
                "<font color = \"red\">4</font>:     String s = (i < <font color = \"red\">40</font>) ? <font color = \"teal\">\"life\"</font> : (i > <font color = \"red\">50</font>) ? <font color = \"teal\">\"universe\"</font> : <font color = \"teal\">\"everything\"</font>; <br>" +
                "<font color = \"red\">5</font>:     System.out.print(s); <br>" +
                "<font color = \"red\">6</font>:   } <br>" +
                "<font color = \"red\">7</font>: }  ");
        array[6].put(DatabaseHelper.WRONG_ANSWER_1, "null");
        array[6].put(DatabaseHelper.WRONG_ANSWER_2, "life");
        array[6].put(DatabaseHelper.WRONG_ANSWER_3, "universe");
        array[6].put(DatabaseHelper.WRITE_ANSWER, "everything");
        array[6].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Продвинутые программисты часто используют тернарный оператор <b>? :</b> вместо <b>if-else</b>. Тернарный оператор использует три операнда и<br>записывается в форме:<br><br>"
                +
                "<b>логическое_условие ? выражение1 : выражение2</b><br><br>"
                +
                "Если <b>логическое_условие</b> истинно, т.е.<br>возвращает <b>true</b>, то берётся (или вычисляется)<br>первоевыражение слева от двоеточия, если<br>возвращается <b>false</b>, то берётся второе<br>выражение справа от двоеточия.<br><br>" +
                "Например, нужно вычислить, какое из двух чисел больше и занести результат в третью переменную:<br><br>"
                +
                "<font color = \"blue\">int</font> largerNum;  <br>" +
                "<font color = \"blue\">int</font> lowNum = <font color = \"red\">9</font>;  <br>" +
                "<font color = \"blue\">int</font> highNum = <font color = \"red\">27</font>; <br>" +
                "<br>" +
                "<font color = \"blue\">if</font>(lowNum < highNum)  <font color = \"green\">// если первое число меньше второго</font><br>" +
                "{  <br>" +
                "    largerNum = highNum;<br>" +
                "} <font color = \"blue\">else</font> {  // иначе<br>" +
                "    largerNum = lowNum;  <br>" +
                "}  ");


        //_________007______________________________________________________________________________________________________________


        array[7] = new ContentValues();
        // Задайте значения для каждого столбца
        array[7].put(DatabaseHelper.QUESTION_COLUMN, "<h1>В какой строке(-ах) кода содержится ошибка?</h1> <br>" +
                "<font color = \"blue\">int</font> i = <font color = \"red\">1</font>;            <font color = \"teal\">//1</font> <br>" +
                "i = -+(<font color = \"red\">10</font> + <font color = \"red\">2</font> + i);   <font color = \"teal\">//2</font> <br>" +
                "++i--;               <font color = \"teal\"> //3</font> <br>" +
                "System.out.println(i); ");
        array[7].put(DatabaseHelper.WRONG_ANSWER_1, "1");
        array[7].put(DatabaseHelper.WRONG_ANSWER_2, "2");
        array[7].put(DatabaseHelper.WRONG_ANSWER_3, "2,3");
        array[7].put(DatabaseHelper.WRITE_ANSWER, "3");
        array[7].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "В Java существует два оператора, называемых операторами инкремента и декремента (++ и --) и являющихся сокращенным вариантом записи для сложения или вычитания из операнда единицы.<br><br> Эти операторы уникальны в том плане, что могут использоваться как в префиксной, так и в постфиксной форме. <br><br>При использовании префиксной формы операнд модифицируется перед выполнением операции. <br><br>В постфиксной форме сначала используется содержимое операнда, а лишь после этого операнд инкрементируется или декрементируется. <br><br>Следующий пример иллюстрирует использование операторов инкремента и декремента.<br><br> " +
                "<font color = \"blue\">class</font> IncDec {<br>" +
                "<font color = \"blue\">public static void</font> main(String args[]){<br>" +
                "<font color = \"blue\">int</font> a = <font color = \"red\">1</font>;<br>" +
                "<font color = \"blue\">int</font> b = <font color = \"red\">2</font>;<br>" +
                "<font color = \"blue\">int</font> с = ++b;<br>" +
                "<font color = \"blue\">int</font> d = a++;<br>" +
                "c++;<br>" +
                "System.out.print(<font color = \"teal\">\"a = \"</font> + a);<br>" +
                "System.out.print(<font color = \"teal\">\"b = \"</font> + b);<br>" +
                "System.out.print(<font color = \"teal\">\"c = \"</font> + c);<br>" +
                "System.out.println(<font color = \"teal\">\"d = \"</font> + d);<br>" +
                "}<br>" +
                "} ");


        //_________008______________________________________________________________________________________________________________


        array[8] = new ContentValues();
        // Задайте значения для каждого столбца
        array[8].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "System.out.println(0.3 == 0.1d + 0.1d + 0.1d ); ");
        array[8].put(DatabaseHelper.WRONG_ANSWER_1, "true");
        array[8].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции");
        array[8].put(DatabaseHelper.WRONG_ANSWER_3, "0.3");
        array[8].put(DatabaseHelper.WRITE_ANSWER, "false");
        array[8].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Правильный ответ на этот вопрос связан со способом представления дробных чисел в памяти компьютера.<br><br>Напомним, что они хранятся в двоичном коде.<br><br> " +
                "Если попробовать перевести 0.1 в двоичную систему счисления, то получится БЕСКОНЕЧНАЯ двоичная дробь 0,000110011001100110011001100...<br><br>Поскольку в памяти компьютера число представляется с помощью КОНЕЧНОГО количества двоичных разрядов (например, под значение типа double отводится 64 бита), то бесконечная двоичная дробь просто округляется.<br><br>То число, которое получается в результате округления, будет чуть-чуть (на одну многомиллионную) отличаться от 0.1.<br><br>Аналогично, двоичное представление для 0.3 будет чуть-чуть отличаться от 0.3.<br><br>" +
                "Получается, что в примере сравниваются два числа, каждое из которых примерно равны 0.3, но они не равны между собой.\n" +
                "Если взять числа с другим двоичным представлением, будет другой результат.<br><br><b>Например,</b><br>System.out.println( 0.375 == 0.125d + 0.125d + 0.125d ) выводит true.");

        //_________009______________________________________________________________________________________________________________


        array[9] = new ContentValues();
        // Задайте значения для каждого столбца
        array[9].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "<font color = \"blue\">class</font> Main { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        Integer i = new Integer(<font color = \"teal\">\"10\"</font>); <br>" +
                "        <font color = \"blue\">if</font> (i.toString().intern() == i.toString().intern()) { <br>" +
                "            System.out.println(<font color = \"teal\">\"Равный\"</font>); <br>" +
                "        } <font color = \"blue\">else</font> { <br>" +
                "            System.out.println(<font color = \"teal\">\"Неравный\"</font>); <br>" +
                "        } <br>" +
                "    } <br>" +
                "} ");
        array[9].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компилятора");
        array[9].put(DatabaseHelper.WRONG_ANSWER_2, "Выведется \"Неравный\"");
        array[9].put(DatabaseHelper.WRONG_ANSWER_3, "Ни один из вариантов");
        array[9].put(DatabaseHelper.WRITE_ANSWER, "Выведется \"Равный\"");
        array[9].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Метод intern() в случае, если строки нет в пуле<br>строк, добавляет её туда и возвращает<br>ссылку на эту строку.<br>Таким образом условие будет верным.");


        //_________010______________________________________________________________________________________________________________


        array[10] = new ContentValues();
        // Задайте значения для каждого столбца
        array[10].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "<font color = \"blue\"><b>public class</b></font> Commentator { <br>" +
                "    <font color = \"blue\"><b>public static void</b></font> main( String[] args ) { <br>" +
                "    <font color = \"blue\">/*System.out.println( \"Line1\" ); <br>" +
                "      System.out.println( \"Line2\" );*/ </font><br>" +
                " <br>" +
                "    <font color = \"green\">//System.out.println( \"Line3\" );</font> <br>" +
                "    System.out.println( <font color = \"blue\">\"Line4\"</font> );<font color = \"green\">//</font> <br>" +
                " <br>" +
                "    System.out.println( <font color = \"blue\">\"/*Line5*/\"</font> ); <br>" +
                "    System.out.println( <font color = \"blue\">\"//Line6//\"</font> ); <br>" +
                "    } <br>" +
                "} ");
        array[10].put(DatabaseHelper.WRONG_ANSWER_1, "/*Line5*/  //Line6//");
        array[10].put(DatabaseHelper.WRONG_ANSWER_2, "Line4  /*Line5*/  /Line6/");
        array[10].put(DatabaseHelper.WRONG_ANSWER_3, "На консоль ничего не выведется");
        array[10].put(DatabaseHelper.WRITE_ANSWER, "Line4  /*Line5*/   //Line6//");
        array[10].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Однострочный комментарий // не является<br>спец-символом внутри текстового литерала.");


        //_________011______________________________________________________________________________________________________________


        array[11] = new ContentValues();
        // Задайте значения для каждого столбца
        array[11].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Можно ли динамически менять размер массива?</h1> <br>");
        array[11].put(DatabaseHelper.WRONG_ANSWER_1, "Ни один из вариантов");
        array[11].put(DatabaseHelper.WRONG_ANSWER_2, "Можно, при определенных условиях");
        array[11].put(DatabaseHelper.WRONG_ANSWER_3, "Да, можно");
        array[11].put(DatabaseHelper.WRITE_ANSWER, "Нет, нельзя");
        array[11].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Размер массива определяется при его создании<br>и в дальнейшем не может изменяться.");




        //_________012______________________________________________________________________________________________________________


        array[12] = new ContentValues();
        // Задайте значения для каждого столбца
        array[12].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что произойдет если откомпилировать и выполнить данный код? </h1> <br>" +
                "<font color = \"blue\">public class</font> Main implements Runnable { <br>" +
                "    <font color = \"blue\">public void</font> run() { \n" +
                "        System.out.println(<font color = \"teal\">\"Hello\"</font>); <br>" +
                "        Thread.currentThread().sleep(<font color = \"red\">100</font>);         <br>" +
                "    }        <br>" +
                "    <font color = \"blue\">public static void</font> main(String... args) <font color = \"blue\">throws</font> InterruptedException { <br>" +
                "        <font color = \"blue\">new</font> Thread(<font color = \"blue\">new</font> Main()).start(); <br>" +
                "    } <br>" +
                "} ");
        array[12].put(DatabaseHelper.WRONG_ANSWER_1, "Выведет в консоль \"Hello\"");
        array[12].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка времени выполнения");
        array[12].put(DatabaseHelper.WRONG_ANSWER_3, "Ничего не произойдет");
        array[12].put(DatabaseHelper.WRITE_ANSWER, "Ничего из вышеперечисленного");
        array[12].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Код не откомпилируется.<br>" +
                "Исключение InterruptedException необходимо обрабатывать в методе run()." );


        //_________013______________________________________________________________________________________________________________


        array[13] = new ContentValues();
        // Задайте значения для каждого столбца
        array[13].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что выведет на экран следующий код? </h1> " +
                "<font color = \"blue\">public class</font> Test { <br>" +

                "    <font color = \"blue\">private</font> String name; <br>" +

                "    Test(String name) { <br>" +
                "        <font color = \"blue\">this</font>.name =  name; " +
                "    } <br>" +

                "    <font color = \"blue\">public void</font> test(Test test) {    " +
                "        test = new Test(\"three\");" +
                "    } <br>" +

                "    <font color = \"blue\">public</font> String toString() { <br>" +
                "        <font color = \"blue\">return</font> name;" +
                "    } <br>" +

                "    <font color = \"blue\">public static void main(String[] args) { <br>" +
                "        Test t1 = <font color = \"blue\">new</font> Test(<font color = \"teal\">\"one\"</font>); <br>" +
                "        Test t2 = <font color = \"blue\">new</font> Test(<font color = \"teal\">\"two\"</font>); <br>" +
                "        t1.test(t2); <br>" +
                "        System.out.println(t2); <br>" +
                "    } " +
                "     " +
                "} ");
        array[13].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции");
        array[13].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка выполнения");
        array[13].put(DatabaseHelper.WRONG_ANSWER_3, "three");
        array[13].put(DatabaseHelper.WRITE_ANSWER, "two");
        array[13].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Ссылки в метод передаются по значению<br> и изменять их переназначая на новые <br>объекты нельзя." );


        //_________014______________________________________________________________________________________________________________


        array[14] = new ContentValues();
        // Задайте значения для каждого столбца
        array[14].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какая из следующих строк скомпилируется без ошибок и предупреждений? </h1> <br>");
        array[14].put(DatabaseHelper.WRONG_ANSWER_1, "byte b = 255;");
        array[14].put(DatabaseHelper.WRONG_ANSWER_2, "char c = \"a\";");
        array[14].put(DatabaseHelper.WRONG_ANSWER_3, "float f = 1.3;");
        array[14].put(DatabaseHelper.WRITE_ANSWER, "int i = 10;");
        array[14].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<font color = \"blue\">float</font> f = 1.3;    <font color = \"teal\">// константа 1.3 имеет тип double,<br>нужно использовать 1.3f</font> <br>" +
                "<font color = \"blue\">int</font> i = 10;       <font color = \"teal\">// Ok</font> <br>" +
                "<font color = \"blue\">char</font> c = \"a\";    <font color = \"teal\"> // символьные константы пишут в<br>одиночных кавычках: 'a' </font><br>" +
                "<font color = \"blue\">byte</font> b = 255;     <font color = \"teal\">// диапазон значений для byte:<br>от -128 до 127 </font><br>" +
                "<font color = \"blue\">boolean</font> b = null; <font color = \"teal\">// null допустимо только для ссылочных типов </font>" );



        //_________015______________________________________________________________________________________________________________


        array[15] = new ContentValues();
        // Задайте значения для каждого столбца
        array[15].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы? </h1> <br>" +
                "<font color = \"blue\">public class</font> StartClass { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        Double d1 = 1d; <br>" +
                "        Double d2 = 1d; <br>" +
                "        System.out.println(d1 == d2); <br>" +
                "    } <br>" +
                "} ");
        array[15].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка выполнения");
        array[15].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции");
        array[15].put(DatabaseHelper.WRONG_ANSWER_3, "true");
        array[15].put(DatabaseHelper.WRITE_ANSWER, "false");
        array[15].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Тип <b>double</b> обеспечивает двойную точность,<br>" +
                " что видно из его названия (double -<br>" +
                " двойная).<br><br>Занимает 64 бит для хранения<br>" +
                " значений.<br><br>Многие математические функции<br>" +
                " возвращают значения типа <b>double</b>.<br><br>Кстати,<br>" +
                " современные процессоры оптимизированы<br>" +
                " под вычисления значений двойной точности,<br>" +
                " поэтому они предпочтительнее, чем тип <b>float</b>.<br><br>" +
                "Класс <b>Double</b> является оболочкой для<br>данного типа.<br>" +
                "Без необходимости не используйте в Android<br>класс <b>Double</b>." );


        //_________016______________________________________________________________________________________________________________


        array[16] = new ContentValues();
        // Задайте значения для каждого столбца
        array[16].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы? </h1> <br>" +
                "<font color = \"blue\">public class</font> A { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        <font color = \"blue\">for</font> (<font color = \"blue\">int</font> i = <font color = \"blue\">0</font>; ++i > <font color = \"blue\">0</font>;) { <br>" +
                "            System.out.println(i); <br>" +
                "        } <br>" +
                "    } <br>" +
                "} ");
        array[16].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка выполнения");
        array[16].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции");
        array[16].put(DatabaseHelper.WRONG_ANSWER_3, "Программа зациклится");
        array[16].put(DatabaseHelper.WRITE_ANSWER, "Напечатает все числа от 1 до 2 в 31 степени - 1");
        array[16].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Значение типа int занимает 32 бита (4 байта).<br>" +
                "Всего возможно 232 различных значений,<br>" +
                "из них половина положительных и половина<br>" +
                "отрицательных, причём отрицательными<br>" +
                "считаются числа, у которых старший бит<br>" +
                "равен единице:<br>" +
                "<br>" +
                "00000000 00000000 00000000 000000002 = 010<br>" +
                "00000000 00000000 00000000 000000012 = 110<br>" +
                ". . .<br>" +
                "01111111 11111111 11111111 111111112 = 214748364710 = 231–1<br>" +
                "10000000 00000000 00000000 000000002 = –214748364810 = –231<br>" +
                ". . .<br>" +
                "11111111 11111111 11111111 111111112 = –110<br>" +
                "<br>" +
                "Поэтому во время выполнения цикла после положительного числа 2147483647 получается отрицательное число –2147483648, которое не удовлетворяет условию продолжения цикла и он заканчивает свою работу." );


        //_________017______________________________________________________________________________________________________________


        array[17] = new ContentValues();
        // Задайте значения для каждого столбца
        array[17].put(DatabaseHelper.QUESTION_COLUMN, "<h1>В какой строке возникнет первая ошибка компиляции?</h1> <br>" +
                "public class Test {     <br>" +
                "<font color = \"teal\">    /* 1 */</font>   <font color = \"blue\">public final static class</font> A {} <br>" +
                " <font color = \"teal\">   /* 2 */ </font>  <font color = \"blue\">static private class</font> B {} <br>" +
                "<font color = \"teal\">    /* 3 */ </font>  <font color = \"blue\">abstract static class</font> C {} <br>" +
                "<font color = \"teal\">    /* 4 */</font>   <font color = \"blue\">static final private class</font> D {} <br>" +
                "<font color = \"teal\">    /* 5 */ </font>  <font color = \"blue\">final public abstract class</font> E {} <br>" +
                "<font color = \"teal\">    /* 6 */</font>   <font color = \"blue\">static final abstract class</font> F {} <br>" +
                "}  ");
        array[17].put(DatabaseHelper.WRONG_ANSWER_1, "1");
        array[17].put(DatabaseHelper.WRONG_ANSWER_2, "3");
        array[17].put(DatabaseHelper.WRONG_ANSWER_3, "4");
        array[17].put(DatabaseHelper.WRITE_ANSWER, "5");
        array[17].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<br>Класс не может быть одновременно abstract" +
                "<br>и final" +
                "<br><br>Класс, содержащий абстрактные методы," +
                "<br>называется абстрактным классом." +
                "<br>Такие классы помечаются ключевым" +
                "<br>словом abstract." +
                "<br><br>Поле может быть объявлено как final" +
                "<br>(финальное). Это позволяет" +
                "<br>предотвратить изменение содержимого" +
                "<br>переменной, по сути, это становится" +
                "<br>константой. Финальное поле должно" +
                "<br>быть инициализировано во время его" +
                "<br>первого объявления." +
                "<br><br><font color = \"blue\">final int</font> FILE_OPEN = <font color = \"red\">1</font>;" +
                "<br><br>Теперь можно пользоваться переменной" +
                "<br>FILE_OPEN так, как если бы она была" +
                "<br>константой, без риска изменения их" +
                "<br>значений. Принято записывать имена" +
                "<br>заглавными буквами." +
                "<br><br>Кроме полей, final можно использовать" +
                "<br>для параметров метода (препятствует" +
                "<br>изменению в пределах метода) и у" +
                "<br>локальных переменных (препятствует" +
                "<br>присвоению ей значения более одного" +
                "<br>раза)." +
                "<br><br>Также слово final можно применять" +
                "<br>к методам, чтобы предотвратить его" +
                "<br>переопределение." +
                "<br><br>Ещё один вариант использования ключевого" +
                "<br>слова final - предотвращение наследования" +
                "<br>класса. При этом неявно всего методы" +
                "<br>класса также становятся финальными." +
                "<br>Поэтому нельзя одновременно объявить" +
                "<br>класс абстрактным и финальным," +
                "<br>поскольку абстрактный класс является" +
                "<br>лишь шаблоном и только его" +
                "<br>подклассы реализуют методы.<br>"  );


        //_________018______________________________________________________________________________________________________________


        array[18] = new ContentValues();
        // Задайте значения для каждого столбца
        array[18].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что будет результатом выполнения следующего кода?</h1> <br>" +
                "<font color = \"blue\">public class</font> Base {" +
                " <br>" +
                "    <font color = \"blue\">public</font> Object print() { <br>" +
                "        <font color = \"blue\">return</font> <font color = \"teal\">\"Object from base method\"</font>; <br>" +
                "    } " +
                " <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        Base test = <font color = \"blue\">new</font> Child(); <br>" +
                "        System.out.println(test.print()); " +
                "    }<br>" +

                "} <br>" +

                "class Child <font color = \"blue\">extends</font> Base { <br>" +

                "    <font color = \"blue\">public</font> String print() { <br>" +
                "        <font color = \"blue\">return</font> <font color = \"teal\">\"String from child method\"</font>;" +
                "    } " +
                "} ");
        array[18].put(DatabaseHelper.WRONG_ANSWER_1, "Object from base method ");
        array[18].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции");
        array[18].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка времени выполнения");
        array[18].put(DatabaseHelper.WRITE_ANSWER, "String from child method");
        array[18].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Переопределенный метод производного класса может вернуть тип, производный от типа, возвращаемого методом базового класса.<br>"  );




        //_________019______________________________________________________________________________________________________________


        array[19] = new ContentValues();
        // Задайте значения для каждого столбца
        array[19].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "Integer i1 = <font color = \"red\">10</font>; <br>" +
                "Integer i2 = <font color = \"red\">10</font>; <br>" +
                "           <br>" +
                "Double d1 = 10d; <br>" +
                "Double d2 = 10d; <br>" +
                " <br>" +
                "System.out.println(i1 == i2); <br>" +
                "System.out.println(d1 == d2); ");
        array[19].put(DatabaseHelper.WRONG_ANSWER_1, "false, true");
        array[19].put(DatabaseHelper.WRONG_ANSWER_2, "false, false");
        array[19].put(DatabaseHelper.WRONG_ANSWER_3, "true, true");
        array[19].put(DatabaseHelper.WRITE_ANSWER, "true, false");
        array[19].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "В данном случае сравниваются не числа, а объекты (дженерики - это объекты). Объекты сравниваются по ссылке." +
                "<br><br>" +
                "Для более эффективного использования памяти, в джаве используются так называемые пулы.<br><br>Есть строковый пул, Integer pool итд.<br><br>Когда мы создаем объект не используя операцию new, объект помещается в пул, и в последствии, если мы захотим создать такой же объект (опять не используя new), новый объект создан не будет, а мы просто получим ссылку на наш объект из пула.<br><br>" +
                "Особенность Integer-пула — он хранит только числа, которые помещаются в тип данных byte: от -128 до 127.<br><br>Для остальных чисел пул не работает.<br>"  );


        //_________020______________________________________________________________________________________________________________


        array[20] = new ContentValues();
        // Задайте значения для каждого столбца
        array[20].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "<font color = \"blue\">class</font> Quest3 { <br>" +
                "    <font color = \"blue\">public static void</font> main(String s[ ]) { <br>" +
                "        String args; <br>" +
                "        System.out.print(args + s); <br>" +
                "    }  <br>" +
                "}  ");
        array[20].put(DatabaseHelper.WRONG_ANSWER_1, "Компиляция без ошибок");
        array[20].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции: несовпадение типов параметров при вызове метода print()");
        array[20].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции: метод main() содержит неправильное имя параметра");
        array[20].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции: переменная args используется до инициализации");
        array[20].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Если переменная объявлена в методе, то до своего использования она должна быть проинициализирована, иначе компилятор сообщает об ошибке.<br><br>" +
                "При инициализированном значении переменной args в методе print() ошибка не возникает, так как оператор сложения инициирует действия по преобразованию в строку всех участвующих в конкатенации объектов.<br><br>" +
                "Параметр String[] args в main() – просто соглашение, и может быть использован любой приемлемый идентификатор для массива строк.<br>"  );

//_________021______________________________________________________________________________________________________________


        array[21] = new ContentValues();
        // Задайте значения для каждого столбца
        array[21].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "<font color = \"blue\">public class</font> StartClass { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        Integer i1 = <font color = \"red\">10</font>; <br>" +
                "        Integer i2 = <font color = \"red\">10</font>; <br>" +
                "        System.out.println(i1 == i2); <br>" +
                "        System.out.println(i1 == 10);<br>" +
                "    } <br>" +
                "} ");
        array[21].put(DatabaseHelper.WRONG_ANSWER_1, "false, false");
        array[21].put(DatabaseHelper.WRONG_ANSWER_2, "true, false");
        array[21].put(DatabaseHelper.WRONG_ANSWER_3, "false, true");
        array[21].put(DatabaseHelper.WRITE_ANSWER, "true, true");
        array[21].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Действие оператора == зависит от типа операндов.<br><br>" +
                "Если сравниваются две ссылки, то true будет, если это ссылки на один и тот же объект.<br><br>Так, в первом случае сравниваются ссылки на один и тот же объект из integer pool.<br><br>" +
                "Если один из операндов - значение примитивного типа (число), то другой операнд преобразовывается к этому же типу.<br><br>Т.е. во втором случае объект i1 преобразовывается к типу int, и уже потом происходит сравнение.<br>"  );


        //_________022______________________________________________________________________________________________________________


        array[22] = new ContentValues();
        // Задайте значения для каждого столбца
        array[22].put(DatabaseHelper.QUESTION_COLUMN, "<h1>У каких операторов всегда вычисляются все операнды (выберите все подходящие варианты)?</h1> <br>" );
        array[22].put(DatabaseHelper.WRONG_ANSWER_1, "||");
        array[22].put(DatabaseHelper.WRONG_ANSWER_2, "&& (2 амперсанда)");
        array[22].put(DatabaseHelper.WRONG_ANSWER_3, "?: (тернарный оператор)");
        array[22].put(DatabaseHelper.WRITE_ANSWER, "%");
        array[22].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                " Оператор <b>||</b> не вычисляет значение второго операнда, если первый операнд имеет значение <b>true</b>.<br><br>" +
                "Оператор <b>&&</b> не вычисляет значение второго операнда, если первый операнд имеет значение <b>false</b>.<br><br>" +
                "Оператор <b>?:</b> в зависимости от истинности условия вычисляет значение только одного из двух выражений.<br>" );

        //_________023______________________________________________________________________________________________________________


        array[23] = new ContentValues();
        // Задайте значения для каждого столбца
        array[23].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "System.out.println(<font color = \"red\">0.0</font>/<font color = \"red\">0.0</font> + <font color = \"red\">10</font>); " );
        array[23].put(DatabaseHelper.WRONG_ANSWER_1, "10");
        array[23].put(DatabaseHelper.WRONG_ANSWER_2, "Infinity");
        array[23].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции");
        array[23].put(DatabaseHelper.WRITE_ANSWER, "NaN");
        array[23].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Результатом деления 0.0 на 0.0 будет NaN – Not a Number, неопределенное значение.<br><br>" +
                "Любые арифметические операции с NaN так же дают NaN.<br>" );


        //_________024______________________________________________________________________________________________________________


        array[24] = new ContentValues();
        // Задайте значения для каждого столбца
        array[24].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "int a = <font color = \"red\">7</font>; <br>" +
                "int b = <font color = \"red\">4</font>; <br>" +
                " <br>" +
                "System.out.println(-a % b); <br>" +
                "System.out.println(a % -b); <br>" +
                "System.out.println((-a % b) == (a % -b)); " );
       array[24].put(DatabaseHelper.WRONG_ANSWER_1, "3, 3, true");
       array[24].put(DatabaseHelper.WRONG_ANSWER_2, "3, -3, false\"");
       array[24].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции");
       array[24].put(DatabaseHelper.WRITE_ANSWER, "-3, 3, false");
       array[24].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Нахождение остатка от деления часто используется в компьютерной технике и телекоммуникационном оборудовании для создания контрольных чисел и получении случайных чисел в ограниченном диапазоне, например в конгруэнтном генераторе случайных чисел." +
                "<br>" );


        //_________025______________________________________________________________________________________________________________


        array[25] = new ContentValues();
        // Задайте значения для каждого столбца
        array[25].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что напечатает следующий код?</h1> <br>" +
                "<font color = \"blue\">int</font> i = <font color = \"red\">0</font>; <br>" +
                "System.out.print(++i); <br>" +
                "System.out.print(i++); <br>" +
                "System.out.print(i); " );
        array[25].put(DatabaseHelper.WRONG_ANSWER_1, "012");
        array[25].put(DatabaseHelper.WRONG_ANSWER_2, "123");
        array[25].put(DatabaseHelper.WRONG_ANSWER_3, "011");
        array[25].put(DatabaseHelper.WRITE_ANSWER, "112");
        array[25].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Пре-инкремент увеличит значение переменной до его непосредственного использования, тогда как пост-инкремент - после.<br>" );

//_________026______________________________________________________________________________________________________________


        array[26] = new ContentValues();
        // Задайте значения для каждого столбца
        array[26].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что попадет в стандартный поток вывода, если метод tryThis() выбросит IOException?</h1> <br>" +
                "<font color = \"blue\">try</font> { <br>" +
                "    tryThis(); <br>" +
                "    <font color = \"blue\">return</font>;<br>" +
                "} <font color = \"blue\">catch</font> (IOException x1) { <br>" +
                "    System.out.println(<font color = \"teal\">\"exception 1\"</font>); <br>" +
                "    <font color = \"blue\">return</font>; <br>" +
                "} <font color = \"blue\">catch</font> (Exception x2) { <br>" +
                "    System.out.println(<font color = \"teal\">\"exception 2\"</font>); <br>" +
                "    <font color = \"blue\">return</font>; <br>" +
                "} <font color = \"blue\">finally</font> { \n" +
                "    System.out.println(<font color = \"teal\">\"finally\"</font>); <br>" +
                "} " );
        array[26].put(DatabaseHelper.WRONG_ANSWER_1, "exception 2");
        array[26].put(DatabaseHelper.WRONG_ANSWER_2, "exception 1");
        array[26].put(DatabaseHelper.WRONG_ANSWER_3, "exception 2 и finally");
        array[26].put(DatabaseHelper.WRITE_ANSWER, "exception 1 и finally");
        array[26].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Исключение - это нештатная ситуация, ошибка во время выполнения программы. Самый простой пример - деление на ноль. Можно вручную отслеживать возникновение подобных ошибок, а можно воспользоваться специальным механизмом исключений, который упрощает создание больших надёжных программ, уменьшает объём необходимого кода и повышает уверенность в том, что в приложении не будет необработанной ошибки.</p>\n" +
                "<p>В методе, в котором происходит ошибка,  создаётся и передаётся специальный объект. Метод может либо обработать исключение самостоятельно, либо пропустить его. В любом случае исключение ловится и обрабатывается. Исключение может появиться благодаря самой системе, либо вы сами можете создать его вручную. Системные исключения возникают при неправильном использовании языка Java или запрещённых приёмов доступа к системе. Ваши собственные исключения обрабатывают специфические ошибки вашей программы.</p>\n" +
                "<p>Вернёмся к примеру с делением. Деление на нуль может предотвратить проверкой соответствующего условия. Но что делать, если знаменатель оказался нулём? Возможно, в контексте вашей задачи известно, как следует поступить в такой ситуации. Но, если нулевой знаменатель возник неожиданно, деление в принципе невозможно, и тогда необходимо возбудить исключение, а не продолжать исполнение программы.</p>\n" +
                "<p>Существует пять ключевых слов, используемых в исключениях: <b>try</b>, <b>catch</b>, <b>throw</b>, <b>throws</b>, <b>finally</b>. Порядок обработки исключений следующий.</p>\n" +
                "<p>Операторы программы, которые вы хотите отслеживать, помещаются в блок <b>try</b>. Если исключение произошло, то оно создаётся и передаётся дальше. Ваш код может перехватить исключение при помощи блока <b>catch</b> и обработать его. Системные исключения автоматически передаются самой системой. Чтобы передать исключение вручную, используется <b>throw</b>. Любое исключение, созданное и передаваемое внутри метода, должно быть указано в его интерфейсе ключевым словом <b>throws</b>. Любой код, который следует выполнить обязательно после завершения блока <b>try</b>, помещается в блок <b>finally</b></p>\n" +
                "<p>Схематически код выглядит так:</p>"
                + "<font color = \"blue\">try</font> {" +
                "    <font color = \"green\">// блок кода, где отслеживаются ошибки<br></font>" +
                "}<br>" +
                "<font color = \"blue\">catch</font> (тип_исключения_1 exceptionObject) {<br>" +
                "    <font color = \"green\">// обрабатываем ошибку<br></font>" +
                "}<br>" +
                "<font color = \"blue\">catch</font> (тип_исключения_2 exceptionObject) {<br>" +
                "    <font color = \"green\">// обрабатываем ошибку<br></font>" +
                "}<br>" +
                "<font color = \"blue\">finally</font> {<br></font>" +
                "    <font color = \"green\">// код, который нужно выполнить после завершения блока try" +
                "<p>Существует специальный класс для исключений <b>Trowable</b>. В него входят два класса <b>Exception</b> и <b>Error</b>.</p>\n" +
                "<p>Класс <b>Exception</b> используется для обработки исключений вашей программой. Вы можете наследоваться от него для создания собственных типов исключений. Для распространённых ошибок уже существует класс <b>RuntimeException</b>, который может обрабатывать деление на ноль или определять ошибочную индексацию массива.</p>\n" +
                "<p>Класс <b>Error</b> служит для обработки ошибок в самом языке <b>Java</b> и на практике вам не придётся иметь с ним дело.</p>\n" +
                "<p>Прежде чем научиться обрабатывать исключения, нам (как и нормальному любопытному коту) хочется посмотреть, а что происходит, если ошибку не обработать. Давайте разделим число котов в вашей квартире на ноль, хотя мы и знаем, что котов на ноль делить нельзя!</p>" +
                "<font color = \"blue\">int</font> catNumber;<br>" +
                "<font color = \"blue\">int</font> zero;<br>" +
                "catNumber = <font color = \"red\">1</font>; <font color = \"teal\">// у меня один кот</font><br>" +
                "zero = <font color = \"red\">0</font>; <font color = \"teal\">// ноль, он и в Африке ноль</font><br>" +
                "<font color = \"blue\">int</font> result = catNumber / zero;" +
                "<p>Я поместил код в обработчик щелчка кнопки. Когда система времени выполнения Java обнаруживает попытку деления на ноль, она создаёт объект исключения и передаёт его. Да вот незадача, никто не перехватывает его, хотя это должны были сделать вы. Видя вашу бездеятельность, объект перехватывает стандартный системный обработчик Java, который отличается вредных характером. Он останавливает вашу программу и выводит сообщение об ошибке, которое можно увидеть в журнале LogCat:</p>" +
                "<p><i>Caused by: java.lang.ArithmeticException: divide by zero at ru.alexanderklimov.test.MainActivity.onClick(MainActivity.java:79)</i></p>" +
                "<p>Как видно, созданный объект исключения принадлежит к классу <b>ArithmeticException</b>, далее системный обработчик любезно вывел краткое описание ошибки и место возникновения.</p>\n" +
                "<p>Вряд ли пользователи вашей программы будут довольны, если вы так и оставите обработку ошибки системе. Если программа будет завершаться с такой ошибкой, то скорее всего вашу программу просто удалят. Посмотрим, как мы можем исправить ситуацию.</p>\n" +
                "<p>Поместим проблемный код в блок <b>try</b>, а в блоке <b>catch</b> обработаем исключение.</p>" +
                "<font color = \"blue\">try</font> { // мониторим код<br>" +
                "    catNumber = <font color = \"red\">1</font>; <font color = \"teal\">// у меня один кот</font><br>" +
                "    zero = <font color = \"red\">0</font>; <font color = \"teal\">// ноль, он и в Африке ноль</font><br>" +
                "    <font color = \"blue\">int</font> result = catNumber / zero;<br>" +
                "    Toast.makeText(<font color = \"blue\">this</font>, <font color = \"teal\">\"Не увидите это сообщение!\"</font>, Toast.LENGTH_LONG).show();<br>" +
                "} <font color = \"blue\">catch</font> (ArithmeticException e) {<br>" +
                "    Toast.makeText(<font color = \"blue\">this</font>, <font color = \"teal\">\"Нельзя котов делить на ноль!\"</font>, Toast.LENGTH_LONG).show();<br>" +
                "}<br>" +
                "Toast.makeText(<font color = \"blue\">this</font>, <font color = \"teal\">\"Жизнь продолжается\"</font>, Toast.LENGTH_LONG).show();" +
                "<p>Теперь программа аварийно не закрывается, так как мы обрабатываем ситуацию с делением на ноль.</p>\n" +
                "<p>В данном случае мы уже знали, к какому классу принадлежит получаемая ошибка, поэтому в блоке <b>catch</b> сразу указали конкретный тип. Обратите внимание, что последний оператор в блоке <b>try</b> не срабатывает, так как ошибка происходит раньше строчкой выше. Далее выполнение передаётся в блок <b>catch</b>, далее выполняются следующие операторы в обычном порядке.</p>\n" +
                "<p>Операторы <b>try</b> и <b>catch</b> работают совместно в паре. Хотя возможны ситуации, когда <b>catch</b> может обрабатывать несколько вложенных операторов <b>try</b>.</p>\n" +
                "<p>Если вы хотите увидеть описание ошибки, то параметр <b>e</b> и поможет увидеть ёго.</p>" +
                "<font color = \"blue\">catch</font> (ArithmeticException e) {<br>" +
                "\tToast.makeText(<font color = \"blue\">this</font>, e + <font color = \"teal\">\": Нельзя котов делить на ноль!\"</font>, Toast.LENGTH_LONG).show();<br>" +
                "}" +
                "<p>По умолчанию, класс <b>Trowable</b>, к которому относится <b>ArithmeticException</b> возвращает строку, содержащую описание исключения. Но вы можете и явно указать метод <b>e.toString</b>.</p>"
        );


        //_________027______________________________________________________________________________________________________________


        array[27] = new ContentValues();
        // Задайте значения для каждого столбца
        array[27].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1> <br>" +
                "<font color = \"blue\">public class</font> MyTest {<br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) {         <br>" +
                "        label1: <font color = \"blue\">for</font> (<font color = \"blue\">int</font> i = <font color = \"red\">0</font>; i < <font color = \"red\">3</font>; i++) { <br>" +
                "            <font color = \"blue\">if</font> (i == <font color = \"red\">1</font>) <br>" +
                "                <font color = \"blue\">continue</font> label1;  <br>" +
                "            label2: <br>" +
                "                System.out.print(<font color = \"teal\">\"TEST \"</font>); <br>" +
                "            label3:; <br>" +
                "        }<br> " +
                "    } <br>" +
                "}<br>" );
        array[27].put(DatabaseHelper.WRONG_ANSWER_1, "Warning при компиляции");
        array[27].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка времени выполнения");
        array[27].put(DatabaseHelper.WRONG_ANSWER_3, "Будет напечатано \"TEST \" без кавычек");
        array[27].put(DatabaseHelper.WRITE_ANSWER, "Будет напечатано \"TEST TEST \" без кавычек");
        array[27].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Конструкция continue label1: передаст управление на метку и цикл будет продолжен.\n" +
                "Если вместо continue поставить break - TEST будет напечатано один раз.<br>" );


        //_________028______________________________________________________________________________________________________________


        array[28] = new ContentValues();
        // Задайте значения для каждого столбца
        array[28].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Дана строка:</h1> <br>" +
                "String s = <font color = \"teal\">\"true,false\"</font>; " +
                "<h1>Каким способом можно сформировать новую строку, равную \"test\"?</h1> " );
        array[28].put(DatabaseHelper.WRONG_ANSWER_1, "String n = s[1] + s[4] + s[9] + s[1];");
        array[28].put(DatabaseHelper.WRONG_ANSWER_2, "String n = s[0] + s[3] + s[8] + s[0];");
        array[28].put(DatabaseHelper.WRONG_ANSWER_3, "String n = s.first() + s.last() + \"s\" + s.first();");
        array[28].put(DatabaseHelper.WRITE_ANSWER, "Ни один из предложенных");
        array[28].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Строка - это не массив, поэтому обращения по индексу недопустимы. Функций first(), last() класс String не содержит.<br>" );


        //_________029______________________________________________________________________________________________________________


        array[29] = new ContentValues();
        // Задайте значения для каждого столбца
        array[29].put(DatabaseHelper.QUESTION_COLUMN, "<h1>В какой строке возникнет ошибка компиляции?</h1>" +
                "<font color = \"blue\">public class</font> Test { <br>" +
                "    <font color = \"blue\">public static void</font> main(String\\u005B\\u005D args) { <font color = \"teal\">// 2</font> <br>" +
                "       <font color = \"blue\"> char</font> a = '\\u005B'; <font color = \"teal\">// 3 </font><br>" +
                "        <font color = \"blue\">char</font> c = '\\u005D'; <font color = \"teal\">// 4</font> <br>" +
                "        System.out.println(a * c); <font color = \"teal\">// 5</font> <br>" +
                "    } <br>" +
                "} " );
        array[29].put(DatabaseHelper.WRONG_ANSWER_1, "3");
        array[29].put(DatabaseHelper.WRONG_ANSWER_2, "4");
        array[29].put(DatabaseHelper.WRONG_ANSWER_3, "5");
        array[29].put(DatabaseHelper.WRITE_ANSWER, "Код скомпилируется без ошибок.");
        array[29].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Последовательности, начинающиеся с \\u, можно даже указывать за пределами символьных констант или строк. Приведенный пример корректен, так как последовательности \\u005B и \\u005D соответствуют символам [ и ].<br>" );

        //_________030______________________________________________________________________________________________________________


        array[30] = new ContentValues();
        // Задайте значения для каждого столбца
        array[30].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой будет результат компиляции и выполнения данного кода?</h1>" +
                "<font color = \"blue\">public class</font> Test { <br>" +
                "   <font color = \"blue\"> public static void</font> main(String[] args) {<br>" +
                "        <font color = \"blue\">float</font> f = <font color = \"red\">1.0</font> + <font color = \"red\">1.0</font>f; <br>" +
                "        f = f + 1; <br>" +
                "        System.out.println( f/<font color = \"red\">0</font> ); <br>" +
                "    } <br>" +
                "} " );
        array[30].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка выполнения");
        array[30].put(DatabaseHelper.WRONG_ANSWER_2, "NaN");
        array[30].put(DatabaseHelper.WRONG_ANSWER_3, "null");
        array[30].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции");
        array[30].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Возникнет ошибка компиляции в строке <br>" +
                "<font color = \"blue\">float</font> f = <font color = \"red\">1.0</font> + <font color = \"red\">1.0</font>f;<br>" +
                "Выражение в правой части имеет тип double и не может быть неявно приведено к типу переменной в левой части (float).<br>" );


        //_________031______________________________________________________________________________________________________________


        array[31] = new ContentValues();
        // Задайте значения для каждого столбца
        array[31].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1>" +
                "<font color = \"blue\">switch</font>(<font color = \"red\">10</font>) { <br>" +
                "<font color = \"blue\">   case</font> <font color = \"red\">1</font>: <br>" +
                "       System.out.println(<font color = \"teal\">\"1\"</font>); <br>" +
                "       <font color = \"blue\">break</font>; <br>" +
                "   <font color = \"blue\">case</font> <font color = \"red\">2</font>: <br>" +
                "       System.out.println(<font color = \"teal\">\"2\"</font>); <br>" +
                "       <font color = \"blue\">break</font>; <br>" +
                "  <font color = \"blue\"> default</font>: <br>" +
                "      <font color = \"blue\"> break</font>; <br>" +
                "       System.out.println(<font color = \"teal\">\"default\"</font>); <br>" +
                "} " );
        array[31].put(DatabaseHelper.WRONG_ANSWER_1, "Код ничего не выведет");
        array[31].put(DatabaseHelper.WRONG_ANSWER_2, "2");
        array[31].put(DatabaseHelper.WRONG_ANSWER_3, "default");
        array[31].put(DatabaseHelper.WRITE_ANSWER, "Возникнет ошибка компиляции");
        array[31].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>В соответствии со спецификацией языка Java, данный фрагмент программы содержит недостижимый оператор - unreachable statement (см. ниже подробное объяснение от maxsbelt).\n" +
                "Если у вас всё компилится без ошибок, значит, вы используете компилятор, не соответствующий спецификации. Ну, или, где-то допустили ошибку.</p><br>" +
                "<p>Оператор switch работает так: при совпадении значения переданного аргумента с одним из case, начинает выполнять код, следующий за этим самым case до конструкции break или конца тела блока switch. Если же совпадений не найдено, то выполняется блок default по тому же принципу. В данном случае, т. к. сразу после входа в блок default стоит оператор break, прерывающий выполнение дальнейшего кода, то компилятор сообщает о том, что в теле блока присутствует код, который никогда не будет выполнен ( System.out.println(\"default\");) и выводит соответствующую ошибку - unreachable statement.</p>" );

        //_________032______________________________________________________________________________________________________________


        array[32] = new ContentValues();
        // Задайте значения для каждого столбца
        array[32].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1>" +
                "<font color = \"blue\">public class</font> Main { <br>" +
                " \n" +
                "    <font color = \"blue\">static class</font> X { <br>" +
                "        <font color = \"blue\">static</font> String x = Y.y; <br>" +
                "    } <br>" +
                " \n" +
                "    <font color = \"blue\">static</font> class Y { <br>" +
                "        <font color = \"blue\">static</font> String y = X.x; <br>" +
                "    } <br>" +
                " \n" +
                "    <font color = \"blue\">public static void</font> main(String[] args) <font color = \"blue\">throws</font> Throwable { <br>" +
                "        Y.y = <font color = \"teal\">\"0\"</font>; <br>" +
                "        System.out.println(X.x); <br>" +
                "    } <br>" +
                "} " );
        array[32].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции");
        array[32].put(DatabaseHelper.WRONG_ANSWER_2, "0");
        array[32].put(DatabaseHelper.WRONG_ANSWER_3, "рантайм ошибка");
        array[32].put(DatabaseHelper.WRITE_ANSWER, "null");
        array[32].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>1)сначала <b>Y.y</b> инициализирован <b>null</b></p>" +
                "<p>2)<b>X.x</b> инициализируется <b>Y.y</b> то есть <b>null</b></p>" +
                "<p>3)<b>Y.y</b> инициализируется <b>X.x</b> то есть <b>null</b></p>" +
                "<p>2)после <b>Y.y</b> = <font color = \"teal\">\"0\"</font> , <b>X.x</b> же остаётся <b>null </b>" +
                "результат : <b>null</b></p>" );

//_________033______________________________________________________________________________________________________________


        array[33] = new ContentValues();
        // Задайте значения для каждого столбца
        array[33].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения данного кода?</h1>" +
                " <font color = \"blue\">class</font> Quest3 { <br>" +
                "     <font color = \"blue\">public static void</font> main(String s[ ]) { <br>" +
                "         <font color = \"blue\">String</font> args; <br>" +
                "        System.out.print(args + s); <br>" +
                "    }  <br>" +
                "}  " );
        array[33].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции: несовпадение типов параметров при вызове метода print()");
        array[33].put(DatabaseHelper.WRONG_ANSWER_2, "Компиляция без ошибок");
        array[33].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции: метод main() содержит неправильное имя параметра");
        array[33].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции: переменная args используется до инициализации");
        array[33].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Если переменная объявлена в методе, то до своего использования она должна быть проинициализирована, иначе компилятор сообщает об ошибке.<br><br>" +
                "При инициализированном значении переменной args в методе print() ошибка не возникает, так как оператор сложения инициирует действия по преобразованию в строку всех участвующих в конкатенации объектов.<br><br>" +
                "Параметр String[] args в main() – просто соглашение, и может быть использован любой приемлемый идентификатор для массива строк. <br>" );

//_________034______________________________________________________________________________________________________________


        array[34] = new ContentValues();
        // Задайте значения для каждого столбца
        array[34].put(DatabaseHelper.QUESTION_COLUMN, "<h1>В переменной типа char могут храниться значения из следующего диапазона?</h1>");
        array[34].put(DatabaseHelper.WRONG_ANSWER_1, "От 0 до 32767");
        array[34].put(DatabaseHelper.WRONG_ANSWER_2, "От 0 до 255");
        array[34].put(DatabaseHelper.WRONG_ANSWER_3, "От –32768 до 32767");
        array[34].put(DatabaseHelper.WRITE_ANSWER, "От 0 до \\uFFFF");
        array[34].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Для хранения символов Java использует специальный тип char. Он отличается от типа char в языках C/C++, где представляет собой целочисленный тип с размером 8 бит. В Java для char используется кодировка Unicode и для хранения Unicode-символов используется 16 бит. Диапазон допустимых значений - от 0 до 65536 (отрицательных значений не существует).<br><br>" +
                "Переменной можно присвоить код символа или непосредственно сам символ, который следует окружить одинарными кавычками.<br>" );

//_________035______________________________________________________________________________________________________________


        array[35] = new ContentValues();
        // Задайте значения для каждого столбца
        array[35].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что произойдет при попытке скомпилировать и запустить данный код?</h1>" +
                "<font color = \"red\">00</font>: <font color = \"blue\">package</font> test; <br>" +
                "<font color = \"red\">01</font>: <font color = \"blue\">public class</font> Test { <br>" +
                "<font color = \"red\">02</font>:     <font color = \"blue\">public static void</font> main(String [] args) { <br>" +
                "<font color = \"red\">03</font>:          Test test = <font color = \"blue\">new</font> Test(); <br>" +
                "<font color = \"red\">04</font>:          System.out.println(test.toString()); <br>" +
                "<font color = \"red\">05</font>:     } <br>" +
                "<font color = \"red\">06</font>: } ");
        array[35].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции в строке 03, так как класс Test не определяет конструктор.");
        array[35].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка компиляции в строке 04, так как класс Test не определяет метод toString().");
        array[35].put(DatabaseHelper.WRONG_ANSWER_3, "Код скомпилируется и выведет следующее: \"Test\"");
        array[35].put(DatabaseHelper.WRITE_ANSWER, "Код скомпилируется и выведет что-то наподобие следующего: test.Test@42e816");
        array[35].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Все объекты в Java наследуются от класса Object. Т.к. класс Test не переопределяет метод toString(), то будет использоваться его реализация из класса Object, который возвращает строковое представление объекта в следующем виде: название класса (с полным именем пакета) + символ @ + шестнадцатеричное беззнаковое значение хеш-кода объекта<br>" );


        //_________036______________________________________________________________________________________________________________


        array[36] = new ContentValues();
        // Задайте значения для каждого столбца
        array[36].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что напечатает следующий код?</h1>" +
        "<font color = \"blue\">public class</font> Funcs extends java.lang.Math {<br>" +
                "    <font color = \"blue\">public int</font> add(int x, int y) { <br>" +
                "        <font color = \"blue\">return</font> x + y; <br>" +
                "    } <br>" +
                "    <font color = \"blue\">public int</font> sub(int x, int y) { <br>" +
                "        <font color = \"blue\">return</font> x - y; <br>" +
                "    } <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] a) { <br>" +
                "        Funcs f = <font color = \"blue\">new</font> Funcs(); <br>" +
                "        System.out.println(\"\" + f.add(<font color = \"red\">1</font>, <font color = \"red\">2</font>)); <br>" +
                "    } <br>" +
                "} ");
        array[36].put(DatabaseHelper.WRONG_ANSWER_1, "Код скомпилируется, но ничего не напечатает");
        array[36].put(DatabaseHelper.WRONG_ANSWER_2, "Код скомпилируется и напечатает 3");
        array[36].put(DatabaseHelper.WRONG_ANSWER_3, "Ничего из перечисленного");
        array[36].put(DatabaseHelper.WRITE_ANSWER, "Код не скомпилируется");
        array[36].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Класс java.lang.Math объявлен как final, то есть наследоваться от него нельзя.<br>" );


        //_________037______________________________________________________________________________________________________________


        array[37] = new ContentValues();
        // Задайте значения для каждого столбца
        array[37].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что произойдет при попытке запустить данный код?</h1>" +
                "<font color = \"blue\">import</font> java.util.*; <br>" +
                "<font color = \"blue\">public class</font> Clazz { <br>" +
                "  <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "    List arrayList = <font color = \"blue\">new</font> ArrayList();  <br>" +
                "    arrayList.add(<font color = \"blue\">\"str1\"</font>);  <br>" +
                "    arrayList.add(<font color = \"blue\">\"str2\"</font>);  <br>" +
                "    arrayList.add(<font color = \"blue\">\"str3\"</font>); <br>" +
                " <br>" +
                "    <font color = \"blue\">for</font> (<font color = \"blue\">int</font> i = <font color = \"red\">0</font>; i < arrayList.size(); i++)   <br>" +
                "        arrayList.remove(i);  <br>" +
                " <br>" +
                "    System.out.println(arrayList.size());  <br>" +
                "  } <br>" +
                "} ");
        array[37].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции");
        array[37].put(DatabaseHelper.WRONG_ANSWER_2, "Будет выброшено исключение IndexOutOfBoundsException");
        array[37].put(DatabaseHelper.WRONG_ANSWER_3, "Код напечатает 0");
        array[37].put(DatabaseHelper.WRITE_ANSWER, "Код напечатает 1");
        array[37].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Исходное состояние списка:<br> (0:\"str1\"; 1:\"str2\"; 2:\"str3\"), size() = 3<br>" +
                "i = 0 → удаляем элемент \"str1\" → (0:\"str2\"; 1:\"str3\"), size() = 2<br>" +
                "i = 1 → удаляем элемент \"str3\" → (0:\"str2\"), size() = 1<br>" +
                "i = 2 → конец цикла, т.к. i > size()<br>" +
                "Ответ: size() = 1<br>" );


        //_________038______________________________________________________________________________________________________________


        array[38] = new ContentValues();
        // Задайте значения для каждого столбца
        array[38].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет результат выполнения программы?</h1>" +
                "<font color = \"blue\">public class</font> Main { <br>" +
                " <br>" +
                "    <font color = \"blue\">public static void</font> main(String... args) { <br>" +
                "        System.out.println(\"\" + <font color = \"blue\">new</font> Main().summ(3, 3)); <br>" +
                "    } <br>" +
                " <br>" +
                "    <font color = \"blue\">public int</font> summ(<font color = \"blue\">int</font> a, <font color = \"blue\">int</font> b) { <br>" +
                "        <font color = \"blue\">try</font> { <br>" +
                "            <font color = \"blue\">return</font> a + b; <br>" +
                "        } <font color = \"blue\">finally</font> { <br>" +
                "            <font color = \"blue\">if</font> (a == b) <br>" +
                "                <font color = \"blue\">return</font> 0;             <br>" +
                "        } <br>" +
                "    } <br>" +
                "} ");
        array[38].put(DatabaseHelper.WRONG_ANSWER_1, "6");
        array[38].put(DatabaseHelper.WRONG_ANSWER_2, "Возникнет ошибка компиляции");
        array[38].put(DatabaseHelper.WRONG_ANSWER_3, "3");
        array[38].put(DatabaseHelper.WRITE_ANSWER, "0");
        array[38].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Тезис: \"Блок finally выполняется всегда\". Но это не значит что первый return не выполнится. Он выполнится, но перетрется return-ом в finally.<br>" +
                "Если в функцию summ(3,4) запустить с такими аргументами, то первый return выполнится, но потом выполнение зайдет в finally, сделает if(a==b) и просто выйдет оттуда т.к. значения не равны.<br>" +
                "И на самом деле finally отработает не всегда. Если вызвать в блоке <b>try{ System.exit(0);}</b>, то finally не выполнится.<br>" );

//_________039______________________________________________________________________________________________________________


        array[39] = new ContentValues();
        // Задайте значения для каждого столбца
        array[39].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет результат выполнения программы?</h1>" +
                "<font color = \"blue\">import</font> java.util.ArrayList; <br>" +
                "<font color = \"blue\">import</font> java.util.List; <br>" +
                " <br>" +
                "<font color = \"blue\">public class</font> Test { <br>" +
                "    <font color = \"blue\">public static void</font> main(String a[]) { <br>" +
                "        List<Integer> list = <font color = \"blue\">new</font> ArrayList<Integer>(); <br>" +
                "        list.add(<font color = \"blue\">null</font>); <br>" +
                "        <font color = \"blue\">for</font> (Integer i : list) { <br>" +
                "            System.out.println(i); <br>" +
                "        } <br>" +
                "    } <br>" +
                "} ");
        array[39].put(DatabaseHelper.WRONG_ANSWER_1, "Программа не скомпилируется");
        array[39].put(DatabaseHelper.WRONG_ANSWER_2, "Ошибка времени выполнения");
        array[39].put(DatabaseHelper.WRONG_ANSWER_3, "0");
        array[39].put(DatabaseHelper.WRITE_ANSWER, "null");
        array[39].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Перво-наперво, <b>null</b> это ключевое слово в Java, так же как <b>public</b>, <b>static</b> или <b>final</b>. Регистр учитывается, Вы не можете писать <b>null</b> как Null или NULL, компилятор не распознает его и будет выброшена ошибка.<br><br>" +
                "Так же, как каждый примитив имеет значение по умолчанию, например, у <b>int</b> это 0, у <b>boolean</b> это <b>false</b>, <b>null</b> это значение по умолчанию любых ссылочных типов, проще говоря, для всех объектов. Так же, как при создании логической переменной ее значение по умолчанию равно <b>false</b>, так и любые ссылочные переменные в Java по умолчанию будут равны <b>null</b>. Это истинно для всех типов переменных: переменной-члена или локальной переменной, переменной экземпляра или статической переменной, кроме того, компилятор будет ругаться, если Вы используете локальную переменную не проинициализировав ее.<br><br>" +
                "Несмотря на распространенное заблуждение, <b>null</b> это не объект(<b>Object</b>) и ни тип. Это просто специальное значение, которое может быть назначено любому ссылочному типу, и Вы можете привести <b>null</b> к любому типу.<br><br>" +
                "<b>null</b> может быть назначен только ссылочному типу, Вы не можете назначить <b>null</b> примитивной переменной вроде <b>int</b>, <b>double</b>, <b>float</b> или <b>boolean</b>.<br><br>" +
                "Любой класс-обертка со значением <b>null</b> будет выбрасывать <i>java.lang.NullPointerException</i> когда Java распакует(<b>unbox</b>) его в примитивную переменную. Некоторые программисты делают ошибку допуская, что авто упаковка(<b>autoboxing</b>) позаботится о конвертации <b>null</b> в значение по умолчанию для соответствующего примитивного типа, например, 0 для <b>int</b>, <b>false</b> для <b>boolean</b> и т.д., но это не верно<br><br>" +
                "Вы можете сравнивать <b>null</b> используя операторы <b>==</b> (равно) и <b>!=</b> (не равно), но не можете использовать его с другими арифметическими или логическими операторами, вроде <b><</b> (меньше) или <b>></b> (больше). В отличии от SQL, в Java <b>null == null</b> вернет <b>true</b><br>" );

        //_________040______________________________________________________________________________________________________________


        array[40] = new ContentValues();
        // Задайте значения для каждого столбца
        array[40].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что выведет на экран следующий код?</h1>" +
                "<font color = \"blue\">public class</font> Test{ <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args){     <br>" +
                "       <font color = \"blue\"> char</font> c1 = <font color = \"teal\">'1'</font>; <br>" +
                "       <font color = \"blue\"> char</font> c2 = <font color = \"teal\">'\\u0031'</font>; <br>" +
                "       <font color = \"blue\"> char</font> c3 = <font color = \"red\">49</font>; <br>" +
                "        System.out.println(c1 + c2 + c3); <br>" +
                "    } <br>" +
                "} ");
        array[40].put(DatabaseHelper.WRONG_ANSWER_1, "111");
        array[40].put(DatabaseHelper.WRONG_ANSWER_2, "81");
        array[40].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции");
        array[40].put(DatabaseHelper.WRITE_ANSWER, "147");
        array[40].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Важно знать, что значение для переменной типа char можно задать несколькими способами: непосредственно символом, unicode-кодом этого символа, а также целым числом. Так же важно знать, что значения типа char не \"склеиваются\", а складываются.<br>" );

//_________041______________________________________________________________________________________________________________


        array[41] = new ContentValues();
        array[41].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Из какой структуры данных \"сборщик мусора\" удалит все элементы у которых исчезла последняя ссылка на их ключ в этой структуре?</h1>"
                );
        array[41].put(DatabaseHelper.WRONG_ANSWER_1, "HashMap");
        array[41].put(DatabaseHelper.WRONG_ANSWER_2, "LinkedHashMap");
        array[41].put(DatabaseHelper.WRONG_ANSWER_3, "IdentityHashMap");
        array[41].put(DatabaseHelper.WRITE_ANSWER, "WeakHashMap");
        array[41].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "WeakHashMap, фактически, хранит не пары \"ключ - значение\", а пары \"слабая ссылка на ключ - значение\". Особенность слабых ссылок (WeakReference) состоит в том, что они игнорируются сборщиком мусора, т.е. если на объект-ключ нет других ссылок, он уничтожается. Перед любым обращением к WeakHashMap (get(), put(), size() и т.д.) анализируются невалидные ссылки и соответствующая пара удаляется.<br>" +
                "<h1>Код для демонстрации: </h1><br><br>" +
                "Map map = <font color = \"blue\">new</font> WeakHashMap(); <br>" +
                "Object obj = <font color = \"blue\">new</font> Object(); <font color = \"green\">// создаём объект</font><br>" +
                "map.put(obj, <font color = \"teal\">\"object\"</font>); <font color = \"green\">// кладём его в мапу</font><br>" +
                "System.out.println(map.size()); <font color = \"green\">// в мапе один элемент</font><br>" +
                "obj = <font color = \"blue\">null</font>; <font color = \"green\">// чистим ссылку</font><br>" +
                "System.gc(); <font color = \"green\">// играемся со сборщиком мусора</font><br>" +
                "System.runFinalization(); <br>" +
                "System.out.println(map.size()); <font color = \"green\">// мапа должна стать пустой</font><br>" );

//_________042______________________________________________________________________________________________________________


        array[42] = new ContentValues();
        array[42].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Из какой структуры данных \"сборщик мусора\" удалит все элементы у которых исчезла последняя ссылка на их ключ в этой структуре?</h1>"
        );
        array[42].put(DatabaseHelper.WRONG_ANSWER_1, "HashMap");
        array[42].put(DatabaseHelper.WRONG_ANSWER_2, "LinkedHashMap");
        array[42].put(DatabaseHelper.WRONG_ANSWER_3, "IdentityHashMap");
        array[42].put(DatabaseHelper.WRITE_ANSWER, "WeakHashMap");
        array[42].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "WeakHashMap, фактически, хранит не пары \"ключ - значение\", а пары \"слабая ссылка на ключ - значение\". Особенность слабых ссылок (WeakReference) состоит в том, что они игнорируются сборщиком мусора, т.е. если на объект-ключ нет других ссылок, он уничтожается. Перед любым обращением к WeakHashMap (get(), put(), size() и т.д.) анализируются невалидные ссылки и соответствующая пара удаляется.<br>" +
                "<h1>Код для демонстрации: </h1><br><br>" +
                "Map map = <font color = \"blue\">new</font> WeakHashMap(); <br>" +
                "Object obj = <font color = \"blue\">new</font> Object(); <font color = \"green\">// создаём объект</font><br>" +
                "map.put(obj, <font color = \"teal\">\"object\"</font>); <font color = \"green\">// кладём его в мапу</font><br>" +
                "System.out.println(map.size()); <font color = \"green\">// в мапе один элемент</font><br>" +
                "obj = <font color = \"blue\">null</font>; <font color = \"green\">// чистим ссылку</font><br>" +
                "System.gc(); <font color = \"green\">// играемся со сборщиком мусора</font><br>" +
                "System.runFinalization(); <br>" +
                "System.out.println(map.size()); <font color = \"green\">// мапа должна стать пустой</font><br>" );


        //_________043______________________________________________________________________________________________________________


        array[43] = new ContentValues();
        array[43].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Что произойдет при компиляции и запуске следующего кода??</h2>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;arrInstance&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">byte</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;arrLocal&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">byte</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>arrInstance<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">!=</font>&nbsp;arrLocal<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">throw</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">IllegalStateException</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;error&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[43].put(DatabaseHelper.WRONG_ANSWER_1, "компиляция пройдет успешно, но будет брошен IllegalStateException");
        array[43].put(DatabaseHelper.WRONG_ANSWER_2, "возникнет ошибка компиляции");
        array[43].put(DatabaseHelper.WRONG_ANSWER_3, "Будет выброшено исключение IndexOutOfBoundsException");
        array[43].put(DatabaseHelper.WRITE_ANSWER, "компиляция пройдет успешно и программа выполнится без ошибок");
        array[43].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Элементы массивов при создании инициализируются нулями.<br>" +
                "При сравнении произойдет приведение типов byte -> int, а так как условие 0 != 0 всегда будет ложным, то в тело if поток выполнения программы не зайдет и исключение выброшено не будет.<br>" );

        //_________044______________________________________________________________________________________________________________


        array[44] = new ContentValues();
        array[44].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Что будет выведено на печать после выполнения данного кода?</h2>" +
                "<font color=\"#000000\">import</font>&nbsp;<font color=\"#006699\">java.util.*</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;MapTest&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Map<font color=\"#339933\">&lt;</font><font color=\"#003399\">String</font>,&nbsp;Integer<font color=\"#339933\">&gt;</font>&nbsp;map1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;HashMap<font color=\"#339933\">&lt;</font><font color=\"#003399\">String</font>,&nbsp;Integer<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Map<font color=\"#339933\">&lt;</font><font color=\"#003399\">String</font>,&nbsp;Integer<font color=\"#339933\">&gt;</font>&nbsp;map2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;HashMap<font color=\"#339933\">&lt;</font><font color=\"#003399\">String</font>,&nbsp;Integer<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map1.<font color=\"#006633\">put</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Number1&quot;</font>,&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#cc66cc\">100</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map1.<font color=\"#006633\">put</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Number2&quot;</font>,&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#cc66cc\">200</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map1.<font color=\"#006633\">put</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Number3&quot;</font>,&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#cc66cc\">300</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;List<font color=\"#339933\">&lt;</font>Map<font color=\"#339933\">&gt;</font>&nbsp;list&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Map<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font>&nbsp;map1&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font>&nbsp;map2&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">HashMap</font>&nbsp;resultMap&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">HashMap</font><font color=\"#009900\">&#41;</font>&nbsp;list.<font color=\"#006633\">get</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#cc66cc\">0</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Number:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;resultMap.<font color=\"#006633\">get</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Number2&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[44].put(DatabaseHelper.WRONG_ANSWER_1, "Будет напечатано null");
        array[44].put(DatabaseHelper.WRONG_ANSWER_2, "Будет напечатано Number: 300");
        array[44].put(DatabaseHelper.WRONG_ANSWER_3, "Результат невозможно предугадать");
        array[44].put(DatabaseHelper.WRITE_ANSWER, "Будет напечатано Number: 200");
        array[44].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "В списке list хранится два отображения: <br>" +
                "list.<font color=\"#006633\">get</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">-&gt;</font>&nbsp;map1&nbsp;<br/>\n" +
                "list.<font color=\"#006633\">get</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">1</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">-&gt;</font>&nbsp;map2&nbsp;<br>" +
                "При вызове resultMap.get(\"Number2\") возвращается элемент, соответствующий ключу \"Number2\", т.е. 200<br>" );

        //_________045______________________________________________________________________________________________________________


        array[45] = new ContentValues();
        array[45].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет вывод на консоль?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">boolean</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000066\">true</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">boolean</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000066\">false</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">boolean</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000066\">true</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>a&nbsp;<font color=\"#339933\">||</font>&nbsp;b&nbsp;<font color=\"#339933\">&amp;&amp;</font>&nbsp;c<font color=\"#009900\">&#41;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Hello&nbsp;&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>a&nbsp;<font color=\"#339933\">&amp;&amp;</font>&nbsp;<font color=\"#339933\">!</font>b&nbsp;<font color=\"#339933\">&amp;&amp;</font>&nbsp;c<font color=\"#009900\">&#41;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;World&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[45].put(DatabaseHelper.WRONG_ANSWER_1, "Возникнет ошибка времени выполнения");
        array[45].put(DatabaseHelper.WRONG_ANSWER_2, "На консоль будет выведено \"Hello \"");
        array[45].put(DatabaseHelper.WRONG_ANSWER_3, "На консоль будет выведено \"World\"");
        array[45].put(DatabaseHelper.WRITE_ANSWER, "На консоль будет выведено \"Hello World\"");
        array[45].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Подставляем логические величины в выражения, по таблицам истинности находим их значения - и там, и там будет true, значит, на консоль будут выведены обе строки.<br>" );

        //_________046______________________________________________________________________________________________________________


        array[46] = new ContentValues();
        array[46].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы?</h1>" +
                "<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Integer</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;10&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>i.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">==</font>&nbsp;i.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Равный&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">else</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Неравный&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[46].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компилятора");
        array[46].put(DatabaseHelper.WRONG_ANSWER_2, "Выведется \"Равный\"");
        array[46].put(DatabaseHelper.WRONG_ANSWER_3, "Ни один из вариантов");
        array[46].put(DatabaseHelper.WRITE_ANSWER, "Выведется \"Неравный\"");
        array[46].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Метод toString() возвращает эквивалент String этого объекта String. Каждый раз, когда он вызывается, создаётся новый объект. Оператор == сравнивает две ссылки на объект, а не реальное содержимое String. Таким образом, сравнение возвращает false, выполняется оператор else, и выводится \"Неравный\".<br>" );


        //_________047______________________________________________________________________________________________________________


        array[47] = new ContentValues();
        array[47].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;App1&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>addToString<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;12345678910&quot;</font>,<font color=\"#0000ff\">','</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#003399\">StringBuffer</font>&nbsp;addToString<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;s,&nbsp;<font color=\"#000066\">char</font>&nbsp;c<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">StringBuffer</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">StringBuffer</font><font color=\"#009900\">&#40;</font>s<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;p&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;b.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>i<font color=\"#339933\">%</font>3&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b.<font color=\"#006633\">insert</font><font color=\"#009900\">&#40;</font>b.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">-</font>i<font color=\"#339933\">-</font>p,&nbsp;c<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;p<font color=\"#339933\">++;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;b<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[47].put(DatabaseHelper.WRONG_ANSWER_1, "На экране напечатается \"12,345,678,910\" без кавычек ");
        array[47].put(DatabaseHelper.WRONG_ANSWER_2, "На экране напечатается 123,456,789,10 без кавычек ");
        array[47].put(DatabaseHelper.WRONG_ANSWER_3, "Ошибка компиляции ");
        array[47].put(DatabaseHelper.WRITE_ANSWER, "Во время выполнения возникнет ArrayIndexOutOfBoundsException");
        array[47].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Следует учитывать, что строка динамически изменяется:<br>" +
                "при i = 3 символ вставляется в 8-ю позицию; получаем b = \"12345678,910\", b.length() = 12<br>" +
                "при i = 6 символ вставляется в 5-ю позицию; получаем b = \"12345,678,910\", b.length() = 13<br>" +
                "при i = 9 символ вставляется во 2-ю позицию; получаем b = \"12,345,678,910\", b.length() = 14<br>" +
                "при i = 12 цикл продолжает выполняться (ведь 12 < 14), происходит попытка вставить символ в -1-ю позицию - и тут выбрасывается exception<br>" );


        //_________048______________________________________________________________________________________________________________


        array[48] = new ContentValues();
        array[48].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>...&nbsp;<font color=\"#006633\">args</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Main<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">summ</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;summ<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;a,&nbsp;<font color=\"#000066\">int</font>&nbsp;b<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;a&nbsp;<font color=\"#339933\">+</font>&nbsp;b<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">finally</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>a&nbsp;<font color=\"#339933\">==</font>&nbsp;b<font color=\"#009900\">&#41;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[48].put(DatabaseHelper.WRONG_ANSWER_1, "6");
        array[48].put(DatabaseHelper.WRONG_ANSWER_2, "Возникнет ошибка компиляции");
        array[48].put(DatabaseHelper.WRONG_ANSWER_3, "3");
        array[48].put(DatabaseHelper.WRITE_ANSWER, "0");
        array[48].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Блок finally выполняется, даже если из блока try был выход по return.\n" +
                "Возвращаемое значение может (но не обязано) быть переопределено в блоке finally.<br>" );

//_________049______________________________________________________________________________________________________________


        array[49] = new ContentValues();
        array[49].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Каково будет значение переменной count после выполнения данного кода?</h2>" +
                "<font color=\"#000066\">int</font>&nbsp;count&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">do</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;count&nbsp;<font color=\"#339933\">*=</font>&nbsp;<font color=\"#339933\">++</font>i<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>count&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">break</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">&lt;=</font>&nbsp;<font color=\"#cc66cc\">4</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;"
        );
        array[49].put(DatabaseHelper.WRONG_ANSWER_1, "5");
        array[49].put(DatabaseHelper.WRONG_ANSWER_2, "10");
        array[49].put(DatabaseHelper.WRONG_ANSWER_3, "4");
        array[49].put(DatabaseHelper.WRITE_ANSWER, "6");
        array[49].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "На последней итерации<br>count = 2* (++2)=2*3 =6 => выход из цикла<br>" );


        //_________050______________________________________________________________________________________________________________


        array[50] = new ContentValues();
        array[50].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что будет выведено на консоль?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">double</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">double</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#40;</font>a<font color=\"#339933\">/</font>b<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">String</font>.<font color=\"#006633\">format</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;%1.4f&quot;</font>,&nbsp;c<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[50].put(DatabaseHelper.WRONG_ANSWER_1, "0");
        array[50].put(DatabaseHelper.WRONG_ANSWER_2, "0,1000");
        array[50].put(DatabaseHelper.WRONG_ANSWER_3, "0,1");
        array[50].put(DatabaseHelper.WRITE_ANSWER, "0,0000");
        array[50].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "В данном случае результат деления 2-х целых чисел будет также округляться до целого, а затем приводиться к double (т. о. получаем 0). Чтобы на консоль вывелось 0,1000 необходимо изменить строку double c = (double) (a/b) на double c = (double) a/b.<br>" );

        //_________051______________________________________________________________________________________________________________


        array[51] = new ContentValues();
        array[51].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что произойдет в результате компиляции и выполнения программы?</h1>" +
                "<font color=\"#000000\">class</font>&nbsp;HashTest&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;Set<font color=\"#339933\">&lt;</font>String<font color=\"#339933\">&gt;</font>&nbsp;set&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;LinkedHashSet<font color=\"#339933\">&lt;</font>String<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;one&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;two&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;three&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;/u000a&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;/u000d&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;/u000c&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;1&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;2&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;set.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;3&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;string&nbsp;<font color=\"#339933\">:</font>&nbsp;set<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font>string&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[51].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка времени выполнения");
        array[51].put(DatabaseHelper.WRONG_ANSWER_2, "/u000a /u000c /u000d 1 2 3 one three two");
        array[51].put(DatabaseHelper.WRONG_ANSWER_3, "3 2 two 1 /u000a one three /u000c /u000d ");
        array[51].put(DatabaseHelper.WRITE_ANSWER, "one two three /u000a /u000d /u000c 1 2 3 ");
        array[51].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "LinkedHashSet запоминает порядок вставки элементов. По мере вставки вхождений в таблицу они присоединяются к двунаправленному связному списку.\n" +
                "Итератор будет перечислять значения в том порядке, в каком они были вставлены.<br>" );

//_________052______________________________________________________________________________________________________________


        array[52] = new ContentValues();
        array[52].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что можно сказать о следующей программе?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#003399\">String</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#009900\">&#123;</font><font color=\"#0000ff\">&quot;String&quot;</font><font color=\"#009900\">&#125;</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;1&nbsp;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>.<font color=\"#000000\">class</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;2&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;3&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>.<font color=\"#000000\">class</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;4&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[52].put(DatabaseHelper.WRONG_ANSWER_1, "Программа напечатает [[Ljava.lang.String; дважды");
        array[52].put(DatabaseHelper.WRONG_ANSWER_2, "Программа напечатает java.lang.String дважды");
        array[52].put(DatabaseHelper.WRONG_ANSWER_3, "Программа напечатает строку, после чего завершится с ошибкой");
        array[52].put(DatabaseHelper.WRITE_ANSWER, "Возникнет ошибка компиляции");
        array[52].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Возникнет ошибка в строке 1, поскольку тип java.lang.String неприводим к типу String<br>" );

        //_________053______________________________________________________________________________________________________________


        array[53] = new ContentValues();
        array[53].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Что будет напечатано в результате выполнения следующей программы? </h2>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;add<font color=\"#009900\">&#40;</font>i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;add<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;i&nbsp;<font color=\"#339933\">+=</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[53].put(DatabaseHelper.WRONG_ANSWER_1, "1");
        array[53].put(DatabaseHelper.WRONG_ANSWER_2, "3");
        array[53].put(DatabaseHelper.WRONG_ANSWER_3, "4");
        array[53].put(DatabaseHelper.WRITE_ANSWER, "2");
        array[53].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "Значение переменной i увеличивается на 1 в момент передачи в метод.\n" +
                "Внутри метода add() используется одноимённая переменная, любые действия с которой никак не влияют на исходную.<br>" );

//_________054______________________________________________________________________________________________________________


        array[54] = new ContentValues();
        array[54].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какое ключевое слово используется, чтобы показать, что с методом может работать не более чем один поток одновременно?</h1>"

        );
        array[54].put(DatabaseHelper.WRONG_ANSWER_1, "locked");
        array[54].put(DatabaseHelper.WRONG_ANSWER_2, "volatile");
        array[54].put(DatabaseHelper.WRONG_ANSWER_3, "sealed");
        array[54].put(DatabaseHelper.WRITE_ANSWER, "synchronized");
        array[54].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Синхронизация относится к многопоточности. Синхронизированый блок кода может быть выполнен только одним потоком одновременно.</p>" +
                "<p>Java поддерживает несколько потоков для выполнения. Это может привести к тому, что два или более потока получат доступ к одному и тому же полю или объекту. Синхронизация это процесс, который позволяет выполнять все параллельные потоки в программе синхронно. Синхронизация позволяет избежать ошибок согласованности памяти, вызванные из-за непоследовательного доступа к общей памяти.\n" +
                "Когда метод объявлен как синхронизированный — нить держит монитор для объекта, метод которого исполняется. Если другой поток выполняет синхронизированный метод, ваш поток заблокируется до тех пор, пока другой поток не отпустит монитор.\n" +
                "Синхронизация достигается в Java использованием зарезервированного слова synchronized. Вы можете использовать его в своих классах определяя синхронизированные методы или блоки. Вы не сможете использовать synchronized в переменных или атрибутах в определении класса.</p>" +
                "<h3>Блокировка на уровне объекта</h3>" +
                "<p>Это механизм синхронизации не статического метода или не статического блока кода, такой, что только один поток сможет выполнить данный блок или метод на данном экземпляре класса.\n" +
                "Это нужно делать всегда, когда необходимо сделать данные на уровне экземпляра потокобезопасными.\n" +
                "Пример:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>или</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000000\">this</font><font color=\"#009900\">&#41;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//other&nbsp;thread&nbsp;safe&nbsp;code</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>или</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#000000\">final</font>&nbsp;<font color=\"#003399\">Object</font>&nbsp;lock&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Object</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font>lock<font color=\"#009900\">&#41;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//other&nbsp;thread&nbsp;safe&nbsp;code</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<h3>Блокировка на уровне класса</h3>" +
                "<p>Предотвращает возможность нескольким потокам войти в синхронизированный блок во время выполнения в любом из доступных экземпляров класса. Это означает, что если во время выполнения программы имеется 100 экземпляров класса DemoClass, то только один поток в это время сможет выполнить demoMethod() в любом из случаев, и все другие случаи будут заблокированы для других потоков.\n" +
                "Это необходимо когда требуется сделать статические данные потокобезопасными.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>или</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font>DemoClass.<font color=\"#000000\">class</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//other&nbsp;thread&nbsp;safe&nbsp;code</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>или</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;DemoClass<br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#000000\">final</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#003399\">Object</font>&nbsp;lock&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Object</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoMethod<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font>lock<font color=\"#009900\">&#41;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//other&nbsp;thread&nbsp;safe&nbsp;code</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<h3>Некоторые важные замечания</h3>" +
                "<p>1. Синхронизация в Java гарантирует, что никакие два потока не смогут выполнить синхронизированный метод одновременно или параллельно.</p>" +
                "<p>2. <b>synchronized</b> можно использовать только с методами и блоками кода. Эти методы или блоки могут быть статическими или не-статическими.</p>" +
                "<p>3. когда какой либо поток входит в синхронизированный метод или блок он приобретает блокировку и всякий раз, когда поток выходит из синхронизированного метода или блока JVM снимает блокировку. Блокировка снимается, даже если нить оставляет синхронизированный метод после завершения из-за каких-либо ошибок или исключений.</p>" +
                "<p>4. <b>synchronized</b> в Java реентерабельна это означает, что если синхронизированный метод вызывает другой синхронизированный метод, который требует такой же замок, то текущий поток, который держит замок может войти в этот метод не приобретая замок.</p>" +
                "<p>5. Синхронизация в Java будет бросать NullPointerException если объект используемый в синхронизированном блоке null. Например, в вышеприведенном примере кода, если замок инициализируется как null, синхронизированный (lock) бросит NullPointerException.</p>" +
                "<p>6. Синхронизированные методы в Java вносят дополнительные затраты на производительность вашего приложения. Так что используйте синхронизацию, когда она абсолютно необходима. Кроме того, рассмотрите вопрос об использовании синхронизированных блоков кода для синхронизации только критических секций кода.</p>" +
                "<p>7. Вполне возможно, что и статический и не статический синхронизированные методы могут работать одновременно или параллельно, потому что они захватывают замок на другой объект.</p>" +
                "<p>8. В соответствии со спецификацией языка вы не можете использовать synchronized в конструкторе это приведет к ошибке компиляции.</p>" +
                "<p>9. Не синхронизируйте по не финальному (no final) полю, потому что ссылка, на не финальное поле может измениться в любое время, а затем другой поток может получить синхронизацию на разных объектах и уже не будет никакой синхронизации вообще. Лучше всего использовать класс String, который уже неизменяемый и финальный.</p>"
                 );
//_________055______________________________________________________________________________________________________________


        array[55] = new ContentValues();
        array[55].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Что будет напечатано в результате выполнения программы? </h2>" +
                "<font color=\"#000000\">class</font>&nbsp;V&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;s&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;V<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;str<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">s</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;str<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;MyTest&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;V&nbsp;v1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;V<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;abc&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;V&nbsp;v2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;V<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;abc&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#40;</font>v1&nbsp;<font color=\"#339933\">==</font>&nbsp;v2<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;v1.<font color=\"#006633\">equals</font><font color=\"#009900\">&#40;</font>v2<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font><br>"
        );
        array[55].put(DatabaseHelper.WRONG_ANSWER_1, "false true");
        array[55].put(DatabaseHelper.WRONG_ANSWER_2, "true false");
        array[55].put(DatabaseHelper.WRONG_ANSWER_3, "true true");
        array[55].put(DatabaseHelper.WRITE_ANSWER, "false false");
        array[55].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "метод equals() по умолчанию сравнивает ссылки, так же как и ==. Для \"правильного\" сравнения объектов, метод необходимо переопределить." +
                "@Override&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">boolean</font>&nbsp;equals<font color=\"#009900\">&#40;</font><font color=\"#003399\">Object</font>&nbsp;obj<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;s.<font color=\"#006633\">equals</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#40;</font>V<font color=\"#009900\">&#41;</font>obj<font color=\"#009900\">&#41;</font>.<font color=\"#006633\">s</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font><br>" );

//_________056______________________________________________________________________________________________________________


        array[56] = new ContentValues();
        array[56].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Рассмотрим код: </h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;MyCalculator&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;Insert&nbsp;here&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;" +
                "<h2>Что из нижеуказанного надо вставить в код, чтобы напечаталось 3.1416?</h2>"
        );
        array[56].put(DatabaseHelper.WRONG_ANSWER_1, "new PrintWriter().format(\"%6.4f\", Math.PI);");
        array[56].put(DatabaseHelper.WRONG_ANSWER_2, "new Formatter().format(\"%6.4f\", Math.PI);");
        array[56].put(DatabaseHelper.WRONG_ANSWER_3, "System.out.printf(\"%6d.4f\", Math.PI);");
        array[56].put(DatabaseHelper.WRITE_ANSWER, "System.out.printf(\"%6.4f\", Math.PI);");
        array[56].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Класс <b>Math</b> содержит методы, связанные с геометрией и тригонометрией и прочей математики. В классе определены две константы типа <i>double</i>: <b>E</b> и <b>PI</b>.</p>\n" +
                "\n" +
                "<p>Популярные методы для тригонометрических функций принимают параметр типа <i>double</i>, выражающий угол в радианах.</p>\n" +
                "\n" +
                "<ul>\n" +
                "<li>sin(double d)</li>\n" +
                "<li>cos(double d)</li>\n" +
                "<li>tan(double d)</li>\n" +
                "<li>asin(double d)</li>\n" +
                "<li>acos(double d)</li>\n" +
                "<li>atan(double d)</li>\n" +
                "<li>atan2(double y, double x)</li>\n" +
                "</ul>\n" +
                "\n" +
                "<p>Существуют также гиперболические функции: <b>sinh()</b>, <b>cosh()</b>, <b>tanh()</b>.</p>\n" +
                "\n" +
                "<p>Экспоненциальные функции: <b>cbrt()</b>, <b>exp()</b>, <b>expm1()</b>, <b>log()</b>, <b>log10()</b>, <b>log1p()</b>, <b>pow()</b>, <b>scalb()</b>, <b>sqrt()</b>.</p>\n" +
                "\n" +
                "<p>Из них хорошо знакомы возведение в степень - <b>pow(2.0, 3.0)</b> вернёт 8.0. И квадратный корень - <b>sqrt(4.0)</b>.</p>\n" +
                "\n" +
                "<p>Функции округления:</p>\n" +
                "\n" +
                "<ul>\n" +
                "<li><b>abs()</b> - возвращает абсолютное значение аргумента</li>\n" +
                "<li><b>ceil()</b> - возвращает наименьшее целое число, которое больше аргумента</li>\n" +
                "<li><b>floor()</b> - возвращает наибольшее целое число, которое меньше или равно аргументу</li>\n" +
                "<li><b>max()</b> - возвращает большее из двух чисел</li>\n" +
                "<li><b>min()</b> - возвращает меньшее из двух чисел</li>\n" +
                "<li><b>nextAfter()</b> - возвращает следующее значение после аргумента в заданном направлении</li>\n" +
                "<li><b>nextUp()</b> - возвращает следующее значение в положительном направлении</li>\n" +
                "<li><b>rint()</b> - возвращает ближайшее целое к аргументу</li>\n" +
                "<li><b>round()</b> - возвращает аргумент, округлённый вверх до ближайшего числа</li>\n" +
                "<li><b>ulp()</b> - возвращает дистанцию между значением и ближайшим большим значением</li>\n" +
                "</ul>\n" +
                "\n" +
                "<p>Другие методы</p>\n" +
                "\n" +
                "<ul>\n" +
                "<li><b>copySign()</b> - возвращает аргумент с тем же знаком, что у второго аргумента</li>\n" +
                "<li><b>getExponent()</b> - возвращает экспоненту</li>\n" +
                "<li><b>IEEEremainder()</b> - возвращает остаток от деления</li>\n" +
                "<li><b>hypot()</b> - возвращает длину гипотенузы</li>\n" +
                "<li><b>random()</b> - возвращает случайное число между 0 и 1 (единица в диапазон не входит)</li>\n" +
                "<li><b>signum()</b> - возвращает знак значения</li>\n" +
                "<li><b>toDegrees()</b> - преобразует радианы в градусы</li>\n" +
                "<li><b>toRadians()</b> - преобразует градусы в радианы</li>\n" +
                "</ul>\n" +
                "\n" +
                "<h2 class=\"text-warning\">Большие числа</h2>\n" +
                "\n" +
                "<p>Если вам не хватает точности основных типов для представления целых и вещественных чисел, то можно использовать классы <b>BigInteger</b> и <b>BigDecimal</b> из пакета <b>java.math</b>, которые предназначены для выполнения действий с числами, состоящими из произвольного количества цифр.</p>\n" +
                "\n" +
                "<p>Для преобразования обычного числа в число с произвольной точностью (называемое большим числом) вызывается статический метод <b>valueOf()</b>:</p>" +
                "<font color=\"#003399\">BigInteger</font>&nbsp;bigIntegerA&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">BigInteger</font>.<font color=\"#006633\">valueOf</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">42</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>При работе с большими числами нельзя использовать привычные математические операции с помощью <b>+</b> или <b>*</b> и т.п. Вместо них следует использовать специальные методы <b>add()</b> (сложение), <b>multiply()</b> (умножение), <b>divide()</b> (деление) и т.д.</p>" +
                "<font color=\"#003399\">BigInteger</font>&nbsp;bigIntegerA&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">BigInteger</font>.<font color=\"#006633\">valueOf</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">42</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">BigInteger</font>&nbsp;bigItBigIntegerB&nbsp;<font color=\"#339933\">=</font>&nbsp;bigIntegerA.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font>bigIntegerA<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">BigInteger</font>&nbsp;bigIntegerC&nbsp;<font color=\"#339933\">=</font>&nbsp;bigIntegerA.<font color=\"#006633\">multiply</font><font color=\"#009900\">&#40;</font>bigIntegerA<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>В обычной практике эти числа используются редко.</p><br>" );

        //_________057______________________________________________________________________________________________________________


        array[57] = new ContentValues();
        array[57].put(DatabaseHelper.QUESTION_COLUMN, "<h2>Как нужно переписать строку 6 кода, чтобы ошибки компиляции не возникало (укажите все подходящие варианты)?</h2>" +
                "<font color=\"#cc66cc\">1</font><font color=\"#339933\">:</font>&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;Class1&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">2</font><font color=\"#339933\">:</font>&nbsp;&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">3</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;total&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">4</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">5</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">6</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;doIt<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">7</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">8</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;doIt<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">9</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">10</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;total&nbsp;<font color=\"#339933\">+=</font>&nbsp;i<font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">11</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;total&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">12</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">13</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;"
        );
        array[57].put(DatabaseHelper.WRONG_ANSWER_1, "Class1();");
        array[57].put(DatabaseHelper.WRONG_ANSWER_2, "Class1 class = new Class1(); class.doIt();");
        array[57].put(DatabaseHelper.WRONG_ANSWER_3, "Class1.doIt();");
        array[57].put(DatabaseHelper.WRITE_ANSWER, "( new Class1() ).doIt();");
        array[57].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Чтобы из статического метода вызвать нестатический метод, нужно создать экземпляр класса.\n" +
                "Остаётся вспомнить, что class – это ключевое слово и его нельзя использовать в качестве имени переменной.</p><br>" );

        //_________058______________________________________________________________________________________________________________


        array[58] = new ContentValues();
        array[58].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Каким будет результат компиляции и запуска данного кода? </h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;args<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ClassA&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;ClassA<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;a.<font color=\"#006633\">methodA</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;ClassA&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;methodA<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ClassB&nbsp;classB&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;ClassB<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>classB.<font color=\"#006633\">getValue</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;ClassB&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;ClassC&nbsp;classC<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;getValue<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;classC.<font color=\"#006633\">getValue</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;ClassC&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;value<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;getValue<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;ClassC&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;value<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[58].put(DatabaseHelper.WRONG_ANSWER_1, "Ошибка компиляции");
        array[58].put(DatabaseHelper.WRONG_ANSWER_2, "Код запустится и на экране отобразится слово \"ClassC\" без кавычек");
        array[58].put(DatabaseHelper.WRONG_ANSWER_3, "Код запустится, но на экран ничего не выведется");
        array[58].put(DatabaseHelper.WRITE_ANSWER, "Возникнет ошибка времени выполнения");
        array[58].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Возникнет NullPointerException, так как поле classC не инициализировано</p>" );

//_________059______________________________________________________________________________________________________________

        array[59] = new ContentValues();
        array[59].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Какой результат выполнения программы?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;big_loop<font color=\"#339933\">:</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">3</font>&nbsp;<font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">3</font>&nbsp;<font color=\"#339933\">;</font>&nbsp;j<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">==</font>&nbsp;j<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">continue</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">else</font>&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;j<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">continue</font>&nbsp;big_loop<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;A&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">finally</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;B&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;C&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[59].put(DatabaseHelper.WRONG_ANSWER_1, "ABCABCABC");
        array[59].put(DatabaseHelper.WRONG_ANSWER_2, "AABCAABCBC");
        array[59].put(DatabaseHelper.WRONG_ANSWER_3, "AABBCACA");
        array[59].put(DatabaseHelper.WRITE_ANSWER, "AABCBB");
        array[59].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Начинаем цикл i = 0;<br>" +
                "__Входим во второй цикл j = 0;<br>" +
                "____Т.к. i == j (0 == 0), то continue для вротого цикла<br>" +
                "__Инкремент j, j = 1;<br>" +
                "____Т.к. i < j (0 < 1), то оба if пропускаются, печатаем \"А\"<br>" +
                "__Инкремент j, j = 2;<br>" +
                "____Т.к. i < j (0 == 2), то оба if пропускаются, печатаем \"А\"<br>" +
                "__Инкремент j, j = 3, выход из цикла;<br>" +
                "__Печатаем B из блока finally<br>" +
                "__Печатаем С<br>" +
                "Инкремент i, i = 1<br>" +
                "__Входим во второй цикл j = 0;<br>" +
                "____Т.к. i > j (1 > 0), то continue big_loop;<br>" +
                "____НО! блок finnaly всё-равно выполняется! По-этому печатаем B из блока finnaly<br>" +
                "Переход к метке big_loop<br>" +
                "Инкремент i, i = 2<br>" +
                "__Инкремент j, j = 1<br>" +
                "____Т.к. i > j (2 > 1), то continue big_loop;<br>" +
                "____НО! блок finnaly всё-равно выполняется! По-этому печатаем B из блока finnaly<br>" +
                "Переход к метке big_loop<br>" +
                "Инкремент i, i = 3, Выход из цикла.<br>" +
                "Конец.<br>" +
                "В итоге на экране заветные AABCBB</p>" );

//_________060______________________________________________________________________________________________________________

        array[60] = new ContentValues();
        array[60].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что будет выведено на консоль?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Z&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">Object</font>&nbsp;o&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Object&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;String&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">Integer</font>&nbsp;i&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Integer&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Z&nbsp;z&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Z<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;z.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#000066\">null</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[60].put(DatabaseHelper.WRONG_ANSWER_1, "String");
        array[60].put(DatabaseHelper.WRONG_ANSWER_2, "Integer");
        array[60].put(DatabaseHelper.WRONG_ANSWER_3, "Object");
        array[60].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции");
        array[60].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Если в классе имеется несколько перегруженных методов и их аргументы не находятся в одной иерархии, то при вызове необходимо точно задавать тип параметра.</p>" );

        //_________061______________________________________________________________________________________________________________

        array[61] = new ContentValues();
        array[61].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что будет выведено на консоль?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Z&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">Object</font>&nbsp;o&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Object&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;String&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;print<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">Integer</font>&nbsp;i&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000ff\">&quot;Integer&quot;</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Z&nbsp;z&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Z<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;z.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#000066\">null</font>&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[61].put(DatabaseHelper.WRONG_ANSWER_1, "String");
        array[61].put(DatabaseHelper.WRONG_ANSWER_2, "Integer");
        array[61].put(DatabaseHelper.WRONG_ANSWER_3, "Object");
        array[61].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции");
        array[61].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Если в классе имеется несколько перегруженных методов и их аргументы не находятся в одной иерархии, то при вызове необходимо точно задавать тип параметра.</p>" );

        //_________062______________________________________________________________________________________________________________

        array[62] = new ContentValues();
        array[62].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Зачем нужна аннотация @Override когда вы переопределяете (или реализовываете) методы?</h1>"
        );
        array[62].put(DatabaseHelper.WRONG_ANSWER_1, "Чтобы пометить методы, которые обязательно должны быть переопределены в классах-наследниках");
        array[62].put(DatabaseHelper.WRONG_ANSWER_2, "Чтобы пометить методы, которые обязательно должны быть перегружены в классах-наследниках");
        array[62].put(DatabaseHelper.WRONG_ANSWER_3, "Аннотация является deprecated (и соответственно не рекомендуется к использованию)");
        array[62].put(DatabaseHelper.WRITE_ANSWER, "Чтобы своевременно обнаружить изменение в сигнатуре метода у класса-предка (или интерфейса).");
        array[62].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Предопределённая аннотация @Override используется для выявления логических ошибок на этапе компиляции. Этой аннотацией желательно помечать каждый метод, который будет перекрывать метод из суперкласса или реализовывать метод из интерфейса. Если в суперклассе или интерфейсе нет метода с такой же сигнатурой, то возникнет ошибка компиляции. Это позволяет легко выявлять ситуации, когда в суперклассе или интерфейсе была удалена или изменена сигнатура перекрываемого метода.</p>" );

        //_________063______________________________________________________________________________________________________________

        array[63] = new ContentValues();
        array[63].put(DatabaseHelper.QUESTION_COLUMN, "<h1>Что произойдет во время компиляции и выполнения данного кода?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;m<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;...&nbsp;<font color=\"#006633\">a</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;1&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;m<font color=\"#009900\">&#40;</font><font color=\"#003399\">Integer</font>&nbsp;...&nbsp;<font color=\"#006633\">a</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;2&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;m<font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[63].put(DatabaseHelper.WRONG_ANSWER_1, "1");
        array[63].put(DatabaseHelper.WRONG_ANSWER_2, "2");
        array[63].put(DatabaseHelper.WRONG_ANSWER_3, "12");
        array[63].put(DatabaseHelper.WRITE_ANSWER, "Ошибка компиляции");
        array[63].put(DatabaseHelper.ARTICLE,  "<h1>Пояснение</h1>" +
                "<p>Пояснение: Для вызова m(1,2) могут быть применены оба метода - и m(int ... a), и m(Integer ... a). Ни один из этих методов не является наиболее специфическим, поэтому возникает ошибка компиляции (ambiguous methods).<br><br>" +
                "P.S. Ранние версии JDK8 содержали ошибку, из-за которой этот код успешно компилировался вопреки спецификации.</p>" );





    }
}
