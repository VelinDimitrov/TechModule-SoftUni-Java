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
        $numberOfButtons=intval($_GET['num']);
        for ($iteration = 1; $iteration <= $numberOfButtons; $iteration++) {
            echo "<button>$iteration</button>";
        }
    }
    ?>
</body>
</html>