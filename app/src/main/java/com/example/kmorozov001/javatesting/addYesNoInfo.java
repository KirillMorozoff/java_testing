package com.example.kmorozov001.javatesting;

import android.content.ContentValues;

/**
 * Created by User on 03.10.2016.
 */
public class addYesNoInfo {


    ContentValues[] array;

    public void adding() {
        // Создание новой строки
        array = new ContentValues[64];
        for (int i = 0; i < 64; i++) {
            array[i] = new ContentValues();
        }

        array[0] = new ContentValues();
        // Задайте значения для каждого столбца
        array[0].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое поле/атрибут класса?</h1>");
        array[0].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Поле (атрибут) класса — это характеристика объекта. Например для фигуры это может быть название, площадь, периметр.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Circle&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">Double</font>&nbsp;area<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;perimeter<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___001_____________________________________________________________________________________________________________________

        array[1] = new ContentValues();
        array[1].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, из каких символов может состоять имя переменной (корректный идентификатор)?</h1>");
        array[1].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Имя или идентификатор переменной — это последовательность из строчных и заглавных латинских букв, цифр, а также символов «$» и «_». Имя переменной <b>может начинаться с любого из перечисленных символов, кроме цифры.</b></p>" +
                "<p>Технически возможно начать имя переменной также с «$» или «_», однако это запрещено соглашением по оформлению кода в Java (Java Code Conventions). Кроме того, символ доллара «$», по соглашению, никогда не используется вообще. В соответствии с соглашением имя переменной должно начинаться именно с маленькой буквы (с заглавной буквы начинаются имена классов). Пробелы при именовании переменных не допускаются.</p>");

        //___002_____________________________________________________________________________________________________________________

        array[2] = new ContentValues();
        array[2].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что значит слово “инициализация”?</h1>");
        array[2].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p><b>Инициализация</b> (от англ. <i>initialization</i>, инициирование) — создание, активация, подготовка к работе, определение параметров. Приведение программы или устройства в состояние готовности к использованию. С точки зрения Java — выделение памяти под объект, например при создании MyClass myClass = new MyClass(). Таким образом будет выделена память под объект myClass (он будет инициализирован). Без инициализации (new MyClass()) запись MyClass myClass; просто резервирует имя (объявляется переменная myClass типа MyClass).</p>");

        //___003_____________________________________________________________________________________________________________________

        array[3] = new ContentValues();
        array[3].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что вы знаете о преобразовании примитивных типов данных, есть ли потеря данных, можно ли преобразовать логический тип?</h1>");
        array[3].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Преобразование может быть неявным и явным (приведение типов). Неявное преобразование может выполняться если:</p>" +
                "<p>1. типы совместимы (например — оба целочисленные)</p>" +
                "<p>2. размер «принимающего» типа больше чем у того, который преобразуется (так называемое «преобразование с расширением»)</p>" +
                "<font color=\"#000066\">int</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">123454</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">double</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;&nbsp;a<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//неявное&nbsp;преобразование&nbsp;-&nbsp;преобразование&nbsp;с&nbsp;расширением</font>" +
                "<p>Явное преобразование имеет вид переменная_нового_типа = (новый_тип) имя переменной;</p>" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//b&nbsp;будет&nbsp;остатком&nbsp;от&nbsp;деления&nbsp;a&nbsp;на&nbsp;диапазон&nbsp;byte,&nbsp;может&nbsp;быть&nbsp;потеря&nbsp;данных</font>" +
                "<p>Примеры:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;typeConverterExample<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">long</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;100L<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">double</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">300.0</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Object</font>&nbsp;ab&nbsp;<font color=\"#339933\">=</font>&nbsp;a&nbsp;<font color=\"#339933\">+</font>&nbsp;b<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>ab.<font color=\"#006633\">getClass</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getName</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;value:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;ab<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//java.lang.Double&nbsp;value:&nbsp;400.0</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">double</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1000.05</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">long</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1000</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Object</font>&nbsp;cd&nbsp;<font color=\"#339933\">=</font>&nbsp;c<font color=\"#339933\">+</font>d<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>cd.<font color=\"#006633\">getClass</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getName</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font><font color=\"#0000ff\">&quot;&nbsp;value:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;cd<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//java.lang.Double&nbsp;value:&nbsp;2000.05</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;typeNarrowing<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a0&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">64</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">257</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">126</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a3&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">129</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">byte</font>&nbsp;b0&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a0<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">byte</font>&nbsp;b2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a2<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">byte</font>&nbsp;b3&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a3<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>b0<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;b&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;b2&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;b3<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//64&nbsp;1&nbsp;126&nbsp;-127</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">double</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">56.9876</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font><font color=\"#009900\">&#41;</font>&nbsp;c<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>d<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//56</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">long</font>&nbsp;e&nbsp;<font color=\"#339933\">=</font>&nbsp;1000L<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">float</font>&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">float</font><font color=\"#009900\">&#41;</font>&nbsp;e<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>f<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//1000.0</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>" +
                "<p>При повышении типа byte>short; short>int; int>long; float>double; char>int информация не потеряется. При сужении возможна потеря информации (см. пример выше byte = (byte) int).</p>" +
                "<p>При различных операциях может происходить повышение типов в порядке «усиления» к более информативному типу. Например складывая int и double получим тип double. Но есть и особенность, например сложив double (8 байт) и long (8 байт) Java оставит знаки после запятой (double), а не более «длинный» тип. Аналогичный пример с вещественной частью:</p>" +
                "&nbsp;&nbsp;<font color=\"#000066\">long</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;100L<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">double</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;a<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Object</font>&nbsp;ab&nbsp;<font color=\"#339933\">=</font>&nbsp;a&nbsp;<font color=\"#339933\">+</font>&nbsp;b<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>ab.<font color=\"#006633\">getClass</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getName</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;value:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;ab<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//java.lang.Double&nbsp;value:&nbsp;200.0</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">float</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">long</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1000</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Object</font>&nbsp;cd&nbsp;<font color=\"#339933\">=</font>&nbsp;c&nbsp;<font color=\"#339933\">-</font>&nbsp;d<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>cd.<font color=\"#006633\">getClass</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getName</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font><font color=\"#0000ff\">&quot;&nbsp;value:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;cd<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//java.lang.Float&nbsp;value:&nbsp;-900.0</font>" +
                "<h1>Кратко можно записать такие правила:</h1>" +
                "<p>1. byte, short, char в выражениях всегда повышаются до int</p>" +
                "<p>2. если в выражении участвует тип long — то именно к этому типу будет приведён результат</p>" +
                "<p>3. если в выражении участвует float — то результат приводится к float</p>" +
                "<p>4. если один из операндов имеет тип double — то к этому типу будет приведён весь результат</p>" +
                "<p>5. При выборе между длиной и возможностью сохранить дробную часть — будет выбрана дробная часть</p>");

//___004_____________________________________________________________________________________________________________________

        array[4] = new ContentValues();
        array[4].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какими значениями инициализируются переменные по умолчанию?</h1>");
        array[4].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Числа инициализируются 0 или 0.0. Объекты (в том числе String) — null, char — \\u0000; boolean — false;</p>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;TestClass&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;a<font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">double</font>&nbsp;b<font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">float</font>&nbsp;c<font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">char</font>&nbsp;d<font color=\"#339933\">;</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;s<font color=\"#339933\">;</font>&nbsp;<font color=\"#003399\">Object</font>&nbsp;o<font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">boolean</font>&nbsp;e<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;toString<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;TestClass{&quot;</font>&nbsp;<font color=\"#339933\">+</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0000ff\">&quot;a=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;a&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;,&nbsp;b=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;b&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;,&nbsp;c=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;c&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;,&nbsp;d=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;d&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;,&nbsp;s='&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;s&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">'<font color=\"#000099\">\\'</font>'</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;,&nbsp;o=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;o&nbsp;<font color=\"#339933\">+</font><font color=\"#0000ff\">&quot;,&nbsp;e=&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;e&nbsp;<font color=\"#339933\">+</font><font color=\"#0000ff\">'}'</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TestClass&nbsp;testClass&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;TestClass<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>testClass<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//TestClass{a=0,&nbsp;b=0.0,&nbsp;c=0.0,&nbsp;d=&nbsp;,&nbsp;s='null',&nbsp;o=null,&nbsp;e=false}</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>");

