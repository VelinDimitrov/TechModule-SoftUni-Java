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
        $endingIteratoinNum=intval($_GET['num']);
        for ($numberToCheck = $endingIteratoinNum; $numberToCheck > 1; $numberToCheck--) {
            if (checkPrime($numberToCheck)) {
                echo $numberToCheck." ";
            }
        }
    }
    function checkPrime(int $numToCheck): bool
    {
        for ($divisor = 2; $divisor < $numToCheck; $divisor++) {
            if ($numToCheck % $divisor == 0) {
                return false;
            }
        }
        return true;
    }
    ?>
</body>
</html>