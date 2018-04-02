<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    X: <input type="text" name="num1"/>
    Y: <input type="text" name="num2"/>
    Z: <input type="text" name="num3"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {
    $firstNum = floatval($_GET['num1']);
    $secondNum = floatval($_GET['num2']);
    $thirdNum = floatval($_GET['num3']);
    if (isPositive($firstNum, $secondNum, $thirdNum)) {
        echo "Positive";
    } else {
        echo "Negative";
    }
}
function isPositive(float $firstNum, float $secondNum, float $thirdNum): bool
{

    if ($firstNum == 0 || $secondNum == 0 || $thirdNum == 0) {
        return true;
    }
    $negativeCounter = 0;
    if ($firstNum < 0)
        $negativeCounter++;
    if ($secondNum < 0)
        $negativeCounter++;
    if ($thirdNum < 0)
        $negativeCounter++;

    if ($negativeCounter % 2 == 1) {
        return false;
    }
    return true;
}

?>
</body>
</html>