//___005_____________________________________________________________________________________________________________________

        array[5] = new ContentValues();
        array[5].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, как передается значение переменной (по ссылке/значению)?</h1>");
        array[5].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Постоянный холивар по этому вопросу, видимо, связан с переводом на русский язык некоторых терминов, а так же работой Java с примитивами, строками и ссылочными объектами. По английски всё звучит строго — <b>Java is always pass-by-value</b>. Обычно спор вызывают особенности языка относящиеся к пониманию примитивов, ссылок и объектов в Java (и то, что некоторые из них неизменяемые). Итак:</p>" +
                "<ul>" +
                "<li>Java передает всё <b>по значению</b>. Java никогда не передает ничего по ссылке. Примитивы, ссылки, null — всё передается по значению, не по «ссылке».</li>" +
                "<li><b>Передача по значению</b>: Когда передается параметр в метод, то параметр копируется в другую переменную и она передается в метод. Поэтому это и называется «передача по значению».</li>" +
                "<li><b>Передача по ссылке</b>: Если мы передаем в метод ссылочный тип (объект), то так же происходит передача копии этого объекта (ссылки), которая указывает на какую-либо область памяти (можно назвать ссылку — «указателем»). Изменив что-то в области памяти, будут изменены все объекты, которые ссылаются на эту область памяти. Отсюда идет название <b>«передача по ссылке»</b>, хотя передается всё то же значение, просто значением является указатель на область памяти.</li>" +
                "</ul>" +
                "<p>Приведу пример с холивара на stackoverflow (http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value) и переведу на русский:</p>" +
                "<p>Пусть мы имеем такую строчку, которая резервирует имя myDog под тип Dog.</p>" +
                "<p>Dog myDog;</p>" +
                "<p>Но это еще не физический объект, а только указатель на тип Dog. Теперь создадим (инициализируем) этот объект.</p>" +
                "<p>Dog myDog = new Dog(\"Rover\");<br>" +
                "foo(myDog);</p>" +
                "<p>Теперь myDog действительно занимает область в памяти (пусть будет область Dog@42). Вызвав метод foo(myDog) мы передаем копию значения указателя на область памяти 42.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;foo<font color=\"#009900\">&#40;</font>Dog&nbsp;someDog<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;someDog.<font color=\"#006633\">setName</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Max&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;AAA</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;someDog&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Fifi&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;BBB</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;someDog.<font color=\"#006633\">setName</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Rowlf&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;CCC</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "В строчке //AAA мы поменяли значение в памяти 42 на «Max».<br>" +
                "В строчке //BBB мы создали новый объект, который теперь будет лежать в другой области памяти (пусть будет Dog@74).<br>" +
                "В строке //CCC мы поменяли значение в области памяти 74. Очевидно, что изначальный объект myDog@42 ничего об этом не знает, но он ссылается на уже измененную в строке //AAA область памяти и теперь будет возвращать имя «Max»." +
                "<p>Теперь другая засада — примитивы и строки.</p>" +
                "<ul>" +
                "<li>Когда передается примитив в метод, то передается так же его копия (копия значения).</li>" +
                "</ul>" +
                "<font color=\"#000066\">int</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;y&nbsp;<font color=\"#339933\">=</font>&nbsp;changeX<font color=\"#009900\">&#40;</font>x<font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#666666\">//x=5;</font><br/>\n" +
                "<font color=\"#666666\">//y=25;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">private</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;changeX<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;value<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "value&nbsp;<font color=\"#339933\">=</font>&nbsp;value&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">return</font>&nbsp;value<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Создали примитив x = 5. Передали в метод копию значения (т.е. 5). В методе умножили на число и вернули его. Значение примитива y будет равно 25, а значение примитива x = 5 (т.е. не изменится). Всё дело в том, что мы передали значение (5), а не указатель на область памяти. Соответственно значение x и не должно было поменяться, т.к. мы его не меняли (в методе использовалась копия значения).</p>" +
                "<ul>" +
                "<li>Строки immutable, т.е. неизменяемые. Когда мы присваиваем строке новое значение, то всегда будет создан новый объект в памяти.</li>" +
                "</ul>" +
                "<p>Еще один пример, что происходит при передаче параметра в метод:</p>" +
                "<font color=\"#000000\">class</font>&nbsp;TestClass&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font>&nbsp;changeObjectValue<font color=\"#009900\">&#40;</font>ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font>&nbsp;objectValue<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;objectValue.<font color=\"#006633\">clear</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;objectValue.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">999</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;objectValue<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;changeStr<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;str<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;NewString&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;str<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;changeX<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;x<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;x<font color=\"#339933\">*</font><font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;x<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TestClass&nbsp;testClass&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;TestClass<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font>&nbsp;value&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">23</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;FirstString&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>value&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;str&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;x<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//[23]&nbsp;FirstString&nbsp;2</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font>&nbsp;value2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Object<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value2&nbsp;<font color=\"#339933\">=</font>&nbsp;value<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;value2&nbsp;<font color=\"#339933\">=</font>&nbsp;testClass.<font color=\"#006633\">changeObjectValue</font><font color=\"#009900\">&#40;</font>value2<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str2&nbsp;<font color=\"#339933\">=</font>&nbsp;str<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;str2&nbsp;<font color=\"#339933\">=</font>&nbsp;testClass.<font color=\"#006633\">changeStr</font><font color=\"#009900\">&#40;</font>str2<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;x2&nbsp;<font color=\"#339933\">=</font>&nbsp;testClass.<font color=\"#006633\">changeX</font><font color=\"#009900\">&#40;</font>x<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>value&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;str&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;x<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//[999]&nbsp;FirstString&nbsp;2</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>value2&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;str2&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;x2<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//[999]&nbsp;NewString&nbsp;10</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>value.<font color=\"#006633\">equals</font><font color=\"#009900\">&#40;</font>value2<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;str.<font color=\"#006633\">equals</font><font color=\"#009900\">&#40;</font>str2<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#009900\">&#40;</font>x2&nbsp;<font color=\"#339933\">==</font>&nbsp;x<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//true&nbsp;false&nbsp;false</font>" +
                "<ol>" +
                "<li>Создаем ссылочный объект value и добавляем в него объект (Integer=23). Так же создаем строку str=»FirstString» и примитивное число x= 2.</li>" +
                "<li>Отдельно создаем объект value2 и выделяем под него память; Сейчас это выглядит что-то вроде value={ArrayList@450}, value2={ArrayList@453}, т.е. видно, что это разные ссылки на объекты (разные области памяти).</li>" +
                "<li>value2={ArrayList@450}, value={ArrayList@450} после присвоения оба объекта ссылаются на одну область памяти. Теперь попытаемся изменить их с помощью методов в тестовом классе</li>" +
                "</ol>" +
                "<ul>" +
                "<li>Объекты передаются по копии указателя на область памяти. Т.к. value и value2 указывают на один объект в памяти, то после изменения в методе changeObjectValue одного объекта, поменяется и второй.</li>" +
                "<li>Строка (String) всегда создается новая. Хоть str2 = str и указывали на одну область вначале, но после изменения str2 на новое значение NewString, значение первой строки осталось прежним.</li>" +
                "<li>Т.к. примитивные типы передаются по копии значения (в данном случае 2), то изменение в методе примитивного типа никак не отразилось на значении исходной переменной x (значение в области памяти для x осталось прежним).</li>" +
                "</ul>");

        //___006_____________________________________________________________________________________________________________________

        array[6] = new ContentValues();
        array[6].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что вы знаете о функции main, какие обязательные условия ее определения?</h1>");
        array[6].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Обязательная запись:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#666666\">/*тело&nbsp;метода*/</font>&nbsp;<font color=\"#009900\">&#125;</font>" +
                "<p>Метод main() — точка входа в программу. Может быть несколько методов main. Входные параметры — только массив строк. Если этого метода не будет, то компиляция возможна, но при запуске будет Error: Main method not found.</p>");

//___007_____________________________________________________________________________________________________________________

        array[7] = new ContentValues();
        array[7].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какова роль и правила написания оператора выбора (switch)?</h1>");
        array[7].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Оператор switch сравнивает аргумент на равенство с предложенным значением.</p>" +
                "<font color=\"#0000ff\">switch</font><font color=\"#008000\">&#40;</font>ВыражениеДляСравнения<font color=\"#008000\">&#41;</font>&nbsp;<font color=\"#008000\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0000ff\">case</font>&nbsp;Совпадение<font color=\"#0000dd\">1</font><font color=\"#008080\">:</font>&nbsp;<br/>\n" +
                "\t&nbsp;&nbsp;&nbsp;&nbsp;команда<font color=\"#008080\">;</font><br/>\n" +
                "\t\t<font color=\"#0000ff\">break</font><font color=\"#008080\">;</font><br/>\n" +
                "\t<font color=\"#0000ff\">case</font>&nbsp;Совпадение<font color=\"#0000dd\">2</font><font color=\"#008080\">:</font>&nbsp;<br/>\n" +
                "\t&nbsp;&nbsp;&nbsp;&nbsp;команда<font color=\"#008080\">;</font><br/>\n" +
                "\t\t<font color=\"#0000ff\">break</font><font color=\"#008080\">;</font><br/>\n" +
                "\t<font color=\"#0000ff\">case</font>&nbsp;Совпадение<font color=\"#0000dd\">3</font><font color=\"#008080\">:</font>&nbsp;<br/>\n" +
                "\t&nbsp;&nbsp;&nbsp;&nbsp;команда<font color=\"#008080\">;</font><br/>\n" +
                "\t\t<font color=\"#0000ff\">break</font><font color=\"#008080\">;</font><br/>\n" +
                "\t<font color=\"#0000ff\">default</font><font color=\"#008080\">:</font>&nbsp;<br/>\n" +
                "\t&nbsp;&nbsp;&nbsp;&nbsp;оператор<font color=\"#008080\">;</font><br/>\n" +
                "\t&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#0000ff\">break</font><font color=\"#008080\">;</font><br/>\n" +
                "<font color=\"#008000\">&#125;</font>" +
                "<p>Обязательно необходимо ставить break; после завершения тело команды, иначе будет продолжаться выполнение ниже по строчкам.</p>");

