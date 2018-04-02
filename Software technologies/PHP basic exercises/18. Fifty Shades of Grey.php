<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
    <?php
    for ($row = 0; $row <= 255;$row+=1) {
        for ($column = 0; $column < 10; $row+=5,$column++) {
            echo "<div style='background-color:rgb($row,$row,$row)'></div>";
        }
        echo"<br>";
    }
    ?>
</body>
</html>