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
        $thirdNum=2;
        echo "$firstNum $secondNum $thirdNum ";
        for ($iteration = 3; $iteration < $fibonachiIterations; $iteration++) {
            $tribonachi=$firstNum+$secondNum+$thirdNum;
            echo $tribonachi. " ";
            $firstNum=$secondNum;
            $secondNum=$thirdNum;
            $thirdNum=$tribonachi;
        }
    }
    ?>
</body>
</html>