//___008_____________________________________________________________________________________________________________________

        array[8] = new ContentValues();
        array[8].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие циклы вы знаете, в чем их отличия?</h1>");
        array[8].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<font color=\"#000000\">while</font><font color=\"#009900\">&#40;</font>условие<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;тело&nbsp;цикла</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">do</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;тело&nbsp;цикла&nbsp;}</font><br/>\n" +
                "<font color=\"#000000\">while</font><font color=\"#009900\">&#40;</font>условие<font color=\"#339933\">-</font>логическое&nbsp;выражение<font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font>инициализация<font color=\"#339933\">;</font>&nbsp;логическое&nbsp;выражение&nbsp;<font color=\"#009900\">&#40;</font>условие<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;шаг&nbsp;<font color=\"#009900\">&#40;</font>итерация<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;тело&nbsp;цикла</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>do-while всегда выполнится хотя бы один раз, т.к. проверка идет после тела цикла.</p>");

        //___009_____________________________________________________________________________________________________________________

        array[9] = new ContentValues();
        array[9].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое массив?</h1>");
        array[9].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Массив (в некоторых языках программирования также таблица, ряд, матрица) — тип или структура данных в виде набора компонентов (элементов массива), расположенных в памяти непосредственно друг за другом. При этом доступ к отдельным элементам массива осуществляется с помощью индексации, то есть ссылки на массив с указанием номера (индекса) нужного элемента. За счёт этого, в отличие от списка, массив является структурой с произвольным доступом.</p>" +
                "<p>Размерность массива — это количество индексов, необходимое для однозначного доступа к элементу массива. Форма или структура массива — количество размерностей плюс размер (протяжённость) массива для каждой размерности; может быть представлена одномерным массивом.</p>" +
                "<p>В Java массивы являются объектами. Это значит, что имя, которое даётся каждому массиву, лишь указывает на адрес какого-то фрагмента данных в памяти. Кроме адреса в этой переменной ничего не хранится. Индекс массива, фактически, указывает на то, насколько надо отступить от начального элемента массива в памяти, чтоб добраться до нужного элемента.</p>" +
                "тип<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;имя<font color=\"#339933\">;</font><br/>\n" +
                "тип&nbsp;&nbsp;имя<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "тип<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;имя&nbsp;&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;тип<font color=\"#009900\">&#91;</font>размер<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "тип<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;имя&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font>эл<font color=\"#cc66cc\">0</font>,&nbsp;эл<font color=\"#cc66cc\">1</font>,&nbsp;…,&nbsp;элN<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>");

        //___010_____________________________________________________________________________________________________________________

        array[10] = new ContentValues();
        array[10].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что вы знаете о классах оболочках?</h1>");
        array[10].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Для каждого примитивного типа есть соответствующий класс (Byte, Double, Float, Integer, Long, Short). Числовые классы имеют общего предка — абстрактный класс Number, в котором описаны шесть методов, возвращающих числовое значение, содержащееся в классе, приведенное к соответствующему примитивному типу: byteValue(), doubleValue(), floatValue(), intValue(), longValue(), shortValue(). Эти методы переопределены в каждом из шести числовых классов-оболочек.</p>");

        //___011_____________________________________________________________________________________________________________________

        array[11] = new ContentValues();
        array[11].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое автоупаковка (boxing/unboxing)?</h1>");
        array[11].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Это автоматическое преобразование из примитивных типов данных к ссылочным и наоборот.</p>");


        //___012_____________________________________________________________________________________________________________________
        array[12] = new ContentValues();
        array[12].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы назвать принципы ООП и рассказать о каждом?</h1>");
        array[12].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Объе́ктно-ориенти́рованное программи́рование (ООП) — это методология программирования, основанная на представлении программы в виде совокупности объектов, каждый из которых является экземпляром определенного класса, а классы образуют иерархию наследования.</p>" +
                "<p>Основные принципы ООП: абстракция, инкапсуляция, наследование, полиморфизм.</p>" +
                "<p><strong>Абстракция</strong> —&nbsp;&nbsp;означает выделение значимой информации и исключение из рассмотрения незначимой. С точки зрения программирования это правильное разделение программы на объекты. Абстракция позволяет отобрать главные характеристики и опустить второстепенные.</p>" +
                "<p>Пример: описание должностей в компании. Здесь название должности значимая информация, а описание обязанностей у каждой должности это второстепенная информация. К примеру главной характеристикой для «директор» будет то, что это должность чем-то управляет, а чем именно (директор по персоналу, финансовый директор, исполнительный директор) это уже второстепенная информация.</p>" +
                "<p><strong>Инкапсуляция</strong> —&nbsp;свойство системы, позволяющее объединить данные и методы, работающие с ними, в классе. Для Java корректно будет говорить, что инкапсуляция это «сокрытие реализации». Пример из жизни — пульт от телевизора. Мы нажимаем кнопочку «увеличить громкость» и она увеличивается, но в этот момент происходят десятки процессов, которые скрыты от нас. Для Java: можно создать класс с 10 методами, например вычисляющие площадь сложной фигуры, но сделать из них 9 private. 10й метод будет называться «вычислитьПлощадь()» и объявлен public, а в нем уже будут вызываться необходимые скрытые от пользователя методы. Именно его и будет вызывать пользователь.</p>" +
                "<p><strong>Наследование</strong> —&nbsp;свойство системы, позволяющее описать новый класс на основе уже существующего с частично или полностью заимствующейся функциональностью. Класс, от которого производится наследование, называется базовым, родительским или суперклассом. Новый класс — потомком, наследником, дочерним или производным классом.</p>" +
                "<p><strong>Полиморфизм&nbsp;</strong>—&nbsp;свойство системы использовать объекты с одинаковым интерфейсом без информации о типе и внутренней структуре объекта. Пример (чуть переделанный) из Thinking in Java:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">interface</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;draw<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;erase<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Circle&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;draw<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Circle.draw()&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Triangle&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;draw<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Triangle.draw()&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;TestPol&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Shape</font>&nbsp;shape1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Circle<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Shape</font>&nbsp;shape2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Triangle<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;testPoly<font color=\"#009900\">&#40;</font>shape1<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;testPoly<font color=\"#009900\">&#40;</font>shape2<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;testPoly<font color=\"#009900\">&#40;</font><font color=\"#003399\">Shape</font>&nbsp;shape<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;shape.<font color=\"#006633\">draw</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Вывод&nbsp;в&nbsp;консоль:</font><br/>\n" +
                "<font color=\"#666666\">//Circle.draw()</font><br/>\n" +
                "<font color=\"#666666\">//Triangle.draw()</font>" +
                "<p>Есть общий интерфейс «Фигура» и две его реализации «Треугольник» и «Круг». У каждого есть метод «нарисовать». Благодаря полиморфизму нам нет нужды писать отдельный метод для каждой из множества фигур, чтобы вызвать метод «нарисовать».&nbsp; Вызов полиморфного метода позволяет одному типу выразить свое отличие от другого, сходного типа, хотя они и происходят от одного базового типа. Это отличие выражается различным действием методов, вызываемых через базовый класс (или интерфейс).<br>\n" +
                "Здесь приведен пример&nbsp;полиморфизма (также называемый динамическим связыванием, или поздним связыванием, или связыванием во время выполнения), в котором продемонстрировано как во время выполнения программы будет выполнен тот метод, который&nbsp;принадлежит передаваемому объекту.</p>\n" +
                "<p>Если бы не было полиморфизма и позднего связывания, то эта же программа выглядела бы примерно так:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;testPolyCircle<font color=\"#009900\">&#40;</font>Circle&nbsp;circle<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;circle.<font color=\"#006633\">draw</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;testPolyTriangle<font color=\"#009900\">&#40;</font>Triangle&nbsp;triangle<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;triangle.<font color=\"#006633\">draw</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>" +
                "<p>Т.е. для каждого класса (фигуры) мы бы писали отдельный метод. Здесь их два, а если фигур (классов) сотни?</p>");

        //___013_____________________________________________________________________________________________________________________
        array[13] = new ContentValues();
        array[13].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы дать определение понятию “класс”?</h1>");
        array[13].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Класс – это описатель общих свойств группы объектов. Этими свойствами могут быть как характеристики объектов (размер, вес, цвет и т.п.), так и поведения, роли и т.п.</p>");

        //___014_____________________________________________________________________________________________________________________
        array[14] = new ContentValues();
        array[14].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое поле/атрибут класса?</h1>");
        array[14].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Поле (атрибут) класса — это характеристика объекта. Например для фигуры это может быть название, площадь, периметр.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Circle&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">Double</font>&nbsp;area<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;perimeter<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___015_____________________________________________________________________________________________________________________
        array[15] = new ContentValues();
        array[15].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, как правильно организовать доступ к полям класса?</h1>");
        array[15].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Модификатор доступа — private. Доступ через методы get\\set.</p>" );

        //___016_____________________________________________________________________________________________________________________
        array[16] = new ContentValues();
        array[16].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы дать определение понятию “конструктор”?</h1>");
        array[16].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Конструктор — это специальный метод, который вызывается при создании нового объекта. Конструктор инициализирует объект непосредственно во время создания. Имя конструктора совпадает с именем класса, включая регистр, а по синтаксису конструктор похож на метод без возвращаемого значения.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Circle&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Shape</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Circle<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" );

        //___017_____________________________________________________________________________________________________________________
        array[17] = new ContentValues();
        array[17].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, чем отличаются конструкторы по-умолчанию, копирования и конструктор с параметрами?</h1>");
        array[17].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Конструктор по умолчанию не принимает никаких параметров. Конструктор копирования принимает в качестве параметра объект класса. Конструктор с параметрами принимает на вход параметры (обычно необходимые для инициализации полей класса).</p>" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//конструктор&nbsp;по&nbsp;умолчанию</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Circle<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//конструктор&nbsp;копирования</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Circle<font color=\"#009900\">&#40;</font>Circle&nbsp;circle<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font><font color=\"#009900\">&#40;</font>circle.<font color=\"#006633\">getName</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>,&nbsp;circle.<font color=\"#006633\">getArea</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>,&nbsp;circle.<font color=\"#006633\">getPerimeter</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//будет&nbsp;вызван&nbsp;конструктор&nbsp;с&nbsp;параметрами&nbsp;ниже</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//конструктор&nbsp;с&nbsp;параметрами</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Circle<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;name,&nbsp;<font color=\"#003399\">Double</font>&nbsp;area,&nbsp;<font color=\"#003399\">String</font>&nbsp;perimeter<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">name</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">area</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;area<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">perimeter</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;perimeter<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>" +
                "<p>Обращаю внимание, что тема копирования (clone()) достаточно глубокая с возможностью возникновения множества неявных проблем. </p>" );

        //___018_____________________________________________________________________________________________________________________
        array[18] = new ContentValues();
        array[18].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие модификации уровня доступа вы знаете?</h1>");
        array[18].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<li>private (закрытый)&nbsp;— доступ к члену класса не предоставляется никому, кроме методов этого класса. Другие классы того же пакета также не могут обращаться к private-членам.</li>\n" +
                "<li>default, package, friendly, доступ по умолчанию, когда никакой модификатор не присутствует —&nbsp;члена класса считается открытым внутри своего собственного пакета, но не доступен для кода, расположенного вне этого пакета.Т.е. если <span style=\"color: #ff0000;\">package2.Class2</span> extends <span style=\"color: #ff0000;\">package1.MainClass</span>, то в <span style=\"color: #ff0000;\">Class2</span> методы <strong>без идентификатора</strong> из <span style=\"color: #ff0000;\">MainClass</span> видны <strong>не будут</strong>.</li>\n" +
                "<li>protected (защищённый) — доступ в пределах пакета и классов наследников. Доступ в классе из другого пакета будет к методам public и protected главного класса.&nbsp;Т.е. если<span style=\"color: #ff0000;\"> package2.Class2</span> extends <span style=\"color: #ff0000;\">package1.MainClass</span>, то внутри <span style=\"color: #ff0000;\">package2.Class2</span> методы&nbsp;с&nbsp;идентификатором <span style=\"color: #ff0000;\">protected</span> из <span style=\"color: #ff0000;\">MainClass</span> будут видны.</li>\n" +
                "<li>public (открытый)&nbsp;— доступ для всех из любого другого кода проекта</li>\n" +
                "</ul>\n" +
                "<p>Модификаторы в списке расположены по возрастающей видимости в программе.</p>" );

        //___019_____________________________________________________________________________________________________________________
        array[19] = new ContentValues();
        array[19].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы рассказать об особенностях класса с единственным закрытым (private) конструктором?</h1>");
        array[19].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Невозможно создать объект класса у которого единственный private конструктор за пределами класса. Поэтому нельзя унаследоваться от такого класса. При попытке унаследоваться будет выдаваться ошибка:&nbsp;<span style=\"color: #ff0000;\">There is no default constructor available in имяКласса</span>. А при попытке создать объект этого класса: <span style=\"color: #ff0000;\">ИмяКласса()&nbsp;has private access in ИмяКласса</span></p>" );

        //___020_____________________________________________________________________________________________________________________
        array[20] = new ContentValues();
        array[20].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, о чем говорят ключевые слова “this”, “super”, где и как их можно использовать?</h1>");
        array[20].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>super — используется для обращения к базовому классу, а this к текущему. Пример:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Animal&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;animal&nbsp;eat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Dog&nbsp;<font color=\"#000000\">extends</font>&nbsp;Animal&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Dog&nbsp;eat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;thisEat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Call&nbsp;Dog.eat()&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">eat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;superEat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Call&nbsp;Animal.eat()&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">super</font>.<font color=\"#006633\">eat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dog&nbsp;dog&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dog.<font color=\"#006633\">eat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dog.<font color=\"#006633\">thisEat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dog.<font color=\"#006633\">superEat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "Dog&nbsp;eat<br/>\n" +
                "Call&nbsp;Dog.<font color=\"#006633\">eat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "Dog&nbsp;eat<br/>\n" +
                "Call&nbsp;Animal.<font color=\"#006633\">eat</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "animal&nbsp;eat" +
                "<p>Если написать super(), то будет вызван конструктор базового класса, а если this(), то конструктор текущего класса. Это можно использовать, например, при вызове конструктора с параметрами:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;A&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;name<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Call&nbsp;empty&nbsp;constructor&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">name</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;name,&nbsp;<font color=\"#003399\">Double</font>&nbsp;weight<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font><font color=\"#009900\">&#40;</font>name<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">weight</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;weight<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Call&nbsp;constructor&nbsp;with&nbsp;Name&nbsp;and&nbsp;Weight&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "..<br/>\n" +
                "&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;Dog&nbsp;dog1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;name&quot;</font>,&nbsp;<font color=\"#cc66cc\">25.0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Вывод&nbsp;</font><br/>\n" +
                "Call&nbsp;constructor&nbsp;with&nbsp;<font color=\"#003399\">Name</font><br/>\n" +
                "Call&nbsp;constructor&nbsp;with&nbsp;<font color=\"#003399\">Name</font>&nbsp;and&nbsp;Weight" );

        //___021_____________________________________________________________________________________________________________________
        array[21] = new ContentValues();
        array[21].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое сигнатура метода?</h1>");
        array[21].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Сигнатура метода в Java — это имя метода плюс параметры (причем порядок параметров имеет значение)." +
                "В сигнатуру метода не входит возвращаемое значение, бросаемые им исключения, а также модификаторы.</p>"+
                "<p>Ключевые слова public, protected, private, abstract, static, final, synchronized, native, strictfp в т.ч. аннотации для метода — это модификаторы и не являются частью сигнатуры.</p>" );

        //___022_____________________________________________________________________________________________________________________
        array[22] = new ContentValues();
        array[22].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие методы называются перегруженными?</h1>");
        array[22].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Java позволяет создавать несколько методов с одинаковыми именами, но разными сигнатурами. Создание метода с тем же именем, но с другим набором параметров называется перегрузкой. Какой из перегруженных методов должен выполняться при вызове, Java определяет на основе фактических параметров.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;str<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font>" );

        //___023_____________________________________________________________________________________________________________________
        array[23] = new ContentValues();
        array[23].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, могут ли нестатические методы перегрузить статические?</h1>");
        array[23].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Да. Это будут просто два разных метода для программы. Статический будет доступен по имени класса.</p>");

        //___024_____________________________________________________________________________________________________________________
        array[24] = new ContentValues();
        array[24].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы расказать про переопределение методов? Могут ли быть переопределены статические методы?</h1>");
        array[24].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Метод в классе-наследнике, совпадающий по сигнатуре с методом из родительского класса называется переопределенным методом. Переопределить базовый статический метод нельзя: <span style=\"color: #ff0000;\">Instance method имяМетода in классНаследник cannot override method имяМетода in родительскийКласс</span></p>");

        //___025_____________________________________________________________________________________________________________________
        array[25] = new ContentValues();
        array[25].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, может ли метод принимать разное количество параметров (аргументы переменной длины)?</h1>");
        array[25].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Да. Запись имеет вид <span style=\"color: #ff0000;\">method(type … val)</span>. Например <span style=\"color: #ff0000;\">public void method(String … strings)</span>, где <span style=\"color: #ff0000;\">strings</span> это массив, т.е. можно записать</p>" +
                "&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;method&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;...&nbsp;<font color=\"#006633\">strings</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;s&nbsp;<font color=\"#339933\">:</font>&nbsp;strings<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>");

        //___026_____________________________________________________________________________________________________________________
        array[26] = new ContentValues();
        array[26].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, можно ли сузить уровень доступа/тип возвращаемого значения при переопределении метода?</h1>");
        array[26].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>При переопределении метода нельзя сузить модификатор доступа к методу (например с public в MainClass до private в Class extends MainClass). Изменить тип возвращаемого значения при переопределении&nbsp;метода нельзя, будет ошибка <span style=\"color: #ff0000;\">attempting to use incompatible return type.&nbsp;</span>Но можно сузить возвращаемое значение, если они совместимы. Например:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Animal&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Animal&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;animal&nbsp;eat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">Long</font>&nbsp;calc<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Dog&nbsp;<font color=\"#000000\">extends</font>&nbsp;Animal&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Dog&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">/*attempting&nbsp;to&nbsp;use&nbsp;incompatible&nbsp;return&nbsp;type<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Integer&nbsp;calc()&nbsp;{<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;null;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;}<br/>\n" +
                "*/</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___027_____________________________________________________________________________________________________________________
        array[27] = new ContentValues();
        array[27].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие преобразования называются нисходящими и восходящими?</h1>");
        array[27].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Преобразование от потомка к предку называется восходящим, от предка к потомку — нисходящим. Нисходящее преобразование должно указываться явно с помощью указания нового типа в скобках.</p>" +
                "<p>Например:</p>" +
                "Animal&nbsp;dog&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Dog<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//восходящее&nbsp;преобразование.&nbsp;Будет&nbsp;потерян&nbsp;доступ&nbsp;ко&nbsp;всем&nbsp;методам,&nbsp;которые&nbsp;есть&nbsp;только&nbsp;у&nbsp;класса&nbsp;Dog.</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;y&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;x<font color=\"#339933\">;</font>&nbsp;&nbsp;<font color=\"#666666\">//нисходящее&nbsp;преобразование.&nbsp;Должно&nbsp;быть&nbsp;указано&nbsp;явно</font>");

        //___028_____________________________________________________________________________________________________________________
        array[28] = new ContentValues();
        array[28].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, чем отличается переопределение от перегрузки?</h1>");
        array[28].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Переопределение используется тогда, когда вы переписываете (переделываете, переопределяете) УЖЕ существующий метод. Перегрузка — это использование одного имени, но с разными входными параметрами. Например нам нужно, чтобы метод toString() для нашего класса выдавал какой-то осмысленный текст. Тогда мы переопределяем метод из класса Object и реализуем этот метод так, как нам это нужно.</p>" +
                "@Override<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;toString<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;Хочу&nbsp;чтобы&nbsp;писался&nbsp;текст,&nbsp;а&nbsp;не&nbsp;название&nbsp;класса@2234SD!&quot;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Тогда как перегрузка обычно используется, чтобы не придумывать каждый раз новое имя, когда методы отличаются только входными параметрами. При перегрузке необходимый метод определяется на этапе компиляции на основе сигнатуры вызываемого метода, тогда как при переопределении нужный метод будет выявлен во время выполнения исходя из реального типа объекта.</p>");

        //___029_____________________________________________________________________________________________________________________
        array[29] = new ContentValues();
        array[29].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, зачем нужен оператор instanceof?</h1>");
        array[29].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Оператор instanceof возвращает true, если объект является экземпляром класса или его потомком.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;MainClass&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;a<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;s&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;Hello&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;g<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>s&nbsp;<font color=\"#000000\">instanceof</font>&nbsp;java.<font color=\"#006633\">lang</font>.<font color=\"#003399\">String</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;попадем&nbsp;сюда,&nbsp;т.к.&nbsp;выражение&nbsp;будет&nbsp;true</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;s&nbsp;is&nbsp;a&nbsp;String&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#000000\">instanceof</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;это&nbsp;отобразится,&nbsp;т.к.&nbsp;будет&nbsp;использована&nbsp;автоупаковка&nbsp;(int&nbsp;-&gt;&nbsp;Integer)</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;i&nbsp;is&nbsp;an&nbsp;Integer&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>g&nbsp;<font color=\"#000000\">instanceof</font>&nbsp;java.<font color=\"#006633\">lang</font>.<font color=\"#003399\">String</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;g&nbsp;не&nbsp;инициализирована&nbsp;и&nbsp;поэтому&nbsp;сюда&nbsp;мы&nbsp;не&nbsp;попадем,&nbsp;т.к.</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;g&nbsp;-&nbsp;null&nbsp;и&nbsp;instanceof&nbsp;вернет&nbsp;false&nbsp;для&nbsp;null.&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;g&nbsp;is&nbsp;a&nbsp;String&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___030_____________________________________________________________________________________________________________________
        array[30] = new ContentValues();
        array[30].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, зачем нужны и какие бывают блоки инициализации?</h1>");
        array[30].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Блоки инициализации представляют собой наборы выражений инициализации полей, заключенные в фигурные скобки и размещаемые внутри класса вне объявлений методов или конструкторов. Блок инициализации выполняется так же, как если бы он был расположен в верхней части тела любого конструктора. Если блоков инициализации несколько, они выполняются в порядке следования в тексте класса. Блок инициализации способен генерировать исключения, если их объявления перечислены в предложениях throws всех конструкторов класса.</p>" +
                "<p>Бывают статические и нестатические блоки инициализации. Так же возможно создать такой блок в анонимном классе.</p>" +
                "<font color=\"#000000\">class</font>&nbsp;Foo&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t<font color=\"#000000\">static</font>&nbsp;List<font color=\"#339933\">&lt;</font>Character<font color=\"#339933\">&gt;</font>&nbsp;abc<font color=\"#339933\">;</font><br/>\n" +
                "\t<font color=\"#000000\">static</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t\tabc&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;LinkedList<font color=\"#339933\">&lt;</font>Character<font color=\"#339933\">&gt;</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t\t<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">char</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">'A'</font><font color=\"#339933\">;</font>&nbsp;c&nbsp;<font color=\"#339933\">&lt;=</font>&nbsp;<font color=\"#0000ff\">'Z'</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#339933\">++</font>c<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t\t\tabc.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font>&nbsp;c&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t\t<font color=\"#009900\">&#125;</font><br/>\n" +
                "\t<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Пример&nbsp;нестатического&nbsp;блока&nbsp;инициализации</font><br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;Bar&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t\t<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Bar:&nbsp;новый&nbsp;экземпляр&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Пример&nbsp;инициализации&nbsp;в&nbsp;анонимном&nbsp;классе</font><br/>\n" +
                "<font color=\"#003399\">JFrame</font>&nbsp;frame&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">JFrame</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "\tadd<font color=\"#009900\">&#40;</font><font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">JPanel</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "\t\tadd<font color=\"#009900\">&#40;</font><font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">JLabel</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Хабрахабр?&quot;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "\t\t\tsetBackground<font color=\"#009900\">&#40;</font><font color=\"#003399\">Color</font>.<font color=\"#006633\">BLACK</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t\t\tsetForeground<font color=\"#009900\">&#40;</font><font color=\"#003399\">Color</font>.<font color=\"#006633\">WHITE</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t\t<font color=\"#009900\">&#125;</font><font color=\"#009900\">&#125;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "\t<font color=\"#009900\">&#125;</font><font color=\"#009900\">&#125;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>");

        //___031_____________________________________________________________________________________________________________________
        array[31] = new ContentValues();
        array[31].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, зачем нужны и какие бывают блоки инициализации?</h1>");
        array[31].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Сначала вызываются все статические блоки от первого предка до последнего наследника. Потом попарно вызываются динамический блок инициализации и конструктор в той же последовательности (от предка до последнего потомка).</p>" +
                "<p>Хорошая картинка, демонстрирующая что происходит на самом деле при инициализации с ресурса javarush.ru:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Pet&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Static&nbsp;block&nbsp;in&nbsp;Pet&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;First&nbsp;block&nbsp;in&nbsp;Pet&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Second&nbsp;block&nbsp;in&nbsp;Pet&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Pet<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Pet&nbsp;empty&nbsp;constructor&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Pet<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;name<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Pet&nbsp;constructor&nbsp;with&nbsp;Name&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;name<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">name</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Cat&nbsp;<font color=\"#000000\">extends</font>&nbsp;Pet&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Static&nbsp;block&nbsp;in&nbsp;Cat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;First&nbsp;block&nbsp;in&nbsp;Cat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Second&nbsp;block&nbsp;in&nbsp;Cat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Cat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Cat&nbsp;empty&nbsp;constructor&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Cat<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;name<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">super</font><font color=\"#009900\">&#40;</font>name<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;without&nbsp;this&nbsp;will&nbsp;call&nbsp;super().&nbsp;Если&nbsp;эту&nbsp;строчку&nbsp;убрать,&nbsp;то&nbsp;будет&nbsp;вызван&nbsp;конструктор&nbsp;Pet();</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Cat&nbsp;constructor&nbsp;with&nbsp;Name:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;name<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">this</font>.<font color=\"#006633\">name</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;name<font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "<font color=\"#009900\">&#125;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;TestInitOrder&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;<br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cat&nbsp;cat&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;Cat<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Rizhick&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                        "<font color=\"#009900\">&#125;</font><br/>\n" +
                        "<font color=\"#666666\">//Вывод</font><br/>\n" +
                        "<font color=\"#000000\">Static</font>&nbsp;block&nbsp;in&nbsp;Pet<br/>\n" +
                        "<font color=\"#000000\">Static</font>&nbsp;block&nbsp;in&nbsp;Cat<br/>\n" +
                        "First&nbsp;block&nbsp;in&nbsp;Pet<br/>\n" +
                        "Second&nbsp;block&nbsp;in&nbsp;Pet<br/>\n" +
                        "Pet&nbsp;constructor&nbsp;with&nbsp;<font color=\"#003399\">Name</font>&nbsp;Rizhick<br/>\n" +
                        "First&nbsp;block&nbsp;in&nbsp;Cat<br/>\n" +
                        "Second&nbsp;block&nbsp;in&nbsp;Cat<br/>\n" +
                        "Cat&nbsp;constructor&nbsp;with&nbsp;<font color=\"#003399\">Name</font><font color=\"#339933\">:</font>&nbsp;Rizhick"
                );

        //___032_____________________________________________________________________________________________________________________
        array[32] = new ContentValues();
        array[32].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, где и для чего используется модификатор abstract?</h1>");
        array[32].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Абстрактным называется класс, на основе которого не могут создаваться объекты. При этом наследники класса могут быть не абстрактными, на их основе объекты создавать, соответственно, можно. Для того, чтобы превратить класс в абстрактный перед его именем надо указать модификатор abstract.</p>" +
                "<p>Абстрактный метод — метод, который не имеет реализации. Если в классе есть хотя бы один абстрактный метод, то весь класс должен быть объявлен абстрактным.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">abstract</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Fighter&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">abstract</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;fight<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;JudoFighter&nbsp;<font color=\"#000000\">extends</font>&nbsp;Fighter&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;@Override<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;fight<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Учу&nbsp;ушу,&nbsp;руками&nbsp;машу!&nbsp;Бью&nbsp;с&nbsp;лету&nbsp;в&nbsp;душу...&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Использование абстрактных классов и методов позволяет описать некую абстракцию, которая должна быть реализована в других классах. Например, мы можем создать абстрактный класс Fighter и объявить в нём абстрактный метод <span style=\"color: #ff0000;\">fight()</span>. Т.к. стилей борьбы может быть много, то,&nbsp;например, для <span style=\"color: #ff0000;\">JudoFighter extends Fighter</span>&nbsp;метод <span style=\"color: #ff0000;\">fight()</span> будет описывать приемы в стиле дзюдо и т.д.</p>");

        //___033_____________________________________________________________________________________________________________________
        array[33] = new ContentValues();
        array[33].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, можно ли объявить метод абстрактным и статическим одновременно?</h1>");
        array[33].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Нет. Получите: <span style=\"color: #ff0000;\">Illegal combination of modifiers: ‘abstract’ and ‘static’</span>. Модификатор abstract говорит, что метод будет реализован в другом классе, а static наоборот указывает, что этот метод будет доступен по имени класса.</p>");

        //___034_____________________________________________________________________________________________________________________
        array[34] = new ContentValues();
        array[34].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что означает ключевое поле static?</h1>");
        array[34].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Модификатор static говорит о том, что метод или поле класса принадлежат не объекту, а классу. Т.е. доступ можно будет получить и не создавая объекта класса. Поля помеченные static инициализируются при инициализации класса. К примеру,&nbsp;Class.forName(«MyClass», true, currentClassLoader), где второй параметр&nbsp;указывает на необходимость проведения&nbsp;инициализации.</p>\n" +
                "<p>На методы, объявленные как static, накладывается ряд ограничений.</p>\n" +
                "<ul>\n" +
                "<li>Они могут вызывать только другие статические методы.</li>\n" +
                "<li>Они должны осуществлять доступ только к статическим переменным.</li>\n" +
                "<li>Они не могут ссылаться на члены типа this или super.</li>\n" +
                "</ul>");

        //___035_____________________________________________________________________________________________________________________
        array[35] = new ContentValues();
        array[35].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, к каким конструкциям Java применим модификатор static?</h1>");
        array[35].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<ul>\n" +
                "<li>К методу.</li>\n" +
                "<li>К внутреннему классу.</li>\n" +
                "<li>К полю.</li>\n" +
                "<li>К импортируемым классам (с 5-ой java). Например,&nbsp;<span style=\"color: #ff0000;\">import static org.junit.Assert.assertThat;</span></li>\n" +
                "</ul>");

        //___036_____________________________________________________________________________________________________________________
        array[36] = new ContentValues();
        array[36].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что будет, если в static блоке кода возникнет исключительная ситуация?</h1>");
        array[36].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Если в явном виде написать любое исключение в <span style=\"color: #ff0000;\">static-блоке</span>, то компилятор не скомпилирует исходники. Это все от того, что компилятор умный. В остальном, взаимодействие с исключениями такое же как и в любом другом месте. Если <span style=\"color: #ff0000;\">unchecked</span> исключение вывалится в <span style=\"color: #ff0000;\">static-блоке</span>, то класс не будет инициализирован.<br>\n" +
                "Какое исключение выбрасывается при ошибке в блоке инициализации?</p>\n" +
                "<p>Для <span style=\"color: #ff0000;\">static</span>:</p>\n" +
                "<ul>\n" +
                "<li><span style=\"color: #ff0000;\">java.lang.ExceptionInInitializerError</span> — если исключение наследуется от <span style=\"color: #ff0000;\">RuntimeException</span>.</li>\n" +
                "</ul>\n" +
                "<p>Для <span style=\"color: #ff0000;\">init</span>:</p>\n" +
                "<ul>\n" +
                "<li><span style=\"color: #ff0000;\">exception</span>, который и вызвал исключение, если он наследуется от <span style=\"color: #ff0000;\">RuntimeException</span>.</li>\n" +
                "</ul>\n" +
                "<p>Верно для <span style=\"color: #ff0000;\">static </span>и <span style=\"color: #ff0000;\">init</span>:</p>\n" +
                "<ul>\n" +
                "<li><span style=\"color: #ff0000;\">java.lang.Error</span> — если исключение вызвано <span style=\"color: #ff0000;\">Error</span>.</li>\n" +
                "<li><span style=\"color: #ff0000;\">java.lang.ThreadDeath</span> — смерть потока. Ничего не вываливается.</li>\n" +
                "</ul>");


        //___037_____________________________________________________________________________________________________________________
        array[37] = new ContentValues();
        array[37].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, можно ли перегрузить static метод?</h1>");
        array[37].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Перегрузить можно, но переопределить нельзя.</p>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Animal&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;animal&nbsp;eat&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;Animal&nbsp;eat<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;s<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;test&nbsp;static&nbsp;overload&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>");

        //___038_____________________________________________________________________________________________________________________
        array[38] = new ContentValues();
        array[38].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое статический класс, какие особенности его использования?</h1>");
        array[38].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Это вложенный класс, который может обращаться только к статическим полям обертывающего его класса, в том числе и приватным. Доступ к нестатическим полям обрамляющего класса может быть осуществлен только через ссылку на экземпляр обрамляющего объекта. <strong>К</strong> <strong>классу высшего уровня</strong>&nbsp;модификатор <span style=\"color: #ff0000;\">static</span> <strong>неприменим</strong>.</p>" +
                "<p>В примере показано, что для инициализации внутреннего статического класса нет нужды в инициализации родителя. Но в случае обычного внутреннего класса такой номер не пройдет:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*will&nbsp;fail&nbsp;-&nbsp;compilation&nbsp;error,&nbsp;you&nbsp;need&nbsp;an&nbsp;instance&nbsp;of&nbsp;Test&nbsp;to&nbsp;instantiate&nbsp;A*/</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;A&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;A<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*will&nbsp;compile&nbsp;successfully,&nbsp;no&nbsp;instance&nbsp;of&nbsp;Test&nbsp;is&nbsp;needed&nbsp;to&nbsp;instantiate&nbsp;B&nbsp;*/</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;B&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;B<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Статические вложенные классы, не имеют доступа к нестатическим полям и методам обрамляющего класса, что в некотором роде аналогично статическим методам, объявленным внутри класса. Доступ к нестатическим полям и методам может осуществляться только через ссылку на экземпляр обрамляющего класса. В этом плане static nested классы очень похожи на любые другие классы верхнего уровня.</p>");

        //___039_____________________________________________________________________________________________________________________
        array[39] = new ContentValues();
        array[39].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, о чем говорит ключевое слово final?</h1>");
        array[39].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Может быть применено к полям, методам или классам. В зависимости к какой сущности приложено данное ключевое слово — будет и различный смысл в его применении.</p>\n" +
                "<ul>\n" +
                "<li>Для класса. Класс помеченный при помощи <span style=\"color: #ff0000;\">final</span> не может иметь наследников.</li>\n" +
                "<li>Для метода. Метод помеченный при помощи <span style=\"color: #ff0000;\">final </span>не может быть переопределен в классах наследниках.</li>\n" +
                "<li>Для поля. Поле помеченное при помощи слова <span style=\"color: #ff0000;\">final </span>не может изменить свое значение после инициализации (инициализируется либо при описании, либо в конструкторе/статическом блоке).</li>\n" +
                "<li>Значение локальных переменных, а так же параметров метода помеченных при помощи слова <span style=\"color: #ff0000;\">final </span>не могут быть изменены после присвоения.</li>\n" +
                "</ul>");

        //___040_____________________________________________________________________________________________________________________
        array[40] = new ContentValues();
        array[40].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы дать определение понятию “интерфейс”?</h1>");
        array[40].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Ключевое слово <b>interface</b> используется для создания полностью абстрактных классов. Создатель интерфейса определяет имена методов, списки аргументов и типы возвращаемых значений, но не тела методов.</p>\n" +
                "<p>Наличие слова <b>interface</b> означает, что именно так должны выглядеть все классы, которые реализуют данный интерфейс. Таким образом, любой код, использующий конкретный интерфейс, знает только то, какие методы вызываются для этого интерфейса, но не более того.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">interface</font>&nbsp;SomeName<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;getSum<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___041_____________________________________________________________________________________________________________________
        array[41] = new ContentValues();
        array[41].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие классы называются анонимными?</h1>");
        array[41].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Вложенный класс — это класс, который объявлен внутри объявления другого класса. Вложенные классы делятся на статические и нестатические (non-static). Собственно нестатические вложенные классы имеют и другое название — внутренние классы (inner classes).</p>\n" +
                "<p>Внутренние классы в Java делятся на такие три вида:</p>\n" +
                "<ul>\n" +
                "<li>внутренние классы-члены (member inner classes);</li>\n" +
                "<li>локальные классы (local classes);</li>\n" +
                "<li>анонимные классы (anonymous classes).</li>\n" +
                "</ul>\n" +
                "<p>Внутренние классы-члены ассоциируются не с самим внешним классом, а с его экземпляром. При этом они имеют доступ ко всем его полям и методам.</p>\n" +
                "<p>Локальные классы (local classes) определяются в блоке Java кода. На практике чаще всего объявление происходит в методе некоторого другого класса. Хотя объявлять локальный класс можно внутри статических и нестатических блоков инициализации.</p>\n" +
                "<p>Анонимный класс (anonymous class) — это локальный класс без имени.</p>\n" +
                "<p>Использование вложенных классов всегда приводит к некоторому нарушению инкапсуляции — вложенный класс может обращаться к закрытым членам внешнего класса (но не наоборот!). Если это обстоятельство учитывается в архитектуре вашего приложения, не стоит уделять ему особого внимания, поскольку внутренний класс всего лишь является специализированным членом внешнего класса.</p>");

        //___042_____________________________________________________________________________________________________________________
        array[42] = new ContentValues();
        array[42].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, каким образом из вложенного класса получить доступ к полю внешнего класса?</h1>");
        array[42].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Если вложенный класс не статический и поле не статическое, то можно просто обратиться к этому полю из внутреннего класса, если только у внутреннего класса не существует поля с таким же литералом, в этом случае нужно обраться через ссылку на внешний класс так — <span style=\"color: #ff0000;\">OuterClass.this.имяПоля</span></p>\n" +
                "<p>*Из комментария к статье: достаточно, чтобы класс был не статическим, а поле статическое или нет — значения не имеет для Member Inner Class.</p>");

        //___043_____________________________________________________________________________________________________________________
        array[43] = new ContentValues();
        array[43].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, каким образом из вложенного класса получить доступ к полю внешнего класса?</h1>");
        array[43].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Если вложенный класс не статический и поле не статическое, то можно просто обратиться к этому полю из внутреннего класса, если только у внутреннего класса не существует поля с таким же литералом, в этом случае нужно обраться через ссылку на внешний класс так — <span style=\"color: #ff0000;\">OuterClass.this.имяПоля</span></p>\n" +
                "<p>*Из комментария к статье: достаточно, чтобы класс был не статическим, а поле статическое или нет — значения не имеет для Member Inner Class.</p>");

        //___044_____________________________________________________________________________________________________________________
        array[44] = new ContentValues();
        array[44].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, каким образом можно обратиться к локальной переменной метода из анонимного класса, объявленного в теле этого метода? Есть ли какие-нибудь ограничения для такой переменной?</h1>");
        array[44].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Также как и локальные классы, анонимные могут захватывать переменные, доступ к локальным переменным происходит по тем же правилам:</p>\n" +
                "<ul>\n" +
                "<li>Анонимный класс имеет доступ к полям внешнего класса.</li>\n" +
                "<li>Анонимный класс не имеет доступ к локальным переменным области, в которой он определен, если они не финальные (final) или неизменяемые (effectively final).</li>\n" +
                "<li>Как и у других внутренних классов, объявление переменной с именем, которое уже занято, затеняет предыдущее объявление.</li>\n" +
                "</ul>\n" +
                "<ul>\n" +
                "<li>Вы не можете определять статические члены анонимного класса.</li>\n" +
                "</ul>\n" +
                "<p>Анонимные классы также могут содержать в себе локальные классы. Конструктора в анонимном классе быть не может.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Animal&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Integer</font>&nbsp;classAreaVar2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">25</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;anonymousClassTest<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">final</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;localAreaVar&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">25</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//Анонимный&nbsp;класс</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">ActionListener</font>&nbsp;listener&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">ActionListener</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;actionPerformed<font color=\"#009900\">&#40;</font><font color=\"#003399\">ActionEvent</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//можно&nbsp;использовать&nbsp;переменные&nbsp;класса&nbsp;без&nbsp;указания&nbsp;final</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;classAreaVar2&nbsp;<font color=\"#339933\">=</font>&nbsp;classAreaVar2&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#cc66cc\">25</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//нельзя&nbsp;использовать&nbsp;локальные&nbsp;переменные,&nbsp;если&nbsp;они&nbsp;не&nbsp;final;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*Local&nbsp;variable&nbsp;is&nbsp;accessed&nbsp;from&nbsp;within&nbsp;inner&nbsp;class:&nbsp;needs&nbsp;to&nbsp;be&nbsp;declared&nbsp;final&nbsp;*/</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;localAreaVar<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">0</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;localAreaVar<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">0</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">+</font><font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___045_____________________________________________________________________________________________________________________
        array[45] = new ContentValues();
        array[45].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы рассказать про каждый из методов класса Object?</h1>");
        array[45].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<ul>\n" +
                "<li><span style=\"color: #ff0000;\">public final native Class getClass()</span>&nbsp;—&nbsp;возвращает в рантайме класс данного объекта.</li>\n" +
                "<li><span style=\"color: #ff0000;\">public native int hashCode()</span> — возвращает хеш-код</li>\n" +
                "<li><span style=\"color: #ff0000;\">public boolean equals(Object obj)</span> — сравнивает объекты.</li>\n" +
                "<li><span style=\"color: #ff0000;\">protected native Object clone() throws CloneNotSupportedException</span> — клонирование объекта</li>\n" +
                "<li><span style=\"color: #ff0000;\">public String toString()</span> — возвращает строковое представление объекта.</li>\n" +
                "<li><span style=\"color: #ff0000;\">public final native void notify()</span>&nbsp;—&nbsp;просыпается один поток, который ждет на “мониторе” данного объекта.</li>\n" +
                "<li><span style=\"color: #ff0000;\">public final native void notifyAll()</span>&nbsp;— просыпаются все потоки, которые ждут на “мониторе” данного объекта.</li>\n" +
                "<li><span style=\"color: #ff0000;\">public final native void wait(long timeout) throws InterruptedException</span></li>\n" +
                "<li><span style=\"color: #ff0000;\">public final void wait() throws InterruptedException</span>&nbsp;—&nbsp;приводит данный поток в ожидание, пока другой поток не вызовет <span style=\"color: #ff0000;\">notify()</span> или <span style=\"color: #ff0000;\">notifyAll()</span> методы для этого объекта.</li>\n" +
                "<li><span style=\"color: #ff0000;\">public final void wait(long timeout, int nanos) throws InterruptedException</span>&nbsp;—&nbsp;приводит данный поток в ожидание, пока другой поток не вызовет <span style=\"color: #ff0000;\">notify()</span> или <span style=\"color: #ff0000;\">notifyAll()</span> для этого метода, или пока не истечет указанный промежуток времени.</li>\n" +
                "<li><span style=\"color: #ff0000;\">protected void finalize() throws Throwable</span>&nbsp;— вызывается сборщиком мусора, когда garbage collector определил, что ссылок на объект больше нет.</li>\n" +
                "</ul>");

        //___046_____________________________________________________________________________________________________________________
        array[46] = new ContentValues();
        array[46].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, в чем особенность работы методов hashCode и equals? Каким образом реализованы методы hashCode и equals в классе Object? Какие правила и соглашения существуют для реализации этих методов? Когда они применяются?</h1>");
        array[46].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Метод, определенный в <span style=\"color: #ff0000;\">Object</span>, который служит для сравнение объектов на равенство. При сравнение объектов при помощи <span style=\"color: #ff0000;\">==</span> идет сравнение по ссылкам. При сравнении по <span style=\"color: #ff0000;\">equals()</span> идет сравнение по состояниям объектов (реализация метода equals для нового созданного класса ложится на плечи разработчиков).&nbsp;С точки зрения математики&nbsp;equals() обозначает отношение эквивалентности объектов. Эквивалентным называется отношение, которое является симметричным, транзитивным и рефлексивным.</p>\n" +
                "<ul>\n" +
                "<li><b>Рефлексивность</b>: для любого ненулевого x, x.equals(x) вернет true;</li>\n" +
                "<li><b>Транзитивность</b>: для любого ненулевого x, y и z, если x.equals(y) и y.equals(z) вернет true, тогда и x.equals(z) вернет true;</li>\n" +
                "<li><b>Симметричность:</b><b> </b>для любого ненулевого x и y, x.equals(y) должно вернуть true, тогда и только тогда, когда y.equals(x) вернет true<b>.</b></li>\n" +
                "<li>Также для любого ненулевого<b> </b>x, x.equals(null) должно вернуть false</li>\n" +
                "</ul>\n" +
                "<div>При переопределении equals() обязательно нужно переопределить&nbsp;метод hashCode(). Равные объекты должны возвращать одинаковые хэш коды.<b> </b></div>\n" +
                "<div></div>\n" +
                "<p>Хеш-код — это число. Если более точно, то это битовая строка фиксированной длины, полученная из массива произвольной длины. В терминах Java, хеш-код — это целочисленный результат работы метода, которому в качестве входного параметра передан объект.</p>\n" +
                "<p>Этот метод реализован таким образом, что для одного и того-же входного объекта, хеш-код всегда будет одинаковым. Следует понимать, что множество возможных хеш-кодов ограничено примитивным типом <span style=\"color: #ff0000;\">int</span>, а множество объектов ограничено только нашей фантазией. Отсюда следует утверждение: “Множество объектов мощнее множества хеш-кодов”. Из-за этого ограничения, вполне возможна ситуация, что хеш-коды разных объектов могут совпасть.</p>\n" +
                "<p>Здесь главное понять, что:</p>\n" +
                "<ul>\n" +
                "<li>Если хеш-коды разные, то и входные объекты гарантированно разные.</li>\n" +
                "<li>Если хеш-коды равны, то входные объекты не всегда равны.</li>\n" +
                "</ul>\n" +
                "<p>Ситуация, когда у <i>разных </i>объектов <i>одинаковые </i>хеш-коды называется — коллизией. Вероятность возникновения коллизии зависит от используемого алгоритма генерации хеш-кода.</p>");

        //___047_____________________________________________________________________________________________________________________
        array[47] = new ContentValues();
        array[47].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что будет, если переопределить equals не переопределяя hashCode? Какие могут возникнуть проблемы?</h1>");
        array[47].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Нарушится контракт. Классы и методы, которые использовали правила этого контракта могут некорректно работать. Так для объекта <span style=\"color: #ff0000;\">HashMap</span> это может привести к тому, что пара, которая была помещена в Map&nbsp;возможно не будет найдена в ней при обращении к Map, если используется новый экземпляр ключа.</p>");

        //___048_____________________________________________________________________________________________________________________
        array[48] = new ContentValues();
        array[48].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, чем отличается абстрактный класс от интерфейса, в каких случаях что вы будете использовать?</h1>");
        array[48].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Абстрактные классы используются только тогда, когда есть «is a» тип отношений; интерфейсы могут быть реализованы классами которые не связаны друг с другом.</p>\n" +
                "<p>Абстрактный класс может реализовывать методы; интерфейс может реализовывать статические методы и начиная с 8й версии.</p>\n" +
                "<p>Интерфейс может описывать константы и методы. Все методы интерфейса по умолчанию являются публичными (public) и абстрактными (abstract), а поля — public static final. С java 8 в интерфейсах можно реализовывать default и статические методы.</p>\n" +
                "<p>В Java класс может наследоваться (реализовывать) от многих интерфейсов, но только от одного абстрактного класса.</p>\n" +
                "<p>С абстрактными классами вы теряете индивидуальность класса, наследующего его; с интерфейсами вы просто расширяете функциональность каждого класса.</p>");


        //___049_____________________________________________________________________________________________________________________
        array[49] = new ContentValues();
        array[49].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое volatile и transient и для чего и в каких случаях можно было бы использовать default?</h1>");
        array[49].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p><span style=\"color: #ff0000;\">volatile &nbsp;</span>— не используется кэш (имеется ввиду область памяти в которой JVM может сохранять локальную копию переменной, чтобы уменьшить время обращения к переменной) при обращении к полю. Для volatile переменной JVM гарантирует синхронизацию для операций чтения/записи, но не гарантирует для операций изменения значения переменной.</p>\n" +
                "<p><span style=\"color: #ff0000;\">transient</span> — указание того, что при сериализации/десериализации данное поле не нужно сериализовать/десериализовывать.</p>");

        //___050_____________________________________________________________________________________________________________________
        array[50] = new ContentValues();
        array[50].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, о расширении модификаторов при наследовании, переопределение и сокрытие методов. Если у класса-родителя есть метод, объявленный как private, может ли наследник расширить его видимость? А если protected? А сузить видимость?</h1>");
        array[50].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Действует общий принцип: расширять видимость можно, сужать нельзя. <span style=\"color: #ff0000;\">private&nbsp;</span>методы видны только внутри класса, для потомков они не видны. Поэтому их и расширить нельзя.</p>");

        //___051_____________________________________________________________________________________________________________________
        array[51] = new ContentValues();
        array[51].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, имеет ли смысл объявлять метод private final?</h1>");
        array[51].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Нет, такой метод и так не виден для наследников, а значит не может быть ими переопределен.</p>");

        //___052_____________________________________________________________________________________________________________________
        array[52] = new ContentValues();
        array[52].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие особенности инициализации final переменных?</h1>");
        array[52].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<ul>\n" +
                "<li>Для поля. Поле помеченное при помощи слова <span style=\"color: #ff0000;\">final</span> не может изменить свое значение после инициализации.<br>\n" +
                "Не статическое final поле можно инициализировать: при описании, в конструкторе (во всех), в статическом блоке, в динамическом блоке.<br>\n" +
                "Статическое final поле (static final) инициализируется либо в статическом блоке, либо при описании.</li>\n" +
                "<li>Значение локальных переменных, а так же параметров метода помеченных при помощи слова <span style=\"color: #ff0000;\">final</span> не могут быть изменены после присвоения.</li>\n" +
                "</ul>");

        //___053_____________________________________________________________________________________________________________________
        array[53] = new ContentValues();
        array[53].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, что такое finalize? Зачем он нужен? Можете ли вы рассказать о сборщике мусора и алгоритмах его работы?</h1>");
        array[53].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Метод <span style=\"color: #ff0000;\">finalize()</span> вызывается перед тем, как объект будет удален garbage collector (сборщик мусора, далее&nbsp;<span style=\"color: #ff0000;\">gc</span>). Существует много различных реализаций <span style=\"color: #ff0000;\">gc</span>. Основа работы следующая, <span style=\"color: #ff0000;\">gc </span>помечает объекты на которых больше не ссылаются другие объекты для их удаления. Затем на одном из проходов помеченные объекты удаляются.<br>\n" +
                "Вызов<span style=\"color: #ff0000;\"> finalize()</span> не гарантируется, т.к. приложение может быть завершено до того, как будет запущена ещё одна сборка мусора. Да, можно отменить сборку объекта с помощью метода <span style=\"color: #ff0000;\">finalize()</span>, присвоив его ссылку какому-то статистическому методу.</p>");

        //___054_____________________________________________________________________________________________________________________
        array[54] = new ContentValues();
        array[54].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, почему метод clone объявлен как protected? Что необходимо для реализации клонирования?</h1>");
        array[54].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Это указывает на то, что хоть метод и есть в классе <span style=\"color: #ff0000;\">Object</span>, но если им разработчик желает воспользоваться, то его нужно переопределить. Для этого нужно реализовать интерфейс <span style=\"color: #ff0000;\">Clonable</span>, чтобы соблюсти контракт.</p>");

        //___055_____________________________________________________________________________________________________________________
        array[55] = new ContentValues();
        array[55].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы дать определение понятию “исключение”?</h1>");
        array[55].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p><strong>Исключение </strong>— это проблема(ошибка) возникающая во время выполнения программы. Исключения могут возникать во многих случаях, например:</p>\n" +
                "<ol>\n" +
                "<li>Пользователь ввел некорректные данные.</li>\n" +
                "<li>Файл, к которому обращается программа, не найден.</li>\n" +
                "<li>Сетевое соединение с сервером было утеряно во время передачи данных. И т.д.</li>\n" +
                "</ol>\n" +
                "<p>Все исключения в Java являются объектами. Поэтому они могут порождаться не только автоматически при возникновении исключительной ситуации, но и создаваться самим разработчиком.</p>");

        //___056_____________________________________________________________________________________________________________________
        array[56] = new ContentValues();
        array[56].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какова иерархия исключений?</h1>");
        array[56].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Исключения делятся на несколько классов, но все они имеют общего предка — класс Throwable. Его потомками являются подклассы Exception и Error.</p>\n" +
                "<p>Исключения (Exceptions) являются результатом проблем в программе, которые в принципе решаемы и предсказуемы. Например, произошло деление на ноль в целых числах.</p>\n" +
                "<p>Ошибки (Errors) представляют собой более серьёзные проблемы, которые, согласно спецификации Java, не следует пытаться обрабатывать в собственной программе, поскольку они связаны с проблемами уровня JVM. Например, исключения такого рода возникают, если закончилась память, доступная виртуальной машине. Программа дополнительную память всё равно не сможет обеспечить для JVM.</p>\n" +
                "<p>В Java все исключения делятся на два&nbsp;типа: контролируемые исключения (checked) и неконтролируемые исключения (unchecked), к которым относятся ошибки (Errors) и исключения времени выполнения (RuntimeExceptions, потомок класса Exception).</p>\n" +
                "<p>Контролируемые исключения представляют собой ошибки, которые можно и нужно обрабатывать в программе, к этому типу относятся все потомки класса Exception (но не RuntimeException).</p>");

        //___057_____________________________________________________________________________________________________________________
        array[57] = new ContentValues();
        array[57].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, какие существуют способы обработки исключений?</h1>");
        array[57].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p><b>В Java есть пять ключевых слов для работы с исключениями:</b></p>\n" +
                "<p><strong>try </strong>— данное ключевое слово используется для отметки начала блока кода, который потенциально может привести к ошибке.</p>\n" +
                "<p><strong>catch </strong>— ключевое слово для отметки начала блока кода, предназначенного для перехвата и обработки исключений.</p>\n" +
                "<p><strong>finally </strong>— ключевое слово для отметки начала блока кода, которой является дополнительным. Этот блок помещается после последнего блока ‘catch’. Управление обычно передаётся в блок ‘finally’ в любом случае.</p>\n" +
                "<p><strong>throw </strong>— служит для генерации исключений.</li>\n" +
                "<p><strong>throws </strong>— ключевое слово, которое прописывается в сигнатуре метода, и обозначающее что метод потенциально может выбросить исключение с указанным типом.</p>\n" +
                "<p>Общий вид конструкции для «поимки» исключительной ситуации выглядит следующим образом:</p>" +
                "<font color=\"#000000\">try</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "<font color=\"#666666\">//здесь&nbsp;код,&nbsp;который&nbsp;потенциально&nbsp;может&nbsp;привести&nbsp;к&nbsp;ошибке&nbsp;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">catch</font><font color=\"#009900\">&#40;</font>SomeException&nbsp;e&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#666666\">//в&nbsp;скобках&nbsp;указывается&nbsp;класс&nbsp;конкретной&nbsp;ожидаемой&nbsp;ошибки&nbsp;&nbsp;</font><br/>\n" +
                "<font color=\"#666666\">//здесь&nbsp;описываются&nbsp;действия,&nbsp;направленные&nbsp;на&nbsp;обработку&nbsp;исключений&nbsp;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">finally</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "<font color=\"#666666\">//выполняется&nbsp;в&nbsp;любом&nbsp;случае&nbsp;(&nbsp;блок&nbsp;finally&nbsp;&nbsp;не&nbsp;обязателен)&nbsp;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___058_____________________________________________________________________________________________________________________
        array[58] = new ContentValues();
        array[58].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, о чем говорит ключевое слово throws?</h1>");
        array[58].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p><b>throws</b> — ключевое слово, которое прописывается в сигнатуре метода, и обозначающее что метод потенциально может выбросить исключение с указанным типом.</p>");

        //___059_____________________________________________________________________________________________________________________
        array[59] = new ContentValues();
        array[59].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, в чем особенность блока finally и всегда ли он исполняется?</h1>");
        array[59].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Когда исключение передано, выполнение метода направляется по нелинейному пути. Это может стать источником проблем. Например, при входе метод открывает файл и закрывает при выходе. Чтобы закрытие файла не было пропущено из-за обработки исключения, был предложен механизм <b>finally</b>.</p>\n" +
                "<p>Ключевое слово <b>finally</b> создаёт блок кода, который будет выполнен после завершения блока <b>try/catch</b>, но перед кодом, следующим за ним. Блок будет выполнен, независимо от того, передано исключение или нет. Оператор <b>finally</b> не обязателен, однако каждый оператор <b>try</b> требует наличия либо <b>catch</b>, либо <b>finally</b>. Код в блоке <strong>finally</strong> будет выполнен <strong>всегда</strong>.</p>");

        //___060_____________________________________________________________________________________________________________________
        array[60] = new ContentValues();
        array[60].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, может ли не быть ни одного блока catch при отлавливании исключений?</h1>");
        array[60].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Такая запись допустима, если имеется связка try{} finally {}. Но смысла в такой записи не так много, всё же лучше иметь блок catch в котором будет обрабатываться необходимое исключение.</p>" +
                "<font color=\"#003399\">String</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;z&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;x<font color=\"#339933\">=</font><font color=\"#0000ff\">&quot;234&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">finally</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;Finally&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___061_____________________________________________________________________________________________________________________
        array[61] = new ContentValues();
        array[61].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, может ли не быть ни одного блока catch при отлавливании исключений?</h1>");
        array[61].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Не всегда. Например в такой ситуации:</p>" +
                "<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">exit</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">Exception</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;e.<font color=\"#006633\">printStackTrace</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">finally</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font>" +
                "<p>Здесь finally недостижим, так как происходит системный выход из программы. Общими словами: когда jvm умирает, ей не до finally (отсюда можете придумать другие примеры как убить jvm и ответить на вопрос в заголовке).</p>");

        //___062_____________________________________________________________________________________________________________________
        array[62] = new ContentValues();
        array[62].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы ответить, может ли один блок catch отлавливать несколько исключений (с одной и разных веток наследований)?</h1>");
        array[62].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>В Java 7 стала доступна новая конструкция, с помощью которой можно перехватывать несколько исключений одни блоком catch:</p>" +
                "<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;...&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#003399\">IOException</font>&nbsp;<font color=\"#339933\">|</font>&nbsp;<font color=\"#003399\">SQLException</font>&nbsp;ex&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;logger.<font color=\"#006633\">log</font><font color=\"#009900\">&#40;</font>ex<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;<font color=\"#000000\">throw</font>&nbsp;ex<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>");

        //___063_____________________________________________________________________________________________________________________
        array[63] = new ContentValues();
        array[63].put(DatabaseHelperYesNo.MULTY_QUESTION_COLUMN, "<h1>Можете ли вы рассказать об обрабатываемых и не обрабатываемых (catched/uncatched) исключениях?</h1>");
        array[63].put(DatabaseHelperYesNo.MULTY_ARTICLE, "<h1>Ответ:</h1>" +
                "<p>Все исключительные ситуации делятся на «проверяемые» (checked) и «непроверяемые» (unchecked) (смотрите картинку вначале статьи). Это свойство присуще «корневищу» (Throwable, Error, Exception, RuntimeException) и передается по наследству. Никак не видимо в исходном коде класса исключения.<br>\n" +
                "В дальнейших примерах просто учтите, что— Throwable и Exception и все их наследники (за исключением наследников Error-а и RuntimeException-а) — checked<br>\n" +
                "— Error и RuntimeException и все их наследники — unchecked<br>\n" +
                "checked exception = проверяемое исключение, проверяемое компилятором.</p>\n" +
                "<p>Тема достаточно обширная для того, чтобы уместить ее в одном ответе. К примеру, можно разобрать примеры Головача:&nbsp;http://habrahabr.ru/company/golovachcourses/blog/225585/</p>\n" +
                "<p>И еще с quizful.net</p>\n" +
                "<p>1. Checked исключения, это те, которые должны обрабатываться блоком catch или описываться в сигнатуре метода. Unchecked могут не обрабатываться и не быть описанными.<br>\n" +
                "2. Unchecked исключения в Java — наследованные от RuntimeException, checked — от Exception (не включая unchecked).</p>\n" +
                "<p>Checked исключения отличаются от Unchecked исключения в Java, тем что:<br>\n" +
                "1)Наличие\\обработка <strong>Checked</strong> исключения проверяются <strong>на этапе компиляции</strong>. Наличие\\обработка <strong>Unchecked</strong> исключения происходит <strong>на этапе выполнения</strong>.</p>");





    }
}