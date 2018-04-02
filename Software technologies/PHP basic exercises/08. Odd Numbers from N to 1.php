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
        $startingNumber=intval($_GET['num']);
        for ($counter = $startingNumber; $counter > 0; $counter--) {
            if ($counter % 2 == 1) {
                echo $counter ." ";
            }
        }
    }
    ?>
</body>
</html>