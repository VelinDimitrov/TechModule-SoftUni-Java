<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num1" />
        M: <input type="text" name="num2" />
        <input type="submit" />
    </form>
	<ul>
        <?php
        if (isset($_GET['num1']) && isset($_GET['num2'])) {
           $lists=intval($_GET['num1']);
           $elementsInEach=intval($_GET['num2']);
            for ($list = 1; $list <= $lists; $list++) {
                echo "<li>List $list";
                echo "\t<ul>";
                for ($element = 1; $element <= $elementsInEach; $element++) {
                        echo "\t\t<li>";
                        echo "\t\t\t\tElement  $list.$element";
                        echo "\t\t</li>";
                }
                echo "\t</ul>";
                echo"</li>";
            }
        }
        ?>
	</ul>
</body>
</html>
<!--<ul>-->
<!--    <li>List 1-->
<!--        <ul>-->
<!--            <li>-->
<!--                Element 1.1-->
<!--            </li>-->
<!--            <li>-->
<!--                Element 1.2-->
<!--            </li>-->
<!--        </ul>-->
<!--    </li>-->
<!--</ul>-->
