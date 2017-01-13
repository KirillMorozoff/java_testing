package com.example.kmorozov001.javatesting;

import android.content.ContentValues;

public class addTypeInInfo {

    ContentValues[] array;

    public  void adding()
    {
        // Создание новой строки
        array = new ContentValues[47];
        for(int i = 0; i < 47; i++){
            array[i] = new ContentValues();
        }

        array[0] = new ContentValues();
        // Задайте значения для каждого столбца
        array[0].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Дан следующий класс: </h1>" +
                "<font color = \"blue\">public class</font> Main { <br>" +
                "    <font color = \"blue\">public static void</font> main(String[] args) { <br>" +
                "        <font color = \"teal\">// TODO code application logic here </font><br>" +
                "    } <br>" +
                "} " +
                "<h1>Укажите полное название пакета, который был автоматически импортирован.</h1>");
        array[0].put(DatabaseHelperTypeIn.ANSWER_1, "java.lang");
        array[0].put(DatabaseHelperTypeIn.ANSWER_2, "java.lang.*");
        array[0].put(DatabaseHelperTypeIn.ANSWER_3, "java.lang.*;");
        array[0].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Для запоминания это:</h1>" +
                "По умолчанию в каждое приложение будет автоматически импортирован пакет java.lang<br>");

        //___001_____________________________________________________________________________________________________________________
        array[1] = new ContentValues();
        array[1].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой оператор позволяет принудительно выбросить исключение?</h1>");
        array[1].put(DatabaseHelperTypeIn.ANSWER_1, "throw");
        array[1].put(DatabaseHelperTypeIn.ANSWER_2, "throw new Exception();");
        array[1].put(DatabaseHelperTypeIn.ANSWER_3, "Throw");
        array[1].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Оператор throw используется для возбуждения исключения «вручную». Для того чтобы сделать это, нужно иметь объект подкласса класса Throwable, который можно либо получить как параметр оператора catch, либо создать с помощью оператора new. Ниже приведена общая форма оператора throw:</p>" +
                "<font color=\"#000000\">throw</font>&nbsp;ОбъектТипа&nbsp;<font color=\"#003399\">Throwable</font><font color=\"#339933\">;</font>&nbsp;" +
                "<p>При достижении этого оператора нормальное выполнение кода немедленно прекращается, так что следующий за ним оператор не выполняется. Ближайший окружающий блок try проверяется на наличие соответствующего возбужденному исключению обработчика catch. Если такой отыщется, управление передается ему. Если нет, то проверяется следующий из вложенных операторов try и так до тех пор, пока либо не будет найден подходящий раздел catch, либо обработчик исключений исполняющей системы Java не остановит программу, выведя при этом состояние стека вызовов. Ниже приведен пример, в котором сначала создается объект-исключение, затем оператор throw возбуждает исключительную ситуацию, после чего то же исключение возбуждается повторно — на этот раз уже кодом перехватившего его в первый раз раздела catch.</p>" +
                "<font color=\"#000000\">class</font>&nbsp;ThrowDemo&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;demoproc<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">throw</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">NullPointerException</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;demo&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">NullPointerException</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;caught&nbsp;inside&nbsp;demoproc&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">throw</font>&nbsp;e<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;args<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;demoproc<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">catch</font><font color=\"#009900\">&#40;</font>NulPointerException&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;recaught:&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;e<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;" +
                "<p>В этом примере обработка исключения проводится в два приема. Метод main создает контекст для исключения и вызывает demoproc. Метод demoproc также устанавливает контекст для обработки исключения, создает новый объект класса NullPointerException и с помощью оператора throw возбуждает это исключение. Исключение перехватывается в следующей строке внутри метода demoproc, причем объект-исключение доступен коду обработчика через параметр «е». Код обработчика выводит сообщение о том, что возбуждено исключение, а затем снова возбуждает его с помощью оператора throw, в результате чего оно передается обработчику исключений в методе main. Ниже приведен результат, полученный при запуске этого примера.</p>" +
                "<p><b>С:\\> java ThrowDemo<br>" +
                "caught inside demoproc<br>" +
                "recaught: java.lang.NullPointerException: demo </b></p>");

       //___002_____________________________________________________________________________________________________________________
        array[2] = new ContentValues();
        array[2].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Если оператор return содержится и в блоке catch и в finally, какой из них “главнее”?</h1>");
        array[2].put(DatabaseHelperTypeIn.ANSWER_1, "finally");
        array[2].put(DatabaseHelperTypeIn.ANSWER_2, "Finally");
        array[2].put(DatabaseHelperTypeIn.ANSWER_3, "FINALLY");
        array[2].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Вернется из блока finally.</p>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;what&nbsp;<font color=\"#339933\">=</font>&nbsp;&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>what<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;SomeString&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">finally</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;Finally&nbsp;message&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Вывод</font><br/>\n" +
                "<font color=\"#000000\">Finally</font>&nbsp;message");


       //___003_____________________________________________________________________________________________________________________
        array[3] = new ContentValues();
        array[3].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>К какому типу checked или unchecked относится SQLException?</h1>");
        array[3].put(DatabaseHelperTypeIn.ANSWER_1, "checked");
        array[3].put(DatabaseHelperTypeIn.ANSWER_2, "Checked");
        array[3].put(DatabaseHelperTypeIn.ANSWER_3, "CHECKED");
        array[3].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>SQLException предоставляет информацию об ошибках доступа к базе данных или других ошибках связанных с работой с базами данных.</p>" +
                "<p>SQLException относится к checked исключениям, а значит проверяется на этапе компиляции.</p>" +
                "<p>Споры об этом типе исключения идут о том, что разработчику приходится постоянно обрабатывать это исключение в коде, хотя большая часть ошибок возникает во время выполнения программы, т.е., по мнению многих, лучше бы отнести его к unchecked runtime исключениям.</p>" +
                "<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;make&nbsp;some&nbsp;SQL&nbsp;call(s)</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#003399\">SQLException</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;log&nbsp;the&nbsp;exception</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;and&nbsp;give&nbsp;up</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Аргумент Joshua Bloch из Effective Java Second Edition такой: сделав SQLException проверяемым — это попытка заставить разработчиков обработать исключение и обернуть его в новом уровне абстракции.</p>");

       //___004_____________________________________________________________________________________________________________________
        array[4] = new ContentValues();
        array[4].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод обрезает пробелы в конце строки?</h1>");
        array[4].put(DatabaseHelperTypeIn.ANSWER_1, "trim");
        array[4].put(DatabaseHelperTypeIn.ANSWER_2, "String.Trim");
        array[4].put(DatabaseHelperTypeIn.ANSWER_3, "trim()");
        array[4].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<font color=\"#003399\">String</font>&nbsp;s&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;a&nbsp;&nbsp;&nbsp;&nbsp;&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>s.<font color=\"#006633\">trim</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;b&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//ab</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>s&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;b&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//a&nbsp;&nbsp;&nbsp;&nbsp;b</font>");

       //___005_____________________________________________________________________________________________________________________
        array[5] = new ContentValues();
        array[5].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод позволяет получить часть строки?</h1>");
        array[5].put(DatabaseHelperTypeIn.ANSWER_1, "substring");
        array[5].put(DatabaseHelperTypeIn.ANSWER_2, "String.Substring");
        array[5].put(DatabaseHelperTypeIn.ANSWER_3, "substring(int beginIndex, int lastIndex)");
        array[5].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Метод substring(int beginIndex, int lastIndex) — возвращает часть строки по указанным индексам.</p>" +
                "<font color=\"#003399\">String</font>&nbsp;fs&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;123456789&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font>&nbsp;sub&nbsp;<font color=\"#339933\">=</font>&nbsp;fs.<font color=\"#006633\">subSequence</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">3</font>,<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font>&nbsp;sub2&nbsp;<font color=\"#339933\">=</font>&nbsp;fs.<font color=\"#006633\">substring</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">3</font>,<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>sub2<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//456</font>");

       //___006_____________________________________________________________________________________________________________________
        array[6] = new ContentValues();
        array[6].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод позволяет разбить строку на подстроки по заданному разделителю?</h1>");
        array[6].put(DatabaseHelperTypeIn.ANSWER_1, "split");
        array[6].put(DatabaseHelperTypeIn.ANSWER_2, "Split");
        array[6].put(DatabaseHelperTypeIn.ANSWER_3, "split(String regex)");
        array[6].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Мы можем использовать метод split(String regex) для разделения строки на массив строк, используя в качестве разделителя регулярное выражение. Метод split(String regex, int numOfStrings) является перегруженным методом для разделения строки на заданное количество строк. Мы можем использовать обратную черту для использования специальных символов регулярных выражений в качестве обычных символов.</p>" +
                "<font color=\"#003399\">String</font>&nbsp;line&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;I&nbsp;am&nbsp;a&nbsp;java&nbsp;developer&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;words&nbsp;<font color=\"#339933\">=</font>&nbsp;line.<font color=\"#006633\">split</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;&nbsp;&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;twoWords&nbsp;<font color=\"#339933\">=</font>&nbsp;line.<font color=\"#006633\">split</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;&nbsp;&quot;</font>,&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;String&nbsp;split&nbsp;with&nbsp;delimiter:&nbsp;&quot;</font><font color=\"#339933\">+</font><font color=\"#003399\">Arrays</font>.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font>words<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//String&nbsp;split&nbsp;with&nbsp;delimiter:&nbsp;[I,&nbsp;am,&nbsp;a,&nbsp;java,&nbsp;developer]</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;String&nbsp;split&nbsp;into&nbsp;two:&nbsp;&quot;</font><font color=\"#339933\">+</font><font color=\"#003399\">Arrays</font>.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font>twoWords<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//String&nbsp;split&nbsp;into&nbsp;two:&nbsp;[I,&nbsp;am&nbsp;a&nbsp;java&nbsp;developer]</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#666666\">//split&nbsp;string&nbsp;delimited&nbsp;with&nbsp;special&nbsp;characters</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#003399\">String</font>&nbsp;wordsWithNumbers&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;I|am|a|java|developer&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;numbers&nbsp;<font color=\"#339933\">=</font>&nbsp;wordsWithNumbers.<font color=\"#006633\">split</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;<font color=\"#000099\">\\\\</font>|&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;String&nbsp;split&nbsp;with&nbsp;special&nbsp;character:&nbsp;&quot;</font><font color=\"#339933\">+</font>&nbsp;<font color=\"#003399\">Arrays</font>.<font color=\"#006633\">toString</font><font color=\"#009900\">&#40;</font>numbers<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><font color=\"#666666\">//String&nbsp;split&nbsp;with&nbsp;special&nbsp;character:&nbsp;[I,&nbsp;am,&nbsp;a,&nbsp;java,&nbsp;developer]</font>");

       //___007_____________________________________________________________________________________________________________________
        array[7] = new ContentValues();
        array[7].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В каком пакете лежат классы-потоки?</h1>");
        array[7].put(DatabaseHelperTypeIn.ANSWER_1, "java.io");
        array[7].put(DatabaseHelperTypeIn.ANSWER_2, "java.io.*");
        array[7].put(DatabaseHelperTypeIn.ANSWER_3, "java.io.*;");
        array[7].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Классы потоков ввода\\вывода лежат в java.io; С JDK 7 добавлен более современный способ работы с потоками — Java NIO. Классы лежат в java.nio. Для работы с архивами используются классы из пакета java.util.</p>");

       //___008_____________________________________________________________________________________________________________________
        array[8] = new ContentValues();
        array[8].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой класс предназначен для работы с элементами файловой системы (ЭФС)?</h1>");
        array[8].put(DatabaseHelperTypeIn.ANSWER_1, "File");
        array[8].put(DatabaseHelperTypeIn.ANSWER_2, "file");
        array[8].put(DatabaseHelperTypeIn.ANSWER_3, "java.io.file");
        array[8].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>В отличие от большинства классов ввода/вывода, класс File работает не с потоками, а непосредственно с файлами. Данный класс позволяет получить информацию о файле: права доступа, время и дата создания, путь к каталогу. А также осуществлять навигацию по иерархиям подкаталогов. Класс java.io.File может представлять имя определённого файла, а также имена группы файлов, находящихся в каталоге. Если класс представляет каталог, то его метод list() возвращает массив строк с именами всех файлов.</p>" +
                "<p><b>Для создания объектов класса File можно использовать один из следующих конструкторов:</b></p>" +
                "<p>File(File dir, String name) — указывается объект класса File (каталог) и имя файла</p>"+
                "<p>File(String path) — указывается путь к файлу без указания имени файла</p>"+
                "<p>File(String dirPath, Sring name) — указывается путь к файлу и имя файла</p>"+
                "<p>File(URI uri) — указывается объекта URI, описывающий файл</p>"
                );

       //___009_____________________________________________________________________________________________________________________
        array[9] = new ContentValues();
        array[9].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод позволяет выбрать все ЭФС определенного каталога по критерию (например, с определенным расширением)?</h1>");
        array[9].put(DatabaseHelperTypeIn.ANSWER_1, "file.listfiles()");
        array[9].put(DatabaseHelperTypeIn.ANSWER_2, "listfiles");
        array[9].put(DatabaseHelperTypeIn.ANSWER_3, "listfiles()");
        array[9].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Метод File.listFiles() возвращает массив объектов File, содержащихся в каталоге. Метод может принимать в качестве параметра объект класса, реализующего FileFilter. Это позволяет включить список только те элементы, для которые метода accept возвращает true (критерием может быть длина имени файла или его расширение).</p>" +
                "<p><font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;FileDemo&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">File</font>&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">File</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;paths<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font><font color=\"#009900\">&#123;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;create&nbsp;new&nbsp;file</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">File</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;c:/test&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;returns&nbsp;pathnames&nbsp;for&nbsp;files&nbsp;and&nbsp;directory</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;paths&nbsp;<font color=\"#339933\">=</font>&nbsp;f.<font color=\"#006633\">listFiles</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;for&nbsp;each&nbsp;pathname&nbsp;in&nbsp;pathname&nbsp;array</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">File</font>&nbsp;path<font color=\"#339933\">:</font>paths<font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;prints&nbsp;file&nbsp;and&nbsp;directory&nbsp;paths</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>path<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#000000\">catch</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">Exception</font>&nbsp;e<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;if&nbsp;any&nbsp;error&nbsp;occurs</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.<font color=\"#006633\">printStackTrace</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"
        );

        //___010_____________________________________________________________________________________________________________________
        array[10] = new ContentValues();
        array[10].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой интерфейс применяется для проверки, попадает ли объект File под некоторое условие?</h1>");
        array[10].put(DatabaseHelperTypeIn.ANSWER_1, "filefilter");
        array[10].put(DatabaseHelperTypeIn.ANSWER_2, "filefilter()");
        array[10].put(DatabaseHelperTypeIn.ANSWER_3, "FileFilter");
        array[10].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Интерфейс <span style=\"color: #ff0000;\">FileFilter</span> применяется для проверки, попадает ли объект <span style=\"color: #ff0000;\">File</span> под некоторое условие. Этот интерфейс содержит единственный метод <span style=\"color: #ff0000;\">boolean accept(File pathName)</span>. Этот метод необходимо переопределить и реализовать. Например:</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">boolean</font>&nbsp;accept<font color=\"#009900\">&#40;</font><font color=\"#003399\">File</font>&nbsp;file<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>file.<font color=\"#006633\">isDirectory</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">true</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">else</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;path&nbsp;<font color=\"#339933\">=</font>&nbsp;file.<font color=\"#006633\">getAbsolutePath</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">toLowerCase</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font>,&nbsp;n&nbsp;<font color=\"#339933\">=</font>&nbsp;extensions.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;n<font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;extension&nbsp;<font color=\"#339933\">=</font>&nbsp;extensions<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#40;</font>path.<font color=\"#006633\">endsWith</font><font color=\"#009900\">&#40;</font>extension<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">&amp;&amp;</font>&nbsp;<font color=\"#009900\">&#40;</font>path.<font color=\"#006633\">charAt</font><font color=\"#009900\">&#40;</font>path.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#339933\">-</font>&nbsp;extension.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">-</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#0000ff\">'.'</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">true</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">false</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//OR</font><br/>\n" +
                "<font color=\"#003399\">String</font>&nbsp;yourPath&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;insert&nbsp;here&nbsp;your&nbsp;path..&quot;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">File</font>&nbsp;directory&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">File</font><font color=\"#009900\">&#40;</font>yourPath<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;myFiles&nbsp;<font color=\"#339933\">=</font>&nbsp;directory.<font color=\"#006633\">list</font><font color=\"#009900\">&#40;</font><font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">FilenameFilter</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">boolean</font>&nbsp;accept<font color=\"#009900\">&#40;</font><font color=\"#003399\">File</font>&nbsp;directory,&nbsp;<font color=\"#003399\">String</font>&nbsp;fileName<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;fileName.<font color=\"#006633\">endsWith</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;.txt&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"
        );

        //___011_____________________________________________________________________________________________________________________
        array[11] = new ContentValues();
        array[11].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод запускает поток на выполнение?</h1>");
        array[11].put(DatabaseHelperTypeIn.ANSWER_1, "thread.start()");
        array[11].put(DatabaseHelperTypeIn.ANSWER_2, "start()");
        array[11].put(DatabaseHelperTypeIn.ANSWER_3, "start");
        array[11].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Thread.start() запускает дочерний поток. Для интерфейса Callable запуск потока осуществляется с помощью метода submit().</p>"
        );

        //___012_____________________________________________________________________________________________________________________
        array[12] = new ContentValues();
        array[12].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод приостанавливает выполнение потока?</h1>");
        array[12].put(DatabaseHelperTypeIn.ANSWER_1, "thread.start()");
        array[12].put(DatabaseHelperTypeIn.ANSWER_2, "start()");
        array[12].put(DatabaseHelperTypeIn.ANSWER_3, "start");
        array[12].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Thread.sleep() — статический метод класса Thread, который приостанавливает выполнение потока, в котором он был вызван. Во время выполнения метода sleep() система перестает выделять потоку процессорное время, распределяя его между другими потоками. Метод sleep() может выполняться либо заданное кол-во времени (миллисекунды или наносекунды) либо до тех пор пока он не будет остановлен прерыванием (в этом случае он сгенерирует исключение InterruptedException).\n" +
                "\n" +
                "Возможно вопрос про старые методы suspend, stop и resume — они deprecated.</p>"
        );

        //___013_____________________________________________________________________________________________________________________
        array[13] = new ContentValues();
        array[13].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод приостанавливает выполнение потока?</h1>");
        array[13].put(DatabaseHelperTypeIn.ANSWER_1, "thread.sleep()");
        array[13].put(DatabaseHelperTypeIn.ANSWER_2, "sleep()");
        array[13].put(DatabaseHelperTypeIn.ANSWER_3, "sleep");
        array[13].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Thread.sleep() — статический метод класса Thread, который приостанавливает выполнение потока, в котором он был вызван. Во время выполнения метода sleep() система перестает выделять потоку процессорное время, распределяя его между другими потоками. Метод sleep() может выполняться либо заданное кол-во времени (миллисекунды или наносекунды) либо до тех пор пока он не будет остановлен прерыванием (в этом случае он сгенерирует исключение InterruptedException).\n" +
                "\n" +
                "Возможно вопрос про старые методы suspend, stop и resume — они deprecated.</p>"
        );

        //___014_____________________________________________________________________________________________________________________
        array[14] = new ContentValues();
        array[14].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод переводит поток в режим ожидания?</h1>");
        array[14].put(DatabaseHelperTypeIn.ANSWER_1, "thread.wait()");
        array[14].put(DatabaseHelperTypeIn.ANSWER_2, "wait()");
        array[14].put(DatabaseHelperTypeIn.ANSWER_3, "wait");
        array[14].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>У метода wait() есть три вариации. Один метод wait() бесконечно ждет другой поток, пока не будет вызван метод notify() или notifyAll() на объекте. Другие две вариации метода wait() ставят текущий поток в ожидание на определенное время. По истечении этого времени поток просыпается и продолжает работу.</p>"
        );

        //___015_____________________________________________________________________________________________________________________
        array[15] = new ContentValues();
        array[15].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой метод пробуждает один из потоков, который вызвал метод wait() у этого монитора?</h1>");
        array[15].put(DatabaseHelperTypeIn.ANSWER_1, "thread.notify()");
        array[15].put(DatabaseHelperTypeIn.ANSWER_2, "notify()");
        array[15].put(DatabaseHelperTypeIn.ANSWER_3, "notify");
        array[15].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Метод notify пробуждает один из потоков, который вызвал метод wait() у этого монитора. Метод notifyAll пробуждает все потоки. Очередность выполнения в этом случае будет определятся приоритетом потока.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;NotifyClass&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#003399\">List</font>&nbsp;synchedList<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;NotifyClass<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;create&nbsp;a&nbsp;new&nbsp;synchronized&nbsp;list&nbsp;to&nbsp;be&nbsp;used</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;synchedList&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">Collections</font>.<font color=\"#006633\">synchronizedList</font><font color=\"#009900\">&#40;</font><font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">LinkedList</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;method&nbsp;used&nbsp;to&nbsp;remove&nbsp;an&nbsp;element&nbsp;from&nbsp;the&nbsp;list</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;removeElement<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">throws</font>&nbsp;<font color=\"#003399\">InterruptedException</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font>synchedList<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;while&nbsp;the&nbsp;list&nbsp;is&nbsp;empty,&nbsp;wait</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>synchedList.<font color=\"#006633\">isEmpty</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;List&nbsp;is&nbsp;empty...&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;synchedList.<font color=\"#006633\">wait</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Waiting...&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;element&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#41;</font>&nbsp;synchedList.<font color=\"#006633\">remove</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;element<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;method&nbsp;to&nbsp;add&nbsp;an&nbsp;element&nbsp;in&nbsp;the&nbsp;list</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;addElement<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;element<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Opening...&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#009900\">&#40;</font>synchedList<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;add&nbsp;an&nbsp;element&nbsp;and&nbsp;notify&nbsp;all&nbsp;that&nbsp;an&nbsp;element&nbsp;exists</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;synchedList.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font>element<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;New&nbsp;Element:'&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;element&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;'&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;synchedList.<font color=\"#006633\">notifyAll</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;notifyAll&nbsp;called!&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Closing...&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">final</font>&nbsp;NotifyClass&nbsp;demo&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;NotifyClass<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Runnable</font>&nbsp;runA&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Runnable</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;run<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;item&nbsp;<font color=\"#339933\">=</font>&nbsp;demo.<font color=\"#006633\">removeElement</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;item<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">InterruptedException</font>&nbsp;ix<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Interrupted&nbsp;Exception!&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">Exception</font>&nbsp;x<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Exception&nbsp;thrown.&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Runnable</font>&nbsp;runB&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Runnable</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;run&nbsp;adds&nbsp;an&nbsp;element&nbsp;in&nbsp;the&nbsp;list&nbsp;and&nbsp;starts&nbsp;the&nbsp;loop</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;run<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;demo.<font color=\"#006633\">addElement</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Hello!&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>&nbsp;threadA1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Thread</font><font color=\"#009900\">&#40;</font>runA,&nbsp;<font color=\"#0000ff\">&quot;A&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadA1.<font color=\"#006633\">start</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>.<font color=\"#006633\">sleep</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">500</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>&nbsp;threadA2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Thread</font><font color=\"#009900\">&#40;</font>runA,&nbsp;<font color=\"#0000ff\">&quot;B&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadA2.<font color=\"#006633\">start</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>.<font color=\"#006633\">sleep</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">500</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>&nbsp;threadB&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Thread</font><font color=\"#009900\">&#40;</font>runB,&nbsp;<font color=\"#0000ff\">&quot;C&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadB.<font color=\"#006633\">start</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>.<font color=\"#006633\">sleep</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">1000</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadA1.<font color=\"#006633\">interrupt</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadA2.<font color=\"#006633\">interrupt</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">InterruptedException</font>&nbsp;x<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Вывод</font><br/>\n" +
                "<font color=\"#003399\">List</font>&nbsp;is&nbsp;empty...<br/>\n" +
                "<font color=\"#003399\">List</font>&nbsp;is&nbsp;empty...<br/>\n" +
                "<font color=\"#006633\">Opening</font>...<br/>\n" +
                "<font color=\"#000000\">New</font>&nbsp;<font color=\"#003399\">Element</font><font color=\"#339933\">:</font><font color=\"#0000ff\">'Hello!'</font><br/>\n" +
                "notifyAll&nbsp;called<font color=\"#339933\">!</font><br/>\n" +
                "Closing...<br/>\n" +
                "<font color=\"#006633\">Waiting</font>...<br/>\n" +
                "<font color=\"#006633\">Waiting</font>...<br/>\n" +
                "<font color=\"#003399\">List</font>&nbsp;is&nbsp;empty...<br/>\n" +
                "<font color=\"#006633\">Hello</font><font color=\"#339933\">!</font><br/>\n" +
                "Interrupted&nbsp;<font color=\"#003399\">Exception</font><font color=\"#339933\">!</font>"
        );

        //___016_____________________________________________________________________________________________________________________
        array[16] = new ContentValues();
        array[16].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В результате какого метода поток приостанавливает свою работу и ждет окончания работы второго потока?</h1>");
        array[16].put(DatabaseHelperTypeIn.ANSWER_1, "thread.join()");
        array[16].put(DatabaseHelperTypeIn.ANSWER_2, "join()");
        array[16].put(DatabaseHelperTypeIn.ANSWER_3, "join");
        array[16].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Одна нить (поток) может вызвать метод join() у другой нити. В результате первый поток (который вызвал метод) приостанавливает свою работу и ждет окончания работы второго потока (у объекта которого был вызван метод join()).</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;TestClass&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>&nbsp;threadExample&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Thread</font><font color=\"#009900\">&#40;</font><font color=\"#000000\">new</font>&nbsp;JoinClass<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadExample.<font color=\"#006633\">start</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;threadExample.<font color=\"#006633\">join</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//public&nbsp;static&nbsp;void&nbsp;TestClass.main()&nbsp;connect&nbsp;to&nbsp;threadExample&nbsp;and&nbsp;wait&nbsp;it.</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">InterruptedException</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.<font color=\"#006633\">printStackTrace</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;END:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#003399\">Calendar</font>.<font color=\"#006633\">getInstance</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getTime</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;JoinClass&nbsp;<font color=\"#000000\">implements</font>&nbsp;<font color=\"#003399\">Runnable</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;@Override<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;run<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;JoinClass.run()&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#003399\">Calendar</font>.<font color=\"#006633\">getInstance</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getTime</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">try</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Thread</font>.<font color=\"#006633\">sleep</font><font color=\"#009900\">&#40;</font>5000L<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">catch</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">InterruptedException</font>&nbsp;e<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;e.<font color=\"#006633\">printStackTrace</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;afterSleep&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#003399\">Calendar</font>.<font color=\"#006633\">getInstance</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">getTime</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#666666\">//Вывод</font><br/>\n" +
                "JoinClass.<font color=\"#006633\">run</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;Tue&nbsp;Jan&nbsp;<font color=\"#cc66cc\">19</font>&nbsp;00<font color=\"#339933\">:</font>00<font color=\"#339933\">:</font><font color=\"#cc66cc\">37</font>&nbsp;MSK&nbsp;<font color=\"#cc66cc\">2016</font><br/>\n" +
                "afterSleep&nbsp;Tue&nbsp;Jan&nbsp;<font color=\"#cc66cc\">19</font>&nbsp;00<font color=\"#339933\">:</font>00<font color=\"#339933\">:</font><font color=\"#cc66cc\">42</font>&nbsp;MSK&nbsp;<font color=\"#cc66cc\">2016</font><br/>\n" +
                "END<font color=\"#339933\">:</font>&nbsp;Tue&nbsp;Jan&nbsp;<font color=\"#cc66cc\">19</font>&nbsp;00<font color=\"#339933\">:</font>00<font color=\"#339933\">:</font><font color=\"#cc66cc\">42</font>&nbsp;MSK&nbsp;<font color=\"#cc66cc\">2016</font>" +
                "<p>После запуска метода <span style=\"color: #ff0000;\">main</span> создается главный поток класса <span style=\"color: #ff0000;\">TestClass</span>.</p>"+
                "<p>Затем мы создаем тестовый поток <span style=\"color: #ff0000;\">threadExample</span> и запускаем его.Заставляем поток протупить 5 секунд внутри метода <span style=\"color: #ff0000;\">JoinClass.run().</span></p>"+
                "<p>После чего вызываем метод <span style=\"color: #ff0000;\">join() </span>у второго потока. В этот момент главный поток подсоединяется к нашему второму потоку и ждет его завершения.</p>"+
                "<p>Смотрим какое прошло время — 5 секунд. Т.е. главный поток ждал пока завершиться <span style=\"color: #ff0000;\">threadExample</span> до перехода к методу <span style=\"color: #ff0000;\">System.out.println()</span>. В противном случае <span style=\"color: #ff0000;\">System.out.println(«END: «)</span>&nbsp;выполнился сразу без ожидания пока отойдет threadExample.</p>"
                     );

        //___017_____________________________________________________________________________________________________________________
        array[17] = new ContentValues();
        array[17].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой cтатический метод заставляет процессор переключиться на обработку других потоков системы?</h1>");
        array[17].put(DatabaseHelperTypeIn.ANSWER_1, "thread.yield()");
        array[17].put(DatabaseHelperTypeIn.ANSWER_2, "yield()");
        array[17].put(DatabaseHelperTypeIn.ANSWER_3, "yield");
        array[17].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Статический метод Thread.yield() заставляет процессор переключиться на обработку других потоков системы. Метод может быть полезным, например, когда поток ожидает наступления какого-либо события и необходимо чтобы проверка его наступления происходила как можно чаще. В этом случае можно поместить проверку события и метод Thread.yield() в цикл:</p>" +
                "<font color=\"#666666\">//Ожидание&nbsp;поступления&nbsp;сообщения</font><br/>\n" +
                "<font color=\"#000000\">while</font><font color=\"#009900\">&#40;</font><font color=\"#339933\">!</font>msgQueue.<font color=\"#006633\">hasMessages</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>\t\t<font color=\"#666666\">//Пока&nbsp;в&nbsp;очереди&nbsp;нет&nbsp;сообщений</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "\t<font color=\"#003399\">Thread</font>.<font color=\"#006633\">yield</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>\t\t<font color=\"#666666\">//Передать&nbsp;управление&nbsp;другим&nbsp;потокам</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"
        );

        //___018_____________________________________________________________________________________________________________________
        array[18] = new ContentValues();
        array[18].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как называется набор нитей, которые могут содержать в себе другие группы потоков?</h1>");
        array[18].put(DatabaseHelperTypeIn.ANSWER_1, "threadgroup ");
        array[18].put(DatabaseHelperTypeIn.ANSWER_2, "thread group");
        array[18].put(DatabaseHelperTypeIn.ANSWER_3, "threadgroup");
        array[18].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>При программировании многопоточных приложений с использованием библиотечных классов полезно организовать взаимосвязанные потоки в группы, что позволит управлять ими как единым целым и накладывать ограничения на способность потоков, принадлежащих группе, выполнять те или иные действия. </p>\n" +
                "<p>Потоки объединяются в <i>группы потоков </i>(thread groups) по соображениям улучшения управляемости и безопасности. Одна группа потоков может принадлежать другой группе, составляя иерархию с основной (системной) группой на верхнем уровне. Потоки, относящиеся к группе, могут управляться единовременно – вы вправе прервать работу сразу всех потоков группы либо установить для них единое максимальное значение приоритета выполнения. Группы потоков могут быть использованы также для определения доменов безопасности. Потоки внутри группы обычно наделены возможностями взаимного влияния, распространяемого и на потоки вложенных групп. Говоря о \"влиянии\", мы подразумеваем, что вызов любого метода способен воздействовать на характеристики Поведения потока, скажем, изменять его приоритет или осуществлять прерывание. В рамках конкретного приложения, однако, бывает необходимо определить политику безопасности, которая, в частности, должна препятствовать влиянию Потоков на потоки, не при надлежащие текущей группе. Потокам внутри отдельных групп могут быть даны различные права на выполнение тех или иных действий в рамках приложения, таких как операции ввода-вывода. </p>\n" +
                "<p>Вообще говоря, методы, затрагивающие функции безопасности, всегда загодя Проверяются соответствующим менеджером безопасности, установленным в системе. Если менеджер запрещает выполнение какого-либо действия, метод выбрасывает исключение типа SecurityException. По умолчанию при старте приложения менеджер безопасности не подключается. Если код выполняется в контексте другого приложения – как, например, аплет в Web-броузере, – вы не можете быть уверены, что некий менеджер безопасности, как правило, установлен и надежно функционирует. К числу действий, затрагивающих безопасность системы, относятся, в частности, операции по созданию потоков, управлению ими, осуществлению ввода-вывода и прерыванию работы приложений. За более подробными сведениями обращайтесь к разделу 18.5 на странице 509. </p>\n" +
                "<p>Каждый поток принадлежит определенной группе потоков. Каждая группа Потоков представляется объектом класса ThreadGroup, ограничивающим параметры Поведения \"СВОИХ\" потоков и предлагающим посреднические услуги при обращении R ним. Задать признак принадлежности потока группе можно при создании Потока, используя вызов соответствующего конструктора. По умолчанию каждый вновь созданный поток вводится в ту же группу, которой принадлежит поток- \"родитель\", если только в процесс не вмешается менеджер безопасности. Пусть, например, некоторый код, связанный с обработкой событий в аплете, создает новый поток. Тогда менеджер безопасности способен включить его в группу потоков аплета, но не в системную группу потоков, обрабатывающих события. Когда поток завершает работу, соответствующий объект Thread удаляется из группы и далее может быть передан в распоряжение сборщика мусора, если иные ссылки на него отсутствуют. </p>\n" +
                "<p>Существуют три разновидности конструкторов класса Thread, позволяющих определить принадлежность создаваемого потока тому или иному объекту типа ThreadGroup. Два из них были рассмотрены в разделе 10.2 на странице 247, при обсуждении интерфейса Runnablе, а третий описан ниже. </p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">Thread</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">ThreadGroup</font>&nbsp;group,&nbsp;<font color=\"#003399\">String</font>&nbsp;name<font color=\"#009900\">&#41;</font>&nbsp;" +
                "<p>Создает новый объект потока с заданным именем name, принадлежащий объекту группы потоков group. </p>\n" +
                "<p>Чтобы предотвратить вероятность присваивания созданных потоков произвольным группам (это способно ослабить механизм обеспечения безопасности), указанные конструкторы сами по себе могут выбрасывать исключение типа SecuгityException, если потоку-\"родителю\" не позволено размещать созданный поток в пределах некоторой группы. </p>\n" +
                "<p>После создания потока признак его принадлежности определенному объекту ThreadGroup изменить уже нельзя. Чтобы получить информацию о том, к какой группе относится поток, следует воспользоваться методом getThreadGroup. Для проверки того, допускает ли поток влияние извне (в том смысле, о котором было сказано выше), может применяться метод checkAccess, который генерирует исключение типа securityException, если делать это запрещено, и просто возвращает управление в противном случае (метод объявлен как void). </p>\n" +
                "<p>Группа потоков может быть <i>группои-демопом </i>(daemon group). Впрочем, это понятие никак не связано с концепцией <i>потоков-демопов. </i>\"Демонический\" объект ThreadGroup автоматически уничтожается, если он становится пустым. Задание признака принадлежности объекта ThreadGroup к категории группдемонов не имеет отношения к тому, является ли любой из потоков, принадлежащих группе, потоком-демоном. Признак воздействует на поведение группы потоков только в том случае, когда она становится пустой. </p>\n" +
                "<p>Объекты групп могут быть использованы также для задания верхней границы значений приоритетов потоков, относящихся к группе. После вызова метода setMaxpriогity с передачей ему соответствующего наибольшего допустимого значения приоритета любая попытка задания значения, превышающего установленный порог, сводится к повышению приоритета потока только до величины максимального уровня. Вызов метода не воздействует на характеристики существующих потоков. Чтобы обеспечить \"господство\" одного определенного потока группы над всеми другими (т.е. гарантировать, что его приоритет будет всегда заведомо выше остальных), достаточно вначале задать в качестве Приоритета этого потока наивысшее требуемое значение, а затем с помощью вызова setMaxpriогity установить верхнюю границу приоритетов остальных Потоков группы. Задаваемый предел применяется также к группе потоков как таковой. любая попытка задать новое наибольшее значение, превышающее текущее, будет сведена к повышению приоритета группы потоков только до ранее установленной величины максимального уровня. </p>" +
                "<font color=\"#000000\">static</font>&nbsp;<font color=\"#000000\">synchronized</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;maxThread<font color=\"#009900\">&#40;</font><font color=\"#003399\">Thread</font>&nbsp;thr,&nbsp;<font color=\"#000066\">int</font>&nbsp;priority<font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#003399\">ThreadGroup</font>&nbsp;grp&nbsp;<font color=\"#339933\">=</font>&nbsp;thr.<font color=\"#006633\">getThreadGroup</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "thr.<font color=\"#006633\">setPriority</font><font color=\"#009900\">&#40;</font>priority<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "grp.<font color=\"#006633\">setMaxPriority</font><font color=\"#009900\">&#40;</font>thr.<font color=\"#006633\">getPriority</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;–&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p>Приведенный выше метод предполагает задание требуемого значения приоритета потока, а затем – максимально допустимого приоритета группы потоков, меньшего, нежели установленный приоритет \"главного\" потока. Новое значение верхней границы приоритетов для группы на единицу меньше фактического приоритета потока; написать просто priority-1 не достаточно, поскольку ранее заданный верхний порог может ограничить наши возможности. Разумеется, в этом примере мы предполагаем, что ни один из потоков группы не обладает предварительно установленным большим приоритетом. </p>\n"
                  );

        //___019_____________________________________________________________________________________________________________________
        array[19] = new ContentValues();
        array[19].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как называется  управляемая коллекция потоков?</h1>");
        array[19].put(DatabaseHelperTypeIn.ANSWER_1, "threadpool");
        array[19].put(DatabaseHelperTypeIn.ANSWER_2, "thread pool");
        array[19].put(DatabaseHelperTypeIn.ANSWER_3, "threadpool");
        array[19].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Пулы потоков (нитей) представляют собой управляемую коллекцию потоков, которые доступны для выполнения различных задач. Пулы нитей, как правило, обеспечивают:</p>\n" +
                "<ul>\n" +
                "<li>Повышение производительности при выполнении большого количества задач в связи с сокращением накладных расходов на вызов каждой задачи.</li>\n" +
                "<li>Является средством ограничивающим расход ресурсов при выполнении набора задач.</li>\n" +
                "<li>Избавляют от необходимости управления жизненным циклом нитей.</li>\n" +
                "</ul>"
        );

        //___020_____________________________________________________________________________________________________________________
        array[20] = new ContentValues();
        array[20].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Скомпилируется ли следующий пример (да или нет)?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;StartClass&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">private</font>&nbsp;<font color=\"#000000\">final</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;DUMMY&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;DUMMY&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>DUMMY<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[20].put(DatabaseHelperTypeIn.ANSWER_1, "нет");
        array[20].put(DatabaseHelperTypeIn.ANSWER_2, "нет");
        array[20].put(DatabaseHelperTypeIn.ANSWER_3, "нет");
        array[20].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Из статического контекста нельзя обращаться к нестатическому.</p>"
        );

        //___021_____________________________________________________________________________________________________________________
        array[21] = new ContentValues();
        array[21].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено на консоль при вычислении следующего выражения?(true или false)</h1>" +
               "<font color=\"#000066\">int</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#339933\">++</font>x<font color=\"#339933\">==</font>x<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>");
        array[21].put(DatabaseHelperTypeIn.ANSWER_1, "true");
        array[21].put(DatabaseHelperTypeIn.ANSWER_2, "true");
        array[21].put(DatabaseHelperTypeIn.ANSWER_3, "true");
        array[21].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Пояснение: левый инкремент x срабатывает перед сравнением >>> x = 1</p>" +
                "<p>правый инкремент x срабатывает после сравнения >>> x = 1</p>"
        );

        //___022_____________________________________________________________________________________________________________________
        array[22] = new ContentValues();
        array[22].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Дано булево выражение:</h1>" +
               "<blockquote><font color=\"#b1b100\">not</font>&nbsp;A&nbsp;<font color=\"#b1b100\">or</font>&nbsp;A&nbsp;<font color=\"#b1b100\">and</font>&nbsp;<font color=\"#b1b100\">not</font>&nbsp;B</blockquote>" +
                "<h1>Чему равен результат при A=true и B=false?</h1>");
        array[22].put(DatabaseHelperTypeIn.ANSWER_1, "true");
        array[22].put(DatabaseHelperTypeIn.ANSWER_2, "true");
        array[22].put(DatabaseHelperTypeIn.ANSWER_3, "true");
        array[22].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Пояснение: Оператор NOT имеет наивысший приоритет и в первую очередь действует на операнд стоящий справа от него. Итого имеем not true or true and not false = false or true and true.\n" +
                "Далее по приоритету идет оператор AND, который воздействует на операнды слева и справа от себя. Итого получим: false or true and true = false or true.\n" +
                "В последнюю очередь работает оператор OR.</p>"
        );

        //___023_____________________________________________________________________________________________________________________
        array[23] = new ContentValues();
        array[23].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как называется операция со стеком, которая позволяет прочитать головной элемент?</h1>");
        array[23].put(DatabaseHelperTypeIn.ANSWER_1, "peek");
        array[23].put(DatabaseHelperTypeIn.ANSWER_2, "peek");
        array[23].put(DatabaseHelperTypeIn.ANSWER_3, "peek");
        array[23].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><b>Стек</b> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">stack</span></i>&nbsp;— стопка; читается <i>стэк</i>)&nbsp;— <a href=\"/wiki/%D0%90%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D1%8B%D0%B9_%D1%82%D0%B8%D0%BF_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85\" title=\"Абстрактный тип данных\">абстрактный тип данных</a>, представляющий собой <a href=\"/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_(%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Список (информатика)\">список элементов</a>, организованных по принципу <i><a href=\"/wiki/LIFO\" title=\"LIFO\">LIFO</a></i> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">last in — first out</span></i>, «последним пришёл&nbsp;— первым вышел»).</p>\n" +
                "<p>Чаще всего принцип работы стека сравнивают со стопкой тарелок: чтобы взять вторую сверху, нужно снять верхнюю.</p>\n" +
                "<p>В <a href=\"/wiki/%D0%A6%D0%92%D0%9A\" title=\"ЦВК\">цифровом вычислительном комплексе</a> стек называется магазином&nbsp;— по аналогии с магазином в огнестрельном оружии (стрельба начнётся с патрона, заряженного последним).</p>\n" +
                "<p>В 1946 <a href=\"/wiki/%D0%A2%D1%8C%D1%8E%D1%80%D0%B8%D0%BD%D0%B3,_%D0%90%D0%BB%D0%B0%D0%BD\" title=\"Тьюринг, Алан\">Алан Тьюринг</a> ввёл понятие стека<sup id=\"cite_ref-1\" class=\"reference\"><a href=\"#cite_note-1\">[1]</a></sup>. А в 1957 году немцы Клаус Самельсон и Фридрих Л. Бауэр запатентовали идею Тьюринга<sup id=\"cite_ref-2\" class=\"reference\"><a href=\"#cite_note-2\">[2]</a></sup>.</p>\n" +
                "<p>В некоторых языках (например, <a href=\"/wiki/Lisp\" class=\"mw-redirect\" title=\"Lisp\">Lisp</a>, <a href=\"/wiki/Python\" title=\"Python\">Python</a><sup id=\"cite_ref-3\" class=\"reference\"><a href=\"#cite_note-3\">[3]</a></sup>) стеком можно назвать любой список, так как для них доступны операции pop и push. В языке <a href=\"/wiki/C%2B%2B\" title=\"C++\">C++</a> <a href=\"/wiki/%D0%A1%D1%82%D0%B0%D0%BD%D0%B4%D0%B0%D1%80%D1%82%D0%BD%D0%B0%D1%8F_%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0_%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0_C%2B%2B\" title=\"Стандартная библиотека языка C++\">стандартная библиотека</a> имеет класс с реализованной структурой и методами<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\">[4]</a></sup>. И&nbsp;т.&nbsp;д.</p>" +
                "<h1>Программный стек</h1>" +
                "<p>Организация в памяти</p>"+
                "<p>Зачастую стек реализуется в виде однонаправленного списка (каждый элемент в списке содержит помимо хранимой информации в стеке указатель на следующий элемент стека).\n" +
                "\n" +
                "Но также часто стек располагается в одномерном массиве с упорядоченными адресами. Такая организация стека удобна, если элемент информации занимает в памяти фиксированное количество слов, например, 1 слово. При этом отпадает необходимость хранения в элементе стека явного указателя на следующий элемент стека, что экономит память. При этом указатель стека (Stack Pointer, — SP) обычно является регистром процессора и указывает на адрес головы стека.\n" +
                "\n" +
                "Предположим для примера, что голова стека расположена по меньшему адресу, следующие элементы располагаются по нарастающим адресам. При каждом вталкивании слова в стек, SP сначала уменьшается на 1 и затем по адресу из SP производится запись в память. При каждом извлечении слова из стека (выталкивании) сначала производится чтение по текущему адресу из SP и последующее увеличение содержимого SP на 1.\n" +
                "\n" +
                "При организации стека в виде однонаправленного списка значением переменной стека является указатель на его вершину — адрес вершины. Если стек пуст, то значение указателя равно NULL.\n" +
                "\n" +
                "Пример реализации стека на языке С:</p>" +
                "<font color=\"#993333\">struct</font>&nbsp;stack<br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">char</font>&nbsp;<font color=\"#339933\">*</font>data<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">struct</font>&nbsp;stack&nbsp;<font color=\"#339933\">*</font>next<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>" +
                "<p><b>Операции со стеком</b></p>" +
                "<p>Возможны три операции со стеком: добавление элемента (иначе проталкивание, <i><span xml:lang=\"en\" lang=\"en\">push</span></i>), удаление элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) и чтение головного элемента (<i><span xml:lang=\"en\" lang=\"en\">peek</span></i>)<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\">[5]</a></sup>.</p>\n" +
                "<p>При проталкивании (<i><span xml:lang=\"en\" lang=\"en\">push</span></i>) добавляется новый элемент, указывающий на элемент, бывший до этого головой. Новый элемент теперь становится головным.</p>\n" +
                "<p>При удалении элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) убирается первый, а головным становится тот, на который был указатель у этого объекта (следующий элемент). При этом значение убранного элемента возвращается.</p>" +
                "<font color=\"#993333\">void</font>&nbsp;push<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps<font color=\"#339933\">,</font>&nbsp;<font color=\"#993333\">int</font>&nbsp;x&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Добавление&nbsp;в&nbsp;стек&nbsp;нового&nbsp;элемента</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;STACKSIZE&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;переполнен&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;overflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#339933\">++</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;x<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#993333\">int</font>&nbsp;pop<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Удаление&nbsp;из&nbsp;стека</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#0000dd\">0</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;опустел&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;underflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">return</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font><font color=\"#339933\">--</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p><b>Область применения</b></p>" +
                "<p>Программный вид стека используется для обхода структур данных, например, <a href=\"/wiki/%D0%94%D0%B5%D1%80%D0%B5%D0%B2%D0%BE_(%D1%82%D0%B5%D0%BE%D1%80%D0%B8%D1%8F_%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%B2)\" title=\"Дерево (теория графов)\">дерево</a> или <a href=\"/wiki/%D0%93%D1%80%D0%B0%D1%84_(%D0%BC%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Граф (математика)\">граф</a>. При использовании рекурсивных функций также будет применяться стек, но аппаратный его вид. Кроме этих назначений, стек используется для организации <a href=\"/wiki/%D0%9E%D0%B1%D1%80%D0%B0%D1%82%D0%BD%D0%B0%D1%8F_%D0%BF%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C\" title=\"Обратная польская запись\">стековой машины</a>, реализующей вычисления в обратной инверсной записи.</p>\n" +
                "<p>Для отслеживания точек возврата из подпрограмм используется стек вызовов.</p>\n" +
                "<p>Арифметические <a href=\"/wiki/%D0%A1%D0%BE%D0%BF%D1%80%D0%BE%D1%86%D0%B5%D1%81%D1%81%D0%BE%D1%80\" title=\"Сопроцессор\">сопроцессоры</a>, программируемые микрокалькуляторы и язык <a href=\"/wiki/Forth\" class=\"mw-redirect\" title=\"Forth\">Forth</a> используют стековую модель вычислений<sup id=\"cite_ref-6\" class=\"reference\"><a href=\"#cite_note-6\">[6]</a></sup>.</p>\n" +
                "<p>Идея стека используется в стековой машине среди <a href=\"/wiki/%D0%A1%D1%82%D0%B5%D0%BA%D0%BE%D0%B2%D1%8B%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Стековый язык\">стековых языков программирования</a>.</p>" +
                "<h1>Аппаратный стек</h1>" +
                "<p>При вызове <a href=\"/wiki/%D0%9F%D0%BE%D0%B4%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0\" title=\"Подпрограмма\">подпрограммы (процедуры)</a> процессор помещает в стек адрес команды, следующей за командой вызова подпрограммы «адрес возврата» из подпрограммы. По команде возврата из подпрограммы из стека извлекается адрес возврата в вызвавшую подпрограмму программу и осуществляется переход по этому адресу.</p>\n" +
                "<p>Аналогичные процессы происходят при <a href=\"/wiki/%D0%9F%D1%80%D0%B5%D1%80%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5\" title=\"Прерывание\">аппаратном прерывании</a> (процессор X86 при аппаратном прерывании сохраняет автоматически в стеке ещё и регистр флагов). Кроме того, <a href=\"/wiki/%D0%9A%D0%BE%D0%BC%D0%BF%D0%B8%D0%BB%D1%8F%D1%82%D0%BE%D1%80\" title=\"Компилятор\">компиляторы</a> размещают локальные переменные процедур в стеке (если в процессоре предусмотрен доступ к произвольному месту стека).</p>\n" +
                "<p>В архитектуре <a href=\"/wiki/X86\" title=\"X86\">X86</a> аппаратный стек&nbsp;— непрерывная область памяти, адресуемая специальными регистрами ESP (указатель стека) и SS (селектор сегмента стека)<sup id=\"cite_ref-ReferenceA_7-0\" class=\"reference\"><a href=\"#cite_note-ReferenceA-7\">[7]</a></sup>.</p>\n" +
                "<p>До использования стека он должен быть инициализирован так, чтобы регистры SS:ESP указывали на адрес головы стека в области физической оперативной памяти, причем под хранение данных в стеке необходимо зарезервировать нужное количество ячеек памяти (очевидно, что стек в <a href=\"/wiki/%D0%9F%D0%BE%D1%81%D1%82%D0%BE%D1%8F%D0%BD%D0%BD%D0%BE%D0%B5_%D0%B7%D0%B0%D0%BF%D0%BE%D0%BC%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B5%D0%B5_%D1%83%D1%81%D1%82%D1%80%D0%BE%D0%B9%D1%81%D1%82%D0%B2%D0%BE\" title=\"Постоянное запоминающее устройство\">ПЗУ</a>, естественно, не может быть организован). Прикладные программы, как правило, от операционной системы получают готовый к употреблению стек. В защищенном режиме работы процессора сегмент состояния задачи содержит четыре селектора сегментов стека (для разных уровней привилегий), но в каждый момент используется только один стек<sup id=\"cite_ref-8\" class=\"reference\"><a href=\"#cite_note-8\">[8]</a></sup>.</p>"

        );

        //___024_____________________________________________________________________________________________________________________
        array[24] = new ContentValues();
        array[24].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как называется операция со стеком, которая позволяет удалить элемент?</h1>");
        array[24].put(DatabaseHelperTypeIn.ANSWER_1, "pop");
        array[24].put(DatabaseHelperTypeIn.ANSWER_2, "pop");
        array[24].put(DatabaseHelperTypeIn.ANSWER_3, "pop");
        array[24].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><b>Стек</b> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">stack</span></i>&nbsp;— стопка; читается <i>стэк</i>)&nbsp;— <a href=\"/wiki/%D0%90%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D1%8B%D0%B9_%D1%82%D0%B8%D0%BF_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85\" title=\"Абстрактный тип данных\">абстрактный тип данных</a>, представляющий собой <a href=\"/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_(%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Список (информатика)\">список элементов</a>, организованных по принципу <i><a href=\"/wiki/LIFO\" title=\"LIFO\">LIFO</a></i> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">last in — first out</span></i>, «последним пришёл&nbsp;— первым вышел»).</p>\n" +
                "<p>Чаще всего принцип работы стека сравнивают со стопкой тарелок: чтобы взять вторую сверху, нужно снять верхнюю.</p>\n" +
                "<p>В <a href=\"/wiki/%D0%A6%D0%92%D0%9A\" title=\"ЦВК\">цифровом вычислительном комплексе</a> стек называется магазином&nbsp;— по аналогии с магазином в огнестрельном оружии (стрельба начнётся с патрона, заряженного последним).</p>\n" +
                "<p>В 1946 <a href=\"/wiki/%D0%A2%D1%8C%D1%8E%D1%80%D0%B8%D0%BD%D0%B3,_%D0%90%D0%BB%D0%B0%D0%BD\" title=\"Тьюринг, Алан\">Алан Тьюринг</a> ввёл понятие стека<sup id=\"cite_ref-1\" class=\"reference\"><a href=\"#cite_note-1\">[1]</a></sup>. А в 1957 году немцы Клаус Самельсон и Фридрих Л. Бауэр запатентовали идею Тьюринга<sup id=\"cite_ref-2\" class=\"reference\"><a href=\"#cite_note-2\">[2]</a></sup>.</p>\n" +
                "<p>В некоторых языках (например, <a href=\"/wiki/Lisp\" class=\"mw-redirect\" title=\"Lisp\">Lisp</a>, <a href=\"/wiki/Python\" title=\"Python\">Python</a><sup id=\"cite_ref-3\" class=\"reference\"><a href=\"#cite_note-3\">[3]</a></sup>) стеком можно назвать любой список, так как для них доступны операции pop и push. В языке <a href=\"/wiki/C%2B%2B\" title=\"C++\">C++</a> <a href=\"/wiki/%D0%A1%D1%82%D0%B0%D0%BD%D0%B4%D0%B0%D1%80%D1%82%D0%BD%D0%B0%D1%8F_%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0_%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0_C%2B%2B\" title=\"Стандартная библиотека языка C++\">стандартная библиотека</a> имеет класс с реализованной структурой и методами<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\">[4]</a></sup>. И&nbsp;т.&nbsp;д.</p>" +
                "<h1>Программный стек</h1>" +
                "<p>Организация в памяти</p>"+
                "<p>Зачастую стек реализуется в виде однонаправленного списка (каждый элемент в списке содержит помимо хранимой информации в стеке указатель на следующий элемент стека).\n" +
                "\n" +
                "Но также часто стек располагается в одномерном массиве с упорядоченными адресами. Такая организация стека удобна, если элемент информации занимает в памяти фиксированное количество слов, например, 1 слово. При этом отпадает необходимость хранения в элементе стека явного указателя на следующий элемент стека, что экономит память. При этом указатель стека (Stack Pointer, — SP) обычно является регистром процессора и указывает на адрес головы стека.\n" +
                "\n" +
                "Предположим для примера, что голова стека расположена по меньшему адресу, следующие элементы располагаются по нарастающим адресам. При каждом вталкивании слова в стек, SP сначала уменьшается на 1 и затем по адресу из SP производится запись в память. При каждом извлечении слова из стека (выталкивании) сначала производится чтение по текущему адресу из SP и последующее увеличение содержимого SP на 1.\n" +
                "\n" +
                "При организации стека в виде однонаправленного списка значением переменной стека является указатель на его вершину — адрес вершины. Если стек пуст, то значение указателя равно NULL.\n" +
                "\n" +
                "Пример реализации стека на языке С:</p>" +
                "<font color=\"#993333\">struct</font>&nbsp;stack<br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">char</font>&nbsp;<font color=\"#339933\">*</font>data<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">struct</font>&nbsp;stack&nbsp;<font color=\"#339933\">*</font>next<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>" +
                "<p><b>Операции со стеком</b></p>" +
                "<p>Возможны три операции со стеком: добавление элемента (иначе проталкивание, <i><span xml:lang=\"en\" lang=\"en\">push</span></i>), удаление элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) и чтение головного элемента (<i><span xml:lang=\"en\" lang=\"en\">peek</span></i>)<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\">[5]</a></sup>.</p>\n" +
                "<p>При проталкивании (<i><span xml:lang=\"en\" lang=\"en\">push</span></i>) добавляется новый элемент, указывающий на элемент, бывший до этого головой. Новый элемент теперь становится головным.</p>\n" +
                "<p>При удалении элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) убирается первый, а головным становится тот, на который был указатель у этого объекта (следующий элемент). При этом значение убранного элемента возвращается.</p>" +
                "<font color=\"#993333\">void</font>&nbsp;push<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps<font color=\"#339933\">,</font>&nbsp;<font color=\"#993333\">int</font>&nbsp;x&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Добавление&nbsp;в&nbsp;стек&nbsp;нового&nbsp;элемента</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;STACKSIZE&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;переполнен&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;overflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#339933\">++</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;x<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#993333\">int</font>&nbsp;pop<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Удаление&nbsp;из&nbsp;стека</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#0000dd\">0</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;опустел&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;underflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">return</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font><font color=\"#339933\">--</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p><b>Область применения</b></p>" +
                "<p>Программный вид стека используется для обхода структур данных, например, <a href=\"/wiki/%D0%94%D0%B5%D1%80%D0%B5%D0%B2%D0%BE_(%D1%82%D0%B5%D0%BE%D1%80%D0%B8%D1%8F_%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%B2)\" title=\"Дерево (теория графов)\">дерево</a> или <a href=\"/wiki/%D0%93%D1%80%D0%B0%D1%84_(%D0%BC%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Граф (математика)\">граф</a>. При использовании рекурсивных функций также будет применяться стек, но аппаратный его вид. Кроме этих назначений, стек используется для организации <a href=\"/wiki/%D0%9E%D0%B1%D1%80%D0%B0%D1%82%D0%BD%D0%B0%D1%8F_%D0%BF%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C\" title=\"Обратная польская запись\">стековой машины</a>, реализующей вычисления в обратной инверсной записи.</p>\n" +
                "<p>Для отслеживания точек возврата из подпрограмм используется стек вызовов.</p>\n" +
                "<p>Арифметические <a href=\"/wiki/%D0%A1%D0%BE%D0%BF%D1%80%D0%BE%D1%86%D0%B5%D1%81%D1%81%D0%BE%D1%80\" title=\"Сопроцессор\">сопроцессоры</a>, программируемые микрокалькуляторы и язык <a href=\"/wiki/Forth\" class=\"mw-redirect\" title=\"Forth\">Forth</a> используют стековую модель вычислений<sup id=\"cite_ref-6\" class=\"reference\"><a href=\"#cite_note-6\">[6]</a></sup>.</p>\n" +
                "<p>Идея стека используется в стековой машине среди <a href=\"/wiki/%D0%A1%D1%82%D0%B5%D0%BA%D0%BE%D0%B2%D1%8B%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Стековый язык\">стековых языков программирования</a>.</p>" +
                "<h1>Аппаратный стек</h1>" +
                "<p>При вызове <a href=\"/wiki/%D0%9F%D0%BE%D0%B4%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0\" title=\"Подпрограмма\">подпрограммы (процедуры)</a> процессор помещает в стек адрес команды, следующей за командой вызова подпрограммы «адрес возврата» из подпрограммы. По команде возврата из подпрограммы из стека извлекается адрес возврата в вызвавшую подпрограмму программу и осуществляется переход по этому адресу.</p>\n" +
                "<p>Аналогичные процессы происходят при <a href=\"/wiki/%D0%9F%D1%80%D0%B5%D1%80%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5\" title=\"Прерывание\">аппаратном прерывании</a> (процессор X86 при аппаратном прерывании сохраняет автоматически в стеке ещё и регистр флагов). Кроме того, <a href=\"/wiki/%D0%9A%D0%BE%D0%BC%D0%BF%D0%B8%D0%BB%D1%8F%D1%82%D0%BE%D1%80\" title=\"Компилятор\">компиляторы</a> размещают локальные переменные процедур в стеке (если в процессоре предусмотрен доступ к произвольному месту стека).</p>\n" +
                "<p>В архитектуре <a href=\"/wiki/X86\" title=\"X86\">X86</a> аппаратный стек&nbsp;— непрерывная область памяти, адресуемая специальными регистрами ESP (указатель стека) и SS (селектор сегмента стека)<sup id=\"cite_ref-ReferenceA_7-0\" class=\"reference\"><a href=\"#cite_note-ReferenceA-7\">[7]</a></sup>.</p>\n" +
                "<p>До использования стека он должен быть инициализирован так, чтобы регистры SS:ESP указывали на адрес головы стека в области физической оперативной памяти, причем под хранение данных в стеке необходимо зарезервировать нужное количество ячеек памяти (очевидно, что стек в <a href=\"/wiki/%D0%9F%D0%BE%D1%81%D1%82%D0%BE%D1%8F%D0%BD%D0%BD%D0%BE%D0%B5_%D0%B7%D0%B0%D0%BF%D0%BE%D0%BC%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B5%D0%B5_%D1%83%D1%81%D1%82%D1%80%D0%BE%D0%B9%D1%81%D1%82%D0%B2%D0%BE\" title=\"Постоянное запоминающее устройство\">ПЗУ</a>, естественно, не может быть организован). Прикладные программы, как правило, от операционной системы получают готовый к употреблению стек. В защищенном режиме работы процессора сегмент состояния задачи содержит четыре селектора сегментов стека (для разных уровней привилегий), но в каждый момент используется только один стек<sup id=\"cite_ref-8\" class=\"reference\"><a href=\"#cite_note-8\">[8]</a></sup>.</p>"
        );

        //___025_____________________________________________________________________________________________________________________
        array[25] = new ContentValues();
        array[25].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как называется операция со стеком, которая позволяет добавить элемент?</h1>");
        array[25].put(DatabaseHelperTypeIn.ANSWER_1, "push");
        array[25].put(DatabaseHelperTypeIn.ANSWER_2, "push");
        array[25].put(DatabaseHelperTypeIn.ANSWER_3, "push");
        array[25].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><b>Стек</b> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">stack</span></i>&nbsp;— стопка; читается <i>стэк</i>)&nbsp;— <a href=\"/wiki/%D0%90%D0%B1%D1%81%D1%82%D1%80%D0%B0%D0%BA%D1%82%D0%BD%D1%8B%D0%B9_%D1%82%D0%B8%D0%BF_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85\" title=\"Абстрактный тип данных\">абстрактный тип данных</a>, представляющий собой <a href=\"/wiki/%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_(%D0%B8%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Список (информатика)\">список элементов</a>, организованных по принципу <i><a href=\"/wiki/LIFO\" title=\"LIFO\">LIFO</a></i> (<a href=\"/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Английский язык\">англ.</a>&nbsp;<i><span xml:lang=\"en\" lang=\"en\">last in — first out</span></i>, «последним пришёл&nbsp;— первым вышел»).</p>\n" +
                "<p>Чаще всего принцип работы стека сравнивают со стопкой тарелок: чтобы взять вторую сверху, нужно снять верхнюю.</p>\n" +
                "<p>В <a href=\"/wiki/%D0%A6%D0%92%D0%9A\" title=\"ЦВК\">цифровом вычислительном комплексе</a> стек называется магазином&nbsp;— по аналогии с магазином в огнестрельном оружии (стрельба начнётся с патрона, заряженного последним).</p>\n" +
                "<p>В 1946 <a href=\"/wiki/%D0%A2%D1%8C%D1%8E%D1%80%D0%B8%D0%BD%D0%B3,_%D0%90%D0%BB%D0%B0%D0%BD\" title=\"Тьюринг, Алан\">Алан Тьюринг</a> ввёл понятие стека<sup id=\"cite_ref-1\" class=\"reference\"><a href=\"#cite_note-1\">[1]</a></sup>. А в 1957 году немцы Клаус Самельсон и Фридрих Л. Бауэр запатентовали идею Тьюринга<sup id=\"cite_ref-2\" class=\"reference\"><a href=\"#cite_note-2\">[2]</a></sup>.</p>\n" +
                "<p>В некоторых языках (например, <a href=\"/wiki/Lisp\" class=\"mw-redirect\" title=\"Lisp\">Lisp</a>, <a href=\"/wiki/Python\" title=\"Python\">Python</a><sup id=\"cite_ref-3\" class=\"reference\"><a href=\"#cite_note-3\">[3]</a></sup>) стеком можно назвать любой список, так как для них доступны операции pop и push. В языке <a href=\"/wiki/C%2B%2B\" title=\"C++\">C++</a> <a href=\"/wiki/%D0%A1%D1%82%D0%B0%D0%BD%D0%B4%D0%B0%D1%80%D1%82%D0%BD%D0%B0%D1%8F_%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0_%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0_C%2B%2B\" title=\"Стандартная библиотека языка C++\">стандартная библиотека</a> имеет класс с реализованной структурой и методами<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\">[4]</a></sup>. И&nbsp;т.&nbsp;д.</p>" +
                "<h1>Программный стек</h1>" +
                "<p>Организация в памяти</p>"+
                "<p>Зачастую стек реализуется в виде однонаправленного списка (каждый элемент в списке содержит помимо хранимой информации в стеке указатель на следующий элемент стека).\n" +
                "\n" +
                "Но также часто стек располагается в одномерном массиве с упорядоченными адресами. Такая организация стека удобна, если элемент информации занимает в памяти фиксированное количество слов, например, 1 слово. При этом отпадает необходимость хранения в элементе стека явного указателя на следующий элемент стека, что экономит память. При этом указатель стека (Stack Pointer, — SP) обычно является регистром процессора и указывает на адрес головы стека.\n" +
                "\n" +
                "Предположим для примера, что голова стека расположена по меньшему адресу, следующие элементы располагаются по нарастающим адресам. При каждом вталкивании слова в стек, SP сначала уменьшается на 1 и затем по адресу из SP производится запись в память. При каждом извлечении слова из стека (выталкивании) сначала производится чтение по текущему адресу из SP и последующее увеличение содержимого SP на 1.\n" +
                "\n" +
                "При организации стека в виде однонаправленного списка значением переменной стека является указатель на его вершину — адрес вершины. Если стек пуст, то значение указателя равно NULL.\n" +
                "\n" +
                "Пример реализации стека на языке С:</p>" +
                "<font color=\"#993333\">struct</font>&nbsp;stack<br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">char</font>&nbsp;<font color=\"#339933\">*</font>data<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#993333\">struct</font>&nbsp;stack&nbsp;<font color=\"#339933\">*</font>next<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>" +
                "<p><b>Операции со стеком</b></p>" +
                "<p>Возможны три операции со стеком: добавление элемента (иначе проталкивание, <i><span xml:lang=\"en\" lang=\"en\">push</span></i>), удаление элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) и чтение головного элемента (<i><span xml:lang=\"en\" lang=\"en\">peek</span></i>)<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\">[5]</a></sup>.</p>\n" +
                "<p>При проталкивании (<i><span xml:lang=\"en\" lang=\"en\">push</span></i>) добавляется новый элемент, указывающий на элемент, бывший до этого головой. Новый элемент теперь становится головным.</p>\n" +
                "<p>При удалении элемента (<i><span xml:lang=\"en\" lang=\"en\">pop</span></i>) убирается первый, а головным становится тот, на который был указатель у этого объекта (следующий элемент). При этом значение убранного элемента возвращается.</p>" +
                "<font color=\"#993333\">void</font>&nbsp;push<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps<font color=\"#339933\">,</font>&nbsp;<font color=\"#993333\">int</font>&nbsp;x&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Добавление&nbsp;в&nbsp;стек&nbsp;нового&nbsp;элемента</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;STACKSIZE&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;переполнен&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;overflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#339933\">++</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;x<font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#993333\">int</font>&nbsp;pop<font color=\"#009900\">&#40;</font>&nbsp;STACK&nbsp;<font color=\"#339933\">*</font>ps&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Удаление&nbsp;из&nbsp;стека</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>size&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#0000dd\">0</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#666666\">//&nbsp;Не&nbsp;опустел&nbsp;ли&nbsp;стек?</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">fputs</font><font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#ff0000\">&quot;Error:&nbsp;stack&nbsp;underflow<font color=\"#000099\">\\n</font>&quot;</font><font color=\"#339933\">,</font>&nbsp;stderr&nbsp;<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">abort</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">else</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#b1b100\">return</font>&nbsp;ps<font color=\"#339933\">-&gt;</font>items<font color=\"#009900\">&#91;</font><font color=\"#339933\">--</font>ps<font color=\"#339933\">-&gt;</font>size<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>" +
                "<p><b>Область применения</b></p>" +
                "<p>Программный вид стека используется для обхода структур данных, например, <a href=\"/wiki/%D0%94%D0%B5%D1%80%D0%B5%D0%B2%D0%BE_(%D1%82%D0%B5%D0%BE%D1%80%D0%B8%D1%8F_%D0%B3%D1%80%D0%B0%D1%84%D0%BE%D0%B2)\" title=\"Дерево (теория графов)\">дерево</a> или <a href=\"/wiki/%D0%93%D1%80%D0%B0%D1%84_(%D0%BC%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)\" title=\"Граф (математика)\">граф</a>. При использовании рекурсивных функций также будет применяться стек, но аппаратный его вид. Кроме этих назначений, стек используется для организации <a href=\"/wiki/%D0%9E%D0%B1%D1%80%D0%B0%D1%82%D0%BD%D0%B0%D1%8F_%D0%BF%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%B7%D0%B0%D0%BF%D0%B8%D1%81%D1%8C\" title=\"Обратная польская запись\">стековой машины</a>, реализующей вычисления в обратной инверсной записи.</p>\n" +
                "<p>Для отслеживания точек возврата из подпрограмм используется стек вызовов.</p>\n" +
                "<p>Арифметические <a href=\"/wiki/%D0%A1%D0%BE%D0%BF%D1%80%D0%BE%D1%86%D0%B5%D1%81%D1%81%D0%BE%D1%80\" title=\"Сопроцессор\">сопроцессоры</a>, программируемые микрокалькуляторы и язык <a href=\"/wiki/Forth\" class=\"mw-redirect\" title=\"Forth\">Forth</a> используют стековую модель вычислений<sup id=\"cite_ref-6\" class=\"reference\"><a href=\"#cite_note-6\">[6]</a></sup>.</p>\n" +
                "<p>Идея стека используется в стековой машине среди <a href=\"/wiki/%D0%A1%D1%82%D0%B5%D0%BA%D0%BE%D0%B2%D1%8B%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA\" title=\"Стековый язык\">стековых языков программирования</a>.</p>" +
                "<h1>Аппаратный стек</h1>" +
                "<p>При вызове <a href=\"/wiki/%D0%9F%D0%BE%D0%B4%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0\" title=\"Подпрограмма\">подпрограммы (процедуры)</a> процессор помещает в стек адрес команды, следующей за командой вызова подпрограммы «адрес возврата» из подпрограммы. По команде возврата из подпрограммы из стека извлекается адрес возврата в вызвавшую подпрограмму программу и осуществляется переход по этому адресу.</p>\n" +
                "<p>Аналогичные процессы происходят при <a href=\"/wiki/%D0%9F%D1%80%D0%B5%D1%80%D1%8B%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5\" title=\"Прерывание\">аппаратном прерывании</a> (процессор X86 при аппаратном прерывании сохраняет автоматически в стеке ещё и регистр флагов). Кроме того, <a href=\"/wiki/%D0%9A%D0%BE%D0%BC%D0%BF%D0%B8%D0%BB%D1%8F%D1%82%D0%BE%D1%80\" title=\"Компилятор\">компиляторы</a> размещают локальные переменные процедур в стеке (если в процессоре предусмотрен доступ к произвольному месту стека).</p>\n" +
                "<p>В архитектуре <a href=\"/wiki/X86\" title=\"X86\">X86</a> аппаратный стек&nbsp;— непрерывная область памяти, адресуемая специальными регистрами ESP (указатель стека) и SS (селектор сегмента стека)<sup id=\"cite_ref-ReferenceA_7-0\" class=\"reference\"><a href=\"#cite_note-ReferenceA-7\">[7]</a></sup>.</p>\n" +
                "<p>До использования стека он должен быть инициализирован так, чтобы регистры SS:ESP указывали на адрес головы стека в области физической оперативной памяти, причем под хранение данных в стеке необходимо зарезервировать нужное количество ячеек памяти (очевидно, что стек в <a href=\"/wiki/%D0%9F%D0%BE%D1%81%D1%82%D0%BE%D1%8F%D0%BD%D0%BD%D0%BE%D0%B5_%D0%B7%D0%B0%D0%BF%D0%BE%D0%BC%D0%B8%D0%BD%D0%B0%D1%8E%D1%89%D0%B5%D0%B5_%D1%83%D1%81%D1%82%D1%80%D0%BE%D0%B9%D1%81%D1%82%D0%B2%D0%BE\" title=\"Постоянное запоминающее устройство\">ПЗУ</a>, естественно, не может быть организован). Прикладные программы, как правило, от операционной системы получают готовый к употреблению стек. В защищенном режиме работы процессора сегмент состояния задачи содержит четыре селектора сегментов стека (для разных уровней привилегий), но в каждый момент используется только один стек<sup id=\"cite_ref-8\" class=\"reference\"><a href=\"#cite_note-8\">[8]</a></sup>.</p>"
        );

        //___026_____________________________________________________________________________________________________________________
        array[26] = new ContentValues();
        array[26].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Чему будет равно значение переменной n в результате выполнения фрагмента псевдокода?</h1>" +
               "<font color=\"#993333\">int</font>&nbsp;n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">3</font><font color=\"#339933\">,</font>&nbsp;k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
               "&nbsp;<br/>\n" +
               "<font color=\"#b1b100\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>n<font color=\"#339933\">!=</font>k<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
               "&nbsp;&nbsp;&nbsp;&nbsp;n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font>n<font color=\"#339933\">*</font><font color=\"#0000dd\">2</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
               "&nbsp;&nbsp;&nbsp;&nbsp;k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font>k<font color=\"#339933\">*</font><font color=\"#0000dd\">7</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
               "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[26].put(DatabaseHelperTypeIn.ANSWER_1, "4");
        array[26].put(DatabaseHelperTypeIn.ANSWER_2, "4");
        array[26].put(DatabaseHelperTypeIn.ANSWER_3, "4");
        array[26].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Оператор mod означает остаток от деления. Например, 35 mod 11 = 2 эквивалентно 35 - (11*3) = 2 </p>"+
                "<p><b>В алгоритм программы заложены следующие действия (по строкам кода):</b></p>"+
                "<p>1) объявление начальных условий, при которых переменная n принимает значение 3, а k соответственно 5<br>" +
                "3) объявление цикла с предусловием: пока n не равно k выполняются действия, указанные в строках 4) и 5). </p>"+
                "В&nbsp;теле&nbsp;цикла&nbsp;значения&nbsp;n&nbsp;и&nbsp;k&nbsp;изменяются&nbsp;следующим&nbsp;образом<font color=\"#339933\">:</font><br/>\n" +
                "Итерация&nbsp;<font color=\"#0000dd\">1</font><font color=\"#339933\">:</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#40;</font>при&nbsp;начальных&nbsp;n<font color=\"#339933\">=</font><font color=\"#0000dd\">3</font><font color=\"#339933\">,</font>&nbsp;k<font color=\"#339933\">=</font><font color=\"#0000dd\">5</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">3</font><font color=\"#339933\">*</font><font color=\"#0000dd\">2</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">6</font><br/>\n" +
                "k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">5</font><font color=\"#339933\">*</font><font color=\"#0000dd\">7</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">2</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "Итерация&nbsp;<font color=\"#0000dd\">2</font><font color=\"#339933\">:</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#40;</font>при&nbsp;n<font color=\"#339933\">=</font><font color=\"#0000dd\">6</font><font color=\"#339933\">,</font>&nbsp;k<font color=\"#339933\">=</font><font color=\"#0000dd\">2</font>&nbsp;после&nbsp;предыдущей&nbsp;итерации<font color=\"#009900\">&#41;</font><br/>\n" +
                "n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">6</font><font color=\"#339933\">*</font><font color=\"#0000dd\">2</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">1</font><br/>\n" +
                "k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">2</font><font color=\"#339933\">*</font><font color=\"#0000dd\">7</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">3</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "Итерация&nbsp;<font color=\"#0000dd\">3</font><font color=\"#339933\">:</font><br/>\n" +
                "<font color=\"#009900\">&#40;</font>при&nbsp;n<font color=\"#339933\">=</font><font color=\"#0000dd\">1</font><font color=\"#339933\">,</font>&nbsp;k<font color=\"#339933\">=</font><font color=\"#0000dd\">3</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">1</font><font color=\"#339933\">*</font><font color=\"#0000dd\">2</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">2</font><br/>\n" +
                "k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">3</font><font color=\"#339933\">*</font><font color=\"#0000dd\">7</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">10</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "Итерация&nbsp;<font color=\"#0000dd\">4</font><font color=\"#339933\">:</font><br/>\n" +
                "<font color=\"#009900\">&#40;</font>при&nbsp;n<font color=\"#339933\">=</font><font color=\"#0000dd\">2</font><font color=\"#339933\">,</font>&nbsp;k<font color=\"#339933\">=</font><font color=\"#0000dd\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "n&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">2</font><font color=\"#339933\">*</font><font color=\"#0000dd\">2</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">4</font><br/>\n" +
                "k&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#0000dd\">10</font><font color=\"#339933\">*</font><font color=\"#0000dd\">7</font><font color=\"#009900\">&#41;</font>&nbsp;mod&nbsp;<font color=\"#0000dd\">11</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000dd\">4</font>"
        );

        //___027_____________________________________________________________________________________________________________________
        array[27] = new ContentValues();
        array[27].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Дан следующий фрагмент псевдокода:</h1>" +
                "BEGIN&nbsp;<br/>\n" +
                "I<font color=\"#339933\">:=</font><font color=\"#0000dd\">10</font>&nbsp;<br/>\n" +
                "N<font color=\"#339933\">:=</font><font color=\"#0000dd\">0</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;WHILE&nbsp;<font color=\"#009900\">&#40;</font>I<font color=\"#339933\">&lt;</font><font color=\"#0000dd\">10</font><font color=\"#009900\">&#41;</font>&nbsp;DO&nbsp;BEGIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;N<font color=\"#339933\">:=</font>N<font color=\"#339933\">+</font><font color=\"#0000dd\">1</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I<font color=\"#339933\">:=</font>I<font color=\"#339933\">+</font><font color=\"#0000dd\">1</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;END&nbsp;WHILE&nbsp;<br/>\n" +
                "OUTPUT&nbsp;N&nbsp;<br/>\n" +
                "END&nbsp;" +
                "<h1>Каким будет значение N в результате его выполнения?</h1>");
        array[27].put(DatabaseHelperTypeIn.ANSWER_1, "0");
        array[27].put(DatabaseHelperTypeIn.ANSWER_2, "0");
        array[27].put(DatabaseHelperTypeIn.ANSWER_3, "0");
        array[27].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>While - цикл с предусловием. Выполняется пока истинно некоторое условие, указанное перед его началом. Это условие проверяется до выполнения тела цикла.</p>"
        );

        //___028_____________________________________________________________________________________________________________________
        array[28] = new ContentValues();
        array[28].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в результате данного сравнения?</h1>" +
                "<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000dd\">1</font><font color=\"#339933\">&gt;</font><font color=\"#0000dd\">0</font>&nbsp;<font color=\"#339933\">?</font>&nbsp;<font color=\"#000000\">false</font>&nbsp;<font color=\"#339933\">:</font>&nbsp;<font color=\"#000000\">true</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;print&nbsp;<font color=\"#ff0000\">&quot;true&quot;</font>&nbsp;<br/>\n" +
                "<font color=\"#b1b100\">else</font>&nbsp;print&nbsp;<font color=\"#ff0000\">&quot;false&quot;</font>&nbsp;");
        array[28].put(DatabaseHelperTypeIn.ANSWER_1, "false");
        array[28].put(DatabaseHelperTypeIn.ANSWER_2, "false");
        array[28].put(DatabaseHelperTypeIn.ANSWER_3, "false");
        array[28].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Выражение с тернарным оператором возвращает значение false ( читается как если 1 > 0 то выполняем выражение 1 если нет то выражение 2, следовательно должно выполняться условие для else.</p>"
        );

        //___029_____________________________________________________________________________________________________________________
        array[29] = new ContentValues();
        array[29].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в результате данного сравнения?</h1>" +
                "<font color=\"#b1b100\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>&nbsp;<font color=\"#0000dd\">1</font><font color=\"#339933\">&gt;</font><font color=\"#0000dd\">0</font>&nbsp;<font color=\"#339933\">?</font>&nbsp;<font color=\"#000000\">false</font>&nbsp;<font color=\"#339933\">:</font>&nbsp;<font color=\"#000000\">true</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;print&nbsp;<font color=\"#ff0000\">&quot;true&quot;</font>&nbsp;<br/>\n" +
                "<font color=\"#b1b100\">else</font>&nbsp;print&nbsp;<font color=\"#ff0000\">&quot;false&quot;</font>&nbsp;");
        array[29].put(DatabaseHelperTypeIn.ANSWER_1, "false");
        array[29].put(DatabaseHelperTypeIn.ANSWER_2, "false");
        array[29].put(DatabaseHelperTypeIn.ANSWER_3, "false");
        array[29].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Выражение с тернарным оператором возвращает значение false ( читается как если 1 > 0 то выполняем выражение 1 если нет то выражение 2, следовательно должно выполняться условие для else.</p>"
        );

        //___030_____________________________________________________________________________________________________________________
        array[30] = new ContentValues();
        array[30].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что напечатает следующий код?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Integer</font>&nbsp;x&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Integer</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font><font color=\"#009900\">&#40;</font>x&nbsp;<font color=\"#339933\">==</font>&nbsp;i<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;true&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">else</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;false&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[30].put(DatabaseHelperTypeIn.ANSWER_1, "true");
        array[30].put(DatabaseHelperTypeIn.ANSWER_2, "true");
        array[30].put(DatabaseHelperTypeIn.ANSWER_3, "true");
        array[30].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>При компиляции, компилятор добавит к выражению сравнения intValue(), т.е получится x.intValue() == i</p>"
        );

        //___031_____________________________________________________________________________________________________________________
        array[31] = new ContentValues();
        array[31].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Каким будет результат выполнения данного кода?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">+=</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;i<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">?</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">:</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">3</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//1&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[31].put(DatabaseHelperTypeIn.ANSWER_1, "3");
        array[31].put(DatabaseHelperTypeIn.ANSWER_2, "3");
        array[31].put(DatabaseHelperTypeIn.ANSWER_3, "3");
        array[31].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>В данном примере используется условное выражение (условие) ? (значение1) : (значение2) . В этом выражении перед знаком вопроса ставится условие, а после него через : идут 2 возвращаемых значения. Первое будет возвращено в случае если условие вернёт значение true, в противном случае будет возвращено 2-ое значение.</p>"
        );

        //___032_____________________________________________________________________________________________________________________
        array[32] = new ContentValues();
        array[32].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено на экран?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;f<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#339933\">++</font>f&nbsp;<font color=\"#339933\">+</font>&nbsp;f<font color=\"#339933\">++;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>f<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[32].put(DatabaseHelperTypeIn.ANSWER_1, "12");
        array[32].put(DatabaseHelperTypeIn.ANSWER_2, "12");
        array[32].put(DatabaseHelperTypeIn.ANSWER_3, "12");
        array[32].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><b>Дело происходит так:</b></p>"+
                "<p>1. значение f равно 5</p>"+
                "<p>2. ++f вычисляется как 6 (значение f равно 6)</p>"+
                "<p>3. f++ вычисляется как 6 (значение f становится 7)</p>"+
                "<p>4. в f записывается сумма 6 + 6 = 12</p>"
        );

        //___033_____________________________________________________________________________________________________________________
        array[33] = new ContentValues();
        array[33].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В какой строке произойдет ошибка компиляции (номер)?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Bar&nbsp;<font color=\"#000000\">extends</font>&nbsp;Foo&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;1&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#666666\">//&nbsp;2&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">print</font><font color=\"#009900\">&#40;</font>sum<font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;3&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;Foo&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;sum<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;x,&nbsp;<font color=\"#000066\">int</font>&nbsp;y<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;x&nbsp;<font color=\"#339933\">+</font>&nbsp;y<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[33].put(DatabaseHelperTypeIn.ANSWER_1, "3");
        array[33].put(DatabaseHelperTypeIn.ANSWER_2, "3");
        array[33].put(DatabaseHelperTypeIn.ANSWER_3, "3");
        array[33].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Ошибка компиляции в строке 3, так как нельзя вызывать нестатический метод из статического контекста</p>"
        );

        //___034_____________________________________________________________________________________________________________________
        array[34] = new ContentValues();
        array[34].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В какой строке произойдет ошибка компиляции (номер)?</h1>" +
                "<font color=\"#000000\">class</font>&nbsp;MyException1&nbsp;<font color=\"#000000\">extends</font>&nbsp;<font color=\"#003399\">Exception</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;1&nbsp;</font><br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;MyException2&nbsp;<font color=\"#000000\">extends</font>&nbsp;<font color=\"#003399\">RuntimeException</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;2&nbsp;</font><br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;m1<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#000000\">throw</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;MyException1<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;3&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;m2<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#000000\">throw</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;MyException2<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;4&nbsp;</font>");
        array[34].put(DatabaseHelperTypeIn.ANSWER_1, "3");
        array[34].put(DatabaseHelperTypeIn.ANSWER_2, "3");
        array[34].put(DatabaseHelperTypeIn.ANSWER_3, "3");
        array[34].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Исключение MyException1 является checked, поэтому нуждается в обработке методом m1().</p>"
        );

        //___035_____________________________________________________________________________________________________________________
        array[35] = new ContentValues();
        array[35].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Назовите элемент множества, определяющий конкретный элемент массива.</h1>");
        array[35].put(DatabaseHelperTypeIn.ANSWER_1, "индекс");
        array[35].put(DatabaseHelperTypeIn.ANSWER_2, "индекс");
        array[35].put(DatabaseHelperTypeIn.ANSWER_3, "индекс");
        array[35].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Массив — это структура данных, в которой хранятся величины одинакового типа. Доступ к отдельному элементу массива осуществляется с помощью целого индекса. Например, если а — массив целых чисел, то значение выражения а [ i ] равно i-му целому числу в массиве.<br>\n" +
                "<br>\n" +
                "Массив объявляется следующим образом: сначала указывается тип массива, т.е тип элементов, содержащихся в массиве, за которым ставится пара пустых квадратных скобок, а затем — имя переменной. Например, вот как объявляется массив, состоящий из целых чисел:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;a<font color=\"#339933\">;</font>" +
                "<p>Однако этот оператор лишь объявляет переменную а, не инициализируя ее настоящим массивом. Чтобы создать массив, нужно применить оператор new.</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">;</font>" +
                "<p>Этот оператор создает массив, состоящий из 100 целых чисел. Элементы этого массива нумеруются от 0 до 99 (а не от 1 до 100). После создания массив можно заполнять, например, с помощью цикла.</p>" +
                "<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;а&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;a<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;Заполняет&nbsp;массив&nbsp;числами&nbsp;от&nbsp;0&nbsp;до&nbsp;99.</font>" +
                "<p>Если вы попытаетесь обратиться к элементу а [100] (или любому другому элементу, индекс которого выходит за пределы диапазона от 0 до 99), создав массив, состоящий из 100 элементов, программа прекратит работу, поскольку возникнет исключительная ситуация, связанная с выходом индекса массива за пределы допустимого диапазона.\n" +
                "Чтобы подсчитать количество элементов в массиве, используйте метод имя Массива.length.</p>" +
                "<p>Например,</p>" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;a.&nbsp;<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font>&nbsp;<font color=\"#009900\">&#40;</font>a<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>После создания массива изменить его размер невозможно (хотя можно, конечно, изменять отдельные его элементы). Если в ходе выполнения программы необходимо часто изменять размер массива, лучше использовать другую структуру данных, называемую списком массивов (array list).</p>" +
                "<p>Массив можно объявить двумя способами:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;a<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "или&nbsp;<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>" +
                "<p>Большинство программистов на языке Java предпочитают первый стиль, поскольку в нем четче отделяется тип массива int [ ] (целочисленный массив) от имени переменной.</p>" +
                "<h1>Инициализаторы массивов и безымянные массивы</h1>" +
                "<p>В языке Java есть средство для одновременного создания массива и его инициализации. Вот пример такой синтаксической конструкции:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;smallPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">11</font>,&nbsp;<font color=\"#cc66cc\">13</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>" +
                "<p>Отметим, что в этом случае не нужно применять оператор new. Кроме того, можно даже инициализировать безымянный массив:</p>"+
                "<p><font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">16</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>&nbsp;,&nbsp;<font color=\"#cc66cc\">29</font>&nbsp;,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font><font color=\"#009900\">&#125;</font></p>"+
                "<p>Это выражение выделяет память для нового массива и заполняет его числами, указанными в фигурных скобках. При этом подсчитывается их количество и, соответственно, определяется размер массива. Эту синтаксическую конструкцию удобно применять для повторной инициализации массива без образования новой переменной. Например, выражение</p>"+
                "<p>smallPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">17</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>,&nbsp;<font color=\"#cc66cc\">29</font>,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font></p>"+
                "<p>представляет собой укороченную запись выражения </p>"+
                "<p><font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;anonymous&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">17</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>,&nbsp;<font color=\"#cc66cc\">29</font>,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "smailPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;anonymous<font color=\"#339933\">;</font></p>"+
                "<p>Можно создать массив нулевого размера. Такой массив может оказаться полезным при написании метода, вычисляющего некий массив, который оказывается пустым. Массив нулевой длины объявляется следующим образом:</p>"+
                "<p><font color=\"#000000\">new</font>&nbsp;тип&nbsp;Элементов<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font></p>"+
                "<p>Заметим, что такой массив не эквивалентен объекту null.</p>"+
                "<h1>Копирование массивов</h1>"+
                "<p>Один массив можно скопировать в другой, но при этом обе переменные будут ссылаться на один и тот же массив.</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;luckyNumbers&nbsp;<font color=\"#339933\">=</font>&nbsp;smailPrimes<font color=\"#339933\">;</font><br/>\n" +
                "luckyNuimbers<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">5</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">12</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;Теперь&nbsp;элемент&nbsp;smailPrimes[5]также&nbsp;равен&nbsp;12.</font>"+
                "<p>\n" +
                "Результат показан на рис. 3.1. Если необходимо скопировать все элементы одного массива в другой, следует использовать метод arraycopy из класса System. Его вызов выглядит следующим образом:</p>" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">arraycopy</font><font color=\"#009900\">&#40;</font>from,&nbsp;fromlndex,&nbsp;to,&nbsp;tolndex,&nbsp;count<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Массив to должен иметь достаточный размер, чтобы в нем поместились все копируемые элементы.</p>"+
                "<p>Например, показанные ниже операторы, результаты работы которых изображены на рис. 3.2, создают два массива, а затем копируют последние четыре элемента первого массива во второй. Копирование начинается со второй позиции в исходном массиве, а копируемые элементы помещаются в целевой массив, начиная с третьей позиции.</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;smailPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">11</font>,&nbsp;<font color=\"#cc66cc\">13</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;luckyNumbers&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1001</font>,&nbsp;<font color=\"#cc66cc\">1002</font>,&nbsp;<font color=\"#cc66cc\">1003</font>,&nbsp;<font color=\"#cc66cc\">1004</font>,&nbsp;<font color=\"#cc66cc\">1005</font>,&nbsp;<font color=\"#cc66cc\">1006</font>,&nbsp;<font color=\"#cc66cc\">1007</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.аггаусору<font color=\"#009900\">&#40;</font>smailPrimes,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;luckyNumbers,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;luckyNumbers.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">+</font>.<font color=\"#0000ff\">&quot;:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;luckyNumbersfi<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Выполнение этих операторов приводит к следующему результату.</p>"+
                "<font color=\"#cc66cc\">0</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1001</font><br/>\n" +
                "<font color=\"#cc66cc\">1</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1002</font><br/>\n" +
                "<font color=\"#cc66cc\">2</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1003</font><br/>\n" +
                "<font color=\"#cc66cc\">3</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">5</font><br/>\n" +
                "<font color=\"#cc66cc\">4</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">7</font><br/>\n" +
                "<font color=\"#cc66cc\">5</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">11</font><br/>\n" +
                "<font color=\"#cc66cc\">6</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">13</font><br/>\n" +
                "&nbsp;"+
                "<p>Массив в языке Java значительно отличается от массива в языке C++. Однако он практически совпадает с указателем на динамический массив. Это значит, что оператор</p>"+
                "<p><font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//Java</font></p>"+
                "<p>эквивалентен оператору</p>"+
                "<p>i&nbsp;n&nbsp;t&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;i&nbsp;n&nbsp;t&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#cc66cc\">1</font>&nbsp;<font color=\"#cc66cc\">0</font>&nbsp;<font color=\"#cc66cc\">0</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;C++,</font><br/>\n" +
                "а&nbsp;не<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;C++</font></p>"+
                "<p>В языке Java оператор [ ] no умолчанию проверяет диапазон изменения индексов. Кроме того, в языке Java нет арифметики указателей — нельзя увеличить указатель а, чтобы обратиться к следующему элементу массива.</p>"
        );

        //___036_____________________________________________________________________________________________________________________
        array[36] = new ContentValues();
        array[36].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено на экран?</h1>" +
                "&nbsp;<br/>\n" +
                "A<font color=\"#339933\">:=</font><font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font><br/>\n" +
                "B<font color=\"#339933\">:=</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">DO</font>&nbsp;<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;B<font color=\"#339933\">:=</font>B<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<font color=\"#000000\">WHILE</font>&nbsp;<font color=\"#009900\">&#40;</font>B<font color=\"#339933\">&lt;=</font>A<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "OUTPUT&nbsp;B<font color=\"#339933\">;</font>");
        array[36].put(DatabaseHelperTypeIn.ANSWER_1, "6");
        array[36].put(DatabaseHelperTypeIn.ANSWER_2, "6");
        array[36].put(DatabaseHelperTypeIn.ANSWER_3, "6");
        array[36].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Цикл с постусловием, сначала делается B+1, затем проверяется условие цикла. В итоге B=6.</p>" +
                "<p>Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть следующие виды циклов:</p>"+
                "<ul>" +
                "<li>for</li>"+
                "<li>while</li>"+
                "<li>do...while</li>"+
                "</ul>"+
                "<h1>Цикл for</h1>"+
                "<p>Цикл for имеет следующее формальное определение:</p>"+
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#91;</font>инициализация&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>условие<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>изменение&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Рассмотрим стандартный цикл for:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Первая часть объявления цикла - <code>int i = 1</code> создает и инициализирует счетчик i. Счетчик необязательно должен представлять тип \n" +
                "<code>int</code>. Это может быть и любой другой числовой тип, например, float. Перед выполнением цикла значение счетчика будет равно 1. В данном \n" +
                "случае это то же самое, что и объявление переменной.</p>\n" +
                "<p>Вторая часть - условие, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока i не достигнет 9.</p>\n" +
                "<p>И третья часть - приращение счетчика на единицу. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: <code>i--</code>.</p>\n" +
                "<p>В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И каждый раз это значение будет увеличиваться на 1.</p>\n" +
                "<p>Нам необязательно указывать все условия при объявлении цикла. Например, мы можем написать так:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: <code>for (; ;)</code>. Теперь нет \n" +
                "инициализированной переменной-счетчика, нет условия, поэтому цикл будет работать вечно - бесконечный цикл.</p>\n" +
                "<p>Либо можно опустить ряд блоков:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;i<font color=\"#339933\">++;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Этот пример эквивалентен первому примеру: у нас также есть счетчик, только создан он вне цикла. У нас есть условие выполнения цикла. \n" +
                "И есть приращение счетчика уже в самом блоке for.</p>\n" +
                "<p>Специальная версия цикла <code>for</code> предназначена для перебора элементов в наборах элементов, например, в массивах и коллекциях. \n" +
                "Она аналогична действию цикла <span class=\"bb\">foreach </span>, который имеется в других языках программирования. Формальное ее объявление:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font>тип_данных&nbsp;название_переменной&nbsp;<font color=\"#339933\">:</font>&nbsp;контейнер<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">:</font>&nbsp;array<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В качестве контейнера в данном случае выступает массив данных типа <code>int</code>. Затем объявляется переменная с типом <code>int</code></p>\n" +
                "<p>То же самое можно было бы сделать и с помощью обычной версии for:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В то же время эта версия цикла for более гибкая по сравнению for (int i : array). В частности, в этой версии мы можем изменять элементы:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font>array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p><b>Перебор многомерных массивов в цикле</b></p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">8</font>,&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;j<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;j<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;%d&nbsp;&quot;</font>,&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font>j<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки. Подобным образом можно перебрать и трехмерные массивы и наборы с большим количеством размерностей.</p>"+
                "<h1>Цикл do</h1>"+
                "<p>Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно, цикл повторяется. Например:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">7</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>В данном случае код цикла сработает 7 раз, пока j не окажется равным нулю. Важно отметить, что цикл do гарантирует хотя бы однократное выполнение действий, даже если условие в инструкции while не будет истинно. Так, мы можем написать:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#339933\">-</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.</p>"+
                "<h1>Цикл while</h1>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<h1>Операторы continue и break</h1>"+
                "<p>Иногда требуется выйти из цикла, не дожидаясь его завершения. В этом случае мы можем воспользоваться оператором break.\n" +
                "\n" +
                "Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">break</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Так как в цикле идет проверка, больше ли элемент массива 10, то мы не увидим на консоли последние два элемента, так как когда \n" +
                "nums[i] окажется больше 10 (то есть равно 12), сработает оператор break, и цикл завершится.</p>\n" +
                "<p>Правда, мы также не увидим и последнего элемента, который меньше 10. Теперь сделаем так, чтобы если число больше 10, цикл не завершался, а просто переходил к следующему элементу. \n" +
                "Для этого используем оператор <b>continue</b>:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">continue</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В этом случае, когда выполнение цикла дойдет до числа 12, которое не удовлетворяет условию проверки, то программа просто пропустит это число и перейдет к следующему элементу массива.</p>"

        );

        //___037_____________________________________________________________________________________________________________________
        array[37] = new ContentValues();
        array[37].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой будет результат выполнения псевдокода?</h1>" +
                "BEGIN&nbsp;&nbsp;<br/>\n" +
                "m&nbsp;<font color=\"#339933\">:=</font>&nbsp;<font color=\"#cc66cc\">1</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#000000\">DO</font>&nbsp;<br/>\n" +
                "m<font color=\"#339933\">:=</font>m<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">WHILE</font>&nbsp;<font color=\"#000066\">FALSE</font>&nbsp;<br/>\n" +
                "OUTPUT&nbsp;m&nbsp;&nbsp;<br/>\n" +
                "END&nbsp;");
        array[37].put(DatabaseHelperTypeIn.ANSWER_1, "2");
        array[37].put(DatabaseHelperTypeIn.ANSWER_2, "2");
        array[37].put(DatabaseHelperTypeIn.ANSWER_3, "2");
        array[37].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Конструкция DO-WHILE предполагает выполнение тела цикла минимум 1 раз</p>" +
                "<p>Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть следующие виды циклов:</p>"+
                "<ul>" +
                "<li>for</li>"+
                "<li>while</li>"+
                "<li>do...while</li>"+
                "</ul>"+
                "<h1>Цикл for</h1>"+
                "<p>Цикл for имеет следующее формальное определение:</p>"+
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#91;</font>инициализация&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>условие<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>изменение&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Рассмотрим стандартный цикл for:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Первая часть объявления цикла - <code>int i = 1</code> создает и инициализирует счетчик i. Счетчик необязательно должен представлять тип \n" +
                "<code>int</code>. Это может быть и любой другой числовой тип, например, float. Перед выполнением цикла значение счетчика будет равно 1. В данном \n" +
                "случае это то же самое, что и объявление переменной.</p>\n" +
                "<p>Вторая часть - условие, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока i не достигнет 9.</p>\n" +
                "<p>И третья часть - приращение счетчика на единицу. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: <code>i--</code>.</p>\n" +
                "<p>В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И каждый раз это значение будет увеличиваться на 1.</p>\n" +
                "<p>Нам необязательно указывать все условия при объявлении цикла. Например, мы можем написать так:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: <code>for (; ;)</code>. Теперь нет \n" +
                "инициализированной переменной-счетчика, нет условия, поэтому цикл будет работать вечно - бесконечный цикл.</p>\n" +
                "<p>Либо можно опустить ряд блоков:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;i<font color=\"#339933\">++;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Этот пример эквивалентен первому примеру: у нас также есть счетчик, только создан он вне цикла. У нас есть условие выполнения цикла. \n" +
                "И есть приращение счетчика уже в самом блоке for.</p>\n" +
                "<p>Специальная версия цикла <code>for</code> предназначена для перебора элементов в наборах элементов, например, в массивах и коллекциях. \n" +
                "Она аналогична действию цикла <span class=\"bb\">foreach </span>, который имеется в других языках программирования. Формальное ее объявление:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font>тип_данных&nbsp;название_переменной&nbsp;<font color=\"#339933\">:</font>&nbsp;контейнер<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">:</font>&nbsp;array<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В качестве контейнера в данном случае выступает массив данных типа <code>int</code>. Затем объявляется переменная с типом <code>int</code></p>\n" +
                "<p>То же самое можно было бы сделать и с помощью обычной версии for:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В то же время эта версия цикла for более гибкая по сравнению for (int i : array). В частности, в этой версии мы можем изменять элементы:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font>array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p><b>Перебор многомерных массивов в цикле</b></p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">8</font>,&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;j<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;j<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;%d&nbsp;&quot;</font>,&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font>j<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки. Подобным образом можно перебрать и трехмерные массивы и наборы с большим количеством размерностей.</p>"+
                "<h1>Цикл do</h1>"+
                "<p>Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно, цикл повторяется. Например:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">7</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>В данном случае код цикла сработает 7 раз, пока j не окажется равным нулю. Важно отметить, что цикл do гарантирует хотя бы однократное выполнение действий, даже если условие в инструкции while не будет истинно. Так, мы можем написать:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#339933\">-</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.</p>"+
                "<h1>Цикл while</h1>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<h1>Операторы continue и break</h1>"+
                "<p>Иногда требуется выйти из цикла, не дожидаясь его завершения. В этом случае мы можем воспользоваться оператором break.\n" +
                "\n" +
                "Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">break</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Так как в цикле идет проверка, больше ли элемент массива 10, то мы не увидим на консоли последние два элемента, так как когда \n" +
                "nums[i] окажется больше 10 (то есть равно 12), сработает оператор break, и цикл завершится.</p>\n" +
                "<p>Правда, мы также не увидим и последнего элемента, который меньше 10. Теперь сделаем так, чтобы если число больше 10, цикл не завершался, а просто переходил к следующему элементу. \n" +
                "Для этого используем оператор <b>continue</b>:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">continue</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В этом случае, когда выполнение цикла дойдет до числа 12, которое не удовлетворяет условию проверки, то программа просто пропустит это число и перейдет к следующему элементу массива.</p>"
        );

        //___038_____________________________________________________________________________________________________________________
        array[38] = new ContentValues();
        array[38].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В результате выполнения цикла (псевдокод) изменится ли порядок элементов в массиве на обратный? (всего N элементов, нумерация с 1) Да или Нет?</h1>" +
                "<font color=\"#000000\">FOR</font>&nbsp;i&nbsp;<font color=\"#339933\">:=</font>&nbsp;<font color=\"#cc66cc\">1</font>&nbsp;TO&nbsp;N&nbsp;<font color=\"#000000\">DO</font>&nbsp;BEGIN<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;t&nbsp;<font color=\"#339933\">:=</font>&nbsp;X<font color=\"#009900\">&#91;</font>N<font color=\"#339933\">-</font>i<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><font color=\"#009900\">&#93;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X<font color=\"#009900\">&#91;</font>N<font color=\"#339933\">-</font>i<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">:=</font>&nbsp;X<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">:=</font>&nbsp;t<br/>\n" +
                "END");
        array[38].put(DatabaseHelperTypeIn.ANSWER_1, "нет");
        array[38].put(DatabaseHelperTypeIn.ANSWER_2, "нет");
        array[38].put(DatabaseHelperTypeIn.ANSWER_3, "нет");
        array[38].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Чтобы инвертировать порядок элементов при таком подходе нужно выполнять цикл до середины массива</p>" +
                "<p>Массив — это структура данных, в которой хранятся величины одинакового типа. Доступ к отдельному элементу массива осуществляется с помощью целого индекса. Например, если а — массив целых чисел, то значение выражения а [ i ] равно i-му целому числу в массиве.<br>\n" +
                "<br>\n" +
                "Массив объявляется следующим образом: сначала указывается тип массива, т.е тип элементов, содержащихся в массиве, за которым ставится пара пустых квадратных скобок, а затем — имя переменной. Например, вот как объявляется массив, состоящий из целых чисел:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;a<font color=\"#339933\">;</font>" +
                "<p>Однако этот оператор лишь объявляет переменную а, не инициализируя ее настоящим массивом. Чтобы создать массив, нужно применить оператор new.</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">;</font>" +
                "<p>Этот оператор создает массив, состоящий из 100 целых чисел. Элементы этого массива нумеруются от 0 до 99 (а не от 1 до 100). После создания массив можно заполнять, например, с помощью цикла.</p>" +
                "<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;а&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">100</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;a<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;Заполняет&nbsp;массив&nbsp;числами&nbsp;от&nbsp;0&nbsp;до&nbsp;99.</font>" +
                "<p>Если вы попытаетесь обратиться к элементу а [100] (или любому другому элементу, индекс которого выходит за пределы диапазона от 0 до 99), создав массив, состоящий из 100 элементов, программа прекратит работу, поскольку возникнет исключительная ситуация, связанная с выходом индекса массива за пределы допустимого диапазона.\n" +
                "Чтобы подсчитать количество элементов в массиве, используйте метод имя Массива.length.</p>" +
                "<p>Например,</p>" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;a.&nbsp;<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font>&nbsp;<font color=\"#009900\">&#40;</font>a<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>После создания массива изменить его размер невозможно (хотя можно, конечно, изменять отдельные его элементы). Если в ходе выполнения программы необходимо часто изменять размер массива, лучше использовать другую структуру данных, называемую списком массивов (array list).</p>" +
                "<p>Массив можно объявить двумя способами:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;a<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "или&nbsp;<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>" +
                "<p>Большинство программистов на языке Java предпочитают первый стиль, поскольку в нем четче отделяется тип массива int [ ] (целочисленный массив) от имени переменной.</p>" +
                "<h1>Инициализаторы массивов и безымянные массивы</h1>" +
                "<p>В языке Java есть средство для одновременного создания массива и его инициализации. Вот пример такой синтаксической конструкции:</p>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;smallPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">11</font>,&nbsp;<font color=\"#cc66cc\">13</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>" +
                "<p>Отметим, что в этом случае не нужно применять оператор new. Кроме того, можно даже инициализировать безымянный массив:</p>"+
                "<p><font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">16</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>&nbsp;,&nbsp;<font color=\"#cc66cc\">29</font>&nbsp;,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font><font color=\"#009900\">&#125;</font></p>"+
                "<p>Это выражение выделяет память для нового массива и заполняет его числами, указанными в фигурных скобках. При этом подсчитывается их количество и, соответственно, определяется размер массива. Эту синтаксическую конструкцию удобно применять для повторной инициализации массива без образования новой переменной. Например, выражение</p>"+
                "<p>smallPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">17</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>,&nbsp;<font color=\"#cc66cc\">29</font>,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font></p>"+
                "<p>представляет собой укороченную запись выражения </p>"+
                "<p><font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;anonymous&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">17</font>,&nbsp;<font color=\"#cc66cc\">19</font>,&nbsp;<font color=\"#cc66cc\">23</font>,&nbsp;<font color=\"#cc66cc\">29</font>,&nbsp;<font color=\"#cc66cc\">31</font>,&nbsp;<font color=\"#cc66cc\">37</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "smailPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;anonymous<font color=\"#339933\">;</font></p>"+
                "<p>Можно создать массив нулевого размера. Такой массив может оказаться полезным при написании метода, вычисляющего некий массив, который оказывается пустым. Массив нулевой длины объявляется следующим образом:</p>"+
                "<p><font color=\"#000000\">new</font>&nbsp;тип&nbsp;Элементов<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font></p>"+
                "<p>Заметим, что такой массив не эквивалентен объекту null.</p>"+
                "<h1>Копирование массивов</h1>"+
                "<p>Один массив можно скопировать в другой, но при этом обе переменные будут ссылаться на один и тот же массив.</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;luckyNumbers&nbsp;<font color=\"#339933\">=</font>&nbsp;smailPrimes<font color=\"#339933\">;</font><br/>\n" +
                "luckyNuimbers<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">5</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">12</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;Теперь&nbsp;элемент&nbsp;smailPrimes[5]также&nbsp;равен&nbsp;12.</font>"+
                "<p>\n" +
                "Результат показан на рис. 3.1. Если необходимо скопировать все элементы одного массива в другой, следует использовать метод arraycopy из класса System. Его вызов выглядит следующим образом:</p>" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">arraycopy</font><font color=\"#009900\">&#40;</font>from,&nbsp;fromlndex,&nbsp;to,&nbsp;tolndex,&nbsp;count<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Массив to должен иметь достаточный размер, чтобы в нем поместились все копируемые элементы.</p>"+
                "<p>Например, показанные ниже операторы, результаты работы которых изображены на рис. 3.2, создают два массива, а затем копируют последние четыре элемента первого массива во второй. Копирование начинается со второй позиции в исходном массиве, а копируемые элементы помещаются в целевой массив, начиная с третьей позиции.</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;smailPrimes&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">11</font>,&nbsp;<font color=\"#cc66cc\">13</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;luckyNumbers&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1001</font>,&nbsp;<font color=\"#cc66cc\">1002</font>,&nbsp;<font color=\"#cc66cc\">1003</font>,&nbsp;<font color=\"#cc66cc\">1004</font>,&nbsp;<font color=\"#cc66cc\">1005</font>,&nbsp;<font color=\"#cc66cc\">1006</font>,&nbsp;<font color=\"#cc66cc\">1007</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.аггаусору<font color=\"#009900\">&#40;</font>smailPrimes,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;luckyNumbers,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;luckyNumbers.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">+</font>.<font color=\"#0000ff\">&quot;:&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;luckyNumbersfi<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Выполнение этих операторов приводит к следующему результату.</p>"+
                "<font color=\"#cc66cc\">0</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1001</font><br/>\n" +
                "<font color=\"#cc66cc\">1</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1002</font><br/>\n" +
                "<font color=\"#cc66cc\">2</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">1003</font><br/>\n" +
                "<font color=\"#cc66cc\">3</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">5</font><br/>\n" +
                "<font color=\"#cc66cc\">4</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">7</font><br/>\n" +
                "<font color=\"#cc66cc\">5</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">11</font><br/>\n" +
                "<font color=\"#cc66cc\">6</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#cc66cc\">13</font><br/>\n" +
                "&nbsp;"+
                "<p>Массив в языке Java значительно отличается от массива в языке C++. Однако он практически совпадает с указателем на динамический массив. Это значит, что оператор</p>"+
                "<p><font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//Java</font></p>"+
                "<p>эквивалентен оператору</p>"+
                "<p>i&nbsp;n&nbsp;t&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;i&nbsp;n&nbsp;t&nbsp;<font color=\"#009900\">&#91;</font>&nbsp;<font color=\"#cc66cc\">1</font>&nbsp;<font color=\"#cc66cc\">0</font>&nbsp;<font color=\"#cc66cc\">0</font>&nbsp;<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;C++,</font><br/>\n" +
                "а&nbsp;не<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#91;</font><font color=\"#cc66cc\">100</font><font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;C++</font></p>"+
                "<p>В языке Java оператор [ ] no умолчанию проверяет диапазон изменения индексов. Кроме того, в языке Java нет арифметики указателей — нельзя увеличить указатель а, чтобы обратиться к следующему элементу массива.</p>"
        );

        //___039_____________________________________________________________________________________________________________________
        array[39] = new ContentValues();
        array[39].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Каким будет значение N в результате его выполнения?</h1>" +
                "BEGIN<br/>\n" +
                "I<font color=\"#339933\">:=</font><font color=\"#cc66cc\">10</font><br/>\n" +
                "N<font color=\"#339933\">:=</font><font color=\"#cc66cc\">0</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">DO</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*или&nbsp;REPEAT*/</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;N<font color=\"#339933\">:=</font>N<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I<font color=\"#339933\">:=</font>I<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">WHILE</font><font color=\"#009900\">&#40;</font>I<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*или&nbsp;UNTIL(I&gt;=10)*/</font><br/>\n" +
                "END<br/>\n" +
                "&nbsp;<br/>\n" +
                "OUTPUT&nbsp;N");
        array[39].put(DatabaseHelperTypeIn.ANSWER_1, "10");
        array[39].put(DatabaseHelperTypeIn.ANSWER_2, "10");
        array[39].put(DatabaseHelperTypeIn.ANSWER_3, "10");
        array[39].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Цикл с постусловием — цикл, в котором тело всегда выполняется хотя бы один раз, а условие проверяется уже после выполнения тела</p>" +
                "<p>Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть следующие виды циклов:</p>"+
                "<ul>" +
                "<li>for</li>"+
                "<li>while</li>"+
                "<li>do...while</li>"+
                "</ul>"+
                "<h1>Цикл for</h1>"+
                "<p>Цикл for имеет следующее формальное определение:</p>"+
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#91;</font>инициализация&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>условие<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>изменение&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Рассмотрим стандартный цикл for:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Первая часть объявления цикла - <code>int i = 1</code> создает и инициализирует счетчик i. Счетчик необязательно должен представлять тип \n" +
                "<code>int</code>. Это может быть и любой другой числовой тип, например, float. Перед выполнением цикла значение счетчика будет равно 1. В данном \n" +
                "случае это то же самое, что и объявление переменной.</p>\n" +
                "<p>Вторая часть - условие, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока i не достигнет 9.</p>\n" +
                "<p>И третья часть - приращение счетчика на единицу. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: <code>i--</code>.</p>\n" +
                "<p>В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И каждый раз это значение будет увеличиваться на 1.</p>\n" +
                "<p>Нам необязательно указывать все условия при объявлении цикла. Например, мы можем написать так:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: <code>for (; ;)</code>. Теперь нет \n" +
                "инициализированной переменной-счетчика, нет условия, поэтому цикл будет работать вечно - бесконечный цикл.</p>\n" +
                "<p>Либо можно опустить ряд блоков:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;i<font color=\"#339933\">++;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Этот пример эквивалентен первому примеру: у нас также есть счетчик, только создан он вне цикла. У нас есть условие выполнения цикла. \n" +
                "И есть приращение счетчика уже в самом блоке for.</p>\n" +
                "<p>Специальная версия цикла <code>for</code> предназначена для перебора элементов в наборах элементов, например, в массивах и коллекциях. \n" +
                "Она аналогична действию цикла <span class=\"bb\">foreach </span>, который имеется в других языках программирования. Формальное ее объявление:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font>тип_данных&nbsp;название_переменной&nbsp;<font color=\"#339933\">:</font>&nbsp;контейнер<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">:</font>&nbsp;array<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В качестве контейнера в данном случае выступает массив данных типа <code>int</code>. Затем объявляется переменная с типом <code>int</code></p>\n" +
                "<p>То же самое можно было бы сделать и с помощью обычной версии for:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В то же время эта версия цикла for более гибкая по сравнению for (int i : array). В частности, в этой версии мы можем изменять элементы:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font>array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p><b>Перебор многомерных массивов в цикле</b></p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">8</font>,&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;j<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;j<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;%d&nbsp;&quot;</font>,&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font>j<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки. Подобным образом можно перебрать и трехмерные массивы и наборы с большим количеством размерностей.</p>"+
                "<h1>Цикл do</h1>"+
                "<p>Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно, цикл повторяется. Например:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">7</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>В данном случае код цикла сработает 7 раз, пока j не окажется равным нулю. Важно отметить, что цикл do гарантирует хотя бы однократное выполнение действий, даже если условие в инструкции while не будет истинно. Так, мы можем написать:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#339933\">-</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.</p>"+
                "<h1>Цикл while</h1>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<h1>Операторы continue и break</h1>"+
                "<p>Иногда требуется выйти из цикла, не дожидаясь его завершения. В этом случае мы можем воспользоваться оператором break.\n" +
                "\n" +
                "Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">break</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Так как в цикле идет проверка, больше ли элемент массива 10, то мы не увидим на консоли последние два элемента, так как когда \n" +
                "nums[i] окажется больше 10 (то есть равно 12), сработает оператор break, и цикл завершится.</p>\n" +
                "<p>Правда, мы также не увидим и последнего элемента, который меньше 10. Теперь сделаем так, чтобы если число больше 10, цикл не завершался, а просто переходил к следующему элементу. \n" +
                "Для этого используем оператор <b>continue</b>:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">continue</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В этом случае, когда выполнение цикла дойдет до числа 12, которое не удовлетворяет условию проверки, то программа просто пропустит это число и перейдет к следующему элементу массива.</p>"
        );

        //___040_____________________________________________________________________________________________________________________
        array[40] = new ContentValues();
        array[40].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Каким будет значение N в результате его выполнения?</h1>" +
                "BEGIN<br/>\n" +
                "I<font color=\"#339933\">:=</font><font color=\"#cc66cc\">10</font><br/>\n" +
                "N<font color=\"#339933\">:=</font><font color=\"#cc66cc\">0</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">DO</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*или&nbsp;REPEAT*/</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;N<font color=\"#339933\">:=</font>N<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;I<font color=\"#339933\">:=</font>I<font color=\"#339933\">+</font><font color=\"#cc66cc\">1</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;<font color=\"#000000\">WHILE</font><font color=\"#009900\">&#40;</font>I<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">/*или&nbsp;UNTIL(I&gt;=10)*/</font><br/>\n" +
                "END<br/>\n" +
                "&nbsp;<br/>\n" +
                "OUTPUT&nbsp;N");
        array[40].put(DatabaseHelperTypeIn.ANSWER_1, "1");
        array[40].put(DatabaseHelperTypeIn.ANSWER_2, "1");
        array[40].put(DatabaseHelperTypeIn.ANSWER_3, "1");
        array[40].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Цикл с постусловием — цикл, в котором тело всегда выполняется хотя бы один раз, а условие проверяется уже после выполнения тела</p>" +
                "<p>Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть следующие виды циклов:</p>"+
                "<ul>" +
                "<li>for</li>"+
                "<li>while</li>"+
                "<li>do...while</li>"+
                "</ul>"+
                "<h1>Цикл for</h1>"+
                "<p>Цикл for имеет следующее формальное определение:</p>"+
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#91;</font>инициализация&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>условие<font color=\"#009900\">&#93;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#91;</font>изменение&nbsp;счетчика<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "<font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Рассмотрим стандартный цикл for:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Первая часть объявления цикла - <code>int i = 1</code> создает и инициализирует счетчик i. Счетчик необязательно должен представлять тип \n" +
                "<code>int</code>. Это может быть и любой другой числовой тип, например, float. Перед выполнением цикла значение счетчика будет равно 1. В данном \n" +
                "случае это то же самое, что и объявление переменной.</p>\n" +
                "<p>Вторая часть - условие, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока i не достигнет 9.</p>\n" +
                "<p>И третья часть - приращение счетчика на единицу. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: <code>i--</code>.</p>\n" +
                "<p>В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И каждый раз это значение будет увеличиваться на 1.</p>\n" +
                "<p>Нам необязательно указывать все условия при объявлении цикла. Например, мы можем написать так:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: <code>for (; ;)</code>. Теперь нет \n" +
                "инициализированной переменной-счетчика, нет условия, поэтому цикл будет работать вечно - бесконечный цикл.</p>\n" +
                "<p>Либо можно опустить ряд блоков:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font><font color=\"#cc66cc\">9</font><font color=\"#339933\">;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Квадрат&nbsp;числа&nbsp;%d&nbsp;равен&nbsp;%d&nbsp;<font color=\"#000099\">\\n</font>&quot;</font>,&nbsp;i,&nbsp;i&nbsp;<font color=\"#339933\">*</font>&nbsp;i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;i<font color=\"#339933\">++;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Этот пример эквивалентен первому примеру: у нас также есть счетчик, только создан он вне цикла. У нас есть условие выполнения цикла. \n" +
                "И есть приращение счетчика уже в самом блоке for.</p>\n" +
                "<p>Специальная версия цикла <code>for</code> предназначена для перебора элементов в наборах элементов, например, в массивах и коллекциях. \n" +
                "Она аналогична действию цикла <span class=\"bb\">foreach </span>, который имеется в других языках программирования. Формальное ее объявление:</p>"+
                "<p><font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font>тип_данных&nbsp;название_переменной&nbsp;<font color=\"#339933\">:</font>&nbsp;контейнер<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//&nbsp;действия</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font></p>"+
                "<p>Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">:</font>&nbsp;array<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В качестве контейнера в данном случае выступает массив данных типа <code>int</code>. Затем объявляется переменная с типом <code>int</code></p>\n" +
                "<p>То же самое можно было бы сделать и с помощью обычной версии for:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В то же время эта версия цикла for более гибкая по сравнению for (int i : array). В частности, в этой версии мы можем изменять элементы:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;array&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">&lt;</font>array.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>array<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p><b>Перебор многомерных массивов в цикле</b></p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">5</font>,&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#009900\">&#125;</font>,<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">7</font>,&nbsp;<font color=\"#cc66cc\">8</font>,&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;j<font color=\"#339933\">=</font><font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;j&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;j<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">printf</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;%d&nbsp;&quot;</font>,&nbsp;nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#91;</font>j<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Сначала создается цикл для перебора по строкам, а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки. Подобным образом можно перебрать и трехмерные массивы и наборы с большим количеством размерностей.</p>"+
                "<h1>Цикл do</h1>"+
                "<p>Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно, цикл повторяется. Например:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">7</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>В данном случае код цикла сработает 7 раз, пока j не окажется равным нулю. Важно отметить, что цикл do гарантирует хотя бы однократное выполнение действий, даже если условие в инструкции while не будет истинно. Так, мы можем написать:</p>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#339933\">-</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">do</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>"+
                "<p>Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.</p>"+
                "<h1>Цикл while</h1>"+
                "<font color=\"#000066\">int</font>&nbsp;j&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font>j&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>j<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;j<font color=\"#339933\">--;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<h1>Операторы continue и break</h1>"+
                "<p>Иногда требуется выйти из цикла, не дожидаясь его завершения. В этом случае мы можем воспользоваться оператором break.\n" +
                "\n" +
                "Например:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">break</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>Так как в цикле идет проверка, больше ли элемент массива 10, то мы не увидим на консоли последние два элемента, так как когда \n" +
                "nums[i] окажется больше 10 (то есть равно 12), сработает оператор break, и цикл завершится.</p>\n" +
                "<p>Правда, мы также не увидим и последнего элемента, который меньше 10. Теперь сделаем так, чтобы если число больше 10, цикл не завершался, а просто переходил к следующему элементу. \n" +
                "Для этого используем оператор <b>continue</b>:</p>"+
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;nums&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font>,&nbsp;<font color=\"#cc66cc\">12</font>,&nbsp;<font color=\"#cc66cc\">9</font>&nbsp;<font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000000\">for</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#339933\">;</font>&nbsp;i&nbsp;<font color=\"#339933\">&lt;</font>&nbsp;nums.<font color=\"#006633\">length</font><font color=\"#339933\">;</font>&nbsp;i<font color=\"#339933\">++</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">&gt;</font>&nbsp;<font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">continue</font><font color=\"#339933\">;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>nums<font color=\"#009900\">&#91;</font>i<font color=\"#009900\">&#93;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#009900\">&#125;</font>"+
                "<p>В этом случае, когда выполнение цикла дойдет до числа 12, которое не удовлетворяет условию проверки, то программа просто пропустит это число и перейдет к следующему элементу массива.</p>"
        );

        //___041_____________________________________________________________________________________________________________________
        array[41] = new ContentValues();
        array[41].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено на экран?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Practice&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;...&nbsp;<font color=\"#006633\">args</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Boolean</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Boolean</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;/true&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>b<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Boolean</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">Boolean</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;/false&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>b&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#000066\">false</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[41].put(DatabaseHelperTypeIn.ANSWER_1, "false");
        array[41].put(DatabaseHelperTypeIn.ANSWER_2, "false");
        array[41].put(DatabaseHelperTypeIn.ANSWER_3, "false");
        array[41].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>В коде программы может находится сколько угодно методов main, главное, чтобы они отличались набором параметров (в данном случае точкой входа будет именно первый \"main\"). Ссылка \"b\" типа Boolean будет указывать на объект со значением false, согласно спецификации конструктора.</p>"
        );

        //___042_____________________________________________________________________________________________________________________
        array[42] = new ContentValues();
        array[42].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Можно ли описать конструкторы в абстрактном классе? (да или нет)</h1>" +
                "<font color=\"#000000\">abstract</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">int</font>&nbsp;p1<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;A<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;p1&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "...&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#000000\">extends</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[42].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[42].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[42].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[42].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Можно, но нельзя напрямую ими воспользоваться (потому что запрещено создавать объекты абстрактного класса).</p>" +
                "A&nbsp;ob1<font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;ошибка:&nbsp;ob1&nbsp;=&nbsp;new&nbsp;A();&nbsp;</font><br/>\n" +
                "B&nbsp;ob2&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;B<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#666666\">//&nbsp;будет&nbsp;вызван&nbsp;конструктор&nbsp;по&nbsp;умолчанию&nbsp;из&nbsp;A&nbsp;</font>" +
                "<p>Класс может быть абстрактным без единого абстрактного метода, если у него указан модификатор abstract. Класс имеющий хоть один абстрактный метод обязан быть абстрактным классом.</p>" +
                "<p>При определении метода в интерфейсе подразумевается модификатор public и abstract, но его также можно указать явно.</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">abstract</font>&nbsp;<font color=\"#000000\">interface</font>&nbsp;ITest&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "...&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );

        //___043_____________________________________________________________________________________________________________________
        array[43] = new ContentValues();
        array[43].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Возникнет ли ошибка компиляции? (да или нет)</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;method<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">throws</font>&nbsp;<font color=\"#003399\">IllegalArgumentException</font>,<font color=\"#003399\">IllegalArgumentException</font>,<font color=\"#003399\">IOException</font>,<font color=\"#003399\">IOException</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#666666\">//...&nbsp;</font><br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;");
        array[43].put(DatabaseHelperTypeIn.ANSWER_1, "нет");
        array[43].put(DatabaseHelperTypeIn.ANSWER_2, "нет");
        array[43].put(DatabaseHelperTypeIn.ANSWER_3, "нет");
        array[43].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Можно, но нельзя напрямую ими воспользоваться (потому что запрещено создавать объекты абстрактного класса).</p>" +
                "<p>Напомним иерархию исключений:</p>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Object</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#339933\">|</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Throwable</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#339933\">/</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Error</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Exception</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#339933\">|</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">RuntimeException</font>&nbsp;" +
                "<p>throws можно использовать исключительно с java.lang.Throwable, у которого два наследника: Exception и Error, т.е. checked и unchecked исключения. Таким образом, можно использовать unchecked исключения в секции throws. При этом Throwable относится к checked исключениям.</p>"
        );

        //___044_____________________________________________________________________________________________________________________
        array[44] = new ContentValues();
        array[44].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Какой из предложенных ниже методов не вызовет ошибку компиляции?</h1>" +
                "<font color=\"#cc66cc\">1</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">double</font>&nbsp;sqr<font color=\"#009900\">&#40;</font><font color=\"#000066\">double</font>&nbsp;arg<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">double</font>&nbsp;sqr<font color=\"#009900\">&#40;</font><font color=\"#000066\">double</font>&nbsp;arg<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">while</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">true</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font><br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">3</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">double</font>&nbsp;sqr<font color=\"#009900\">&#40;</font><font color=\"#000066\">double</font>&nbsp;arg<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#003399\">System</font>.<font color=\"#006633\">currentTimeMillis</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">%</font>&nbsp;<font color=\"#cc66cc\">2</font>&nbsp;<font color=\"#339933\">==</font>&nbsp;<font color=\"#cc66cc\">0</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;arg&nbsp;<font color=\"#339933\">*</font>&nbsp;arg<font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>");
        array[44].put(DatabaseHelperTypeIn.ANSWER_1, "2");
        array[44].put(DatabaseHelperTypeIn.ANSWER_2, "2");
        array[44].put(DatabaseHelperTypeIn.ANSWER_3, "2");
        array[44].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>1) метод не скомпилируется, так как он ничего не возвращает: >> COMPILATION ERROR: Missing return statement</p>"+
                "<p>2) метод скомпилируется. Можно ничего не возвращать, а «повесить метод».</p>"+
                "<p>3) метод не скомпилируется, компилятор не может удостовериться, что возврат будет. Что возвращать, если currentTimeMillis() - нечетное?</p>"+
                "<font color=\"#339933\">&gt;&gt;</font>&nbsp;COMPILATION&nbsp;ERROR<font color=\"#339933\">:</font>&nbsp;Missing&nbsp;<font color=\"#000000\">return</font>&nbsp;statement&nbsp;"
        );

        //___045_____________________________________________________________________________________________________________________
        array[45] = new ContentValues();
        array[45].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет если второй аргумент foreach в runtime окажется null?</h1>" +
                "<font color=\"#000000\">class</font>&nbsp;Test<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">Map</font>&nbsp;map&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;TestMap<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font><font color=\"#003399\">Object</font>&nbsp;o<font color=\"#339933\">:</font>&nbsp;map.<font color=\"#006633\">keySet</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>o<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000000\">class</font>&nbsp;TestMap&nbsp;<font color=\"#000000\">extends</font>&nbsp;<font color=\"#003399\">HashMap</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;@Override&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">Set</font>&nbsp;keySet<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;");
        array[45].put(DatabaseHelperTypeIn.ANSWER_1, "nullpointerpxception");
        array[45].put(DatabaseHelperTypeIn.ANSWER_2, "nullpointerpxception");
        array[45].put(DatabaseHelperTypeIn.ANSWER_3, "nullpointerpxception");
        array[45].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Цикл развернется в такую конструкцию: </p>"+
                "<font color=\"#000000\">for</font><font color=\"#009900\">&#40;</font>Iterator<font color=\"#339933\">&lt;</font>object<font color=\"#339933\">&gt;</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;map.<font color=\"#006633\">keySet</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#006633\">iterator</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;i.<font color=\"#006633\">hasNext</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;item&nbsp;<font color=\"#339933\">=</font>&nbsp;i.<font color=\"#006633\">next</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>item<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );

        //___046_____________________________________________________________________________________________________________________
        array[46] = new ContentValues();
        array[46].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что получим после выполнения кода?</h1>" +
                "<font color=\"#000066\">int</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;0xFF0<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;0xF0F<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;0x0FF<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "c&nbsp;<font color=\"#339933\">=</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font>a&nbsp;<font color=\"#339933\">^</font>&nbsp;b&nbsp;<font color=\"#339933\">|</font>&nbsp;a&nbsp;<font color=\"#339933\">&amp;</font>&nbsp;b<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">^</font>&nbsp;c<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#40;</font>c&nbsp;<font color=\"#339933\">|</font>&nbsp;a<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">^</font>&nbsp;<font color=\"#009900\">&#40;</font>c&nbsp;<font color=\"#339933\">&amp;</font>&nbsp;a<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;");
        array[46].put(DatabaseHelperTypeIn.ANSWER_1, "0");
        array[46].put(DatabaseHelperTypeIn.ANSWER_2, "0");
        array[46].put(DatabaseHelperTypeIn.ANSWER_3, "0");
        array[46].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Так как a = c, то (c | a) даст с, и (a & c) тоже даст c, ну а побитовая сума по модулю 2 даст 0, если суммировать два одинаковых числа. Ответ = 0.</p>"
        );

        //___047_____________________________________________________________________________________________________________________
        array[47] = new ContentValues();
        array[47].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>В чём причина исключения — в f или s?</h1>" +
                "&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Formatter&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;format<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;value<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">3</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;[&quot;</font><font color=\"#339933\">+</font>value<font color=\"#339933\">+</font><font color=\"#0000ff\">&quot;]&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">4</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">6</font><font color=\"#339933\">:</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">7</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;TestNPE&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">8</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#003399\">String</font>&nbsp;handle<font color=\"#009900\">&#40;</font>Formatter&nbsp;f,&nbsp;<font color=\"#003399\">String</font>&nbsp;s<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;<font color=\"#cc66cc\">9</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">if</font><font color=\"#009900\">&#40;</font>s.<font color=\"#006633\">isEmpty</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">10</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#0000ff\">&quot;(none)&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">11</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">12</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;f.<font color=\"#006633\">format</font><font color=\"#009900\">&#40;</font>s.<font color=\"#006633\">trim</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">13</font><font color=\"#339933\">:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">14</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;" +
                "<p>Откуда-то был вызван метод handle с какими-то параметрами, и было получено: </p>" +
                "<font color=\"#003399\">Exception</font>&nbsp;in&nbsp;thread&nbsp;<font color=\"#0000ff\">&quot;main&quot;</font>&nbsp;java.<font color=\"#006633\">lang</font>.<font color=\"#003399\">NullPointerException</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;at&nbsp;TestNPE.<font color=\"#006633\">handle</font><font color=\"#009900\">&#40;</font>TestNPE.<font color=\"#006633\">java</font><font color=\"#339933\">:</font><font color=\"#cc66cc\">12</font><font color=\"#009900\">&#41;</font>");
        array[47].put(DatabaseHelperTypeIn.ANSWER_1, "f");
        array[47].put(DatabaseHelperTypeIn.ANSWER_2, "f");
        array[47].put(DatabaseHelperTypeIn.ANSWER_3, "f");
        array[47].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Метод format не статический, и f вполне может быть источником ошибки. Зато s не может быть: в девятой строке уже было обращение к s. Если бы s было null, исключение бы случилось в девятой строке. Просмотр логики кода перед исключением довольно часто помогает отбросить некоторые варианты. Источник ошибки - f.</p>" +
                "<p>Если бы в девятой строчке было бы написано так:\n" +
                "if(\"\".equals(s)), то обращения к полям и методам s нет, а метод equals корректно обрабатывает null, возвращая false, поэтому в таком случае ошибку в 12-й строке мог вызвать как f, так и s.</p>"
        );

        //___048_____________________________________________________________________________________________________________________
        array[48] = new ContentValues();
        array[48].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<p>Например вы не знаете как отсортировать лист чисел и не хотите писать сортировку для листа, то очень удобно произвести конвертирование с листа в массив, вызвать сортировку для массива, и осталось вернутся обратного к листу. самый очевидный способ использовать циклы, но допустим вам сказали обойтись без циклов и ваших подпрограмм.</p>" +
                "<h1>Существует ли метод для преобразования такого типа: <font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">-&gt;</font>&nbsp;ArrayList<font color=\"#339933\">&lt;</font>Integer<font color=\"#339933\">&gt;</font>. Если да, назовите его.</h1>");
        array[48].put(DatabaseHelperTypeIn.ANSWER_1, "asList");
        array[48].put(DatabaseHelperTypeIn.ANSWER_2, "asList()");
        array[48].put(DatabaseHelperTypeIn.ANSWER_3, "Arrays.asList");
        array[48].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Такой метод существует, Arrays.asList(T... arr), только загвоздка в том что он работает для объектов, а если хотите привести int[], от нужно скомбинировать:</p>" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font>,&nbsp;<font color=\"#cc66cc\">3</font>,&nbsp;<font color=\"#cc66cc\">4</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "List<font color=\"#339933\">&lt;</font>integer<font color=\"#339933\">&gt;</font>&nbsp;intList&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">Arrays</font>.<font color=\"#006633\">asList</font><font color=\"#009900\">&#40;</font>ArrayUtils.<font color=\"#006633\">toObject</font><font color=\"#009900\">&#40;</font>a<font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>правда ArrayUtils - это уже библиотека Apache, если же вы не используете эту библиотеку, вам нужно привести массив чисел к массиву объектов циклом, а в этом случаем луче сразу добавлять элементы в лист.</p>" +
                "<p>А если использовать объекты, то все работает все хорошо</p>" +
                "<font color=\"#003399\">String</font>&nbsp;s<font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#0000ff\">&quot;a&quot;</font>,&nbsp;<font color=\"#0000ff\">&quot;b&quot;</font>,&nbsp;<font color=\"#0000ff\">&quot;c&quot;</font>,&nbsp;<font color=\"#0000ff\">&quot;d&quot;</font><font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "List<font color=\"#339933\">&lt;</font>String<font color=\"#339933\">&gt;</font>&nbsp;strList&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#003399\">Arrays</font>.<font color=\"#006633\">asList</font><font color=\"#009900\">&#40;</font>s<font color=\"#009900\">&#41;</font>&nbsp;"
        );

        //___049_____________________________________________________________________________________________________________________
        array[49] = new ContentValues();
        array[49].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет напечатано после попытки компиляции и выполнения кода</h1>" +
                "<font color=\"#000066\">int</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;mass&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#123;</font><font color=\"#cc66cc\">1</font>,&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#125;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "List<font color=\"#339933\">&lt;</font>String<font color=\"#339933\">&gt;</font>&nbsp;list&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;<font color=\"#003399\">ArrayList</font><font color=\"#009900\">&#40;</font><font color=\"#cc66cc\">10</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "list.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;03&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "list.<font color=\"#006633\">add</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;04&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>mass.<font color=\"#006633\">length</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;list.<font color=\"#006633\">size</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#0000ff\">&quot;.&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;" );
        array[49].put(DatabaseHelperTypeIn.ANSWER_1, "4");
        array[49].put(DatabaseHelperTypeIn.ANSWER_2, "4");
        array[49].put(DatabaseHelperTypeIn.ANSWER_3, "4");
        array[49].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Код успешно скомпилируется, и выдаст на экран \"4.\", так как размер массива 2, и метод size() для листа тоже выдаст 2, ибо мы добавили 2 элемента.</p>"
        );

        //___050_____________________________________________________________________________________________________________________
        array[50] = new ContentValues();
        array[50].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как вы думаете, что произойдет в результате выполнения данного кода? </h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;ab&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#000000\">extends</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;abc&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">new</font>&nbsp;Test<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#000000\">new</font>&nbsp;B<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;" );
        array[50].put(DatabaseHelperTypeIn.ANSWER_1, "nullpointerexception");
        array[50].put(DatabaseHelperTypeIn.ANSWER_2, "nullpointerexception");
        array[50].put(DatabaseHelperTypeIn.ANSWER_3, "nullpointerexception");
        array[50].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>В результате выполнения данного кода возникнет NullPointerException, так как, создавая объект класса B, сначала вызывается конструктор супер класса (родителя). В конструкторе родителя происходит вызов метода printLength(), который переопределен в подклассе (наследнике), внутри этого метода идет обращение к переменной str наследника, которая еще не проинициализирована и равна null, так как конструктор родителя еще не закончил свою работу, отсюда и исключение.</p>" +
                "<p>В действительности, вызов не финальных методов в конструкторе класса - это плохая практика, так как не статические переменные в Java инициализируются после вызова конструктора супер класса (родителя).</p>"
        );

        //___051_____________________________________________________________________________________________________________________
        array[51] = new ContentValues();
        array[51].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Как думаете, что будет передано в метод и что напечатает код?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;ab&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#000000\">extends</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">String</font>&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">&quot;abc&quot;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000066\">void</font>&nbsp;printLength<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str.<font color=\"#006633\">length</font><font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">new</font>&nbsp;Test<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>.<font color=\"#000000\">new</font>&nbsp;B<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;" );
        array[51].put(DatabaseHelperTypeIn.ANSWER_1, "value 1");
        array[51].put(DatabaseHelperTypeIn.ANSWER_2, "value 1");
        array[51].put(DatabaseHelperTypeIn.ANSWER_3, "value 1");
        array[51].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Раньше я думал, что раз String не примитив, то будет происходить передача по ссылке и новое значение (\"Value 2\") будет успешно присвоено.</p>" +
                "<p>В Java все передается по значению: и примитивы, и ссылки. Т.о. внутрь функции передается копия ссылки, которая ссылается на \"Value 1\". Присваивание данной копии значения другой ссылки (после чего она будет ссылаться на \"Value 2\") не влияет на объект, на который она изначально ссылалась.</p>" +
                "<p>Объект можно изменить по ссылке (если он не immutable как String):</p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Test&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">static</font>&nbsp;StringBuilder&nbsp;str&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#000000\">new</font>&nbsp;StringBuilder<font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;Value&nbsp;1&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;changeIt<font color=\"#009900\">&#40;</font>StringBuilder&nbsp;s<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;s.<font color=\"#006633\">append</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;2&quot;</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">static</font>&nbsp;<font color=\"#000066\">void</font>&nbsp;main<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font><font color=\"#009900\">&#91;</font><font color=\"#009900\">&#93;</font>&nbsp;args<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;changeIt<font color=\"#009900\">&#40;</font>str<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>str<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;" +
                "<p>(Напечатает Value 12)</p>"
        );

        //___052_____________________________________________________________________________________________________________________
        array[52] = new ContentValues();
        array[52].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Можно ли использовать byte[] в качестве ключа в HashMap? (да или нет)</h1>"
               );
        array[52].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[52].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[52].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[52].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><i>Во-первых.</i> Массив byte[] является экземпляром некоторого класса, который расширяет Object. Например, массивы реализуют интерфейсы-маркеры Cloneable и Serializable, чего нельзя сказать про Object.</p>\n" +
                "\n" +
                "<p><i>Во-вторых.</i> В актуальных JVM не перегруженный метод hashCode() по умолчанию возвращает псевдослучайное значение. Алгоритм генерации хэш кода может быть изменён с помощью ключа -XX:hashCode. Например, при -XX:hashCode=2 всегда будет возвращаться 1, а при -XX:hashCode=4 будет возвращаться упомянутый автором адрес объекта-массива в памяти.</p>\n" +
                "\n" +
                "<p><i>В-третьих.</i> Метод equals() для массивов не выполняет сравнение значений элементов.</p>\n" +
                "\n" +
                "<p>Окончательно, на поставленный вопрос можно дать следующий ответ - byte[] <u>можно</u> использовать в качестве ключа в HashMap.</p>"
        );

        //___053_____________________________________________________________________________________________________________________
        array[53] = new ContentValues();
        array[53].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в консоли?</h1>" +
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">++;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;"
        );
        array[53].put(DatabaseHelperTypeIn.ANSWER_1, "5");
        array[53].put(DatabaseHelperTypeIn.ANSWER_2, "5");
        array[53].put(DatabaseHelperTypeIn.ANSWER_3, "5");
        array[53].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>k = 5 +1, затем k = 5; Пост инкремент не передает значение сразу. Ответ 5.</p>"
        );

        //___054_____________________________________________________________________________________________________________________
        array[54] = new ContentValues();
        array[54].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в консоли?</h1>" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;i<font color=\"#339933\">++;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;"
        );
        array[54].put(DatabaseHelperTypeIn.ANSWER_1, "11");
        array[54].put(DatabaseHelperTypeIn.ANSWER_2, "11");
        array[54].put(DatabaseHelperTypeIn.ANSWER_3, "11");
        array[54].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Cначала инкременты, второй инкремент получает уже инкрементное значение. Т.к. это пост-инкременты конечно выражение i = 5 +6; Ответ 11.</p>"
        );

        //___055_____________________________________________________________________________________________________________________
        array[55] = new ContentValues();
        array[55].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в консоли?</h1>" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#339933\">++</font>i<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;"
        );
        array[55].put(DatabaseHelperTypeIn.ANSWER_1, "12");
        array[55].put(DatabaseHelperTypeIn.ANSWER_2, "12");
        array[55].put(DatabaseHelperTypeIn.ANSWER_3, "12");
        array[55].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Конечное выражение будет таким i = 5 + 7; Ответ 12.</p>"
        );

        //___056_____________________________________________________________________________________________________________________
        array[56] = new ContentValues();
        array[56].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Что будет выведено в консоли?</h1>" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">5</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "i&nbsp;<font color=\"#339933\">=</font>&nbsp;i<font color=\"#339933\">++</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#339933\">++</font>i<font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "<font color=\"#003399\">System</font>.<font color=\"#006633\">out</font>.<font color=\"#006633\">println</font><font color=\"#009900\">&#40;</font>i<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>&nbsp;"
        );
        array[56].put(DatabaseHelperTypeIn.ANSWER_1, "13");
        array[56].put(DatabaseHelperTypeIn.ANSWER_2, "13");
        array[56].put(DatabaseHelperTypeIn.ANSWER_3, "13");
        array[56].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Конечное выражение i = 6 +7; Ответ 13.</p>"
        );

        //___057_____________________________________________________________________________________________________________________
        array[57] = new ContentValues();
        array[57].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Будет ли разница при исполнении этих строк кода?</h1>" +
                "<font color=\"#cc66cc\">1</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;v1<font color=\"#339933\">=</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">long</font>&nbsp;v2<font color=\"#339933\">=</font><font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font>&nbsp;v1<font color=\"#339933\">=</font>v1<font color=\"#339933\">+</font>v2<font color=\"#339933\">;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#cc66cc\">2</font><font color=\"#339933\">:</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;v1<font color=\"#339933\">=</font><font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<font color=\"#000066\">long</font>&nbsp;v2<font color=\"#339933\">=</font><font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font>&nbsp;v1<font color=\"#339933\">+=</font>v2<font color=\"#339933\">;</font>&nbsp;&nbsp;"
        );
        array[57].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[57].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[57].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[57].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>При сокращённых операциях в java производится приведение типов. То есть v1+=v2 аналогична v1=(int)(v1+v2) Соответственно в первой строке будет ошибка компиляции так как long шире чем int, а вторая строка успешно выполнится.</p>" +
                "<p>Когда мы производим какие-то действия с переменными, то нужно следить за типами. Нельзя умножать котов на футбольные мячи, это противоречит здравому смыслу. Также и с переменными. Если вы присваиваете переменной одного типа значение другого типа, то вспоминайте теорию. Например, вы без проблем можете присвоить значение типа <b>int</b> переменной типа <b>long</b>, так как все числа из диапазона типа <b>int</b> гарантировано помещаются в диапазон чисел <b>long</b>. В этом случае Java выполнит преобразование автоматически, вы даже ничего не заметите.</p>\n" +
                "\n" +
                "<p>Представим обратную картину - мы хотим присвоить переменной типа <b>byte</b> значение типа <b>double</b>. Java не сможет автоматически выполнить ваше желание. Не все числа типа <b>double</b> могут стать числом типа <b>byte</b>. Но часть чисел может, например, число 9. В таком случае используется так называемое <i>приведение</i> типов, чтобы подсказать Java о допустимости операции.</p>\n" +
                "\n" +
                "<p>Итак, автоматическое преобразование типов осуществляется, если оба типа совместимы и длина целевого типа больше длины исходного типа. В этом случае происходит <i>преобразование с расширением</i>. Вы всегда можете преобразовать любое число типа <b>byte</b> в число типа <b>int</b>. Такая операция произойдёт без вашего участия автоматически.</p>\n" +
                "\n" +
                "<p>Таблица выглядит следующим образом.</p>" +
                "<p>Сплошные линии обозначают преобразования, выполняемые без потери данных. Штриховые линии говорят о том, что при преобразовании может произойти потеря точности.</p>\n" +
                "\n" +
                "<p>Типы целых чисел и чисел с плавающей точкой совместимы частично. Например, число 5 вполне может быть числом с плавающей точкой (5.0).</p>\n" +
                "\n" +
                "<p>Совсем не совместимы, например, <b>char</b> и <b>boolean</b>.</p>\n" +
                "\n" +
                "<p>С автоматическим приведением мы разобрались. Рассмотрим вариант, когда нужно преобразовать число типа <b>int</b> в число типа <b>byte</b>. Преобразование автоматически невозможно, поскольку <b>byte</b> меньше <b>int</b>. Но, например, число 99 вполне можно использовать и как <b>int</b> и как <b>byte</b>. В этом случае используется явное приведение типов, то есть преобразование из одного типа в другой (преобразование с сужением).</p>\n" +
                "\n" +
                "<p>Выглядит это следующим образом:</p>" +
                "<font color=\"#000066\">int</font>&nbsp;a<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;b<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#666666\">//&nbsp;какие-то&nbsp;операции&nbsp;с&nbsp;переменной&nbsp;</font><br/>\n" +
                "b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a<font color=\"#339933\">;</font>" +
                "<p>Как видите, вы в скобках указываете тип, к которому нужно явно привести переменную.</p>\n" +
                "\n" +
                "<p>Существует ещё вариант приведения с усечением. Это когда число с плавающей точкой приводится к целочисленному типу. В этом случае отбрасывается дробная часть (хвост). Например, число 3.14 будет усечено до числа 3:</p>" +
                "&nbsp;<br/>\n" +
                "<font color=\"#000066\">double</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">3.14</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;a<font color=\"#339933\">;</font>" +
                "<p>Если размер целочисленной части слишком велик для целочисленного типа, то значение будет уменьшено до результата деления по модулю на диапазон целевого типа.</p>\n" +
                "\n" +
                "<p>Например, попробуйте преобразовать число 454.874 в тип <b>byte</b>:</p>" +
                "<font color=\"#000066\">byte</font>&nbsp;b<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">double</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">454.874</font><font color=\"#339933\">;</font><br/>\n" +
                "b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;d<font color=\"#339933\">;</font><br/>\n" +
                "infoTextView.<font color=\"#006633\">append</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;b&nbsp;равно&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;b<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>У меня вывелся удивительный результат: b равно -58.</p>\n" +
                "\n" +
                "<p>Рассмотрим такой пример. Допустим у нас есть выражение, где промежуточное значение может выходить за пределы допустимого диапазона:</p>" +
                "<font color=\"#000066\">byte</font>&nbsp;a&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">44</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">55</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">byte</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">101</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;a&nbsp;<font color=\"#339933\">*</font>&nbsp;b&nbsp;<font color=\"#339933\">-</font>&nbsp;c<font color=\"#339933\">;</font>" +
                "<p>При умножении переменных a * b промежуточный результат вышел за пределы диапазона допустимых значений для типов <b>byte</b>. Java во время вычисления промежуточных результатов автоматически повышает тип каждого операнда до <b>int</b> и ошибки не происходит.</p>\n" +
                "\n" +
                "<p>Это удобно, но может поставить в тупик в следующем примере:</p>" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">50</font><font color=\"#339933\">;</font><br/>\n" +
                "b&nbsp;<font color=\"#339933\">=</font>&nbsp;b&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#339933\">;</font>" +
                "<p>С виду всё правильно. Если не слишком больше число типа <b>byte</b>, а итоговый результат тоже не выходит за диапазон допустимых значений. Но Java не позволит вам написать подобный код. Происходит следующее. Во время вычисления выражения тип операндов был автоматически повышен до <b>int</b>, как об этом говорилось выше. При этом тип результата тоже был повышен до <b>int</b>. Получается, что результат вычисления равен типу <b>int</b>, а мы пытаемся его присвоить переменной <b>b</b>, которая у нас объявлена как <b>byte</b>. И это несмотря на то, что итоговый результат может быть типом <b>byte</b>. Как же выйти из этого положения? Следует использовать явное приведение типов:</p>" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">50</font><font color=\"#339933\">;</font><br/>\n" +
                "b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font><font color=\"#000066\">byte</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#40;</font>b&nbsp;<font color=\"#339933\">*</font>&nbsp;<font color=\"#cc66cc\">2</font><font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>Мы рассмотрели единичные примеры. Пора обобщить и запомнить несколько правил.</p>\n" +
                "\n" +
                "<p>Типы всех значений <b>byte</b>, <b>short</b>, <b>char</b> повышаются до типа <b>int</b>, как это было рассмотрено выше.</p>\n" +
                "\n" +
                "<p>Если один операнд имеет тип <b>long</b>, то тип всего выражения повышается до <b>long</b>.</p>\n" +
                "\n" +
                "<p>Если один операнд имеет тип <b>float</b>, то тип всего выражения повышается до <b>float</b>.</p>\n" +
                "\n" +
                "<p>Если один операнд имеет тип <b>double</b>, то тип всего выражения повышается до <b>double</b>.</p>\n" +
                "\n" +
                "<p>Рассмотрим выражение:</p>" +
                "<font color=\"#000066\">byte</font>&nbsp;b&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">45</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">char</font>&nbsp;c&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#0000ff\">'c'</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">short</font>&nbsp;s&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1005</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">int</font>&nbsp;i&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">700000</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">float</font>&nbsp;f&nbsp;<font color=\"#339933\">=</font>&nbsp;4.55f<font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">double</font>&nbsp;d&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#cc66cc\">1.456</font><font color=\"#339933\">;</font><br/>\n" +
                "<font color=\"#000066\">double</font>&nbsp;result&nbsp;<font color=\"#339933\">=</font>&nbsp;<font color=\"#009900\">&#40;</font>f&nbsp;<font color=\"#339933\">*</font>&nbsp;b<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;<font color=\"#009900\">&#40;</font>i&nbsp;<font color=\"#339933\">/</font>&nbsp;c<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#339933\">-</font>&nbsp;<font color=\"#009900\">&#40;</font>d&nbsp;<font color=\"#339933\">*</font>&nbsp;s<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font><br/>\n" +
                "textViewInfo.<font color=\"#006633\">append</font><font color=\"#009900\">&#40;</font><font color=\"#0000ff\">&quot;d&nbsp;равно&nbsp;&quot;</font>&nbsp;<font color=\"#339933\">+</font>&nbsp;d<font color=\"#009900\">&#41;</font><font color=\"#339933\">;</font>" +
                "<p>В первом промежуточном выражении (f * b) тип переменной <b>b</b> повышается до <b>float</b> и промежуточный результат также становится <b>float</b>. В следующем выражении (i / c) тип у переменной <b>c</b> повышается до <b>int</b> и промежуточный результат также становится типом <b>int</b>. В выражении (d * s) тип переменной <b>s</b> повышается до <b>double</b> и промежуточное выражение также становится <b>double</b>. В результате у нас появились три промежуточные значения типов: float, int, double. При сложении <b>float</b> и <b>int</b> мы получаем <b>float</b>, затем при вычитании с использованием <b>float</b> и <b>double</b> тип повышается до <b>double</b>, который и становится окончательным типом результата выражения.</p>"
        );

        //___058_____________________________________________________________________________________________________________________
        array[58] = new ContentValues();
        array[58].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Можно ли хеш-функцию для класса реализовывать как: (да или нет)</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;...&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;hashCode<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[58].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[58].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[58].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[58].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p><b>Изначально для хеш-функции отводятся следующие правила:</b></p>"+
                "<p>1. Для двух одинаковых объектов значение хеш-функции обязательно одинаковое;</p>"+
                "<p>2. Если у 2 объектов хеш-функция возвращает одно и то же значение, то эти объекты не обязательно одинаковые;</p>"
        );

        //___059_____________________________________________________________________________________________________________________
        array[59] = new ContentValues();
        array[59].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>При вставке в середину списка из 1000.000 элементов какую реализацию вы выберете и почему ? ArrayList или LinkedList?</h1>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;...&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#000066\">int</font>&nbsp;hashCode<font color=\"#009900\">&#40;</font><font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#cc66cc\">1</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );
        array[59].put(DatabaseHelperTypeIn.ANSWER_1, "arraylist");
        array[59].put(DatabaseHelperTypeIn.ANSWER_2, "arraylist");
        array[59].put(DatabaseHelperTypeIn.ANSWER_3, "arraylist");
        array[59].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>При вставке в середину в LinkedList выполнится медленнее чем в ArrayList , так как нам для вставки в LinkedList нам нужно добраться до середины делая все время next next next… и потом вставить элемент что незатратно исходя из реализации LinkedList-а , а с другой стороны для ArrayList он быстро по индексу добирается до середины , но чтоб ему добавить элемент нужно сдвинуть правую половину на одну позицию. ArrayList сделает это быстрее , все потому, что метод System.arrayCopy работает быстрее чем next next next , так как System.arrayCopy native метод !!! </p>"

        );

        //___060_____________________________________________________________________________________________________________________
        array[60] = new ContentValues();
        array[60].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Возможно ли при переопределении (override) метода изменить модификатор доступа?</h1>"
        );
        array[60].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[60].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[60].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[60].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Только если расширять (package -> protected -> public)</p>"

        );

        //___061_____________________________________________________________________________________________________________________
        array[61] = new ContentValues();
        array[61].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Возможно ли при переопределении (override) метода изменить возвращаемый тип?</h1>"
        );
        array[61].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[61].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[61].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[61].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Только если выполняется Upcasting (восходящее преобразование, преобразование вверх по иерархии)</p>"
        );

        //___062_____________________________________________________________________________________________________________________
        array[62] = new ContentValues();
        array[62].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Возможно ли при переопределении (override) метода изменить тип аргумента или количество?</h1>"
        );
        array[62].put(DatabaseHelperTypeIn.ANSWER_1, "нет");
        array[62].put(DatabaseHelperTypeIn.ANSWER_2, "нет");
        array[62].put(DatabaseHelperTypeIn.ANSWER_3, "нет");
        array[62].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>В этом случае происходит Overload(перегрузка)</p>"
        );

        //___063_____________________________________________________________________________________________________________________
        array[63] = new ContentValues();
        array[63].put(DatabaseHelperTypeIn.MULTY_QUESTION_COLUMN, "<h1>Возможно ли при переопределении (override) метода изменить изменять порядок, количество или вовсе убрать секцию throws?</h1>"
        );
        array[63].put(DatabaseHelperTypeIn.ANSWER_1, "да");
        array[63].put(DatabaseHelperTypeIn.ANSWER_2, "да");
        array[63].put(DatabaseHelperTypeIn.ANSWER_3, "да");
        array[63].put(DatabaseHelperTypeIn.MULTY_ARTICLE, "<h1>Объяснение:</h1>" +
                "<p>Возможно вовсе убрать секцию throws в методе, так как она уже определена.\n" +
                "Так же, возможно добавлять новые исключения, которые наследуются от объявленных или исключения времени выполнения.</p>" +
                "<p>Пример: </p>" +
                "<font color=\"#000000\">public</font>&nbsp;<font color=\"#000000\">class</font>&nbsp;Main&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">protected</font>&nbsp;<font color=\"#003399\">Collection</font>&nbsp;execute<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;myparam<font color=\"#009900\">&#41;</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">throws</font>&nbsp;<font color=\"#003399\">IOException</font>,&nbsp;<font color=\"#003399\">SQLException</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;B&nbsp;<font color=\"#000000\">extends</font>&nbsp;A&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;Queue&nbsp;execute<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;arg<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#000000\">throws</font>&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">NullPointerException</font>,&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SQLTransactionRollbackException,&nbsp;&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#003399\">FileNotFoundException</font>,&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">class</font>&nbsp;C&nbsp;<font color=\"#000000\">extends</font>&nbsp;B&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;@Override&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">public</font>&nbsp;<font color=\"#003399\">LinkedList</font>&nbsp;execute<font color=\"#009900\">&#40;</font><font color=\"#003399\">String</font>&nbsp;arg<font color=\"#009900\">&#41;</font>&nbsp;<font color=\"#009900\">&#123;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#000000\">return</font>&nbsp;<font color=\"#000066\">null</font><font color=\"#339933\">;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"#009900\">&#125;</font>&nbsp;<br/>\n" +
                "<font color=\"#009900\">&#125;</font>&nbsp;"
        );



    }
}
