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
        $factorial=intval($_GET['num']);
        echo getFactorial($factorial);
    }
    function getFactorial(int $factorialNum): int
    {
        if ($factorialNum < 2) {
            return 1;
        }
        return $factorialNum*getFactorial($factorialNum-1);
    }
    ?>
</body>
</html>