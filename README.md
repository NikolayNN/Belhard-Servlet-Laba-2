# Belhard-Servlet-Laba-2

<h1>Servlet API.</h1>
<h3>Задание-2.</h3>
<h3>Генератор рекомендательных писем.</h3>

<p>Друзья, это единственное задание из текущей темы, которое потребует от Вас создания «нестандартных» сервлетов. Дело в том, что при разработке всех остальных задач от Вас в качестве ответа будет требоваться HTML документ, записанный в текстовый поток вывода. Но только сегодня, проездом в нашем городе, с единственным концертом и только для Вас… Неповторимое и леденящее кровь шоу… Вы готовы удивляться?.. Запись бинарного ответа в байтовый поток вывода!!! Ну а попутно мы рассмотрим еще два (а если пожелаете, то и три) практических момента, которые, возможно, пригодятся Вам в реальной работе. Хотя, нет, соврал – один из этих моментов точно не пригодиться, так что я бы на Вашем месте выбирал три, чтобы больше получилось.</p>
<p>В этой задаче от Вас потребуется создание автоматического генератора рекомендательных писем для наиболее трудолюбивых слушателей нашего курса. Вы уже знаете, что после того, как наш курс закончится, тем из Вас кто работал больше и лучше своих коллег, наряду с сертификатом будет выдано рекомендательное письмо, которое Вы сможете предъявить в качестве дополнительного, пусть и неявного, и не всегда эффективного, но все же свидетельства Вашего конкурентного преимущества.<p>
<p>Итак, обо всем по порядку. В рамках текущего задания, Вам необходимо реализовать сервлет, который отобразит для пользователя форму со следующими компонентами:</p>

<table>
  <tr>
    <th>№</th>
    <th>Название</th>
    <th>Тип компонента</th>
  </tr>
  <tr>
    <td>1</td>
    <td>Фамилия слушателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Имя слушателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>3</td>
    <td>Отчество слушателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Дата начала занятий</td>
    <td>DatePicker</td>
  </tr>
  <tr>
    <td>5</td>
    <td>Дата окончания занятий</td>
    <td>DatePicker</td>
  </tr>
  <tr>
    <td>6</td>
    <td>Список тем, изученных самостоятельно.</td>
    <td></td>
  </tr>
  <tr>
    <td>7</td>
    <td>Тема курсового проекта</td>
    <td>Многострочное поле ввода – TextArea</td>
  </tr>
  <tr>
    <td>8</td>
    <td>Оценка курсового проекта</td>
    <td>
      Combobox со следующими вариантами:
      <ul>
        <li>Отлично</li>
        <li>Хорошо</li>
        <li>Удовлетворительно</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>9</td>
    <td>Фамилия преподавателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>10</td>
    <td>Имя преподавателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>11</td>
    <td>Отчество преподавателя</td>
    <td>Текстовое поле</td>
  </tr>
  <tr>
    <td>12</td>
    <td>Упаковать в архив</td>
    <td>CheckBox</td>
  </tr>
  <tr>
    <td>13</td>
    <td>Тип архива</td>
    <td>
      Радио кнопки со значениями:
      <li>zip</li>
      <li>jar</li>
    </td>
  </tr>
  <tr>
    <td>14</td>
    <td>Сгенерировать письмо</td>
    <td>Кнопка submit.</td>
  </tr>
</table>
<p>Приведем некоторые комментарии к таблице компонентов.</p>
<p><b>Во-первых</b>, не забывайте, пожалуйста, что любая качественная программа должна заботиться о валидации введенных пользователем значений. Я думаю, что мы уже достаточно поговорили с Вами о валидации данных в задаче №1, поэтому здесь ограничимся лишь короткими тезисами – валидация данных должна присутствовать в Вашем сервлете, и ее правила Вы должны продумать самостоятельно.</p>
<p><b>Во-вторых</b>, пункт номер №6 – «Список тем, изученных самостоятельно» – не дает точного типа компонента. Я бы на Вашем месте рассматривал два варианта реализации:</p>
<p><b>В-третьих</b>, обратите, пожалуйста, внимание на еще одно важное требование для пункта №6. Список тем не должен располагаться в Вашем исходном коде! Вместо этого, все темы должны загружаться из внешнего текстового файла, что позволит пользователям сервлета в любой момент изменить список предлагаемых тем либо дополнить его.</p>
<p><b>В-четвертых</b>, пункт №12 – «Упаковать в архив». Это CheckBox, который не отправляется на сервер для обработки. Он служит только лишь для клиентской логики, и, если он выбран, то радио кнопки из пункта №13 становятся активными (enabled). И при помощи этих кнопок, пользователь может указать, что он хочет упаковать получившийся файл с рекомендацией в один из доступных архивов – ZIP или JAR</p>
<p>Вот здесь мы вплотную и подошли к результатам работы нашей системы. После того, как пользователь корректно заполняет форму и наживает кнопку «Сгенерировать письмо», управление передается сервлету, который:</p>
<ol>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
</ol>
<p></p>
<p></p>
