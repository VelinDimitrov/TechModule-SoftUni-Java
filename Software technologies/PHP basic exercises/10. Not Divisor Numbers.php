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
        $numToDivide=intval($_GET['num']);
        for ($divisor = $numToDivide - 1; $divisor > 1; $divisor--) {
            if ($numToDivide % $divisor != 0) {
                echo $divisor . " ";
            }
        }
    }
    ?>
</body>
</html>