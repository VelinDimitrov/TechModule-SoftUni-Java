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
        $endingNumber=intval($_GET['num']);
        for ($counter = 1; $counter <= $endingNumber; $counter++) {
            if ($counter % 2 == 0) {
                echo $counter ." ";
            }
        }
    }
    ?>
</body>
</html>