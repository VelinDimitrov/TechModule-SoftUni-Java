<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if (isset($_GET['num'])) {
        $fibonachiIterations=intval($_GET['num']);
        getFibonachi($fibonachiIterations);
    }
    function getFibonachi(int $fibonachiIterations)
    {
        $firstNum=1;
        $secondNum=1;
        echo "$firstNum $secondNum ";
        for ($iteration = 2; $iteration < $fibonachiIterations; $iteration++) {
            $fibonachiNum=$firstNum+$secondNum;
            echo $fibonachiNum. " ";
            $firstNum=$secondNum;
            $secondNum=$fibonachiNum;
        }
    }
    ?>
</body>
</html>